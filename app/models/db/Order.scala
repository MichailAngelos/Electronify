package models.db

import models.Logger
import play.api.libs.json.{Format, Json}

case class Order(
    id: String,
    status: String,
    items: Seq[String],
    address: String,
    total: Double
)
object Order extends Logger {
  implicit val format: Format[Order] = Json.format
}
