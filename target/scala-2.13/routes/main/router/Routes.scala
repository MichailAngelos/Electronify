// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/micha/IdeaProjects/Electronify/conf/routes
// @DATE:Fri Dec 18 16:36:31 EET 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_2: controllers.HomeController,
  // @LINE:15
  ElectronicsController_0: controllers.ElectronicsController,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_2: controllers.HomeController,
    // @LINE:15
    ElectronicsController_0: controllers.ElectronicsController,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, ElectronicsController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, ElectronicsController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index.html""", """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart.html""", """controllers.HomeController.cart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """singleProduct.html""", """controllers.HomeController.product"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """checkout.html""", """controllers.HomeController.checkOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """shop.html""", """controllers.HomeController.shop"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact.html""", """controllers.HomeController.contact()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.ElectronicsController.viewAll"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/create""", """controllers.ElectronicsController.createProduct"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/details""", """controllers.ElectronicsController.productDetails(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/cart/""" + "$" + """id<[^/]+>""", """controllers.ElectronicsController.addCart(id:Int)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/edit/""" + "$" + """id<[^/]+>""", """controllers.ElectronicsController.editProduct(id:Int)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products/delete/""" + "$" + """id<[^/]+>""", """controllers.ElectronicsController.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index.html")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """index.html""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_cart2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart.html")))
  )
  private[this] lazy val controllers_HomeController_cart2_invoker = createInvoker(
    HomeController_2.cart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cart",
      Nil,
      "GET",
      this.prefix + """cart.html""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_product3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("singleProduct.html")))
  )
  private[this] lazy val controllers_HomeController_product3_invoker = createInvoker(
    HomeController_2.product,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "product",
      Nil,
      "GET",
      this.prefix + """singleProduct.html""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_checkOut4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("checkout.html")))
  )
  private[this] lazy val controllers_HomeController_checkOut4_invoker = createInvoker(
    HomeController_2.checkOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "checkOut",
      Nil,
      "GET",
      this.prefix + """checkout.html""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_shop5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("shop.html")))
  )
  private[this] lazy val controllers_HomeController_shop5_invoker = createInvoker(
    HomeController_2.shop,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "shop",
      Nil,
      "GET",
      this.prefix + """shop.html""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_contact6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact.html")))
  )
  private[this] lazy val controllers_HomeController_contact6_invoker = createInvoker(
    HomeController_2.contact(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "contact",
      Nil,
      "GET",
      this.prefix + """contact.html""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_ElectronicsController_viewAll7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_ElectronicsController_viewAll7_invoker = createInvoker(
    ElectronicsController_0.viewAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "viewAll",
      Nil,
      "GET",
      this.prefix + """products""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ElectronicsController_createProduct8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/create")))
  )
  private[this] lazy val controllers_ElectronicsController_createProduct8_invoker = createInvoker(
    ElectronicsController_0.createProduct,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "createProduct",
      Nil,
      "POST",
      this.prefix + """products/create""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ElectronicsController_productDetails9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/details")))
  )
  private[this] lazy val controllers_ElectronicsController_productDetails9_invoker = createInvoker(
    ElectronicsController_0.productDetails(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "productDetails",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """products/details""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ElectronicsController_addCart10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/cart/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElectronicsController_addCart10_invoker = createInvoker(
    ElectronicsController_0.addCart(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "addCart",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """products/cart/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ElectronicsController_editProduct11_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElectronicsController_editProduct11_invoker = createInvoker(
    ElectronicsController_0.editProduct(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "editProduct",
      Seq(classOf[Int]),
      "PUT",
      this.prefix + """products/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ElectronicsController_delete12_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ElectronicsController_delete12_invoker = createInvoker(
    ElectronicsController_0.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ElectronicsController",
      "delete",
      Seq(classOf[Int]),
      "DELETE",
      this.prefix + """products/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """Assets""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:6
    case controllers_HomeController_index1_route(params@_) =>
      call { 
        controllers_HomeController_index1_invoker.call(HomeController_2.index)
      }
  
    // @LINE:7
    case controllers_HomeController_cart2_route(params@_) =>
      call { 
        controllers_HomeController_cart2_invoker.call(HomeController_2.cart)
      }
  
    // @LINE:8
    case controllers_HomeController_product3_route(params@_) =>
      call { 
        controllers_HomeController_product3_invoker.call(HomeController_2.product)
      }
  
    // @LINE:9
    case controllers_HomeController_checkOut4_route(params@_) =>
      call { 
        controllers_HomeController_checkOut4_invoker.call(HomeController_2.checkOut)
      }
  
    // @LINE:10
    case controllers_HomeController_shop5_route(params@_) =>
      call { 
        controllers_HomeController_shop5_invoker.call(HomeController_2.shop)
      }
  
    // @LINE:11
    case controllers_HomeController_contact6_route(params@_) =>
      call { 
        controllers_HomeController_contact6_invoker.call(HomeController_2.contact())
      }
  
    // @LINE:15
    case controllers_ElectronicsController_viewAll7_route(params@_) =>
      call { 
        controllers_ElectronicsController_viewAll7_invoker.call(ElectronicsController_0.viewAll)
      }
  
    // @LINE:16
    case controllers_ElectronicsController_createProduct8_route(params@_) =>
      call { 
        controllers_ElectronicsController_createProduct8_invoker.call(ElectronicsController_0.createProduct)
      }
  
    // @LINE:17
    case controllers_ElectronicsController_productDetails9_route(params@_) =>
      call(params.fromQuery[Int]("id", None)) { (id) =>
        controllers_ElectronicsController_productDetails9_invoker.call(ElectronicsController_0.productDetails(id))
      }
  
    // @LINE:18
    case controllers_ElectronicsController_addCart10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ElectronicsController_addCart10_invoker.call(ElectronicsController_0.addCart(id))
      }
  
    // @LINE:19
    case controllers_ElectronicsController_editProduct11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ElectronicsController_editProduct11_invoker.call(ElectronicsController_0.editProduct(id))
      }
  
    // @LINE:20
    case controllers_ElectronicsController_delete12_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_ElectronicsController_delete12_invoker.call(ElectronicsController_0.delete(id))
      }
  
    // @LINE:22
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
