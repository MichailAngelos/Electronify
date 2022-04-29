package models.db

import models.Logger
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

import java.util.UUID

case class Product(
    id: String,
    name: String,
    brand: String,
    price: Double,
    onSale: Boolean,
    inStock: Boolean,
    createdAt: String,
    category: String,
    sale: Int,
    stock: Int,
    image: String
)

object Product extends Logger {
  implicit val format: Format[Product] = Json.format

//Remove if are not needed
//  implicit val reads: Reads[Product] = (
//    (JsPath \ "id").read[String] and
//      (JsPath \ "name").read[String] and
//      (JsPath \ "brand").read[String] and
//      (JsPath \ "price").read[Double] and
//      (JsPath \ "onSale").read[Boolean] and
//      (JsPath \ "inStock").read[Boolean] and
//      (JsPath \ "createdAt").read[String]
//  )(Product.apply _)
//
//  implicit val writes: Writes[Product] = (
//    (JsPath \ "id").write[String] and
//      (JsPath \ "name").write[String] and
//      (JsPath \ "brand").write[String] and
//      (JsPath \ "price").write[Double] and
//      (JsPath \ "onSale").write[Boolean] and
//      (JsPath \ "inStock").write[Boolean] and
//      (JsPath \ "createdAt").write[String]
//  )(unlift(Product.unapply))

  implicit val getProduct: AnyRef with GetResult[Product] =
    GetResult(r =>
      Product(
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextDouble(),
        r.nextBoolean(),
        r.nextBoolean(),
        r.nextString(),
        r.nextString(),
        r.nextInt(),
        r.nextInt(),
        r.nextString()
      )
    )

  def defaultProduct: Product = {
    Product(
      id = UUID.fromString("00000000-0000-0000-0000-000000000000").toString,
      name = "",
      brand = "",
      price = 0.0,
      onSale = false,
      inStock = false,
      createdAt = "",
      category = "",
      sale = 0,
      stock = 0,
      image = ""
    )
  }
}

case class Products(products: Seq[Product])

object Products extends Logger {
  implicit val format: Format[Products] = Json.format
}
