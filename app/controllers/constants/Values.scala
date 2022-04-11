package controllers.constants

import scala.util.matching.Regex

object Values {
  val EMAIL_REGEX: Regex = "^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$".r
}
