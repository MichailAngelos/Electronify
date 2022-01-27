package models.raw

import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

case class LogIn(username: String, password: String)

object LogIn {
  implicit val format: Format[LogIn] = Json.format[LogIn]

  implicit val getUserResult: AnyRef with GetResult[LogIn] = GetResult(r => LogIn(r.<<, r.<<))
}
