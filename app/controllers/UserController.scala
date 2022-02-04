package controllers

import controllers.constants.Global
import controllers.constants.Global.{
  SESSION_INVALID_FORM,
  SESSION_SIGN_UP_INVALID_PASS
}
import controllers.constants.Responses._
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
import models.raw.{CheckOutRaw, RawUser}
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
      //todo: html template missing
      Ok(Json.toJson(userService.getUserById(id)))
    }

  //todo: html template missing (only for admins)
  def getAllActiveUsers: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok(Json.toJson(userService.getAllActiveUsers))
    }

  //todo: better input validation email,letters etc.
  def signUpUser: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val userRaw: Option[RawUser] = userForm.bindFromRequest().value
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

  //todo: missing authorization
  def logIn: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val credentials = logInForm.bindFromRequest().get
      val encryptedPassCredential =
        credentials.copy(password = encryptPassword(credentials.password))

      val mayUser: User =
        userService.logInUser(encryptedPassCredential)

      if (isUserValid(encryptedPassCredential, mayUser)) {
        Ok(SUCCESS).withSession(
          Global.SESSION_USERNAME_KEY -> credentials.username,
          Global.SESSION_ID -> mayUser.id.get.toString,
          Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
          Global.SESSION_ERR_LOGGED -> EMPTY_STRING
        )
      } else {
        BadRequest(FAILED) withSession (
          Global.SESSION_ERR_LOGGED -> FAILED
        )
      }
    }

  def logout: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      Ok("").withNewSession
    }

  //todo: admin action
  def disableUser: Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val id = extractUUID(request.body.asJson)
      val response = updateValidationResponse(userService.disableUser(id))

      response match {
        case UPDATED => Ok(response)
        case _       => BadRequest(response)
      }
    }

  //todo: If we have user address then ask if we want to change
  def checkout(id: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val checkOutRaw: Option[CheckOutRaw] =
        checkoutForm.bindFromRequest().value

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
          logger.info(checkoutForm.bindFromRequest().errors.toString())
          BadRequest(ERR_INVALID_FORM)
            .withSession(SESSION_INVALID_FORM -> ERR_INVALID_FORM)
      }
    }
}
