package controllers

import javax.inject._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def cart(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.cart())
  }

  def product() = Action { implicit request =>
    Ok(views.html.singleProduct())
  }

  def shop() = Action { implicit request =>
   Ok(views.html.shop())
  }


  def checkOut() = Action { implicit request =>
    Ok(views.html.checkout())
  }

  def contact() = Action { implicit request =>
    Ok(views.html.contact())

  }

def addCart(id :Int) : Action[AnyContent]= Action{implicit request =>
  // TODO
  ???
}
}