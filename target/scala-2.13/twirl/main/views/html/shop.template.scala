
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


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/main("Store")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""

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
                  DATE: 2020-12-18T16:36:31.975
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/shop.scala.html
                  HASH: b3ef0f986c0f22184487a0dbae85c4e9677be75a
                  MATRIX: 721->1|817->3|845->6|866->19|905->21|939->29|1280->342|1296->348|1355->385|1478->481|1493->487|1536->509|1623->568|1639->574|1695->608|1815->701|1830->707|1877->733|1964->792|1980->798|2037->833|2161->930|2176->936|2220->959|2307->1018|2323->1024|2380->1059|2501->1153|2516->1159|2563->1185|2643->1237|2659->1243|2717->1279|4632->3167|4647->3173|4691->3196|4808->3286|4823->3292|4884->3331|5639->4059|5654->4065|5698->4088|5841->4204|5856->4210|5899->4232|6043->4349|6058->4355|6101->4377|6244->4493|6259->4499|6306->4525|6454->4646|6469->4652|6515->4677|7312->5446|7328->5452|7388->5490|7497->5571|7513->5577|7560->5602|8338->6352|8354->6358|8414->6396|8523->6477|8539->6483|8586->6508|9364->7258|9380->7264|9440->7302|9549->7383|9565->7389|9612->7414|10388->8162|10404->8168|10464->8206|10573->8287|10589->8293|10636->8318|11415->9069|11431->9075|11491->9113|11600->9194|11616->9200|11663->9225|12441->9975|12457->9981|12517->10019|12626->10100|12642->10106|12689->10131|13465->10879|13481->10885|13541->10923|13650->11004|13666->11010|13713->11035|14491->11785|14507->11791|14567->11829|14676->11910|14692->11916|14739->11941|15517->12691|15533->12697|15593->12735|15702->12816|15718->12822|15765->12847|16543->13597|16559->13603|16619->13641|16728->13722|16744->13728|16791->13753|17569->14503|17585->14509|17645->14547|17754->14628|17770->14634|17817->14659|18595->15409|18611->15415|18671->15453|18780->15534|18796->15540|18843->15565|19728->16422|19744->16428|19799->16460|20126->16759|20142->16765|20207->16808|20289->16862|20305->16868|20367->16908|20449->16962|20465->16968|20518->16999|20600->17053|20616->17059|20681->17102|20740->17133|20756->17139|20826->17187|20885->17218|20901->17224|20966->17267|21025->17298|21041->17304|21103->17344
                  LINES: 21->1|26->1|27->2|27->2|27->2|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|82->57|82->57|82->57|83->58|83->58|83->58|103->78|103->78|103->78|106->81|106->81|106->81|109->84|109->84|109->84|112->87|112->87|112->87|115->90|115->90|115->90|140->115|140->115|140->115|142->117|142->117|142->117|156->131|156->131|156->131|158->133|158->133|158->133|172->147|172->147|172->147|174->149|174->149|174->149|187->162|187->162|187->162|189->164|189->164|189->164|203->178|203->178|203->178|205->180|205->180|205->180|219->194|219->194|219->194|221->196|221->196|221->196|234->209|234->209|234->209|236->211|236->211|236->211|250->225|250->225|250->225|252->227|252->227|252->227|266->241|266->241|266->241|268->243|268->243|268->243|282->257|282->257|282->257|284->259|284->259|284->259|298->273|298->273|298->273|300->275|300->275|300->275|314->289|314->289|314->289|316->291|316->291|316->291|333->308|333->308|333->308|343->318|343->318|343->318|344->319|344->319|344->319|345->320|345->320|345->320|346->321|346->321|346->321|347->322|347->322|347->322|348->323|348->323|348->323|349->324|349->324|349->324
                  -- GENERATED --
              */
          