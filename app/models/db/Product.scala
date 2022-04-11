package models.db

import models.Logger
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

case class Product(
    id: String,
    name: String,
    brand: String,
    price: Double,
    onSale: Boolean,
    inStock: Boolean,
    createdAt: String
)

object Product extends Logger {
  implicit val format: Format[Product] = Json.format

  implicit val getProduct: AnyRef with GetResult[Product] =
    GetResult(r =>
      Product(
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextDouble(),
        r.nextBoolean(),
        r.nextBoolean(),
        r.nextString()
      )
    )
}

case class Products(products: Seq[Product])

object Products extends Logger {
  implicit val format: Format[Products] = Json.format
}
