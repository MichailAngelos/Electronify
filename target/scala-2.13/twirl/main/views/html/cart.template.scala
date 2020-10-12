
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-10-12T09:44:02.303
                  SOURCE: /home/michail/dev/Electronify/app/views/cart.scala.html
                  HASH: 766584c46de396a8bf2054a313a1f5c32974b9ea
                  MATRIX: 721->1|817->4|844->6|864->18|903->20|934->25|1269->332|1285->338|1344->375|1465->469|1480->475|1523->497|1610->556|1626->562|1682->596|1800->687|1815->693|1862->719|1949->778|1965->784|2022->819|2144->914|2159->920|2203->943|2290->1002|2306->1008|2363->1043|2482->1135|2497->1141|2544->1167|2624->1219|2640->1225|2698->1261|4574->3110|4589->3116|4633->3139|4749->3228|4764->3234|4825->3273|5560->3981|5575->3987|5619->4010|5759->4123|5774->4129|5817->4151|5958->4265|5973->4271|6016->4293|6156->4406|6171->4412|6218->4438|6363->4556|6378->4562|6424->4587|7625->5760|7641->5766|7703->5806|8140->6215|8156->6221|8218->6261|8655->6670|8671->6676|8733->6716|9170->7125|9186->7131|9248->7171|9820->7715|9836->7721|9897->7759|10034->7868|10050->7874|10111->7912|10249->8022|10265->8028|10326->8066|10463->8175|10479->8181|10540->8219|10677->8328|10693->8334|10754->8372|12452->10041|12469->10047|12536->10091|15385->12911|15402->12917|15463->12955|16300->13763|16317->13769|16378->13807|18618->16019|18634->16025|18689->16057|18977->16317|18993->16323|19058->16366|19139->16419|19155->16425|19217->16465|19298->16518|19314->16524|19367->16555|19448->16608|19464->16614|19529->16657|19587->16687|19603->16693|19673->16741|19731->16771|19747->16777|19812->16820|19870->16850|19886->16856|19948->16896
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|36->12|36->12|36->12|36->12|36->12|36->12|38->14|38->14|38->14|38->14|38->14|38->14|40->16|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|42->18|81->57|81->57|81->57|82->58|82->58|82->58|102->78|102->78|102->78|105->81|105->81|105->81|108->84|108->84|108->84|111->87|111->87|111->87|114->90|114->90|114->90|148->124|148->124|148->124|155->131|155->131|155->131|162->138|162->138|162->138|169->145|169->145|169->145|180->156|180->156|180->156|181->157|181->157|181->157|182->158|182->158|182->158|183->159|183->159|183->159|184->160|184->160|184->160|211->187|211->187|211->187|255->231|255->231|255->231|266->242|266->242|266->242|312->288|312->288|312->288|323->299|323->299|323->299|324->300|324->300|324->300|325->301|325->301|325->301|326->302|326->302|326->302|327->303|327->303|327->303|328->304|328->304|328->304|329->305|329->305|329->305
                  -- GENERATED --
              */
          