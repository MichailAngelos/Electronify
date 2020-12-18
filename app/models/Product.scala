package models

import play.api.libs.json.{Format, Json}

case class Product(id: Int, name: String, price: Double, brand: String)

object Product {
  implicit val format: Format[Product] = Json.format
}
