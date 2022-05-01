package controllers

/** Version 1 will be released in March 2021 */

import controllers.constants.Global
import controllers.constants.Global.{
  SESSION_INVALID_FORM,
  SESSION_SIGN_UP_INVALID_PASS
}
import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  def index(): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(views.html.index()).removingFromSession(
        Global.SESSION_LOGGED_IN_KEY,
        Global.SESSION_ERR_LOGGED
      )
    }

//  def cart(): Action[AnyContent] =
//    Action { implicit request =>
//      Ok(views.html.cart())
//    }

  def product(): Action[AnyContent] =
    Action { implicit request =>
      Ok(views.html.singleProduct())
    }

  def checkOut(): Action[AnyContent] =
    Action { implicit request =>
      Ok(views.html.checkout()).removingFromSession(SESSION_INVALID_FORM)
    }

  def contact(): Action[AnyContent] =
    Action { implicit request =>
      Ok(views.html.contact())
    }

  def signUp(): Action[AnyContent] =
    Action { implicit request =>
      Ok(views.html.signup()).removingFromSession(
        SESSION_INVALID_FORM,
        SESSION_SIGN_UP_INVALID_PASS
      )
    }
}
