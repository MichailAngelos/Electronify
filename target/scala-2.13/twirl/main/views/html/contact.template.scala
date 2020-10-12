
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
                  DATE: 2020-10-12T09:44:02.272
                  SOURCE: /home/michail/dev/Electronify/app/views/contact.scala.html
                  HASH: b0cebfab8a0ba52d1974b33b70f514fbbf5b37b3
                  MATRIX: 724->1|820->4|847->6|868->19|907->21|938->26|1273->333|1289->339|1348->376|1469->470|1484->476|1527->498|1614->557|1630->563|1686->597|1804->688|1819->694|1866->720|1953->779|1969->785|2026->820|2148->915|2163->921|2207->944|2294->1003|2310->1009|2367->1044|2486->1136|2501->1142|2548->1168|2628->1220|2644->1226|2702->1262|4579->3112|4594->3118|4638->3141|4754->3230|4769->3236|4830->3275|5565->3983|5580->3989|5624->4012|5764->4125|5779->4131|5822->4153|5963->4267|5978->4273|6021->4295|6161->4408|6176->4414|6223->4440|6368->4558|6383->4564|6429->4589|8125->6256|8142->6262|8203->6300|9246->7315|9262->7321|9329->7365|9446->7454|9462->7460|9529->7504|9646->7593|9662->7599|9723->7637|9840->7726|9856->7732|9918->7771|10035->7860|10051->7866|10112->7904|10645->8409|10661->8415|10705->8437|10865->8569|10881->8575|10928->8600|10969->8613|10985->8619|11046->8657|11152->8735|11168->8741|11215->8766|11560->9083|11576->9089|11623->9114|11664->9127|11680->9133|11743->9173|11849->9251|11865->9257|11912->9282|12260->9602|12276->9608|12323->9633|12364->9646|12380->9652|12439->9688|12545->9766|12561->9772|12608->9797|13115->10276|13131->10282|13175->10304|13335->10436|13351->10442|13398->10467|13439->10480|13455->10486|13523->10531|13629->10609|13645->10615|13692->10640|14040->10960|14056->10966|14103->10991|14144->11004|14160->11010|14219->11046|14325->11124|14341->11130|14388->11155|14729->11468|14745->11474|14792->11499|14833->11512|14849->11518|14916->11562|15022->11640|15038->11646|15085->11671|15720->12278|15736->12284|15783->12309|15824->12322|15840->12328|15901->12366|16007->12444|16023->12450|16070->12475|16415->12792|16431->12798|16478->12823|16519->12836|16535->12842|16602->12886|16708->12964|16724->12970|16771->12995|17119->13315|17135->13321|17182->13346|17223->13359|17239->13365|17307->13410|17413->13488|17429->13494|17476->13519|18109->14124|18125->14130|18180->14162|18467->14421|18483->14427|18548->14470|18629->14523|18645->14529|18707->14569|18788->14622|18804->14628|18857->14659|18938->14712|18954->14718|19019->14761|19077->14791|19093->14797|19163->14845|19221->14875|19237->14881|19302->14924|19360->14954|19376->14960|19438->15000|19524->15057|19554->15058|19600->15075|19853->15299|19883->15300|19933->15321|20115->15474|20145->15475|20175->15476|20209->15481|20239->15482|20289->15503|20471->15656|20501->15657|20543->15670|20573->15671|20606->15676
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|36->12|36->12|36->12|36->12|36->12|36->12|38->14|38->14|38->14|38->14|38->14|38->14|40->16|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|42->18|82->58|82->58|82->58|83->59|83->59|83->59|103->79|103->79|103->79|106->82|106->82|106->82|109->85|109->85|109->85|112->88|112->88|112->88|115->91|115->91|115->91|144->120|144->120|144->120|168->144|168->144|168->144|169->145|169->145|169->145|170->146|170->146|170->146|171->147|171->147|171->147|172->148|172->148|172->148|188->164|188->164|188->164|190->166|190->166|190->166|190->166|190->166|190->166|191->167|191->167|191->167|197->173|197->173|197->173|197->173|197->173|197->173|198->174|198->174|198->174|204->180|204->180|204->180|204->180|204->180|204->180|205->181|205->181|205->181|215->191|215->191|215->191|217->193|217->193|217->193|217->193|217->193|217->193|218->194|218->194|218->194|225->201|225->201|225->201|225->201|225->201|225->201|226->202|226->202|226->202|233->209|233->209|233->209|233->209|233->209|233->209|234->210|234->210|234->210|246->222|246->222|246->222|246->222|246->222|246->222|247->223|247->223|247->223|254->230|254->230|254->230|254->230|254->230|254->230|255->231|255->231|255->231|262->238|262->238|262->238|262->238|262->238|262->238|263->239|263->239|263->239|280->256|280->256|280->256|290->266|290->266|290->266|291->267|291->267|291->267|292->268|292->268|292->268|293->269|293->269|293->269|294->270|294->270|294->270|295->271|295->271|295->271|296->272|296->272|296->272|298->274|298->274|299->275|303->279|303->279|304->280|307->283|307->283|307->283|307->283|307->283|308->284|311->287|311->287|312->288|312->288|313->289
                  -- GENERATED --
              */
          