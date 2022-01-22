package controllers.utils

import java.util.Date

object DateUtils {
  def timestampNow: String = {
    new Date().toString
  }
}
