
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


Seq[Any](format.raw/*2.1*/("""
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
                  DATE: 2020-10-12T09:44:02.122
                  SOURCE: /home/michail/dev/Electronify/app/views/singleProduct.scala.html
                  HASH: 5151e2c369535b4d266d2b8146ccb8868114fb62
                  MATRIX: 730->1|826->4|853->6|876->21|915->23|946->28|1281->335|1297->341|1356->378|1477->472|1492->478|1535->500|1622->559|1638->565|1694->599|1812->690|1827->696|1874->722|1961->781|1977->787|2034->822|2156->917|2171->923|2215->946|2302->1005|2318->1011|2375->1046|2494->1138|2509->1144|2556->1170|2636->1222|2652->1228|2710->1264|4586->3113|4601->3119|4645->3142|4761->3231|4776->3237|4837->3276|5572->3984|5587->3990|5631->4013|5771->4126|5786->4132|5829->4154|5970->4268|5985->4274|6028->4296|6168->4409|6183->4415|6230->4441|6375->4559|6390->4565|6436->4590|7628->5754|7644->5760|7704->5798|8123->6189|8139->6195|8199->6233|8619->6625|8635->6631|8695->6669|9115->7061|9131->7067|9191->7105|9759->7645|9775->7651|9820->7674|10259->8085|10275->8091|10342->8135|10581->8346|10597->8352|10657->8390|10746->8451|10762->8457|10829->8501|10918->8562|10934->8568|11001->8612|11090->8673|11106->8679|11173->8723|15547->13069|15563->13075|15618->13107|15839->13297
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|36->12|36->12|36->12|36->12|36->12|36->12|38->14|38->14|38->14|38->14|38->14|38->14|40->16|40->16|40->16|40->16|40->16|40->16|42->18|42->18|42->18|42->18|42->18|42->18|81->57|81->57|81->57|82->58|82->58|82->58|102->78|102->78|102->78|105->81|105->81|105->81|108->84|108->84|108->84|111->87|111->87|111->87|114->90|114->90|114->90|148->124|148->124|148->124|155->131|155->131|155->131|162->138|162->138|162->138|169->145|169->145|169->145|181->157|181->157|181->157|190->166|190->166|190->166|194->170|194->170|194->170|195->171|195->171|195->171|196->172|196->172|196->172|197->173|197->173|197->173|265->241|265->241|265->241|275->251
                  -- GENERATED --
              */
          