package models.raw

import play.api.libs.json.{Format, Json}

case class LogIn(username: String, password: String)

object LogIn {
  implicit val format: Format[LogIn] = Json.format[LogIn]
}
