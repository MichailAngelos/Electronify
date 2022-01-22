package controllers.utils

import java.security.MessageDigest
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Utils {

  def getFutureValue[T](future : Future[T]): T ={
    futureValidation(Some(Await.result(future, 10.seconds)))
  }

  def futureValidation[T](result:Option[T]): T = {
    result match {
      case Some(value) => value
      case None => throw new Exception("No Data found")
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
}
