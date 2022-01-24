package models

import controllers.utils.{DateUtils, Utils}
import play.api.libs.functional.syntax.{toFunctionalBuilderOps, unlift}
import play.api.libs.json._
import slick.jdbc.{GetResult, PositionedParameters, PositionedResult, SetParameter}

import java.sql.JDBCType
import java.util.UUID
import scala.language.postfixOps

case class User(
    id: Option[UUID] = Some(UUID.fromString("")),
    username: String,
    password: String,
    email: String,
    telephone: Int,
    created_at: Option[String] = Some(""),
    active: Option[Boolean] = Some(false)
)

object User {
  implicit val reads: Reads[User] = (
    (JsPath \ "id").readNullable[UUID] and
      (JsPath \ "username").read[String] and
      (JsPath \ "password").read[String] and
      (JsPath \ "email").read[String] and
      (JsPath \ "telephone").read[Int] and
      (JsPath \ "created_at").readNullable[String] and
      (JsPath \ "active").readNullable[Boolean]
  )(User.apply _)

  implicit val writes: Writes[User] = (
    (JsPath \ "id").writeNullable[UUID] and
      (JsPath \ "username").write[String] and
      (JsPath \ "password").write[String] and
      (JsPath \ "email").write[String] and
      (JsPath \ "telephone").write[Int] and
      (JsPath \ "created_at").writeNullable[String] and
      (JsPath \ "active").writeNullable[Boolean]
  )(unlift(User.unapply))

  implicit val getUserResult: AnyRef with GetResult[User] =
    GetResult(r =>
      User(
        Some(uuidMapping(r).nextUUID),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextInt(),
        Some(r.nextString()),
        Some(r.nextBoolean())
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
      user.active
    )
  }

  implicit class uuidMapping(val r: PositionedResult) extends AnyVal{
    def nextUUID : UUID =  UUID.fromString(r.nextString())
    }

  implicit object SetUUID extends SetParameter[UUID] {
    def apply(v: UUID, pp: PositionedParameters): Unit = {
      pp.setObject(v, JDBCType.BINARY.getVendorTypeNumber)
    }
  }

  def defaultUser: User = {
    User(
      username = "",
      password = "",
      email = "",
      telephone = 0
    )
  }

  def extractFormData(form: Option[JsValue]): User = {
    form match {
      case Some(userForm) =>
        userForm.validate[User] match {
          case JsSuccess(value, _) =>
            value.copy(
              id = Some(UUID.randomUUID()),
              password = Utils.encryptPassword(value.password),
              created_at = Some(DateUtils.timestampNow),
              active = Some(true)
            )
          case JsError(errors) =>
            throw new Exception("Invalid User Form " + errors)
        }
      case None => throw new Exception("Failed Empty Form")
    }
  }
}

case class UserList(users: Seq[User])

object UserList {
  implicit val format: Format[UserList] = Json.format[UserList]

  def getUserList(users: Vector[Seq[User]]): UserList = {
    UserList(users.flatten)
  }
}
