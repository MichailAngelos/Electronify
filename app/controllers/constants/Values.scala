package controllers.constants

import scala.util.matching.Regex

object Values {
  val EMAIL_REGEX: Regex = "^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$".r

  val getProduct: Map[Int, String] = Map(
    1 -> "Details",
    2 -> "All",
    3 -> "OnSale",
    4 -> "InStock",
    5 -> "Category"
  )

  val postProduct: Map[Int, String] = Map(
    1 -> "Create",
    2 -> "Update",
    3 -> "Remove",
    4 -> "SetSale"
  )
}
