package models.forms

import models.raw._
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

  val logInForm: Form[LogIn] = Form {
    mapping(
      "username" -> text,
      "password" -> text
    )(LogIn.apply)(LogIn.unapply)
  }

  val checkoutForm: Form[CheckOutRaw] = Form {
    mapping(
      "name" -> text,
      "address" -> text,
      "addressO" -> text,
      "city" -> text,
      "postCode" -> number,
      "country" -> text,
      "comments" -> text
    )(CheckOutRaw.apply)(CheckOutRaw.unapply)
  }

  val addToCartF: Form[AddCartRaw] = Form {
    mapping(
      "quantity" -> number
    )(AddCartRaw.apply)(AddCartRaw.unapply)
  }
}
