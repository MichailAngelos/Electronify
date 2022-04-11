package controllers

import controllers.services.ProductService
import models.db.Products
import models.enums.Product
import models.enums.Product.GetProduct
import models.enums.Product.GetProduct._
import play.api.mvc.{
  AbstractController,
  Action,
  AnyContent,
  ControllerComponents,
  Request,
  Result
}

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class ProductController @Inject() (
    cc: ControllerComponents,
    service: ProductService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getProduct(id: String = "", action: Int): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val mayAction: Option[Product.GetProduct.Value] =
        GetProduct.getProduct(action)

      mayAction match {
        case Some(action) =>
          action match {
            case Details  => getDetails(id)
            case All      => ???
            case OnSale   => ???
            case InStock  => ???
            case Category => ???
          }
        case None => ???
      }

    }
  def getDetails(id: String): Result = {
    ???
  }

}
