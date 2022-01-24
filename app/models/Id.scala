package models

import play.api.libs.json.{OFormat, Json}

import java.util.UUID

case class Id(id: Option[UUID])

object Id {
  implicit val format: OFormat[Id] = Json.format[Id]
}
