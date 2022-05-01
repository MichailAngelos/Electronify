package models.db

import play.api.libs.json.{Json, OFormat}

import java.util.UUID

case class Id(id: Option[UUID])

object Id {
  implicit val format: OFormat[Id] = Json.format[Id]
}
