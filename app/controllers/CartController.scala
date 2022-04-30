package controllers

import controllers.constants.Responses.CREATED_ENTITY
import controllers.services.CartService
import controllers.utils.Utils.updateValidationResponse
import models.db.Cart.{createCart, logger}
import models.enums.ActionsCart._
import models.forms.Forms.addToCartF
import models.raw.AddCartRaw
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

class CartController @Inject() (
    cc: ControllerComponents,
    service: CartService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def postCart(
      id: String,
      productId: String,
      action: String
  ): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case AddCart =>
          addToCart(id, productId, addToCartF.bindFromRequest().value, request)
        case UpdateCart => Ok(views.html.index())
        case RemoveCart => Ok(views.html.index())
        case _          => BadRequest(views.html.index())

      }
    }

  def addToCart(
      userId: String,
      productId: String,
      cartRaw: Option[AddCartRaw],
      request: Request[AnyContent]
  ): Result = {
    cartRaw match {
      case Some(quantity) =>
        val response = updateValidationResponse(
          service.addToCart(createCart(userId, productId, quantity.quantity))
        )
        response match {
          case CREATED_ENTITY => Created(views.html.cart()(request.session))
          case _ =>
            logger.info("Failed to add")
            BadRequest(views.html.index()(request.session))
        }
      case None =>
        logger.info("No quantity")
        BadRequest(views.html.index()(request.session))
    }
  }

  def getCart(id: String, action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] => ??? }
}
