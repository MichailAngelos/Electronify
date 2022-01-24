package controllers

import controllers.constants.Responses._
import controllers.forms.Forms._
import controllers.services.UserService
import controllers.utils.Utils
import controllers.utils.Utils.{extractUUID, updateValidationResponse}
import models.db.User
import models.db.User._
import models.raw.RawUser
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserController @Inject() (
    cc: ControllerComponents,
    userService: UserService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def getUserById: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val id = extractUUID(request.body.asJson)
      Ok(Json.toJson(userService.getUserById(id)))
    }

  def getAllActiveUsers: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(Json.toJson(userService.getAllActiveUsers))
    }

  def signUpUser: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val userRaw: RawUser = userForm.bindFromRequest().get
      if (userRaw.password.equals(userRaw.passwordR)) {
        val user: User = extractFormData(Some(userRaw))
        val response = updateValidationResponse(userService.createUser(user))

        response match {
          case USER_CREATED   => Redirect(routes.HomeController.index())
          case ERR_USER_EXIST => BadGateway(response)
          case _              => BadRequest(response)
        }
      } else {
        logger.error("Passwords Don't Match")
        Redirect(routes.HomeController.signUp(), 400)
      }
    }

  def logIn: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val credentials = logInForm.bindFromRequest().get
      val encryptedPass = Utils.encryptPassword(credentials.password)
      Ok(
        userService
          .logInUser(
            credentials
              .copy(password = encryptedPass)
          )
          .toString
      )
    }

//  def logout = Action {
//    Redirect(routes.Auth.login).withNewSession.flashing(
//      "success" -> "You are now logged out."
//    )
//  }

  def disableUser: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val id = extractUUID(request.body.asJson)
      val response = updateValidationResponse(userService.disableUser(id))

      response match {
        case USER_UPDATED => Ok(response)
        case _            => BadRequest(response)
      }
    }
}
