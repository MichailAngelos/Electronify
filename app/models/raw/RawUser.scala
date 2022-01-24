package models.raw

import play.api.libs.json.{Format, Json}

case class RawUser(
    username: String,
    password: String,
    passwordR: String,
    email: String,
    telephone: Int
)

object RawUser {
  implicit val format : Format[RawUser] = Json.format[RawUser]
}