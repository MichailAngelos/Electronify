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

case class Products(products: Seq[Product])

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

  implicit val getProductsResult: AnyRef with GetResult[Seq[Product]] =
    GetResult(r => Seq(getProduct.apply(r)))

}

object Products extends Logger {
  implicit val format: Format[Products] = Json.format

  def getProducts(products: Vector[Seq[Product]]): Products = {
    Products(products.flatten)
  }

  def getCartProducts(products: Vector[Product]): Products = {
    Products(products)
  }
}
