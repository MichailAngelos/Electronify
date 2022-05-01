package models.db

import models.Logger
import play.api.libs.json.{Json, OFormat}
import slick.jdbc.GetResult

case class CartProduct(id: String, quantity: Int)

object CartProduct extends Logger {
  implicit val format: OFormat[CartProduct] = Json.format[CartProduct]

  implicit val getProductCartResult: AnyRef with GetResult[CartProduct] =
    GetResult(r =>
      CartProduct(
        r.nextString(),
        r.nextInt()
      )
    )

  implicit val getProductCartResultSeq
      : AnyRef with GetResult[Seq[CartProduct]] =
    GetResult(r => Seq(getProductCartResult.apply(r)))

}
