package models.db

import models.Logger
import play.api.libs.json.{Json, OFormat}

case class UserCart(id: String, products: Products, total: Double)

object UserCart extends Logger {
  implicit val format: OFormat[UserCart] = Json.format[UserCart]
}
