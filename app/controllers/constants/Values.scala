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

  val COUNTRIES: Seq[String] = Seq(
    "Åland",
    "Afghanistan",
    "Albania",
    "Algeria",
    "Andorra",
    "Angola",
    "Anguilla",
    "Antarctica",
    "Antigua",
    "Argentina",
    "Armenia",
    "Aruba",
    "Australia",
    "Austria",
    "Azerbaijan",
    "Bahamas",
    "Bahrain",
    "Bangladesh",
    "Barbados",
    "Belarus",
    "Belau",
    "Belgium",
    "Belize",
    "Benin",
    "Bermuda",
    "Bhutan",
    "Bolivia",
    "Bonaire",
    "Bosnia",
    "Botswana",
    "Bouvet Island",
    "Brazil",
    "British",
    "British",
    "Brunei",
    "Bulgaria",
    "Burkina",
    "Burundi",
    "Cambodia",
    "Cameroon",
    "Canada",
    "Cape",
    "Cayman Islands",
    "Central",
    "Chad",
    "Chile",
    "China",
    "Christmas Island",
    "Cocos",
    "Colombia",
    "Comoros",
    "Congo",
    "Congo",
    "Cook Islands",
    "Costa Rica",
    "Croatia",
    "Cuba",
    "CuraÇao",
    "Republic of Cyprus",
    "Czech Republic",
    "Denmark",
    "Djibouti",
    "Dominica",
    "Dominican",
    "Ecuador",
    "Egypt",
    "El",
    "Equatorial Guinea",
    "Eritrea",
    "Estonia",
    "Ethiopia",
    "Falkland",
    "Faroe",
    "Fiji",
    "Finland",
    "France",
    "French Guiana",
    "Gabon",
    "Gambia",
    "Georgia",
    "Germany",
    "Ghana",
    "Gibraltar",
    "Greece",
    "Greenland",
    "Grenada",
    "Guadeloupe",
    "Guatemala",
    "Guernsey",
    "Guinea",
    "Guinea",
    "Guyana",
    "Haiti",
    "Heard",
    "Heard and McDonald Islands",
    "Honduras",
    "Hong Kong",
    "Hungary",
    "Iceland",
    "India",
    "Indonesia",
    "Iran",
    "Iraq",
    "Israel",
    "Italy",
    "Ivory",
    "Jamaica",
    "Japan",
    "Jersey",
    "Jordan",
    "Kazakhstan",
    "Kenya",
    "Kiribati",
    "Kuwait",
    "Kyrgyzstan",
    "Laos",
    "Latvia",
    "Lebanon",
    "Lesotho",
    "Liberia",
    "Libya",
    "Liechtenstein",
    "Lithuania",
    "Luxembourg",
    "Macao",
    "China",
    "North Macedonia",
    "Madagascar",
    "Malawi",
    "Malaysia",
    "Maldives",
    "Mali",
    "Malta",
    "Marshall",
    "Martinique",
    "Mauritania",
    "Mauritius",
    "Mayotte",
    "Mexico",
    "Micronesia",
    "Moldova",
    "Monaco",
    "Mongolia",
    "Montenegro",
    "Montserrat",
    "Morocco",
    "Mozambique",
    "Myanmar",
    "Namibia",
    "Nauru",
    "Nepal",
    "Netherlands",
    "Netherlands",
    "New Zealand",
    "Nicaragua",
    "Niger",
    "Nigeria",
    "Niue",
    "Norfolk",
    "Norway",
    "Oman",
    "Pakistan",
    "Palestinian",
    "Panama",
    "Papua",
    "Paraguay",
    "Peru",
    "Philippines",
    "Pitcairn",
    "Poland",
    "Portugal",
    "Qatar",
    "Republic",
    "Reunion",
    "Romania",
    "Russia",
    "Rwanda",
    "São",
    "Sanibel Island",
    "Saudi Arabia",
    "Senegal",
    "Serbia",
    "Seychelles",
    "Sierra",
    "Singapore",
    "Slovakia",
    "Slovenia",
    "Solomon",
    "Somalia",
    "Spain",
    "Sri Lanka",
    "Sudan",
    "Suriname",
    "Svalbard",
    "Swaziland",
    "Sweden",
    "Switzerland",
    "Syria",
    "Taiwan",
    "Tajikistan",
    "Tanzania",
    "Thailand",
    "Timor",
    "Togo",
    "Tokelau",
    "Tonga",
    "Trinidad",
    "Tunisia",
    "Turkey",
    "Turkmenistan",
    "Turks",
    "Tuvalu",
    "Uganda",
    "Ukraine",
    "United",
    "United Kingdom",
    "United States of America",
    "Uruguay",
    "Uzbekistan",
    "Vanuatu",
    "Vatican",
    "Venezuela",
    "Vietnam",
    "Wallis and Futuna",
    "Yemen",
    "Zambia",
    "Zimbabwe"
  )
}
