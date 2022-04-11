package models.enums

object Product {
  object GetProduct extends Enumeration {
    type GetProduct = Value
    val Details, All, OnSale, InStock, Category = Value

    def getProduct(action: Int): Option[Value] = {
      values.find(_.id == action)
    }
  }
}
