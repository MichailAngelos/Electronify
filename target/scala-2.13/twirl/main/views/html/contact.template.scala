
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
                        <h1><a href=""""),_display_(/*58.39*/routes/*58.45*/.HomeController.index()),format.raw/*58.68*/("""">
                            <img class="img-thumbnail" height="150" width="200" src=""""),_display_(/*59.87*/routes/*59.93*/.Assets.versioned("/img/eshoplogo.png")),format.raw/*59.132*/(""""></a></h1>
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
                        <a href=""""),_display_(/*79.35*/routes/*79.41*/.HomeController.index()),format.raw/*79.64*/("""">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*82.35*/routes/*82.41*/.HomeController.shop()),format.raw/*82.63*/("""">Store</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*85.35*/routes/*85.41*/.HomeController.cart()),format.raw/*85.63*/("""">Cart</a>
                    </li>
                    <li class="nav-item">
                        <a href=""""),_display_(/*88.35*/routes/*88.41*/.HomeController.checkOut()),format.raw/*88.67*/("""">Checkout</a>
                    </li>
                    <li class="nav-item">
                        <<a href=""""),_display_(/*91.36*/routes/*91.42*/.HomeController.contact()),format.raw/*91.67*/("""">Contact</a>
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
                                                <h2>Contact Details</h2>
                                                <p> <span id="dots">...</span>
                                                    <span id="more" style="display: none">
                                                       email : eshopmail.com
                                                       <br><br>
                                                        telephone : 9999999999
                                                           <br>  <br>
                                                           facebook : eShop electronics
                                                           <br> <br>
                                                        <img class="rounded-circle" height="120" width="120" src=""""),_display_(/*120.116*/routes/*120.122*/.Assets.versioned("/img/contact.jpeg")),format.raw/*120.160*/("""">
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
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*144.87*/routes/*144.93*/.Assets.versioned("/img/alienware_logo.jpg")),format.raw/*144.137*/("""">
                            <img class="img-thumbnail" height="200" width="200" src=""""),_display_(/*145.87*/routes/*145.93*/.Assets.versioned("/img/microsoft-logo.jpg")),format.raw/*145.137*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*146.87*/routes/*146.93*/.Assets.versioned("/img/sonylogo.gif")),format.raw/*146.131*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*147.87*/routes/*147.93*/.Assets.versioned("/img/Xbox-logo.jpg")),format.raw/*147.132*/("""">
                            <img class="img-thumbnail" height="180" width="200" src=""""),_display_(/*148.87*/routes/*148.93*/.Assets.versioned("/img/appleInc.jpg")),format.raw/*148.131*/("""">
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
                        <a href=""""),_display_(/*164.35*/routes/*164.41*/.HomeController.shop()),format.raw/*164.63*/("""" class="wid-view-more">View All</a>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*166.39*/routes/*166.45*/.HomeController.product()),format.raw/*166.70*/(""""><img src=""""),_display_(/*166.83*/routes/*166.89*/.Assets.versioned("img/sonySmart.jpg")),format.raw/*166.127*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*167.43*/routes/*167.49*/.HomeController.product()),format.raw/*167.74*/("""">Sony Smart TV </a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*173.39*/routes/*173.45*/.HomeController.product()),format.raw/*173.70*/(""""><img src=""""),_display_(/*173.83*/routes/*173.89*/.Assets.versioned("img/Macbook_Air.jpg")),format.raw/*173.129*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*174.43*/routes/*174.49*/.HomeController.product()),format.raw/*174.74*/("""">Apple New MacBook</a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$525.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*180.39*/routes/*180.45*/.HomeController.product()),format.raw/*180.70*/(""""><img src=""""),_display_(/*180.83*/routes/*180.89*/.Assets.versioned("img/macBook.jpg")),format.raw/*180.125*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*181.43*/routes/*181.49*/.HomeController.product()),format.raw/*181.74*/("""">Apple MacBook Air</a></h2>
                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="single-product-widget">
                        <h2 class="product-wid-title">Recently Viewed</h2>
                        <a href=""""),_display_(/*191.35*/routes/*191.41*/.HomeController.shop()),format.raw/*191.63*/("""" class="wid-view-more">View All</a>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*193.39*/routes/*193.45*/.HomeController.product()),format.raw/*193.70*/(""""><img src=""""),_display_(/*193.83*/routes/*193.89*/.Assets.versioned("img/product_thumb__1.jpg")),format.raw/*193.134*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*194.43*/routes/*194.49*/.HomeController.product()),format.raw/*194.74*/("""">Sony Playstation</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*201.39*/routes/*201.45*/.HomeController.product()),format.raw/*201.70*/(""""><img src=""""),_display_(/*201.83*/routes/*201.89*/.Assets.versioned("img/xboxOne.jpg")),format.raw/*201.125*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*202.43*/routes/*202.49*/.HomeController.product()),format.raw/*202.74*/("""">X-box One</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*209.39*/routes/*209.45*/.HomeController.product()),format.raw/*209.70*/(""""><img src=""""),_display_(/*209.83*/routes/*209.89*/.Assets.versioned("img/product-thumb-2.jpg")),format.raw/*209.133*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*210.43*/routes/*210.49*/.HomeController.product()),format.raw/*210.74*/("""">Samsung Galaxy note 4</a></h2>
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
                            <a href=""""),_display_(/*222.39*/routes/*222.45*/.HomeController.product()),format.raw/*222.70*/(""""><img src=""""),_display_(/*222.83*/routes/*222.89*/.Assets.versioned("img/alienware.jpg")),format.raw/*222.127*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*223.43*/routes/*223.49*/.HomeController.product()),format.raw/*223.74*/("""">Alienware M17</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*230.39*/routes/*230.45*/.HomeController.product()),format.raw/*230.70*/(""""><img src=""""),_display_(/*230.83*/routes/*230.89*/.Assets.versioned("img/product-thumb-4.jpg")),format.raw/*230.133*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*231.43*/routes/*231.49*/.HomeController.product()),format.raw/*231.74*/("""">Samsung Smart Tv</a></h2>

                            <div class="product-wid-price">
                                <ins>$400.00</ins> <del>$425.00</del>
                            </div>
                        </div>
                        <div class="single-wid-product">
                            <a href=""""),_display_(/*238.39*/routes/*238.45*/.HomeController.product()),format.raw/*238.70*/(""""><img src=""""),_display_(/*238.83*/routes/*238.89*/.Assets.versioned("img/product_thumb__1.jpg")),format.raw/*238.134*/("""" alt="" class="product-thumb"></a>
                            <h2><a href=""""),_display_(/*239.43*/routes/*239.49*/.HomeController.product()),format.raw/*239.74*/("""">Sony Playstation</a></h2>

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
                    <p>European standards   <img height="20" width="20" src=""""),_display_(/*256.79*/routes/*256.85*/.Assets.versioned("/img/eu.png")),format.raw/*256.117*/(""""></p><br>
                    <p>&copy; 2020 eShop. All Rights Reserved.</p>
                </div>
            </div>
        </div>
    </div>

        <!-- End footer bottom area -->

        <!-- JavaScript , Bootstrap ,Jquery files-->
    <script src=""""),_display_(/*266.19*/routes/*266.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*266.68*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*267.19*/routes/*267.25*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*267.65*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*268.19*/routes/*268.25*/.Assets.versioned("js/main.js")),format.raw/*268.56*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*269.19*/routes/*269.25*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*269.68*/(""""></script>
    <script src=""""),_display_(/*270.19*/routes/*270.25*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*270.73*/(""""></script>
    <script src=""""),_display_(/*271.19*/routes/*271.25*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*271.68*/(""""></script>
    <script src=""""),_display_(/*272.19*/routes/*272.25*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*272.65*/(""""></script>
    <script>
            function readMore() """),format.raw/*274.33*/("""{"""),format.raw/*274.34*/("""
                """),format.raw/*275.17*/("""var dots = document.getElementById("dots");
                var moreText = document.getElementById("more");
                var btnText = document.getElementById("myBtn");

                if (dots.style.display === "none") """),format.raw/*279.52*/("""{"""),format.raw/*279.53*/("""
                    """),format.raw/*280.21*/("""dots.style.display = "inline";
                    btnText.innerHTML = "Read more";
                    moreText.style.display = "none";
                """),format.raw/*283.17*/("""}"""),format.raw/*283.18*/(""" """),format.raw/*283.19*/("""else """),format.raw/*283.24*/("""{"""),format.raw/*283.25*/("""
                    """),format.raw/*284.21*/("""dots.style.display = "none";
                    btnText.innerHTML = "Read less";
                    moreText.style.display = "inline";
                """),format.raw/*287.17*/("""}"""),format.raw/*287.18*/("""
            """),format.raw/*288.13*/("""}"""),format.raw/*288.14*/("""
    """),format.raw/*289.5*/("""</script>
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
                  DATE: 2020-12-18T16:36:31.929
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/contact.scala.html
                  HASH: bfcaecf92dee5f51d37ac1d0147b195ab2bbe351
                  MATRIX: 724->1|820->3|850->8|871->21|910->23|942->29|1283->342|1299->348|1358->385|1481->481|1496->487|1539->509|1626->568|1642->574|1698->608|1818->701|1833->707|1880->733|1967->792|1983->798|2040->833|2164->930|2179->936|2223->959|2310->1018|2326->1024|2383->1059|2504->1153|2519->1159|2566->1185|2646->1237|2662->1243|2720->1279|4637->3169|4652->3175|4696->3198|4813->3288|4828->3294|4889->3333|5644->4061|5659->4067|5703->4090|5846->4206|5861->4212|5904->4234|6048->4351|6063->4357|6106->4379|6249->4495|6264->4501|6311->4527|6459->4648|6474->4654|6520->4679|8245->6375|8262->6381|8323->6419|9390->7458|9406->7464|9473->7508|9591->7598|9607->7604|9674->7648|9792->7738|9808->7744|9869->7782|9987->7872|10003->7878|10065->7917|10183->8007|10199->8013|10260->8051|10809->8572|10825->8578|10869->8600|11031->8734|11047->8740|11094->8765|11135->8778|11151->8784|11212->8822|11319->8901|11335->8907|11382->8932|11733->9255|11749->9261|11796->9286|11837->9299|11853->9305|11916->9345|12023->9424|12039->9430|12086->9455|12440->9781|12456->9787|12503->9812|12544->9825|12560->9831|12619->9867|12726->9946|12742->9952|12789->9977|13306->10466|13322->10472|13366->10494|13528->10628|13544->10634|13591->10659|13632->10672|13648->10678|13716->10723|13823->10802|13839->10808|13886->10833|14241->11160|14257->11166|14304->11191|14345->11204|14361->11210|14420->11246|14527->11325|14543->11331|14590->11356|14938->11676|14954->11682|15001->11707|15042->11720|15058->11726|15125->11770|15232->11849|15248->11855|15295->11880|15942->12499|15958->12505|16005->12530|16046->12543|16062->12549|16123->12587|16230->12666|16246->12672|16293->12697|16645->13021|16661->13027|16708->13052|16749->13065|16765->13071|16832->13115|16939->13194|16955->13200|17002->13225|17357->13552|17373->13558|17420->13583|17461->13596|17477->13602|17545->13647|17652->13726|17668->13732|17715->13757|18365->14379|18381->14385|18436->14417|18733->14686|18749->14692|18814->14735|18896->14789|18912->14795|18974->14835|19056->14889|19072->14895|19125->14926|19207->14980|19223->14986|19288->15029|19347->15060|19363->15066|19433->15114|19492->15145|19508->15151|19573->15194|19632->15225|19648->15231|19710->15271|19798->15330|19828->15331|19875->15349|20132->15577|20162->15578|20213->15600|20398->15756|20428->15757|20458->15758|20492->15763|20522->15764|20573->15786|20758->15942|20788->15943|20831->15957|20861->15958|20895->15964
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|83->58|83->58|83->58|84->59|84->59|84->59|104->79|104->79|104->79|107->82|107->82|107->82|110->85|110->85|110->85|113->88|113->88|113->88|116->91|116->91|116->91|145->120|145->120|145->120|169->144|169->144|169->144|170->145|170->145|170->145|171->146|171->146|171->146|172->147|172->147|172->147|173->148|173->148|173->148|189->164|189->164|189->164|191->166|191->166|191->166|191->166|191->166|191->166|192->167|192->167|192->167|198->173|198->173|198->173|198->173|198->173|198->173|199->174|199->174|199->174|205->180|205->180|205->180|205->180|205->180|205->180|206->181|206->181|206->181|216->191|216->191|216->191|218->193|218->193|218->193|218->193|218->193|218->193|219->194|219->194|219->194|226->201|226->201|226->201|226->201|226->201|226->201|227->202|227->202|227->202|234->209|234->209|234->209|234->209|234->209|234->209|235->210|235->210|235->210|247->222|247->222|247->222|247->222|247->222|247->222|248->223|248->223|248->223|255->230|255->230|255->230|255->230|255->230|255->230|256->231|256->231|256->231|263->238|263->238|263->238|263->238|263->238|263->238|264->239|264->239|264->239|281->256|281->256|281->256|291->266|291->266|291->266|292->267|292->267|292->267|293->268|293->268|293->268|294->269|294->269|294->269|295->270|295->270|295->270|296->271|296->271|296->271|297->272|297->272|297->272|299->274|299->274|300->275|304->279|304->279|305->280|308->283|308->283|308->283|308->283|308->283|309->284|312->287|312->287|313->288|313->288|314->289
                  -- GENERATED --
              */
          