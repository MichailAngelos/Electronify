package models.db

import models.Logger
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

case class ShoppingSession(
    id: String,
    userId: String,
    logIn: String,
    logOut: String = ""
)

object ShoppingSession extends Logger {
  implicit val format: Format[ShoppingSession] = Json.format

  implicit val getProduct: AnyRef with GetResult[ShoppingSession] =
    GetResult(r =>
      ShoppingSession(
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString()
      )
    )
}
