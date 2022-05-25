package controllers.constants

import scala.util.matching.Regex

object Values {
  val EMAIL_REGEX: Regex = "^w+([.-]?w+)*@w+([.-]?w+)*(.w{2,3})+$".r

  val EU_COUNTRIES: Seq[String] = Seq(
    "Austria",
    "Belgium",
    "Bulgaria",
    "Croatia",
    "Republic of Cyprus",
    "Czech Republic",
    "Denmark",
    "Estonia",
    "Finland",
    "France",
    "Germany",
    "Greece",
    "Hungary",
    "Ireland",
    "Italy",
    "Latvia",
    "Lithuania",
    "Luxembourg",
    "Malta",
    "Netherlands",
    "Poland",
    "Portugal",
    "Romania",
    "Slovakia",
    "Slovenia",
    "Spain",
    "Sweden"
  )
}
