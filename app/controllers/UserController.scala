package controllers

import controllers.constants.Global
import controllers.constants.Responses._
import controllers.forms.Forms._
import controllers.services.UserService
import controllers.utils.Utils
import controllers.utils.Utils.{
  encryptPassword,
  extractUUID,
  isUserValid,
  updateValidationResponse
}
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

  def getUserById(id: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
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
      val encryptedPassCredential =
        credentials.copy(password = encryptPassword(credentials.password))

      val mayUser: User =
        userService.logInUser(encryptedPassCredential)

      if (isUserValid(encryptedPassCredential, mayUser)) {
        Redirect(routes.HomeController.index()).withSession(
          Global.SESSION_USERNAME_KEY -> credentials.username,
          Global.SESSION_ID -> mayUser.id.get.toString,
          Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
          Global.SESSION_ERR_LOGGED -> EMPTY_STRING
        )
      } else {
        Redirect(routes.HomeController.index()) withSession (
          Global.SESSION_ERR_LOGGED -> FAILED
        )
      }
    }

  def logout: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Redirect(routes.HomeController.index()).withNewSession
    }

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
