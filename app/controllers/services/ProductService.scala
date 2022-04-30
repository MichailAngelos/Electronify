package controllers.services

import controllers.utils.Utils
import controllers.utils.Utils.getFutureValue
import models.Logger
import models.db.Products.getProducts
import models.db.{Product, Products}
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}
import slick.jdbc.JdbcProfile

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class ProductService @Inject() (
    protected val dbConfigProvider: DatabaseConfigProvider
)(implicit ec: ExecutionContext)
    extends HasDatabaseConfigProvider[JdbcProfile]
    with Logger {

  import profile.api._

  def getProduct(id: String): Product = {
    val query =
      sql"select * from electronify.product where id = $id;".as[Product]
    val product: Option[Product] =
      Utils.getFutureValue(db.run(query)).headOption

    product match {
      case Some(value) => value
      case None        => Product.defaultProduct
    }
  }

  def getAll: Products = {
    val query =
      sql"select * from electronify.product;".as[Seq[Product]]
    getProducts(getFutureValue(db.run(query)))
  }

  def getSale: Products = {
    val query =
      sql"select * from electronify.product where on_sale = true;"
        .as[Seq[Product]]
    getProducts(getFutureValue(db.run(query)))
  }

  def getInStock: Products = {
    val query =
      sql"select * from electronify.product where in_stock = true;"
        .as[Seq[Product]]
    getProducts(getFutureValue(db.run(query)))
  }

}
