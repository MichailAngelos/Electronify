package models.enums

import controllers.constants.Values

trait Product

sealed abstract class ProductAction(name: Map[Int, String]) {
  def getAction(action: Int): Option[String] = {
    name.get(action)
  }
}

object Product {
  case object GetProduct extends ProductAction(Values.getProduct)
  case object PostProduct extends ProductAction(Values.postProduct)
}

object ActionProduct extends Enumeration {
  type ActionProduct = Value
  val Details = "Details"
  val All = "All"
  val OnSale = "OnSale"
  val InStock = "InStock"
  val Category = "Category"
  val Create = "Create"
  val Update = "Update"
  val Remove = "Remove"
  val SetSale = "SetSale"
}
