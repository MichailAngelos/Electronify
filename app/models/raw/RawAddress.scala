package models.raw

import play.api.libs.json.{Format, Json}

case class RawAddress(id: String)

object RawAddress {
  implicit val format: Format[RawAddress] = Json.format[RawAddress]
}
