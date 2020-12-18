
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object singleProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Product")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div class="header-area">
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                            <li><a href="#"><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*10.102*/routes/*10.108*/.Assets.versioned("/img/account.png")),format.raw/*10.145*/("""">
                                Account</a></li>
                            <li><a href=""""),_display_(/*12.43*/routes/*12.49*/.HomeController.cart()),format.raw/*12.71*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*12.130*/routes/*12.136*/.Assets.versioned("/img/cart.png")),format.raw/*12.170*/("""">
                                Cart</a></li>
                            <li><a href=""""),_display_(/*14.43*/routes/*14.49*/.HomeController.checkOut()),format.raw/*14.75*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*14.134*/routes/*14.140*/.Assets.versioned("/img/check.png")),format.raw/*14.175*/("""">
                                Checkout</a></li>
                            <li><a href=""""),_display_(/*16.43*/routes/*16.49*/.HomeController.index()),format.raw/*16.72*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*16.131*/routes/*16.137*/.Assets.versioned("/img/login.png")),format.raw/*16.172*/("""">
                                Login</a></li>
                            <li><a href=""""),_display_(/*18.43*/routes/*18.49*/.HomeController.checkOut()),format.raw/*18.75*/(""""><img class="rounded" height="20" width="20" src=""""),_display_(/*18.127*/routes/*18.133*/.Assets.versioned("/img/signup.png")),format.raw/*18.169*/("""">SignUp</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="header-right">
                        <ul class="list-unstyled list-inline">
                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">
                                    currency :</span><span class="value">USD </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">USD</a></li>
                                    <li><a href="#">EUR</a></li>
                                    <li><a href="#">GBP</a></li>
                                </ul>
                            </li>

                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">
                                    language :</span><span class="value">English </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="index.html">English</a></li>
                                    <li><a href="#">Greek</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- End header area -->

    <div class="site-branding-area">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        <h1><a href=""""),_display_(/*57.39*/routes/*57.45*/.HomeController.index()),format.raw/*57.68*/("""">
                            <img class="img-thumbnail" height="150" width="200" src=""""),_display_(/*58.87*/routes/*58.93*/.Assets.versioned("/img/eshoplogo.png")),format.raw/*58.132*/(""""></a></h1>
                    </div>
                </div>

                <div class="col-sm-6">
                    <div class="shopping-item">
                        <a href="cart.html">Cart - <span class="cart-amunt">
                            $0</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">0</span></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- End site branding area -->
    <div class="mainmenu-area">
        <div class="container">
            <nav class="navbar navbar-expand-sm">

                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a href=""""),_display_(/*78.35*/routes/*78.41*/.HomeController.index()),format.raw/*78.64*/("""">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*81.35*/routes/*81.41*/.HomeController.shop()),format.raw/*81.63*/("""">Store</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*84.35*/routes/*84.41*/.HomeController.cart()),format.raw/*84.63*/("""">Cart</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*87.35*/routes/*87.41*/.HomeController.checkOut()),format.raw/*87.67*/("""">Checkout</a>
                    </li>
                    <li class="nav-item">
                        <<a href=""""),_display_(/*90.36*/routes/*90.42*/.HomeController.contact()),format.raw/*90.67*/("""">Contact</a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-11">
                    <div class="product-bit-title text-center" >
                        <h2>Store</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <div class="single-product-area">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Search Products</h2>
                        <form action="">
                            <input type="text" placeholder="Search products...">
                            <input type="submit" value="Search">
                        </form>
                    </div>

                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Products</h2>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*124.40*/routes/*124.46*/.Assets.versioned("img/alienware.jpg")),format.raw/*124.84*/("""" class="recent-thumb" alt="">
                            <h2><a href="">Sony Smart TV</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*131.40*/routes/*131.46*/.Assets.versioned("img/alienware.jpg")),format.raw/*131.84*/("""" class="recent-thumb" alt="">
                            <h2><a href="">Sony Smart TV </a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*138.40*/routes/*138.46*/.Assets.versioned("img/alienware.jpg")),format.raw/*138.84*/("""" class="recent-thumb" alt="">
                            <h2><a href="">Sony Smart TV </a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*145.40*/routes/*145.46*/.Assets.versioned("img/alienware.jpg")),format.raw/*145.84*/("""" class="recent-thumb" alt="">
                            <h2><a href="">Sony Smart TV </a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="product-breadcroumb">
                            <a href=""""),_display_(/*157.39*/routes/*157.45*/.HomeController.index()),format.raw/*157.68*/("""">Home</a>
                            <a href="#">Sony Smart TV </a>
                            <br><br>
                        </div>

                        <div class="row">
                            <div class="col-sm-6">
                                <div class="product-images">
                                    <div class="product-main-img">
                                        <img src=""""),_display_(/*166.52*/routes/*166.58*/.Assets.versioned("img/product-thumb-4.jpg")),format.raw/*166.102*/("""" alt="">
                                    </div>
                                    <br>
                                    <div class="product-gallery">
                                        <img src=""""),_display_(/*170.52*/routes/*170.58*/.Assets.versioned("img/alienware.jpg")),format.raw/*170.96*/("""" alt="">
                                        <img src=""""),_display_(/*171.52*/routes/*171.58*/.Assets.versioned("img/product-thumb-2.jpg")),format.raw/*171.102*/("""" alt="">
                                        <img src=""""),_display_(/*172.52*/routes/*172.58*/.Assets.versioned("img/product-thumb-3.jpg")),format.raw/*172.102*/("""" alt="">
                                        <img src=""""),_display_(/*173.52*/routes/*173.58*/.Assets.versioned("img/product-thumb-4.jpg")),format.raw/*173.102*/("""" alt="">
                                    </div>
                                </div>
                            </div>

                            <div class="col-sm-6">
                                <div class="product-inner">
                                    <h2 class="product-name">Sony Smart TV</h2>
                                    <div class="product-inner-price">
                                        <ins>$700.00</ins> <del>$800.00</del>
                                    </div>

                                    <form action="" class="cart">
                                        <div class="quantity">
                                            <input type="number" size="4" class="input-text qty text" title="Qty" value="1" name="quantity" min="1" step="1">
                                        </div>
                                        <button class="add_to_cart_button" type="submit">Add to cart</button>
                                    </form>

                                    <div role="tabpanel">
                                        <ul class="product-tab" role="tablist">
                                            <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab">
                                                Description</a></li>
                                            <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab">
                                                Reviews</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="home">
                                                <h2>Product Description</h2>
                                                <p>Explaining Here in more details about a single Product that the User click on</p>
                                            </div>
                                            <div role="tabpanel" class="tab-pane fade" id="profile">
                                                <h2>Reviews</h2>
                                                <div class="submit-review">
                                                    <p><label for="name">Name</label> <input name="name" type="text"></p>
                                                    <p><label for="email">
                                                        Email</label> <input name="email" type="email"></p>
                                                    <div class="rating-chooser">
                                                        <p>Your rating</p>

                                                        <div class="rating-wrap-post">
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                            <i class="fa fa-star"></i>
                                                        </div>
                                                    </div>
                                                    <p><label for="review">
                                                        Your review</label> <textarea name="review" id="" cols="30" rows="10"></textarea></p>
                                                    <p><input type="submit" value="Submit"></p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="footer-bottom-area">
        <div class="row">
            <div class="col-md-8">
                <div class="copyright" style="padding-left: 40px">
                    <p>European standards   <img height="20" width="20" src=""""),_display_(/*241.79*/routes/*241.85*/.Assets.versioned("/img/eu.png")),format.raw/*241.117*/(""""></p><br>
                    <p>&copy; 2020 eShop. All Rights Reserved.</p>
                </div>
            </div>
        </div>
    </div>

        <!-- End footer bottom area -->


""")))}),format.raw/*251.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-12-18T16:36:31.983
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/singleProduct.scala.html
                  HASH: 666ce588bb0bfe7c904c92ef516cbc592b8eb17f
                  MATRIX: 730->1|826->3|856->8|879->23|918->25|950->31|1291->344|1307->350|1366->387|1489->483|1504->489|1547->511|1634->570|1650->576|1706->610|1826->703|1841->709|1888->735|1975->794|1991->800|2048->835|2172->932|2187->938|2231->961|2318->1020|2334->1026|2391->1061|2512->1155|2527->1161|2574->1187|2654->1239|2670->1245|2728->1281|4643->3169|4658->3175|4702->3198|4819->3288|4834->3294|4895->3333|5650->4061|5665->4067|5709->4090|5852->4206|5867->4212|5910->4234|6054->4351|6069->4357|6112->4379|6255->4495|6270->4501|6317->4527|6465->4648|6480->4654|6526->4679|7752->5877|7768->5883|7828->5921|8254->6319|8270->6325|8330->6363|8757->6762|8773->6768|8833->6806|9260->7205|9276->7211|9336->7249|9916->7801|9932->7807|9977->7830|10425->8250|10441->8256|10508->8300|10751->8515|10767->8521|10827->8559|10917->8621|10933->8627|11000->8671|11090->8733|11106->8739|11173->8783|11263->8845|11279->8851|11346->8895|15788->13309|15804->13315|15859->13347|16090->13547
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|82->57|82->57|82->57|83->58|83->58|83->58|103->78|103->78|103->78|106->81|106->81|106->81|109->84|109->84|109->84|112->87|112->87|112->87|115->90|115->90|115->90|149->124|149->124|149->124|156->131|156->131|156->131|163->138|163->138|163->138|170->145|170->145|170->145|182->157|182->157|182->157|191->166|191->166|191->166|195->170|195->170|195->170|196->171|196->171|196->171|197->172|197->172|197->172|198->173|198->173|198->173|266->241|266->241|266->241|276->251
                  -- GENERATED --
              */
          