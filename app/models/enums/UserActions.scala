package models.enums

object UserActions {
  object UserGetActions extends Enumeration {
    type UserGetActions = Value
    val GetUser, ActiveUsers, LogOut = Value

    def getUserAction(action: Int): Option[Value] = {
      values.find(_.id == action)
    }
  }

  object UserPostActions extends Enumeration {
    type UserPostActions = Value
    val SignIn, SignUp, Disable, Checkout, Update = Value

    def getUserAction(action: Int): Option[Value] = {
      values.find(_.id == action)
    }
  }
}