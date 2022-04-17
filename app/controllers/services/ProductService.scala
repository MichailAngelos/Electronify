package controllers.services

import controllers.utils.Utils
import models.Logger
import models.db.Product
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

}
