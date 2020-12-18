
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Cart")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
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
                        <h2>Shopping Cart</h2>
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
                        <form action="#">
                            <input type="text" placeholder="Search products...">
                            <input type="submit" value="Search">
                        </form>
                    </div>

                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Products</h2>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*124.40*/routes/*124.46*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*124.86*/("""" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Mac Book Air</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*131.40*/routes/*131.46*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*131.86*/("""" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Mac Book Air</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*138.40*/routes/*138.46*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*138.86*/("""" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Mac Book Air</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                        <div class="thubmnail-recent">
                            <img src=""""),_display_(/*145.40*/routes/*145.46*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*145.86*/("""" class="recent-thumb" alt="">
                            <h2><a href="single-product.html">Mac Book Air</a></h2>
                            <div class="product-sidebar-price">
                                <ins>$700.00</ins> <del>$800.00</del>
                            </div>
                        </div>
                    </div>

                    <div class="single-sidebar">
                        <h2 class="sidebar-title">Recent Posts</h2>
                        <ul>
                            <li><a href="#"><img src=""""),_display_(/*156.56*/routes/*156.62*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*156.100*/("""" class="recent-thumb" alt="">Sony Smart TV </a></li>
                            <li><a href="#"><img src=""""),_display_(/*157.56*/routes/*157.62*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*157.100*/("""" class="recent-thumb" alt="">Sony Smart TV  </a></li>
                            <li><a href="#"><img src=""""),_display_(/*158.56*/routes/*158.62*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*158.100*/("""" class="recent-thumb" alt="">Sony Smart TV </a></li>
                            <li><a href="#"><img src=""""),_display_(/*159.56*/routes/*159.62*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*159.100*/("""" class="recent-thumb" alt="">Sony Smart TV </a></li>
                            <li><a href="#"><img src=""""),_display_(/*160.56*/routes/*160.62*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*160.100*/("""" class="recent-thumb" alt="">Sony Smart TV </a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-remove">&nbsp;</th>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-name">Product</th>
                                            <th class="product-price">Price</th>
                                            <th class="product-quantity">Quantity</th>
                                            <th class="product-subtotal">Total</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove" href="#">×</a>
                                            </td>

                                            <td class="product-thumbnail">
                                                <a href="single-product.html"><img width="145" height="145" alt="poster_1_up" class="shop_thumbnail" src=""""),_display_(/*187.156*/routes/*187.162*/.Assets.versioned("img/product-thumb-4.jpg")),format.raw/*187.206*/(""""></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="single-product.html">Ship Your Idea</a>
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">£299.00</span>
                                            </td>

                                            <td class="product-quantity">
                                                <div class="quantity buttons_added">

                                                    <input type="number" size="4" class="input-text qty text" title="Qty" value="1" min="0" step="1">

                                                </div>
                                            </td>

                                            <td class="product-subtotal">
                                                <span class="amount">£340.00</span>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="actions" colspan="6">
                                                <div class="coupon">
                                                    <label for="coupon_code">Coupon:</label>
                                                    <input type="text" placeholder="Coupon code" value="" id="coupon_code" class="input-text" name="coupon_code">
                                                    <input type="submit" value="Apply Coupon" name="apply_coupon" class="button">
                                                </div>
                                                <input type="submit" value="Update Cart" name="update_cart" class="button"><br>
                                                <input type="submit" value="Proceed to Checkout" name="proceed" class="checkout-button button alt wc-forward">
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </form>

                            <div class="cart-collaterals">
                                <div class="cross-sells">
                                    <h2>You may be interested in...</h2>
                                    <ul class="products">
                                        <li class="product">
                                            <a href="single-product.html">
                                                <img width="325" height="325" alt="T_4_front" class="attachment-shop_catalog wp-post-image" src=""""),_display_(/*231.147*/routes/*231.153*/.Assets.versioned("img/product-2.jpg")),format.raw/*231.191*/("""">
                                                <h3>Ship Your Idea</h3>
                                                <span class="price"><span class="amount">£20.00</span></span>
                                            </a>

                                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="22" rel="nofollow" href="single-product.html">
                                                Select options</a>
                                        </li>

                                        <li class="product">
                                            <a href="single-product.html">
                                                <img width="325" height="325" alt="T_4_front" class="attachment-shop_catalog wp-post-image"  src=""""),_display_(/*242.148*/routes/*242.154*/.Assets.versioned("img/product-4.jpg")),format.raw/*242.192*/("""">
                                                <h3>Buy anything</h3>
                                                <span class="price"><span class="amount">£20.00</span></span>
                                            </a>

                                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="22" rel="nofollow" href="single-product.html">
                                                Select options</a>
                                        </li>
                                    </ul>
                                </div>


                                <div class="cart_totals ">
                                    <h2>Cart Totals</h2>

                                    <table cellspacing="0">
                                        <tbody>
                                            <tr class="cart-subtotal">
                                                <th>Cart Subtotal</th>
                                                <td><span class="amount">£299.00</span></td>
                                            </tr>

                                            <tr class="shipping">
                                                <th>Shipping and Handling</th>
                                                <td>40.00</td>
                                            </tr>

                                            <tr class="order-total">
                                                <th>Order Total</th>
                                                <td><strong><span class="amount">£339.00</span></strong> </td>
                                            </tr>
                                        </tbody>
                                    </table>
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
                    <p>European standards   <img height="20" width="20" src=""""),_display_(/*288.79*/routes/*288.85*/.Assets.versioned("/img/eu.png")),format.raw/*288.117*/(""""></p><br>
                    <p>&copy; 2020 eShop. All Rights Reserved.</p>
                </div>
            </div>
        </div>
    </div>

        <!-- End footer bottom area -->


        <!-- JavaScript , Bootstrap ,Jquery files-->
    <script src=""""),_display_(/*299.19*/routes/*299.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*299.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*300.19*/routes/*300.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*300.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*301.19*/routes/*301.25*/.Assets.versioned("js/main.js")),format.raw/*301.56*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*302.19*/routes/*302.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*302.68*/(""""></script>
    <script src=""""),_display_(/*303.19*/routes/*303.25*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*303.73*/(""""></script>
    <script src=""""),_display_(/*304.19*/routes/*304.25*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*304.68*/(""""></script>
    <script src=""""),_display_(/*305.19*/routes/*305.25*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*305.65*/(""""></script>

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
                  DATE: 2020-12-18T16:36:31.894
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/cart.scala.html
                  HASH: d0b28e5aafc7175ffeab27994cf7397dd92c173e
                  MATRIX: 721->1|817->3|847->8|867->20|906->22|938->28|1279->341|1295->347|1354->384|1477->480|1492->486|1535->508|1622->567|1638->573|1694->607|1814->700|1829->706|1876->732|1963->791|1979->797|2036->832|2160->929|2175->935|2219->958|2306->1017|2322->1023|2379->1058|2500->1152|2515->1158|2562->1184|2642->1236|2658->1242|2716->1278|4631->3166|4646->3172|4690->3195|4807->3285|4822->3291|4883->3330|5638->4058|5653->4064|5697->4087|5840->4203|5855->4209|5898->4231|6042->4348|6057->4354|6100->4376|6243->4492|6258->4498|6305->4524|6453->4645|6468->4651|6514->4676|7749->5883|7765->5889|7827->5929|8271->6345|8287->6351|8349->6391|8793->6807|8809->6813|8871->6853|9315->7269|9331->7275|9393->7315|9976->7870|9992->7876|10053->7914|10191->8024|10207->8030|10268->8068|10407->8179|10423->8185|10484->8223|10622->8333|10638->8339|10699->8377|10837->8487|10853->8493|10914->8531|12639->10227|12656->10233|12723->10277|15616->13141|15633->13147|15694->13185|16542->14004|16559->14010|16620->14048|18906->16306|18922->16312|18977->16344|19276->16615|19292->16621|19357->16664|19439->16718|19455->16724|19517->16764|19599->16818|19615->16824|19668->16855|19750->16909|19766->16915|19831->16958|19890->16989|19906->16995|19976->17043|20035->17074|20051->17080|20116->17123|20175->17154|20191->17160|20253->17200
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|82->57|82->57|82->57|83->58|83->58|83->58|103->78|103->78|103->78|106->81|106->81|106->81|109->84|109->84|109->84|112->87|112->87|112->87|115->90|115->90|115->90|149->124|149->124|149->124|156->131|156->131|156->131|163->138|163->138|163->138|170->145|170->145|170->145|181->156|181->156|181->156|182->157|182->157|182->157|183->158|183->158|183->158|184->159|184->159|184->159|185->160|185->160|185->160|212->187|212->187|212->187|256->231|256->231|256->231|267->242|267->242|267->242|313->288|313->288|313->288|324->299|324->299|324->299|325->300|325->300|325->300|326->301|326->301|326->301|327->302|327->302|327->302|328->303|328->303|328->303|329->304|329->304|329->304|330->305|330->305|330->305
                  -- GENERATED --
              */
          