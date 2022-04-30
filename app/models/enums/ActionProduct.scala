package models.enums

object ActionProduct extends Enumeration {
  type ActionProduct = Value
  val Details = "Details"
  val All = "All"
  val OnSale = "OnSale"
  val InStock = "InStock"
  val Create = "Create"
  val Update = "Update"
  val Remove = "Remove"
  val SetSale = "SetSale"
}
