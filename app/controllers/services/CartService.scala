package controllers.services

import controllers.utils.Utils
import controllers.utils.Utils.{
  getFutureValue,
  isCreated,
  isUpdated,
  validUpdateStatus
}
import models.Logger
import models.db.Products.getProducts
import models.db._
import models.enums.UpdateProduct._
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
    val productResponse = isUpdated(updateProduct(cart, Reduce))
    val cartO: Option[Cart] = mayCart(cart.userId, cart.productId)

    cartO match {
      case Some(oldCart) =>
        val newQuantity = oldCart.quantity + cart.quantity
        val updateCart =
          sqlu"update electronify.cart set quantity=$newQuantity where user_id=${cart.userId} and product_id=${cart.productId};"
        val response = isUpdated(updateQueries(updateCart))
        if (productResponse == Status.ACCEPTED)
          validUpdateStatus(response, "cart")
        else {
          logger.info("Failed to update product")
          response
        }
      case None =>
        val addToCart =
          sqlu"insert into electronify.cart (id, quantity, created_at, deleted_at,user_id, product_id) values (${cart.id}, ${cart.quantity}, ${cart.createdAt}, ${cart.deletedAt}, ${cart.userId}, ${cart.productId});"
        val cartResponse = isCreated(updateQueries(addToCart))
        if (productResponse == Status.ACCEPTED)
          validUpdateStatus(cartResponse, "cart")
        else {
          logger.info("Failed to update product")
          cartResponse
        }
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
    // Todo :Shipping cost depends on user's country address temp total
    val total: Double = userProducts.foldLeft[Double](0.0)(_ + _.price)

    UserCart(userId, Products(userProducts), total)
  }

  def clearCart(userId: String, productId: String): Int = {
    val cartO = mayCart(userId, productId)
    cartO match {
      case Some(cart) =>
        val resetProductStock = updateProduct(cart, Reset)
        if (resetProductStock == Status.ACCEPTED) {
          val query =
            sqlu"delete from electronify.cart where user_id = $userId;"
          updateQueries(query)
        } else {
          logger.info("Failed to reset product stock")
          -1
        }
      case None =>
        logger.info("Failed to fetch cart")
        -1
    }

  }

  def getAllProducts: Products = {
    val query =
      sql"select * from electronify.product;".as[Seq[Product]]
    getProducts(getFutureValue(db.run(query)))
  }

  def updateProduct(cart: Cart, action: String): Int = {
    action match {
      case Reduce => reduceProductStock(cart.productId, cart.quantity)
      case Reset  => resetStock(cart.productId, cart.quantity)
      case Update => ???
      case _      => -1
    }
  }

  def reduceProductStock(productId: String, quantity: Int): Int = {
    val productO = getProductById(productId)
    productO match {
      case Some(product) =>
        val newStock = product.stock - quantity
        if (newStock < 0) -1
        else {
          val inStock = Utils.inStock(product.stock)
          val updateProduct: SqlAction[Int, NoStream, Effect] =
            sqlu"update electronify.product set stock = $newStock , in_stock = $inStock where id = ${product.id};"
          updateQueries(updateProduct)
        }
      case None =>
        logger.info("Failed to get product")
        -1
    }
  }

  def resetStock(productId: String, quantity: Int): Int = {
    val productO = getProductById(productId)
    productO match {
      case Some(product) =>
        val newStock = product.stock + quantity
        val inStock = Utils.inStock(product.stock)
        val updateProduct =
          sqlu"update electronify.product set stock = $newStock , in_stock = $inStock where id = ${product.id};"
        updateQueries(updateProduct)
      case None =>
        logger.info("Failed to get product")
        -1
    }
  }

  def getProductById(id: String): Option[Product] = {
    val getProduct =
      sql"select * from electronify.product where id = $id;"
        .as[Product]
    getFutureValue(db.run(getProduct)).headOption
  }

  def removeItem(userId: String, productId: String): Int = {
    val cartO: Option[Cart] = mayCart(userId, productId)

    cartO match {
      case Some(cart) =>
        val updateCart =
          sqlu"delete from electronify.cart where user_id = $userId and product_id = $productId;"
        val cartResponse = isUpdated(updateQueries(updateCart))
        val resetProductStock = isUpdated(updateProduct(cart, Reset))

        if (resetProductStock == Status.ACCEPTED)
          validUpdateStatus(cartResponse, "cart")
        else {
          logger.info("Failed to update product")
          cartResponse
        }
      case None =>
        logger.info("Failed to remove item")
        -1
    }
  }

  // Todo : Needs to be fix
  def mayCart(userId: String, productId: String): Option[Cart] = {
    if (productId.nonEmpty) {
      val getCart =
        sql"select * from electronify.cart where user_id=$userId and product_id=$productId;"
          .as[Cart]
      getFutureValue(db.run(getCart)).headOption
    } else {
      val getCart =
        sql"select * from electronify.cart where user_id=$userId;"
          .as[Cart]
      getFutureValue(db.run(getCart)).headOption
    }
  }
}
