package controllers

import controllers.services.UserService
import play.api.libs.json.Json
import play.api.libs.ws.WSClient
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserController @Inject() (
    ws: WSClient,
    cc: ControllerComponents,
    userService: UserService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getAllUsers: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(Json.toJson(userService.getAll))
    }

  def getAllActiveUsers: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(Json.toJson(userService.getAllActiveUsers))
    }

  def signUpUser(username: String, password: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
     //todo post data sign up form
      ???
    }

}
