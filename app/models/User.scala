package models

import play.api.libs.json.{Format, Json}

case class User(
    id: Int,
    username: String,
    password: String,
    email: String,
    telephone: Int,
    created_at: String,
    active: Boolean
)

object User {
  implicit val format: Format[User] = Json.format
}