package controllers.services

import controllers.constants.Responses._
import controllers.constants.Values.EU_COUNTRIES
import controllers.utils.DateUtils
import controllers.utils.DateUtils.timestampNow
import controllers.utils.Utils.{
  getFutureValue,
  isCreated,
  isUpdated,
  validUpdateStatus
}
import models.Logger
import models.db.User._
import models.db.{
  CartProduct,
  Order,
  Product,
  Products,
  ShoppingSession,
  User,
  UserAddress,
  UserCart,
  UserList
}
import models.raw.LogIn
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.{JdbcProfile, SetParameter}
import slick.sql.SqlAction

import java.util.UUID
import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile]
    with Logger {

  import profile.api._

  def getUserById(id: String): User = {
    val query = sql"select * from electronify.users where id = $id;".as[User]
    val user: Option[User] = getFutureValue(db.run(query)).headOption

    user match {
      case Some(user) =>
        if (
          id == user.id
            .getOrElse(UUID.fromString(""))
            .toString && user.active
        ) {
          logger.info(SUCCESS)
          user
        } else {
          logger.info(NO_USER_FOUND)
          User.defaultUser
        }
      case None => {
        logger.info(NO_USER_FOUND)
        User.defaultUser
      }
    }
  }

  def getAllActiveUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = true;".as[Seq[User]]
    UserList.getUserList(getFutureValue(db.run(query)))
  }

  def getAllDisableUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = false;".as[Seq[User]]
    UserList.getUserList(getFutureValue(db.run(query)))
  }

  def updateQueries(query: SqlAction[Int, NoStream, Effect]): Int = {
    getFutureValue[Int](db.run(query))
  }

  def createUser(user: User): Int = {
    val activeUsers = getAllActiveUsers
    val filter =
      activeUsers.users.filter(existingUser => user.email == existingUser.email)

    user.id match {
      case Some(userId) =>
        val id = userId.toString
        if (filter.isEmpty) {
          val query: SqlAction[Int, NoStream, Effect] =
            sqlu"insert into electronify.users values ($id, ${user.username}, ${user.password}, ${user.email}, ${user.telephone}, ${user.created_at}, ${user.active})"
          val response = updateQueries(query)
          val result = isCreated(response)
          if (result == Status.CREATED) createSession(id)
          result
        } else Status.BAD_GATEWAY
      case None => Status.BAD_REQUEST
    }
  }

  def disableUser(id: String): Int = {
    val activeUsers = getAllDisableUsers
    val filter =
      activeUsers.users.filter(existingUser =>
        id == existingUser.id.get.toString
      )

    if (filter.isEmpty) {
      val query: SqlAction[Int, NoStream, Effect] =
        sqlu"update electronify.users set active = false where id = $id;"

      isUpdated(updateQueries(query))
    } else Status.GONE
  }

  def logInUser(credentials: LogIn): User = {
    val query =
      sql"select * from electronify.users where username = ${credentials.username} and password = ${credentials.password} and active = true;"
        .as[User]
    val userO = getFutureValue(db.run(query)).headOption
    userO match {
      case Some(value) =>
        createSession(value.id.get.toString)
        value
      case None =>
        logger.info(NO_USER_FOUND)
        User.defaultUser
    }
  }

  def createUserAddress(address: UserAddress): Option[UserAddress] = {
    val getAddress =
      sql"select * from electronify.users_address where user_id = ${address.userId};"
        .as[UserAddress]
    val mayAddress: Option[UserAddress] =
      getFutureValue(db.run(getAddress)).headOption

    mayAddress match {
      case Some(_) =>
        logger.info(ERR_ALREADY_EXIST)
        None
      case None =>
        val query: SqlAction[Int, NoStream, Effect] =
          sqlu" insert into electronify.users_address (id, address_1, address_2, city, postal_code, country, telephone, name, user_id, comments) values (${address.id},  ${address.address}, ${address.addressO}, ${address.city},${address.postCode},${address.country},${address.telephone}, ${address.name}, ${address.userId},${address.comments});"
        val response = updateQueries(query)

        if (isCreated(response) == Status.CREATED) Some(address)
        else None
    }
  }

  def createSession(id: String): Int = {
    val currentDate = timestampNow
    val uuid = UUID.randomUUID()
    val query =
      sqlu"insert into electronify.shopping_session (id, user_id, login) values ($uuid,$id,$currentDate)"
    validUpdateStatus(isUpdated(updateQueries(query)), "shopping_session")
  }

  def logOutSession(userId: String): Int = {
    val getSession =
      sql"select * from electronify.shopping_session where user_id = $userId and logout = '';"
        .as[ShoppingSession]
    val session = getFutureValue(db.run(getSession)).headOption

    session match {
      case Some(sess) =>
        val currentDate = timestampNow
        val query =
          sqlu"update electronify.shopping_session set logout = $currentDate where id = ${sess.id}"
        validUpdateStatus(isUpdated(updateQueries(query)), "shopping_session")
      case None =>
        logger.info("No session Found for user")
        Status.BAD_REQUEST
    }
  }

  def clearCart(id: String): Int = {
    val query = sqlu"delete from electronify.cart where user_id = $id;"
    updateQueries(query)
  }

  def getUserAddress(id: String): Option[UserAddress] = {
    val query = sql"select * from electronify.users_address where user_id=$id;"
      .as[UserAddress]
    getFutureValue(db.run(query)).headOption
  }

  def deleteAddress(id: String, addressId: String): Int = {
    val query =
      sqlu"delete from electronify.users_address where id=$addressId and user_id=$id;"
    isUpdated(updateQueries(query))
  }

  def getUserCart(userId: String): UserCart = {
    val queryProducts =
      sql"select product_id,quantity from electronify.cart where user_id = $userId;"
        .as[Seq[CartProduct]]
    val productCart: Seq[CartProduct] = getFutureValue(
      db.run(queryProducts)
    ).flatten

    val userProducts: Seq[Product] = productCart.flatMap(cart => {
      val product =
        sql"select * from electronify.product where id = ${cart.id};"
          .as[Product]
      getFutureValue(db.run(product)).map(_.copy(stock = cart.quantity))
    })
    val mayAddress = getUserAddress(userId)
    val total: Double = userProducts.foldLeft[Double](0.0)(_ + _.price)
    if (total >= 200.00) {
      UserCart(
        userId,
        Products(userProducts),
        total,
        shipping = 0.00
      )
    } else {
      mayAddress match {
        case Some(address) =>
          if (EU_COUNTRIES.contains(address.country)) {
            UserCart(
              userId,
              Products(userProducts),
              total,
              shipping = total * 0.03
            )
          } else
            UserCart(
              userId,
              Products(userProducts),
              total,
              shipping = total * 0.05
            )
        case None =>
          UserCart(
            userId,
            Products(userProducts),
            total,
            shipping = total * 0.05
          )
      }
    }
  }

  def submitOrder(id: String): Option[Order] = {
    val userCart: UserCart = getUserCart(id)
    val userAddress = getUserAddress(id).get
    val paymentId = UUID.randomUUID()
    val orderId = UUID.randomUUID()
    val dateNow = DateUtils.timestampNow
    val items = userCart.products.products.map(_.name).mkString
    val orderIdStr = orderId.toString

    val queryOrder =
      sqlu"insert into electronify.orders (id, user_id, status,items,total,created_at,address,payment_id) values ($orderIdStr,$id,'InProgress',$items,${userCart.total},$dateNow,${userAddress.id},$paymentId)"

    val order =
      validUpdateStatus(isCreated(updateQueries(queryOrder)), "payment")
    if (order == Status.CREATED) {
      val payment = createPayment(orderId, paymentId, userCart.total, id)
      if (payment == Status.CREATED) {
        clearCart(id)
        Some(
          Order(
            orderIdStr,
            "In Progress",
            userCart.products.products.map(_.name),
            userAddress.address,
            userCart.total
          )
        )
      } else None
    } else None
  }

  def createPayment(
      orderId: UUID,
      paymentId: UUID,
      amount: Double,
      userId: String
  ): Int = {
    val id = paymentId.toString
    val orderIdStr = orderId.toString
    val query =
      sqlu"insert into electronify.payment (id, user_id, status,amount,order_id) values ($id,$userId,'PAID',$amount,$orderIdStr)"

    validUpdateStatus(isCreated(updateQueries(query)), "payment")
  }
}
