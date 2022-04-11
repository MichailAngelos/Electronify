package models.enums

object UserAuth extends Enumeration {
  type UserAuth = Value
  val Guest, Admin, Customer = Value

  def getUserAuthLevel(action: Int): Option[Value] = {
    values.find(_.id == action)
  }
}
