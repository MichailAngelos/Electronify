package controllers.enums

import controllers.enums

object UserPostActions extends Enumeration {
  type UserPostActions = Value
  val SignIn, SignUp, Disable, Checkout, Update = Value

  def getUserAction(action: Int): Option[enums.UserPostActions.Value] = {
    print(values.map(_.id))
    values.find(_.id == action)
  }
}
