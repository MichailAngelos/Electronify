package models

import play.api.libs.functional.syntax.{toFunctionalBuilderOps, unlift}
import play.api.libs.json.{Format, JsPath, Json, OFormat, Reads, Writes}
import slick.jdbc.GetResult

import scala.language.postfixOps

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
  implicit val reads:  Reads[User]= (
    (JsPath \ "id").read[Int] and
      (JsPath \ "username").read[String] and
      (JsPath \ "password").read[String] and
      (JsPath \ "email").read[String] and
      (JsPath \ "telephone").read[Int] and
      (JsPath \ "created_at").read[String] and
      (JsPath \ "active").read[Boolean]
    )(User.apply _)

  implicit val writes : Writes[User]= (
    (JsPath \ "id").write[Int] and
      (JsPath \ "username").write[String] and
      (JsPath \ "password").write[String] and
      (JsPath \ "email").write[String] and
      (JsPath \ "telephone").write[Int] and
      (JsPath \ "created_at").write[String] and
      (JsPath \ "active").write[Boolean]
    )(unlift(User.unapply))

  implicit val getUserResult: AnyRef with GetResult[Seq[User]] = GetResult(r =>
    Seq(User(
      r.nextInt(),
      r.nextString(),
      r.nextString(),
      r.nextString(),
      r.nextInt(),
      r.nextString(),
      r.nextBoolean()
    )
  ))

  def defaultUser: User = {
    User(
      id = 0,
      username = "",
      password = "",
      email = "",
      telephone = 0,
      created_at = "",
      active = false
    )
  }
}

case class UserList(users: Seq[User])

object UserList {
  implicit val format: Format[UserList] = Json.format[UserList]

  def getUserList(users: Vector[Seq[User]]): UserList = {
    UserList(users.flatten)
  }

}
