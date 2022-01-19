package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import services.UserService
import javax.inject.Inject

class UserController @Inject()(cc: ControllerComponents, userService: UserService)  extends AbstractController(cc) {

  def getAll: Action[AnyContent] = Action { implicit request =>
    Ok(Json.toJson(userService.getAllUsers))
    }
}
