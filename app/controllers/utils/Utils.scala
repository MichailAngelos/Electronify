package controllers.utils

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Utils {

  def getFutureValue[T](future : Future[T]): T ={
    userFutureValidation(Some(Await.result(future, 10.seconds)))
  }

  def userFutureValidation[T](result:Option[T]): T = {
    result match {
      case Some(value) => value
      case None => throw new Exception("No Data found")
    }
  }
}
