
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

object shop extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Store")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""

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
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*115.40*/routes/*115.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*115.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*117.39*/routes/*117.45*/.HomeController.product()),format.raw/*117.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*131.40*/routes/*131.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*131.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*133.39*/routes/*133.45*/.HomeController.product()),format.raw/*133.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*147.40*/routes/*147.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*147.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*149.39*/routes/*149.45*/.HomeController.product()),format.raw/*149.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>
                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*162.40*/routes/*162.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*162.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*164.39*/routes/*164.45*/.HomeController.product()),format.raw/*164.70*/("""">ASony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*178.40*/routes/*178.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*178.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*180.39*/routes/*180.45*/.HomeController.product()),format.raw/*180.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*194.40*/routes/*194.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*194.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*196.39*/routes/*196.45*/.HomeController.product()),format.raw/*196.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>
                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*209.40*/routes/*209.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*209.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*211.39*/routes/*211.45*/.HomeController.product()),format.raw/*211.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*225.40*/routes/*225.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*225.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*227.39*/routes/*227.45*/.HomeController.product()),format.raw/*227.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*241.40*/routes/*241.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*241.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*243.39*/routes/*243.45*/.HomeController.product()),format.raw/*243.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*257.40*/routes/*257.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*257.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*259.39*/routes/*259.45*/.HomeController.product()),format.raw/*259.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*273.40*/routes/*273.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*273.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*275.39*/routes/*275.45*/.HomeController.product()),format.raw/*275.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                            <img src=""""),_display_(/*289.40*/routes/*289.46*/.Assets.versioned("img/product-4.jpg")),format.raw/*289.84*/("""" alt="">
                        </div>
                        <h2><a href=""""),_display_(/*291.39*/routes/*291.45*/.HomeController.product()),format.raw/*291.70*/("""">Sony Playstation</a></h2>
                        <div class="product-carousel-price">
                            <ins>$899.00</ins> <del>$999.00</del>
                        </div>

                        <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">
                                Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-bottom-area">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright" style="padding-left: 40px">
                        <p>European standards   <img height="20" width="20" src=""""),_display_(/*308.83*/routes/*308.89*/.Assets.versioned("/img/eu.png")),format.raw/*308.121*/(""""></p><br>
                        <p>&copy; 2020 eShop. All Rights Reserved.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- End footer bottom area -->

        <!-- JavaScript , Bootstrap ,Jquery files-->
    <script src=""""),_display_(/*318.19*/routes/*318.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*318.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*319.19*/routes/*319.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*319.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*320.19*/routes/*320.25*/.Assets.versioned("js/main.js")),format.raw/*320.56*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*321.19*/routes/*321.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*321.68*/(""""></script>
    <script src=""""),_display_(/*322.19*/routes/*322.25*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*322.73*/(""""></script>
    <script src=""""),_display_(/*323.19*/routes/*323.25*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*323.68*/(""""></script>
    <script src=""""),_display_(/*324.19*/routes/*324.25*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*324.65*/(""""></script>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-12T09:44:02.218
                  SOURCE: /home/michail/dev/Electronify/app/views/shop.scala.html
                  HASH: ec9eb19c590ae471f0ad5f1aab1997f408860265
                  MATRIX: 721->1|817->5|838->18|877->20|909->26|1244->333|1260->339|1319->376|1440->470|1455->476|1498->498|1585->557|1601->563|1657->597|1775->688|1790->694|1837->720|1924->779|1940->785|1997->820|2119->915|2134->921|2178->944|2265->1003|2281->1009|2338->1044|2457->1136|2472->1142|2519->1168|2599->1220|2615->1226|2673->1262|4549->3111|4564->3117|4608->3140|4724->3229|4739->3235|4800->3274|5535->3982|5550->3988|5594->4011|5734->4124|5749->4130|5792->4152|5933->4266|5948->4272|5991->4294|6131->4407|6146->4413|6193->4439|6338->4557|6353->4563|6399->4588|7171->5332|7187->5338|7247->5376|7354->5455|7370->5461|7417->5486|8181->6222|8197->6228|8257->6266|8364->6345|8380->6351|8427->6376|9191->7112|9207->7118|9267->7156|9374->7235|9390->7241|9437->7266|10200->8001|10216->8007|10276->8045|10383->8124|10399->8130|10446->8155|11211->8892|11227->8898|11287->8936|11394->9015|11410->9021|11457->9046|12221->9782|12237->9788|12297->9826|12404->9905|12420->9911|12467->9936|13230->10671|13246->10677|13306->10715|13413->10794|13429->10800|13476->10825|14240->11561|14256->11567|14316->11605|14423->11684|14439->11690|14486->11715|15250->12451|15266->12457|15326->12495|15433->12574|15449->12580|15496->12605|16260->13341|16276->13347|16336->13385|16443->13464|16459->13470|16506->13495|17270->14231|17286->14237|17346->14275|17453->14354|17469->14360|17516->14385|18280->15121|18296->15127|18356->15165|18463->15244|18479->15250|18526->15275|19394->16115|19410->16121|19465->16153|19782->16442|19798->16448|19863->16491|19944->16544|19960->16550|20022->16590|20103->16643|20119->16649|20172->16680|20253->16733|20269->16739|20334->16782|20392->16812|20408->16818|20478->16866|20536->16896|20552->16902|20617->16945|20675->16975|20691->16981|20753->17021
                  LINES: 21->1|26->2|26->2|26->2|28->4|34->10|34->10|34->10|36->12|36->12|36->12|36->12|36->12|36->12|38->14|38->14|38->14|38->14|38->14|38->14|40->16|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|42->18|81->57|81->57|81->57|82->58|82->58|82->58|102->78|102->78|102->78|105->81|105->81|105->81|108->84|108->84|108->84|111->87|111->87|111->87|114->90|114->90|114->90|139->115|139->115|139->115|141->117|141->117|141->117|155->131|155->131|155->131|157->133|157->133|157->133|171->147|171->147|171->147|173->149|173->149|173->149|186->162|186->162|186->162|188->164|188->164|188->164|202->178|202->178|202->178|204->180|204->180|204->180|218->194|218->194|218->194|220->196|220->196|220->196|233->209|233->209|233->209|235->211|235->211|235->211|249->225|249->225|249->225|251->227|251->227|251->227|265->241|265->241|265->241|267->243|267->243|267->243|281->257|281->257|281->257|283->259|283->259|283->259|297->273|297->273|297->273|299->275|299->275|299->275|313->289|313->289|313->289|315->291|315->291|315->291|332->308|332->308|332->308|342->318|342->318|342->318|343->319|343->319|343->319|344->320|344->320|344->320|345->321|345->321|345->321|346->322|346->322|346->322|347->323|347->323|347->323|348->324|348->324|348->324
                  -- GENERATED --
              */
          