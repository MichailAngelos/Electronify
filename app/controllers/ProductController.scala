package controllers

import controllers.services.ProductService
import models.enums.ActionProduct._
import models.enums.Product.GetProduct
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class ProductController @Inject() (
    cc: ControllerComponents,
    service: ProductService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getProduct(id: String = "", action: Int): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val productAction: Option[String] = GetProduct.getAction(action)
      productAction match {
        case Some(action) =>
          action match {
            case Details  => getDetails(id)
            case All      => ???
            case OnSale   => ???
            case InStock  => ???
            case Category => ???
            case _        => BadRequest(views.html.index())
          }
        case None => BadRequest(views.html.index())

      }
    }

  def getDetails(id: String): Result = {
    Ok(Json.toJson(service.getProduct(id)))
  }

  def postProduct(id: String, action: Int): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      ???
    }

}
