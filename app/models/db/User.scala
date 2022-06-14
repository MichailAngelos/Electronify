package models.db

import controllers.utils.{DateUtils, Utils}
import models.Logger
import models.raw.RawUser
import play.api.libs.functional.syntax.{toFunctionalBuilderOps, unlift}
import play.api.libs.json._
import slick.jdbc.{
  GetResult,
  PositionedParameters,
  PositionedResult,
  SetParameter
}

import java.sql.JDBCType
import java.util.UUID
import scala.language.postfixOps

case class User(
    id: Option[UUID],
    username: String,
    password: String,
    email: String,
    telephone: Int,
    created_at: String = "",
    active: Boolean = false,
    auth: Int = 0,
    profileImage: String = "img/user-account.png"
)

case class UserList(users: Seq[User])

object User extends Logger {
  implicit val reads: Reads[User] = (
    (JsPath \ "id").readNullable[UUID] and
      (JsPath \ "username").read[String] and
      (JsPath \ "password").read[String] and
      (JsPath \ "email").read[String] and
      (JsPath \ "telephone").read[Int] and
      (JsPath \ "created_at").read[String] and
      (JsPath \ "active").read[Boolean] and
      (JsPath \ "auth").read[Int] and
      (JsPath \ "profileImage").read[String]
  )(User.apply _)

  implicit val writes: Writes[User] = (
    (JsPath \ "id").writeNullable[UUID] and
      (JsPath \ "username").write[String] and
      (JsPath \ "password").write[String] and
      (JsPath \ "email").write[String] and
      (JsPath \ "telephone").write[Int] and
      (JsPath \ "created_at").write[String] and
      (JsPath \ "active").write[Boolean] and
      (JsPath \ "auth").write[Int] and
      (JsPath \ "profileImage").write[String]
  )(unlift(User.unapply))

  implicit val getUserResult: AnyRef with GetResult[User] =
    GetResult(r =>
      User(
        Some(uuidMapping(r).nextUUID),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextInt(),
        r.nextString(),
        r.nextBoolean(),
        r.nextInt(),
        r.nextString()
      )
    )

  implicit val getUsersResultSeq: AnyRef with GetResult[Seq[User]] =
    GetResult(r => Seq(getUserResult.apply(r)))

  implicit val setUser: SetParameter[User] = SetParameter { (user, _) =>
    User(
      user.id,
      user.username,
      user.password,
      user.email,
      user.telephone,
      user.created_at,
      user.active,
      user.auth,
      user.profileImage
    )
  }

  implicit class uuidMapping(val r: PositionedResult) extends AnyVal {
    def nextUUID: UUID = UUID.fromString(r.nextString())
  }

  implicit object SetUUID extends SetParameter[UUID] {
    def apply(v: UUID, pp: PositionedParameters): Unit = {
      pp.setObject(v, JDBCType.BINARY.getVendorTypeNumber)
    }
  }

  def defaultUser: User = {
    User(
      id = Some(UUID.fromString("00000000-0000-0000-0000-000000000000")),
      username = "",
      password = "",
      email = "",
      telephone = 0
    )
  }

  def getUserFromRaw(form: RawUser): User = {
    User(
      id = Some(UUID.randomUUID()),
      username = form.username,
      password = Utils.encryptPassword(form.password),
      email = form.email,
      telephone = form.telephone,
      created_at = DateUtils.timestampNow,
      active = true,
      auth = 2
    )
  }
}

object UserList {
  implicit val format: Format[UserList] = Json.format[UserList]

  def getUserList(users: Vector[Seq[User]]): UserList = {
    UserList(users.flatten)
  }
}
