package controllers.constants

import models.raw.RawUser
import play.api.data.Form
import play.api.data.Forms.{mapping, number, text}

object Forms {

  val userForm: Form[RawUser] = Form {
    mapping(
      "username" -> text,
      "password" -> text,
      "passwordR" -> text,
      "email" -> text,
      "telephone" -> number
    )(RawUser.apply)(RawUser.unapply)
  }
}
