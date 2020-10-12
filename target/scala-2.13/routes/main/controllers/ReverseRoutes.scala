// @GENERATOR:play-routes-compiler
// @SOURCE:/home/michail/dev/Electronify/conf/routes
// @DATE:Mon Oct 12 09:44:01 EEST 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def cart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart.html")
    }
  
    // @LINE:8
    def product(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "singleProduct.html")
    }
  
    // @LINE:10
    def shop(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "shop.html")
    }
  
    // @LINE:5
    def index(): Call = {
    
      () match {
      
        // @LINE:5
        case ()  =>
          
          Call("GET", _prefix)
      
      }
    
    }
  
    // @LINE:11
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact.html")
    }
  
    // @LINE:9
    def checkOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "checkout.html")
    }
  
  }

  // @LINE:15
  class ReverseElectronicsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def delete(id:Int): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "products/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:15
    def viewAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products")
    }
  
    // @LINE:19
    def editProduct(id:Int): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "products/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:18
    def addCart(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/cart/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:17
    def productDetails(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "products/details" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:16
    def createProduct(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "products/create")
    }
  
  }

  // @LINE:22
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
