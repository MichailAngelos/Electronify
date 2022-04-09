package controllers

import controllers.constants.Global
import controllers.constants.Global.{
  SESSION_INVALID_FORM,
  SESSION_SIGN_UP_INVALID_PASS
}
import controllers.constants.Responses._
import controllers.enums.UserPostActions
import controllers.enums.UserPostActions._
import controllers.forms.Forms._
import controllers.services.UserService
import controllers.utils.Utils.{
  encryptPassword,
  extractUUID,
  isUserValid,
  updateValidationResponse
}
import models.db.{User, UserAddress}
import models.db.User._
import models.db.UserAddress.userAddressFromRaw
import models.raw.{CheckOutRaw, LogIn, RawUser}
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserController @Inject() (
    cc: ControllerComponents,
    userService: UserService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def userPostAction(id: String = "", action: Int): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val userAction: Option[UserPostActions.Value] =
        UserPostActions.getUserAction(action)

      userAction match {
        case Some(action) =>
          action match {
            case SignIn   => signIn(logInForm.bindFromRequest().value)
            case SignUp   => signUp(userForm.bindFromRequest().value)
            case Disable  => disableUser(extractUUID(request.body.asJson))
            case Checkout => checkout(id, checkoutForm.bindFromRequest().value)
            //todo
            case Update => Redirect(routes.HomeController.index())
          }
        case None =>
          Redirect(routes.HomeController.index()) withSession (
            Global.SESSION_ERR_LOGGED -> FAILED
          )
      }
    }

  //todo: authorization
  def signIn(credentials: Option[LogIn]): Result = {
    credentials match {
      case Some(credentials) =>
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
      case None =>
        Redirect(routes.HomeController.index()) withSession (
          Global.SESSION_ERR_LOGGED -> FAILED
        )
    }
  }

  //todo: input validation email,letters etc.
  def signUp(userRaw: Option[RawUser]): Result = {
    userRaw match {
      case Some(raw) =>
        if (raw.password.equals(raw.passwordR)) {
          val user: User = getUserFromRaw(raw)
          val response =
            updateValidationResponse(userService.createUser(user))
          response match {
            case CREATED_ENTITY =>
              Created(CREATED_ENTITY).withSession(
                Global.SESSION_USERNAME_KEY -> user.username,
                Global.SESSION_ID -> user.id.get.toString,
                Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                Global.SESSION_ERR_LOGGED -> EMPTY_STRING
              )
            case ERR_ALREADY_EXIST => BadGateway(response)
            case _                 => BadRequest(response)
          }
        } else {
          logger.error(ERR_INVALID_PASS)
          BadGateway(ERR_INVALID_PASS).withSession(
            SESSION_SIGN_UP_INVALID_PASS -> ERR_INVALID_PASS
          )
        }
      case None =>
        logger.error(ERR_INVALID_FORM)
        BadRequest(ERR_INVALID_FORM).withSession(
          SESSION_INVALID_FORM -> ERR_INVALID_FORM
        )
    }
  }

  //todo: admin action
  def disableUser(id: String): Result = {
    val response = updateValidationResponse(userService.disableUser(id))
    response match {
      case UPDATED => Ok(response)
      case _       => BadRequest(response)
    }
  }

  //todo: If we have user address then ask if we want to change
  def checkout(id: String, checkOutRaw: Option[CheckOutRaw]): Result = {
    checkOutRaw match {
      case Some(raw) =>
        val user = userService.getUserById(id)
        val address: UserAddress = userAddressFromRaw(user, raw)
        val response =
          updateValidationResponse(userService.createUserAddress(address))

        response match {
          case CREATED_ENTITY =>
            //todo: Redirect to payment page
            Created(CREATED_ENTITY)
          case _ =>
            BadRequest(ERR_INVALID_FORM)
              .withSession(
                SESSION_INVALID_FORM -> ERR_INVALID_FORM,
                Global.SESSION_USERNAME_KEY -> user.username,
                Global.SESSION_ID -> user.id.get.toString
              )
        }
      case None =>
        BadRequest(ERR_INVALID_FORM)
          .withSession(SESSION_INVALID_FORM -> ERR_INVALID_FORM)
    }
  }

  def getUserById(id: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      //todo: html template missing
      Ok(Json.toJson(userService.getUserById(id)))
    }

  //todo: html template missing (only for admins)
  def getAllActiveUsers: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(Json.toJson(userService.getAllActiveUsers))
    }

  def logout: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Redirect(routes.HomeController.index()).withNewSession
    }
}
