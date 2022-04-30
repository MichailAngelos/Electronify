package controllers

import controllers.services.ProductService
import models.enums.ActionProduct._
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class ProductController @Inject() (
    cc: ControllerComponents,
    service: ProductService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getProduct(id: String = "", action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case Details  => getDetails(id)
        case All      => getAllProducts(request)
        case OnSale   => ???
        case InStock  => ???
        case Category => ???
        case _        => BadRequest(views.html.index())
      }
    }

  def getDetails(id: String): Result = {
    Ok(Json.toJson(service.getProduct(id)))
  }

  def getAllProducts(request: Request[AnyContent]): Result = {
    Ok(views.html.shop(service.getAll)(request.session))
  }

  def postProduct(id: String, action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      ???
    }

}
