package controllers.services

import controllers.utils.Utils.{getFutureValue, isCreated, validUpdateStatus}
import models.Logger
import models.db._
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import play.api.http.Status
import slick.jdbc.JdbcProfile
import slick.sql.SqlAction

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class CartService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile]
    with Logger {
  import profile.api._

  def updateQueries(query: SqlAction[Int, NoStream, Effect]): Int = {
    getFutureValue[Int](db.run(query))
  }

  def addToCart(cart: Cart): Int = {
    val addToCart =
      sqlu"insert into electronify.cart (id, quantity, created_at, deleted_at,user_id, product_id) values (${cart.id}, ${cart.quantity}, ${cart.createdAt}, ${cart.deletedAt}, ${cart.userId}, ${cart.productId});"
    val response = updateQueries(addToCart)
    val result = isCreated(response)

    if (result == Status.CREATED) result
    else {
      validUpdateStatus(result, "cart")
    }
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
    // Shipping cost depends on user's country address temp total
    val total: Double = userProducts.foldLeft[Double](0.0)(_ + _.price)

    UserCart(userId, Products(userProducts), total)
  }
}
