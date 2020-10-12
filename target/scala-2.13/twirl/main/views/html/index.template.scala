
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-10-12T09:44:02.359
                  SOURCE: /home/michail/dev/Electronify/app/views/index.scala.html
                  HASH: f5316c5aecfa45786378a6ec2f5f7801dce9b5ff
                  MATRIX: 722->1|818->4|845->6|866->19|905->21|936->26|1271->333|1287->339|1346->376|1467->470|1482->476|1525->498|1612->557|1628->563|1684->597|1802->688|1817->694|1864->720|1951->779|1967->785|2024->820|2146->915|2161->921|2205->944|2292->1003|2308->1009|2365->1044|2484->1136|2499->1142|2546->1168|2626->1220|2642->1226|2700->1262|4576->3111|4591->3117|4635->3140|4751->3229|4766->3235|4827->3274|5562->3982|5577->3988|5621->4011|5761->4124|5776->4130|5819->4152|5960->4266|5975->4272|6018->4294|6158->4407|6173->4413|6220->4439|6365->4557|6380->4563|6426->4588|8221->6354|8238->6360|8299->6398|9342->7413|9358->7419|9425->7463|9542->7552|9558->7558|9625->7602|9742->7691|9758->7697|9819->7735|9936->7824|9952->7830|10014->7869|10131->7958|10147->7964|10208->8002|10741->8507|10757->8513|10801->8535|10961->8667|10977->8673|11024->8698|11065->8711|11081->8717|11142->8755|11248->8833|11264->8839|11311->8864|11656->9181|11672->9187|11719->9212|11760->9225|11776->9231|11839->9271|11945->9349|11961->9355|12008->9380|12356->9700|12372->9706|12419->9731|12460->9744|12476->9750|12535->9786|12641->9864|12657->9870|12704->9895|13211->10374|13227->10380|13271->10402|13431->10534|13447->10540|13494->10565|13535->10578|13551->10584|13619->10629|13725->10707|13741->10713|13788->10738|14136->11058|14152->11064|14199->11089|14240->11102|14256->11108|14315->11144|14421->11222|14437->11228|14484->11253|14825->11566|14841->11572|14888->11597|14929->11610|14945->11616|15012->11660|15118->11738|15134->11744|15181->11769|15816->12376|15832->12382|15879->12407|15920->12420|15936->12426|15997->12464|16103->12542|16119->12548|16166->12573|16511->12890|16527->12896|16574->12921|16615->12934|16631->12940|16698->12984|16804->13062|16820->13068|16867->13093|17215->13413|17231->13419|17278->13444|17319->13457|17335->13463|17403->13508|17509->13586|17525->13592|17572->13617|18205->14222|18221->14228|18276->14260|18563->14519|18579->14525|18644->14568|18725->14621|18741->14627|18803->14667|18884->14720|18900->14726|18953->14757|19034->14810|19050->14816|19115->14859|19173->14889|19189->14895|19259->14943|19317->14973|19333->14979|19398->15022|19456->15052|19472->15058|19534->15098|19620->15155|19650->15156|19696->15173|19949->15397|19979->15398|20029->15419|20211->15572|20241->15573|20271->15574|20305->15579|20335->15580|20385->15601|20567->15754|20597->15755|20639->15768|20669->15769|20702->15774|20744->15785
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|36->12|36->12|36->12|36->12|36->12|36->12|38->14|38->14|38->14|38->14|38->14|38->14|40->16|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|42->18|81->57|81->57|81->57|82->58|82->58|82->58|102->78|102->78|102->78|105->81|105->81|105->81|108->84|108->84|108->84|111->87|111->87|111->87|114->90|114->90|114->90|142->118|142->118|142->118|166->142|166->142|166->142|167->143|167->143|167->143|168->144|168->144|168->144|169->145|169->145|169->145|170->146|170->146|170->146|186->162|186->162|186->162|188->164|188->164|188->164|188->164|188->164|188->164|189->165|189->165|189->165|195->171|195->171|195->171|195->171|195->171|195->171|196->172|196->172|196->172|202->178|202->178|202->178|202->178|202->178|202->178|203->179|203->179|203->179|213->189|213->189|213->189|215->191|215->191|215->191|215->191|215->191|215->191|216->192|216->192|216->192|223->199|223->199|223->199|223->199|223->199|223->199|224->200|224->200|224->200|231->207|231->207|231->207|231->207|231->207|231->207|232->208|232->208|232->208|244->220|244->220|244->220|244->220|244->220|244->220|245->221|245->221|245->221|252->228|252->228|252->228|252->228|252->228|252->228|253->229|253->229|253->229|260->236|260->236|260->236|260->236|260->236|260->236|261->237|261->237|261->237|278->254|278->254|278->254|288->264|288->264|288->264|289->265|289->265|289->265|290->266|290->266|290->266|291->267|291->267|291->267|292->268|292->268|292->268|293->269|293->269|293->269|294->270|294->270|294->270|296->272|296->272|297->273|301->277|301->277|302->278|305->281|305->281|305->281|305->281|305->281|306->282|309->285|309->285|310->286|310->286|311->287|312->288
                  -- GENERATED --
              */
          