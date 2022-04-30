package controllers.services

import controllers.utils.Utils.{getFutureValue, isCreated, validUpdateStatus}
import models.Logger
import models.db.Cart
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
}
