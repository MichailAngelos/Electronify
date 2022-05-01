package controllers.utils

import controllers.constants.Global
import controllers.constants.Responses._
import controllers.constants.Values.EMAIL_REGEX
import models.db.{Id, User}
import models.raw.LogIn
import models.Logger
import play.api.http.Status
import play.api.libs.json.{JsError, JsSuccess, JsValue}

import java.security.MessageDigest
import java.util.UUID
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Utils extends Logger {

  def getFutureValue[T](future: Future[T]): T = {
    futureValidation(Some(Await.result(future, 10.seconds)))
  }

  def futureValidation[T](result: Option[T]): T = {
    result match {
      case Some(value) => value
      case None        => throw new Exception("No Data found")
    }
  }

  def encryptPassword(password: String): String = {
    val algorithm: MessageDigest = MessageDigest.getInstance("SHA-256")
    val defaultBytes: Array[Byte] = password.getBytes
    algorithm.reset()
    algorithm.update(defaultBytes)
    val messageDigest: Array[Byte] = algorithm.digest
    convertBytesToHex(messageDigest)
  }

  def convertBytesToHex(bytes: Array[Byte]): String = {
    val sb = new StringBuilder
    for (b <- bytes) {
      sb.append(String.format("%02x", Byte.box(b)))
    }
    sb.toString
  }

  def updateValidationResponse(response: Int): String = {
    response match {
      case Status.CREATED     => CREATED_ENTITY
      case Status.ACCEPTED    => UPDATED
      case Status.OK          => DONE
      case Status.GONE        => ERR_USER_DISABLE
      case Status.BAD_GATEWAY => ERR_ALREADY_EXIST
      case _                  => ERR_INVALID_REQUEST
    }
  }

  def extractUUID(jsValue: Option[JsValue]): String = {
    jsValue match {
      case Some(js) =>
        js.validate[Id] match {
          case JsSuccess(value, _) =>
            value.id.getOrElse(UUID.fromString("")).toString
          case JsError(errors) =>
            logger.info("Invalid id" + errors)
            ""
        }
      case None =>
        logger.info("No ID was given")
        ""
    }
  }

  def isUserValid(credentials: LogIn, user: User): Boolean = {
    user.active && user.username == credentials.username && credentials.password == user.password
  }

  def isCreated(status: Int): Int = {
    status match {
      case 1 => Status.CREATED
      case _ => Status.BAD_REQUEST
    }
  }

  def isUpdated(status: Int): Int = {
    status match {
      case 1 => Status.ACCEPTED
      case _ => Status.BAD_REQUEST
    }
  }

  def isEmailValid(email: String): Boolean = {
    EMAIL_REGEX.matches(email.toLowerCase)
  }

  def getUserSession(user: User): Map[String, String] = {
    Map(
      Global.SESSION_USERNAME_KEY -> user.username,
      Global.SESSION_ID -> user.id.get.toString,
      Global.SESSION_LOGGED_IN_KEY -> LOGGED_IN,
      Global.SESSION_ERR_LOGGED -> EMPTY_STRING
    )
  }

  def validUpdateStatus(status: Int, update: String): Int = {
    if (status != Status.ACCEPTED) {
      logger.info(s"Failed to update $update table")
      status
    } else status
  }
}
