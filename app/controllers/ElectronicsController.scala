package controllers

//Features to  implement in the next version

import play.api.mvc._
import play.mvc.Controller


class ElectronicsController extends Controller {

  def addCart(id: Int) : Action[AnyContent] = ???

  def createProduct() :Action[AnyContent] = ???

  def editProduct(id: Int) :Action[AnyContent]  = ???

  def viewAll() :Action[AnyContent] = ???

  def delete(id : Int) :Action[AnyContent]  = ???

  def productDetails(id :Int) :Action[AnyContent]  = ???
}