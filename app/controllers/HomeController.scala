package controllers
/**Version 1 will be released in March 2021 */
import javax.inject._
import play.api.mvc._

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index(): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def cart(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.cart())
  }

  def product(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.singleProduct())
  }

  def shop(): Action[AnyContent] = Action { implicit request =>
   Ok(views.html.shop())
  }


  def checkOut(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.checkout())
  }

  def contact(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.contact())
  }

  def signUp(): Action[AnyContent] = Action { implicit request =>
    Ok(views.html.signup())
  }
}