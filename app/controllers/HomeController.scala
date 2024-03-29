package controllers

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
        Global.SESSION_ERR_LOGGED,
        Global.SESSION_ORDER
      )
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
