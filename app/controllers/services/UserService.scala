package controllers.services

import controllers.constants.Responses._
import controllers.utils.Utils
import controllers.utils.Utils.isCreated
import models.Logger
import models.db.User._
import models.db.{User, UserAddress, UserList}
import models.raw.LogIn
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.JdbcProfile
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
    val user: Option[User] = Utils.getFutureValue(db.run(query)).headOption

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
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
  }

  def getAllDisableUsers: UserList = {
    val query =
      sql"select * from electronify.users where active = false;".as[Seq[User]]
    UserList.getUserList(Utils.getFutureValue(db.run(query)))
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

          isCreated(response)
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

      updateQueries(query) match {
        case 1 => Status.ACCEPTED
        case _ => Status.BAD_REQUEST
      }
    } else Status.GONE
  }

  def logInUser(credentials: LogIn): User = {
    val query =
      sql"select * from electronify.users where username = ${credentials.username} and password = ${credentials.password} and active = true;"
        .as[User]
    val userO = Utils.getFutureValue(db.run(query)).headOption
    userO match {
      case Some(value) => value
      case None =>
        logger.info(NO_USER_FOUND)
        User.defaultUser
    }
  }

  def createUserAddress(address: UserAddress): Int = {
    val getAddress =
      sql"select * from electronify.users_address where id = ${address.id};"
        .as[UserAddress]
    val mayAddress: Option[UserAddress] =
      Utils.getFutureValue(db.run(getAddress)).headOption

    mayAddress match {
      case Some(_) =>
        logger.info(ERR_ALREADY_EXIST)
        Status.BAD_REQUEST
      case None =>
        val query: SqlAction[Int, NoStream, Effect] =
          sqlu" insert into electronify.users_address (id, address_1, address_2, city, postal_code, country, telephone, name) values (${address.id},  ${address.address}, ${address.addressO}, ${address.city},${address.postCode},${address.country},${address.telephone}, ${address.name});"

        val response = updateQueries(query)

        isCreated(response)
    }
  }

  def updateQueries(query: SqlAction[Int, NoStream, Effect]): Int = {
    Utils.getFutureValue[Int](db.run(query))
  }
}
