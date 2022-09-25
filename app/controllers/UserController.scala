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
import models.raw.{CheckOutRaw, LogIn, RawAddress, RawUser}
import play.api.libs.json.Json
import play.api.mvc._

import javax.inject.Inject
import scala.concurrent.ExecutionContext

class UserController @Inject() (cc: ControllerComponents, service: UserService)(
    implicit ec: ExecutionContext
) extends AbstractController(cc) {

  def userPostAction(id: String = "", action: String): Action[AnyContent] =
    Action { implicit request: Request[AnyContent] =>
      action match {
        case SignIn  => signIn(logInForm.bindFromRequest().value, request)
        case SignUp  => signUp(userForm.bindFromRequest().value, request)
        case Disable => disableUser(extractUUID(request.body.asJson))
        case CreateAddress =>
          createAddress(id, checkoutForm.bindFromRequest().value, request)
        case ChangeAddress =>
          changeAddress(id, deleteAddress.bindFromRequest().value, request)
        case Payment =>
          completePayment(id, request)
        case Update =>
          // change user details
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
        case UserById    => getUserById(id, request.session)
        case ActiveUsers => getAllActiveUsers
        case Checkout | Payment =>
          getUserAddress(id) match {
            case Some(address) =>
              Ok(views.html.payment(address))
                .removingFromSession(SESSION_INVALID_FORM)
            case None =>
              Ok(views.html.checkout())
                .removingFromSession(SESSION_INVALID_FORM)
          }
        case LogOut => logout(id)
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
              level match {
                case Guest =>
                  Ok(
                    views.html.index()(
                      Session(
                        getUserSession(mayUser, Guest.toString)
                      )
                    )
                  )
                case Admin =>
                  Ok(
                    views.html.index()(
                      Session(
                        getUserSession(mayUser, Admin.toString)
                      )
                    )
                  ).addingToSession(
                    Global.SESSION_USERNAME_KEY -> mayUser.username,
                    Global.SESSION_ID -> mayUser.id.get.toString,
                    Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                    Global.SESSION_ERR_LOGGED -> EMPTY_STRING,
                    Global.SESSION_AUTH -> level.toString
                  )(request)
                case Customer =>
                  Ok(
                    views.html.index()(
                      Session(
                        getUserSession(mayUser, Customer.toString)
                      )
                    )
                  ).addingToSession(
                    Global.SESSION_USERNAME_KEY -> mayUser.username,
                    Global.SESSION_ID -> mayUser.id.get.toString,
                    Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                    Global.SESSION_ERR_LOGGED -> EMPTY_STRING,
                    Global.SESSION_AUTH -> level.toString
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
                    getUserSession(user, Customer.toString)
                  )
                )
              ).addingToSession(
                Global.SESSION_USERNAME_KEY -> user.username,
                Global.SESSION_ID -> user.id.get.toString,
                Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
                Global.SESSION_ERR_LOGGED -> EMPTY_STRING,
                Global.SESSION_AUTH -> Customer.toString
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

  def createAddress(
      id: String,
      addressRaw: Option[CheckOutRaw],
      request: Request[AnyContent]
  ): Result = {
    addressRaw match {
      case Some(raw) =>
        val user = service.getUserById(id)
        val address: UserAddress = userAddressFromRaw(user, raw)
        val response = service.createUserAddress(address)

        response match {
          case Some(address) =>
            Created(views.html.payment(address)(request.session))
          case None =>
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

  def completePayment(id: String, request: Request[AnyContent]): Result = {
    if (service.submitOrder(id) == 1) {
      Ok(views.html.index()(request.session))
        .addingToSession(Global.SESSION_ORDER -> ORDER_SUBMISSION)(request)
    } else
      BadRequest(views.html.index()(request.session))
  }

  def getUserById(id: String, session: Session): Result = {
    Ok(views.html.userCard(service.getUserById(id))(session))
  }

  //todo: html template missing (only for admins)
  def getAllActiveUsers: Result = {
    Ok(Json.toJson(service.getAllActiveUsers))
  }

  def logout(id: String): Result = {
    service.logOutSession(id)
    Ok(views.html.index()(Session())).withNewSession
  }

  def getUserAddress(id: String): Option[UserAddress] = {
    service.getUserAddress(id)
  }

  def changeAddress(
      userId: String,
      address: Option[RawAddress],
      request: Request[AnyContent]
  ): Result = {
    val update = service.deleteAddress(
      userId,
      address.getOrElse(RawAddress("00000000-0000-0000-0000-000000000000")).id
    )
    updateValidationResponse(update) match {
      case UPDATED =>
        Ok(views.html.checkout()(request.session))
          .removingFromSession(SESSION_INVALID_FORM)(request)
      case _ =>
        logger.error(s"Can't find address for this $userId")
        service.getUserAddress(userId)
        BadRequest(
          views.html
            .payment(service.getUserAddress(userId).get)(request.session)
        )
    }
  }
}
