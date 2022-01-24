package controllers.forms

import models.raw.{LogIn, RawUser}
import play.api.data.Form
import play.api.data.Forms.{mapping, number, text, tuple}

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

  val logInForm: Form[LogIn] = Form {
    mapping(
      "username" -> text,
      "password" -> text
    )(LogIn.apply)(LogIn.unapply)
  }
}
