package models.db

import models.raw.CheckOutRaw
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

import java.util.UUID

case class UserAddress(
    id: String,
    name: String,
    address: String,
    addressO: String,
    city: String,
    postCode: String,
    country: String,
    telephone: String,
    userId: String
)

object UserAddress {
  implicit val format: Format[UserAddress] = Json.format[UserAddress]

  def userAddressFromRaw(user: User, form: CheckOutRaw): UserAddress = {
    UserAddress(
      UUID.randomUUID().toString,
      form.name,
      form.address,
      form.addressO,
      form.city,
      form.postCode.toString,
      form.country,
      user.telephone.toString,
      user.id.get.toString
    )
  }

  implicit val getUserResult: AnyRef with GetResult[UserAddress] =
    GetResult(r =>
      UserAddress(
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString(),
        r.nextString()
      )
    )
}
