package controllers

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents, Request, Result}
import services.{UserService, Validation}

import javax.inject.Inject
import scala.concurrent.{ExecutionContext, Future}

class UserController @Inject() (
    cc: ControllerComponents,
    userService: UserService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getAll: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val userListF = userService.getAll
      val list: Future[Result] = for {
        list <- userListF
      } yield Ok(Json.toJson(list))

      Validation.futureValidation(list)
    }
}
