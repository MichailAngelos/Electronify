package models.db

import com.sun.xml.internal.ws.util.JAXWSUtils.getUUID
import controllers.utils.DateUtils.timestampNow
import models.Logger
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

case class Cart(
    id: String,
    quantity: Int,
    createdAt: String,
    deletedAt: String = "",
    userId: String,
    productId: String
)

object Cart extends Logger {
  implicit val format: Format[Cart] = Json.format

  implicit val getProduct: AnyRef with GetResult[Cart] =
    GetResult(r =>
      Cart(
        r.nextString(),
        r.nextInt(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString()
      )
    )

  def createCart(userId: String, productId: String, quantity: Int): Cart = {
    Cart(
      id = getUUID,
      quantity,
      createdAt = timestampNow,
      userId = userId,
      productId = productId
    )
  }

}
