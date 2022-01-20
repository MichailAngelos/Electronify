package services

import play.api.mvc.Result

import scala.concurrent.Future
import scala.util.{Failure, Success}

object Validation {

  def futureValidation(result: Future[Result]): Result = {
    result.value match {
      case Some(value) =>
        value match {
          case Failure(exception) => throw new Exception("No Data " + exception)
          case Success(value)     => value
        }
      case None => throw new Exception("I failed No Data")
    }
  }

}
