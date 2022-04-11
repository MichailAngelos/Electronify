package controllers

import controllers.constants.Global
import controllers.constants.Global._
import controllers.constants.Responses._
import controllers.services.UserService
import controllers.utils.Utils
import controllers.utils.Utils.{
  encryptPassword,
  extractUUID,
  isUserValid,
  updateValidationResponse
}
import models.db.{User, UserAddress}
import models.db.User._
import models.db.UserAddress.userAddressFromRaw
import models.enums.UserActions.UserGetActions._
import models.enums.UserActions.{UserGetActions, UserPostActions}
import models.enums.UserActions.UserPostActions._
import models.enums.UserAuth._
import models.enums.UserAuth
import models.forms.Forms._
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
            case SignIn   => signIn(logInForm.bindFromRequest().value, request)
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

  def getUserActions(id: String = "", action: Int): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      val getAction: Option[UserGetActions.Value] =
        UserGetActions.getUserAction(action)

      getAction match {
        case Some(action) =>
          action match {
            case GetUser     => getUserById(id)
            case ActiveUsers => getAllActiveUsers
            case LogOut      => logout
          }
        case None =>
          Redirect(routes.HomeController.index()) withSession (
            Global.SESSION_ERR_LOGGED -> FAILED
          )
      }
    }

  def signIn(
      credentials: Option[LogIn],
      request: Request[AnyContent]
  ): Result = {
    credentials match {
      case Some(credentials) =>
        val encryptedPassCredential =
          credentials.copy(password = encryptPassword(credentials.password))
        val mayUser: User =
          userService.logInUser(encryptedPassCredential)

        if (isUserValid(encryptedPassCredential, mayUser)) {
          val authLevel = UserAuth.getUserAuthLevel(mayUser.auth)
          authLevel match {
            case Some(level) =>
              val logIn: Result =
                Redirect(routes.HomeController.index()).withSession(
                  Global.SESSION_USERNAME_KEY -> credentials.username,
                  Global.SESSION_ID -> mayUser.id.get.toString,
                  Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                  Global.SESSION_ERR_LOGGED -> EMPTY_STRING
                )
              level match {
                case Guest =>
                  print(Guest.toString)
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Guest.toString
                  )(request)
                case Admin =>
                  print(Admin.toString)
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Admin.toString
                  )(request)
                case Customer =>
                  print(Customer.toString)
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Customer.toString
                  )(request)
              }
            case None =>
              Redirect(routes.HomeController.index()) withSession (
                Global.SESSION_ERR_LOGGED -> FAILED
              )
          }

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
        } else if (Utils.isEmailValid(raw.email)) {
          logger.error(ERR_INVALID_EMAIL)
          BadGateway(ERR_INVALID_EMAIL).withSession(
            SESSION_INVALID_FORM -> ERR_INVALID_EMAIL
          )
        } else {
          logger.error(ERR_INVALID_PASS)
          BadGateway(ERR_INVALID_PASS).withSession(
            SESSION_INVALID_EMAIL -> ERR_INVALID_PASS
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

  //todo: html template missing
  def getUserById(id: String): Result = {
    Ok(Json.toJson(userService.getUserById(id)))
  }

  //todo: html template missing (only for admins)
  def getAllActiveUsers: Result = {
    Ok(Json.toJson(userService.getAllActiveUsers))
  }

  def logout: Result = {
    Redirect(routes.HomeController.index()).withNewSession
  }
}
