package models.enums

object ActionsUser extends Enumeration {
  type ActionsUser = Value
  val UserById = "UserById"
  val ActiveUsers = "ActiveUsers"
  val LogOut = "LogOut"
  val SignIn = "SignIn"
  val SignUp = "SignUp"
  val Disable = "Disable"
  val Checkout = "CheckOut"
  val Update = "Update"
}
