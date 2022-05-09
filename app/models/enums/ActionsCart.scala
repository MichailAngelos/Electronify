package models.enums

object ActionsCart extends Enumeration {
  type ActionsCart = Value
  val AddCart = "AddCart"
  val ClearCart = "ClearCart"
  val UpdateCart = "UpdateCart"
  val GetCart = "GetCart"
  val RemoveItem = "RemoveItem"
}
