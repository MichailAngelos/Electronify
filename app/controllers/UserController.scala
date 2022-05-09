package controllers

import controllers.constants.Global
import controllers.constants.Global._
import controllers.constants.Responses._
import controllers.services.UserService
import controllers.utils.Utils
import controllers.utils.Utils.{logger, _}
import models.db.User._
import models.db.UserAddress.userAddressFromRaw
import models.db.{User, UserAddress}
import models.enums.ActionsUser._
import models.enums.UserAuth
import models.enums.UserAuth._
import models.forms.Forms._
import models.raw.{CheckOutRaw, LogIn, RawUser}
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserController @Inject() (
    cc: ControllerComponents,
    service: UserService
)(implicit ec: ExecutionContext)
    extends AbstractController(cc) {

  def userPostAction(id: String = "", action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case SignIn   => signIn(logInForm.bindFromRequest().value, request)
        case SignUp   => signUp(userForm.bindFromRequest().value, request)
        case Disable  => disableUser(extractUUID(request.body.asJson))
        case Checkout => checkout(id, checkoutForm.bindFromRequest().value)
        case Update =>
          Ok(views.html.index())
            .withSession(Global.SESSION_USERNAME_KEY -> "")
        case _ =>
          BadRequest(views.html.index())
            .withSession(Global.SESSION_USERNAME_KEY -> "")
      }
    }

  def getUserActions(id: String = "", action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case UserById    => getUserById(id)
        case ActiveUsers => getAllActiveUsers
        case LogOut      => logout(id)
        case _ =>
          BadRequest(views.html.index())
            .withSession(Global.SESSION_USERNAME_KEY -> "")
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
          service.logInUser(encryptedPassCredential)

        if (isUserValid(encryptedPassCredential, mayUser)) {
          val authLevel = UserAuth.getUserAuthLevel(mayUser.auth)
          authLevel match {
            case Some(level) =>
              val logIn: Result =
                Ok(
                  views.html.index()(
                    request.session.copy(
                      getUserSession(mayUser)
                    )
                  )
                ).addingToSession(
                  Global.SESSION_USERNAME_KEY -> credentials.username,
                  Global.SESSION_ID -> mayUser.id.get.toString,
                  Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                  Global.SESSION_ERR_LOGGED -> EMPTY_STRING
                )(request)
              level match {
                case Guest =>
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Guest.toString
                  )(request)
                case Admin =>
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Admin.toString
                  )(request)
                case Customer =>
                  logIn.addingToSession(
                    Global.SESSION_AUTH -> Customer.toString
                  )(request)
              }
            case None =>
              BadRequest(views.html.index()(request.session)).withSession(
                Global.SESSION_ERR_LOGGED -> FAILED
              )
          }

        } else {
          BadRequest(views.html.index()(request.session)) withSession (
            Global.SESSION_ERR_LOGGED -> FAILED
          )
        }
      case None =>
        BadRequest(views.html.index()(request.session)) withSession (
          Global.SESSION_ERR_LOGGED -> FAILED
        )
    }
  }

  def signUp(userRaw: Option[RawUser], request: Request[AnyContent]): Result = {
    userRaw match {
      case Some(raw) =>
        if (raw.password.equals(raw.passwordR)) {
          val user: User = getUserFromRaw(raw)
          val response =
            updateValidationResponse(service.createUser(user))
          response match {
            case CREATED_ENTITY =>
              Created(
                views.html.index()(
                  request.session.copy(
                    getUserSession(user)
                  )
                )
              ).addingToSession(
                Global.SESSION_USERNAME_KEY -> user.username,
                Global.SESSION_ID -> user.id.get.toString,
                Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                Global.SESSION_ERR_LOGGED -> EMPTY_STRING
              )(request)
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
    val response = updateValidationResponse(service.disableUser(id))
    response match {
      case UPDATED => Ok(response)
      case _       => BadRequest(response)
    }
  }

  //todo: If we have user address then ask if we want to change
  def checkout(id: String, checkOutRaw: Option[CheckOutRaw]): Result = {
    checkOutRaw match {
      case Some(raw) =>
        val user = service.getUserById(id)
        val address: UserAddress = userAddressFromRaw(user, raw)
        val response =
          updateValidationResponse(service.createUserAddress(address))

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
    Ok(Json.toJson(service.getUserById(id)))
  }

  //todo: html template missing (only for admins)
  def getAllActiveUsers: Result = {
    Ok(Json.toJson(service.getAllActiveUsers))
  }

  def logout(id: String): Result = {
    service.logOutSession(id)
    Redirect(routes.HomeController.index()).withNewSession
  }
}
