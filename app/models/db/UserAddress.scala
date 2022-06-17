package models.db

import models.raw.CheckOutRaw
import play.api.libs.json.{Format, Json}
import slick.jdbc.GetResult

import java.util.UUID

case class UserAddress(
    id: String,
    address: String,
    addressO: String,
    city: String,
    postCode: String,
    country: String,
    telephone: String,
    name: String,
    userId: String,
    comments: String
)

object UserAddress {
  implicit val format: Format[UserAddress] = Json.format[UserAddress]

  def userAddressFromRaw(user: User, form: CheckOutRaw): UserAddress = {
    UserAddress(
      UUID.randomUUID().toString,
      form.address,
      form.addressO,
      form.city,
      form.postCode.toString,
      form.country,
      user.telephone.toString,
      form.name,
      user.id.get.toString,
      form.comments
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
        r.nextString(),
        r.nextString()
      )
    )
}
