package models.raw

import models.Logger
import play.api.libs.json.{Format, Json}

case class CheckOutRaw(
    name: String,
    address: String,
    addressO: String = "",
    city: String,
    postCode: Int,
    country: String,
    comments :String = ""
)

object CheckOutRaw extends Logger {
  implicit val format: Format[CheckOutRaw] = Json.format[CheckOutRaw]
}
