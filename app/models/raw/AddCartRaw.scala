package models.raw

import models.Logger
import play.api.libs.json.{Format, Json}

case class AddCartRaw(quantity: Int)

object AddCartRaw extends Logger {
  implicit val format: Format[AddCartRaw] = Json.format[AddCartRaw]
}
