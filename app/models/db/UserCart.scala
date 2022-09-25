package models.db

import models.Logger
import play.api.libs.json.{Json, OFormat}
case class UserCart(
    id: String,
    products: Products,
    total: Double,
    shipping: Double = 19.99
)

object UserCart extends Logger {
  implicit val format: OFormat[UserCart] = Json.format[UserCart]
}
