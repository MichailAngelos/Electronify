package controllers

import controllers.services.ProductService
import models.enums.ActionProduct._
import play.api.libs.json.Json
import play.api.mvc.ControllerHelpers.request2session
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
        case Details => getDetails(id, request)
        case All     => getAllProducts(request)
        case OnSale  => getSaleProducts(request)
        case InStock => getInStockProducts(request)
        case _       => BadRequest(views.html.index())
      }
    }

  def getDetails(id: String, request: Request[AnyContent]): Result = {
    Ok(views.html.singleProduct(service.getProduct(id))(request.session))
  }

  def getAllProducts(request: Request[AnyContent]): Result = {
    Ok(views.html.shop(service.getAll)(request.session))
  }

  def getSaleProducts(request: Request[AnyContent]): Result = {
    Ok(views.html.shop(service.getSale)(request.session))
  }

  def getInStockProducts(request: Request[AnyContent]): Result = {
    Ok(views.html.shop(service.getInStock)(request.session))
  }

  def postProduct(id: String, action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case Create  => Ok(views.html.index())
        case Update  => Ok(views.html.index())
        case Remove  => Ok(views.html.index())
        case SetSale => Ok(views.html.index())
        case _       => BadRequest(views.html.index())
      }
    }

}
