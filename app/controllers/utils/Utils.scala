package controllers.utils

import controllers.constants.Responses._
import models.Id
import play.api.http.Status
import play.api.libs.json.{JsError, JsSuccess, JsValue}

import java.security.MessageDigest
import java.util.UUID
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Utils {

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

  def convertBytesToHex(bytes: Seq[Byte]): String = {
    val sb = new StringBuilder
    for (b <- bytes) {
      sb.append(String.format("%02x", Byte.box(b)))
    }
    sb.toString
  }

  def updateValidationResponse(response: Int): String = {
    response match {
      case Status.CREATED     => USER_CREATED
      case Status.ACCEPTED    => USER_UPDATED
      case Status.OK          => DONE
      case Status.GONE        => ERR_USER_DISABLE
      case Status.BAD_GATEWAY => ERR_USER_EXIST
      case _                  => ERR_INVALID_REQUEST
    }
  }

  def extractUUID(jsValue: Option[JsValue]): String = {
    jsValue match {
      case Some(js) =>
        js.validate[Id] match {
          case JsSuccess(value, _) => value.id.getOrElse(UUID.fromString("")).toString
          case JsError(errors)     => throw new Exception("Invalid id" + errors)
        }
      case None => throw new Exception("No id was given")
    }
  }
}
