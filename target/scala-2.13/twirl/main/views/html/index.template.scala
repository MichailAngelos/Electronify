
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("eShop")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
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

    <div class="slider-area">
        <div class="zigzag-bottom"></div>
        <div id="slide-list" class="carousel carousel-fade slide" data-ride="carousel">
            <div class="carousel-inner" role="listbox">
                <div class="item active">
                    <div class="single-slide">
                        <div class="slide-bg slide-one"></div>
                        <div class="slide-text-wrapper">
                            <div class="slide-text">
                                <div class="container">
                                    <div class="row">
                                        <div class="col-md-6 col-md-offset-6">
                                            <div align="center" class="slide-content">
                                                <h2>We are awesome</h2>
                                                <p>Welcome to the cheapest eShop for your electronics!</p>
                                                <p> <span id="dots">...</span>
                                                    <span id="more" style="display: none">
                                                        Shop today your electronics from the comfort of your house.Lean back and you are one click away from the products and deals you are looking for.
                                                        Every week special offers just for you.
                                                        We ship worldwide !
                                                        <br>  <br>
                                                        <img class="rounded-circle" height="120" width="120" src=""""),_display_(/*118.116*/routes/*118.122*/.Assets.versioned("/img/shipping.png")),format.raw/*118.160*/("""">
                                                    </span></p>
                                                <button class="readmore" onclick="readMore()" id="myBtn">Read More</button>
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
        <!-- End slider area -->

    <div class="brands-area">
        <div class="zigzag-bottom"></div>
        <div class="container" style="align-content: center">
            <div class="row">
                <div class="col-md-12">
                    <div class="brand-wrapper">
                        <h2 class="section-title">Brands</h2>
                        <div class="brand-list">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*142.87*/routes/*142.93*/.Assets.versioned("/img/alienware_logo.jpg")),format.raw/*142.137*/("""">
                            <img class="img-thumbnail" height="200" width="200" src=""""),_display_(/*143.87*/routes/*143.93*/.Assets.versioned("/img/microsoft-logo.jpg")),format.raw/*143.137*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*144.87*/routes/*144.93*/.Assets.versioned("/img/sonylogo.gif")),format.raw/*144.131*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*145.87*/routes/*145.93*/.Assets.versioned("/img/Xbox-logo.jpg")),format.raw/*145.132*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*146.87*/routes/*146.93*/.Assets.versioned("/img/appleInc.jpg")),format.raw/*146.131*/("""">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- End brands area -->

    <div class="product-widget-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Top Sellers</h2>
                        <a href=""""),_display_(/*162.35*/routes/*162.41*/.HomeController.shop()),format.raw/*162.63*/("""" class="wid-view-more">View All</a>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*164.39*/routes/*164.45*/.HomeController.product()),format.raw/*164.70*/(""""><img src=""""),_display_(/*164.83*/routes/*164.89*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*164.127*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*165.43*/routes/*165.49*/.HomeController.product()),format.raw/*165.74*/("""">Sony Smart TV </a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*171.39*/routes/*171.45*/.HomeController.product()),format.raw/*171.70*/(""""><img src=""""),_display_(/*171.83*/routes/*171.89*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*171.129*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*172.43*/routes/*172.49*/.HomeController.product()),format.raw/*172.74*/("""">Apple New MacBook</a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$525.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*178.39*/routes/*178.45*/.HomeController.product()),format.raw/*178.70*/(""""><img src=""""),_display_(/*178.83*/routes/*178.89*/.Assets.versioned("img/macBook.jpg")),format.raw/*178.125*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*179.43*/routes/*179.49*/.HomeController.product()),format.raw/*179.74*/("""">Apple MacBook Air</a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Recently Viewed</h2>
                        <a href=""""),_display_(/*189.35*/routes/*189.41*/.HomeController.shop()),format.raw/*189.63*/("""" class="wid-view-more">View All</a>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*191.39*/routes/*191.45*/.HomeController.product()),format.raw/*191.70*/(""""><img src=""""),_display_(/*191.83*/routes/*191.89*/.Assets.versioned("img/product_thumb__1.jpg")),format.raw/*191.134*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*192.43*/routes/*192.49*/.HomeController.product()),format.raw/*192.74*/("""">Sony Playstation</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*199.39*/routes/*199.45*/.HomeController.product()),format.raw/*199.70*/(""""><img src=""""),_display_(/*199.83*/routes/*199.89*/.Assets.versioned("img/xboxOne.jpg")),format.raw/*199.125*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*200.43*/routes/*200.49*/.HomeController.product()),format.raw/*200.74*/("""">X-box One</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*207.39*/routes/*207.45*/.HomeController.product()),format.raw/*207.70*/(""""><img src=""""),_display_(/*207.83*/routes/*207.89*/.Assets.versioned("img/product-thumb-2.jpg")),format.raw/*207.133*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*208.43*/routes/*208.49*/.HomeController.product()),format.raw/*208.74*/("""">Samsung Galaxy note 4</a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Top New</h2>
                        <a href="#" class="wid-view-more">View All</a>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*220.39*/routes/*220.45*/.HomeController.product()),format.raw/*220.70*/(""""><img src=""""),_display_(/*220.83*/routes/*220.89*/.Assets.versioned("img/alienware.jpg")),format.raw/*220.127*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*221.43*/routes/*221.49*/.HomeController.product()),format.raw/*221.74*/("""">Alienware M17</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*228.39*/routes/*228.45*/.HomeController.product()),format.raw/*228.70*/(""""><img src=""""),_display_(/*228.83*/routes/*228.89*/.Assets.versioned("img/product-thumb-4.jpg")),format.raw/*228.133*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*229.43*/routes/*229.49*/.HomeController.product()),format.raw/*229.74*/("""">Samsung Smart Tv</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*236.39*/routes/*236.45*/.HomeController.product()),format.raw/*236.70*/(""""><img src=""""),_display_(/*236.83*/routes/*236.89*/.Assets.versioned("img/product_thumb__1.jpg")),format.raw/*236.134*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*237.43*/routes/*237.49*/.HomeController.product()),format.raw/*237.74*/("""">Sony Playstation</a></h2>

                            <div class="product-wid-price">
                                <ins>$250.00</ins> <del>$350.00</del>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- End product widget area -->

    <div class="footer-bottom-area">
        <div class="row">
            <div class="col-md-8">
                <div class="copyright" style="padding-left: 40px">
                    <p>European standards   <img height="20" width="20" src=""""),_display_(/*254.79*/routes/*254.85*/.Assets.versioned("/img/eu.png")),format.raw/*254.117*/(""""></p><br>
                    <p>&copy; 2020 eShop. All Rights Reserved.</p>
                </div>
            </div>
        </div>
    </div>

        <!-- End footer bottom area -->

        <!-- JavaScript , Bootstrap ,Jquery files-->
    <script src=""""),_display_(/*264.19*/routes/*264.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*264.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*265.19*/routes/*265.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*265.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*266.19*/routes/*266.25*/.Assets.versioned("js/main.js")),format.raw/*266.56*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*267.19*/routes/*267.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*267.68*/(""""></script>
    <script src=""""),_display_(/*268.19*/routes/*268.25*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*268.73*/(""""></script>
    <script src=""""),_display_(/*269.19*/routes/*269.25*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*269.68*/(""""></script>
    <script src=""""),_display_(/*270.19*/routes/*270.25*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*270.65*/(""""></script>
    <script>
            function readMore() """),format.raw/*272.33*/("""{"""),format.raw/*272.34*/("""
                """),format.raw/*273.17*/("""var dots = document.getElementById("dots");
                var moreText = document.getElementById("more");
                var btnText = document.getElementById("myBtn");

                if (dots.style.display === "none") """),format.raw/*277.52*/("""{"""),format.raw/*277.53*/("""
                    """),format.raw/*278.21*/("""dots.style.display = "inline";
                    btnText.innerHTML = "Read more";
                    moreText.style.display = "none";
                """),format.raw/*281.17*/("""}"""),format.raw/*281.18*/(""" """),format.raw/*281.19*/("""else """),format.raw/*281.24*/("""{"""),format.raw/*281.25*/("""
                    """),format.raw/*282.21*/("""dots.style.display = "none";
                    btnText.innerHTML = "Read less";
                    moreText.style.display = "inline";
                """),format.raw/*285.17*/("""}"""),format.raw/*285.18*/("""
            """),format.raw/*286.13*/("""}"""),format.raw/*286.14*/("""
    """),format.raw/*287.5*/("""</script>
""")))}),format.raw/*288.2*/("""
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
                  DATE: 2020-12-18T16:36:31.947
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/index.scala.html
                  HASH: d367a8a590a5820b4f296e744ddbb8d862782659
                  MATRIX: 722->1|818->3|848->8|869->21|908->23|940->29|1281->342|1297->348|1356->385|1479->481|1494->487|1537->509|1624->568|1640->574|1696->608|1816->701|1831->707|1878->733|1965->792|1981->798|2038->833|2162->930|2177->936|2221->959|2308->1018|2324->1024|2381->1059|2502->1153|2517->1159|2564->1185|2644->1237|2660->1243|2718->1279|4633->3167|4648->3173|4692->3196|4809->3286|4824->3292|4885->3331|5640->4059|5655->4065|5699->4088|5842->4204|5857->4210|5900->4232|6044->4349|6059->4355|6102->4377|6245->4493|6260->4499|6307->4525|6455->4646|6470->4652|6516->4677|8339->6471|8356->6477|8417->6515|9484->7554|9500->7560|9567->7604|9685->7694|9701->7700|9768->7744|9886->7834|9902->7840|9963->7878|10081->7968|10097->7974|10159->8013|10277->8103|10293->8109|10354->8147|10903->8668|10919->8674|10963->8696|11125->8830|11141->8836|11188->8861|11229->8874|11245->8880|11306->8918|11413->8997|11429->9003|11476->9028|11827->9351|11843->9357|11890->9382|11931->9395|11947->9401|12010->9441|12117->9520|12133->9526|12180->9551|12534->9877|12550->9883|12597->9908|12638->9921|12654->9927|12713->9963|12820->10042|12836->10048|12883->10073|13400->10562|13416->10568|13460->10590|13622->10724|13638->10730|13685->10755|13726->10768|13742->10774|13810->10819|13917->10898|13933->10904|13980->10929|14335->11256|14351->11262|14398->11287|14439->11300|14455->11306|14514->11342|14621->11421|14637->11427|14684->11452|15032->11772|15048->11778|15095->11803|15136->11816|15152->11822|15219->11866|15326->11945|15342->11951|15389->11976|16036->12595|16052->12601|16099->12626|16140->12639|16156->12645|16217->12683|16324->12762|16340->12768|16387->12793|16739->13117|16755->13123|16802->13148|16843->13161|16859->13167|16926->13211|17033->13290|17049->13296|17096->13321|17451->13648|17467->13654|17514->13679|17555->13692|17571->13698|17639->13743|17746->13822|17762->13828|17809->13853|18459->14475|18475->14481|18530->14513|18827->14782|18843->14788|18908->14831|18990->14885|19006->14891|19068->14931|19150->14985|19166->14991|19219->15022|19301->15076|19317->15082|19382->15125|19441->15156|19457->15162|19527->15210|19586->15241|19602->15247|19667->15290|19726->15321|19742->15327|19804->15367|19892->15426|19922->15427|19969->15445|20226->15673|20256->15674|20307->15696|20492->15852|20522->15853|20552->15854|20586->15859|20616->15860|20667->15882|20852->16038|20882->16039|20925->16053|20955->16054|20989->16060|21032->16072
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|82->57|82->57|82->57|83->58|83->58|83->58|103->78|103->78|103->78|106->81|106->81|106->81|109->84|109->84|109->84|112->87|112->87|112->87|115->90|115->90|115->90|143->118|143->118|143->118|167->142|167->142|167->142|168->143|168->143|168->143|169->144|169->144|169->144|170->145|170->145|170->145|171->146|171->146|171->146|187->162|187->162|187->162|189->164|189->164|189->164|189->164|189->164|189->164|190->165|190->165|190->165|196->171|196->171|196->171|196->171|196->171|196->171|197->172|197->172|197->172|203->178|203->178|203->178|203->178|203->178|203->178|204->179|204->179|204->179|214->189|214->189|214->189|216->191|216->191|216->191|216->191|216->191|216->191|217->192|217->192|217->192|224->199|224->199|224->199|224->199|224->199|224->199|225->200|225->200|225->200|232->207|232->207|232->207|232->207|232->207|232->207|233->208|233->208|233->208|245->220|245->220|245->220|245->220|245->220|245->220|246->221|246->221|246->221|253->228|253->228|253->228|253->228|253->228|253->228|254->229|254->229|254->229|261->236|261->236|261->236|261->236|261->236|261->236|262->237|262->237|262->237|279->254|279->254|279->254|289->264|289->264|289->264|290->265|290->265|290->265|291->266|291->266|291->266|292->267|292->267|292->267|293->268|293->268|293->268|294->269|294->269|294->269|295->270|295->270|295->270|297->272|297->272|298->273|302->277|302->277|303->278|306->281|306->281|306->281|306->281|306->281|307->282|310->285|310->285|311->286|311->286|312->287|313->288
                  -- GENERATED --
              */
          