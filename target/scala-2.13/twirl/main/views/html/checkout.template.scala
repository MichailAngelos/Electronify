
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

object checkout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

    """),_display_(/*3.6*/main("Checkout")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
        """),format.raw/*4.9*/("""<div class="header-area">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-md-8">
                        <div class="user-menu">
                            <ul>
                                <li><a href="#"><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*10.106*/routes/*10.112*/.Assets.versioned("/img/account.png")),format.raw/*10.149*/("""">
                                    Account</a></li>
                                <li><a href=""""),_display_(/*12.47*/routes/*12.53*/.HomeController.cart()),format.raw/*12.75*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*12.134*/routes/*12.140*/.Assets.versioned("/img/cart.png")),format.raw/*12.174*/("""">
                                    Cart</a></li>
                                <li><a href=""""),_display_(/*14.47*/routes/*14.53*/.HomeController.checkOut()),format.raw/*14.79*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*14.138*/routes/*14.144*/.Assets.versioned("/img/check.png")),format.raw/*14.179*/("""">
                                    Checkout</a></li>
                                <li><a href=""""),_display_(/*16.47*/routes/*16.53*/.HomeController.index()),format.raw/*16.76*/(""""><img class="rounded-circle" height="20" width="20" src=""""),_display_(/*16.135*/routes/*16.141*/.Assets.versioned("/img/login.png")),format.raw/*16.176*/("""">
                                    Login</a></li>
                                <li><a href=""""),_display_(/*18.47*/routes/*18.53*/.HomeController.checkOut()),format.raw/*18.79*/(""""><img class="rounded" height="20" width="20" src=""""),_display_(/*18.131*/routes/*18.137*/.Assets.versioned("/img/signup.png")),format.raw/*18.173*/("""">SignUp</a></li>
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
                            <h1><a href=""""),_display_(/*57.43*/routes/*57.49*/.HomeController.index()),format.raw/*57.72*/("""">
                                <img class="img-thumbnail" height="150" width="200" src=""""),_display_(/*58.91*/routes/*58.97*/.Assets.versioned("/img/eshoplogo.png")),format.raw/*58.136*/(""""></a></h1>
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
                            <a href=""""),_display_(/*78.39*/routes/*78.45*/.HomeController.index()),format.raw/*78.68*/("""">Home</a>
                        </li>
                        <li class="nav-item">
                            <a href=""""),_display_(/*81.39*/routes/*81.45*/.HomeController.shop()),format.raw/*81.67*/("""">Store</a>
                        </li>
                        <li class="nav-item">
                            <a href=""""),_display_(/*84.39*/routes/*84.45*/.HomeController.cart()),format.raw/*84.67*/("""">Cart</a>
                        </li>
                        <li class="nav-item">
                            <a href=""""),_display_(/*87.39*/routes/*87.45*/.HomeController.checkOut()),format.raw/*87.71*/("""">Checkout</a>
                        </li>
                        <li class="nav-item">
                            <<a href=""""),_display_(/*90.40*/routes/*90.46*/.HomeController.contact()),format.raw/*90.71*/("""">Contact</a>
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
                            <h2>Check Out</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container-fluid" id="checkout">
            <div class="row">
                <div class="col-md-9" style="padding-left: 250px">
                    <form action="#">
                        <label for="fname" class="required">Όνομα</label>
                        <input type="text" id="fname" name="firstname" required placeholder="Name" >

                        <label for="lname" class="required">Επίθετο</label>
                        <input type="text" id="lname" name="lastname" required placeholder="Surname">

                        <label for="til" class="required">Telephone</label>
                        <input type="text" id="til" name="til" required placeholder="Telephone">

                        <label for="mail">E-mail</label>
                        <input type="text" id="mail" name="mail" placeholder="E-mail">

                        <label for="address" class="required">Address</label>
                        <input type="text" id="address" name="addres" placeholder="Address">

                        <label for="perioxes">Your Country </label>
                        <select id="countries" name="countries">
                            <option value="AX">Åland Islands</option>
                            <option value="AF">Afghanistan</option>
                            <option value="AL">Albania</option>
                            <option value="DZ">Algeria</option>
                            <option value="AD">Andorra</option>
                            <option value="AO">Angola</option>
                            <option value="AI">Anguilla</option>
                            <option value="AQ">Antarctica</option>
                            <option value="AG">Antigua and Barbuda</option>
                            <option value="AR">Argentina</option>
                            <option value="AM">Armenia</option>
                            <option value="AW">Aruba</option>
                            <option value="AU">Australia</option>
                            <option value="AT">Austria</option>
                            <option value="AZ">Azerbaijan</option>
                            <option value="BS">Bahamas</option>
                            <option value="BH">Bahrain</option>
                            <option value="BD">Bangladesh</option>
                            <option value="BB">Barbados</option>
                            <option value="BY">Belarus</option>
                            <option value="PW">Belau</option>
                            <option value="BE">Belgium</option>
                            <option value="BZ">Belize</option>
                            <option value="BJ">Benin</option>
                            <option value="BM">Bermuda</option>
                            <option value="BT">Bhutan</option>
                            <option value="BO">Bolivia</option>
                            <option value="BQ">Bonaire, Saint Eustatius and Saba</option>
                            <option value="BA">Bosnia and Herzegovina</option>
                            <option value="BW">Botswana</option>
                            <option value="BV">Bouvet Island</option>
                            <option value="BR">Brazil</option>
                            <option value="IO">British Indian Ocean Territory</option>
                            <option value="VG">British Virgin Islands</option>
                            <option value="BN">Brunei</option>
                            <option value="BG">Bulgaria</option>
                            <option value="BF">Burkina Faso</option>
                            <option value="BI">Burundi</option>
                            <option value="KH">Cambodia</option>
                            <option value="CM">Cameroon</option>
                            <option value="CA">Canada</option>
                            <option value="CV">Cape Verde</option>
                            <option value="KY">Cayman Islands</option>
                            <option value="CF">Central African Republic</option>
                            <option value="TD">Chad</option>
                            <option value="CL">Chile</option>
                            <option value="CN">China</option>
                            <option value="CX">Christmas Island</option>
                            <option value="CC">Cocos (Keeling) Islands</option>
                            <option value="CO">Colombia</option>
                            <option value="KM">Comoros</option>
                            <option value="CG">Congo (Brazzaville)</option>
                            <option value="CD">Congo (Kinshasa)</option>
                            <option value="CK">Cook Islands</option>
                            <option value="CR">Costa Rica</option>
                            <option value="HR">Croatia</option>
                            <option value="CU">Cuba</option>
                            <option value="CW">CuraÇao</option>
                            <option value="CY">Cyprus</option>
                            <option value="CZ">Czech Republic</option>
                            <option value="DK">Denmark</option>
                            <option value="DJ">Djibouti</option>
                            <option value="DM">Dominica</option>
                            <option value="DO">Dominican Republic</option>
                            <option value="EC">Ecuador</option>
                            <option value="EG">Egypt</option>
                            <option value="SV">El Salvador</option>
                            <option value="GQ">Equatorial Guinea</option>
                            <option value="ER">Eritrea</option>
                            <option value="EE">Estonia</option>
                            <option value="ET">Ethiopia</option>
                            <option value="FK">Falkland Islands</option>
                            <option value="FO">Faroe Islands</option>
                            <option value="FJ">Fiji</option>
                            <option value="FI">Finland</option>
                            <option value="FR">France</option>
                            <option value="GF">French Guiana</option>
                            <option value="PF">French Polynesia</option>
                            <option value="TF">French Southern Territories</option>
                            <option value="GA">Gabon</option>
                            <option value="GM">Gambia</option>
                            <option value="GE">Georgia</option>
                            <option value="DE">Germany</option>
                            <option value="GH">Ghana</option>
                            <option value="GI">Gibraltar</option>
                            <option value="GR">Greece</option>
                            <option value="GL">Greenland</option>
                            <option value="GD">Grenada</option>
                            <option value="GP">Guadeloupe</option>
                            <option value="GT">Guatemala</option>
                            <option value="GG">Guernsey</option>
                            <option value="GN">Guinea</option>
                            <option value="GW">Guinea-Bissau</option>
                            <option value="GY">Guyana</option>
                            <option value="HT">Haiti</option>
                            <option value="HM">Heard Island and McDonald Islands</option>
                            <option value="HN">Honduras</option>
                            <option value="HK">Hong Kong</option>
                            <option value="HU">Hungary</option>
                            <option value="IS">Iceland</option>
                            <option value="IN">India</option>
                            <option value="ID">Indonesia</option>
                            <option value="IR">Iran</option>
                            <option value="IQ">Iraq</option>
                            <option value="IM">Isle of Man</option>
                            <option value="IL">Israel</option>
                            <option value="IT">Italy</option>
                            <option value="CI">Ivory Coast</option>
                            <option value="JM">Jamaica</option>
                            <option value="JP">Japan</option>
                            <option value="JE">Jersey</option>
                            <option value="JO">Jordan</option>
                            <option value="KZ">Kazakhstan</option>
                            <option value="KE">Kenya</option>
                            <option value="KI">Kiribati</option>
                            <option value="KW">Kuwait</option>
                            <option value="KG">Kyrgyzstan</option>
                            <option value="LA">Laos</option>
                            <option value="LV">Latvia</option>
                            <option value="LB">Lebanon</option>
                            <option value="LS">Lesotho</option>
                            <option value="LR">Liberia</option>
                            <option value="LY">Libya</option>
                            <option value="LI">Liechtenstein</option>
                            <option value="LT">Lithuania</option>
                            <option value="LU">Luxembourg</option>
                            <option value="MO">Macao S.A.R., China</option>
                            <option value="MK">Macedonia</option>
                            <option value="MG">Madagascar</option>
                            <option value="MW">Malawi</option>
                            <option value="MY">Malaysia</option>
                            <option value="MV">Maldives</option>
                            <option value="ML">Mali</option>
                            <option value="MT">Malta</option>
                            <option value="MH">Marshall Islands</option>
                            <option value="MQ">Martinique</option>
                            <option value="MR">Mauritania</option>
                            <option value="MU">Mauritius</option>
                            <option value="YT">Mayotte</option>
                            <option value="MX">Mexico</option>
                            <option value="FM">Micronesia</option>
                            <option value="MD">Moldova</option>
                            <option value="MC">Monaco</option>
                            <option value="MN">Mongolia</option>
                            <option value="ME">Montenegro</option>
                            <option value="MS">Montserrat</option>
                            <option value="MA">Morocco</option>
                            <option value="MZ">Mozambique</option>
                            <option value="MM">Myanmar</option>
                            <option value="NA">Namibia</option>
                            <option value="NR">Nauru</option>
                            <option value="NP">Nepal</option>
                            <option value="NL">Netherlands</option>
                            <option value="AN">Netherlands Antilles</option>
                            <option value="NC">New Caledonia</option>
                            <option value="NZ">New Zealand</option>
                            <option value="NI">Nicaragua</option>
                            <option value="NE">Niger</option>
                            <option value="NG">Nigeria</option>
                            <option value="NU">Niue</option>
                            <option value="NF">Norfolk Island</option>
                            <option value="KP">North Korea</option>
                            <option value="NO">Norway</option>
                            <option value="OM">Oman</option>
                            <option value="PK">Pakistan</option>
                            <option value="PS">Palestinian Territory</option>
                            <option value="PA">Panama</option>
                            <option value="PG">Papua New Guinea</option>
                            <option value="PY">Paraguay</option>
                            <option value="PE">Peru</option>
                            <option value="PH">Philippines</option>
                            <option value="PN">Pitcairn</option>
                            <option value="PL">Poland</option>
                            <option value="PT">Portugal</option>
                            <option value="QA">Qatar</option>
                            <option value="IE">Republic of Ireland</option>
                            <option value="RE">Reunion</option>
                            <option value="RO">Romania</option>
                            <option value="RU">Russia</option>
                            <option value="RW">Rwanda</option>
                            <option value="ST">São Tomé and Príncipe</option>
                            <option value="BL">Saint Barthélemy</option>
                            <option value="SH">Saint Helena</option>
                            <option value="KN">Saint Kitts and Nevis</option>
                            <option value="LC">Saint Lucia</option>
                            <option value="SX">Saint Martin (Dutch part)</option>
                            <option value="MF">Saint Martin (French part)</option>
                            <option value="PM">Saint Pierre and Miquelon</option>
                            <option value="VC">Saint Vincent and the Grenadines</option>
                            <option value="SM">San Marino</option>
                            <option value="SA">Saudi Arabia</option>
                            <option value="SN">Senegal</option>
                            <option value="RS">Serbia</option>
                            <option value="SC">Seychelles</option>
                            <option value="SL">Sierra Leone</option>
                            <option value="SG">Singapore</option>
                            <option value="SK">Slovakia</option>
                            <option value="SI">Slovenia</option>
                            <option value="SB">Solomon Islands</option>
                            <option value="SO">Somalia</option>
                            <option value="ZA">South Africa</option>
                            <option value="GS">South Georgia/Sandwich Islands</option>
                            <option value="KR">South Korea</option>
                            <option value="SS">South Sudan</option>
                            <option value="ES">Spain</option>
                            <option value="LK">Sri Lanka</option>
                            <option value="SD">Sudan</option>
                            <option value="SR">Suriname</option>
                            <option value="SJ">Svalbard and Jan Mayen</option>
                            <option value="SZ">Swaziland</option>
                            <option value="SE">Sweden</option>
                            <option value="CH">Switzerland</option>
                            <option value="SY">Syria</option>
                            <option value="TW">Taiwan</option>
                            <option value="TJ">Tajikistan</option>
                            <option value="TZ">Tanzania</option>
                            <option value="TH">Thailand</option>
                            <option value="TL">Timor-Leste</option>
                            <option value="TG">Togo</option>
                            <option value="TK">Tokelau</option>
                            <option value="TO">Tonga</option>
                            <option value="TT">Trinidad and Tobago</option>
                            <option value="TN">Tunisia</option>
                            <option value="TR">Turkey</option>
                            <option value="TM">Turkmenistan</option>
                            <option value="TC">Turks and Caicos Islands</option>
                            <option value="TV">Tuvalu</option>
                            <option value="UG">Uganda</option>
                            <option value="UA">Ukraine</option>
                            <option value="AE">United Arab Emirates</option>
                            <option selected="selected" value="GB">United Kingdom (UK)</option>
                            <option value="US">United States (US)</option>
                            <option value="UY">Uruguay</option>
                            <option value="UZ">Uzbekistan</option>
                            <option value="VU">Vanuatu</option>
                            <option value="VA">Vatican</option>
                            <option value="VE">Venezuela</option>
                            <option value="VN">Vietnam</option>
                            <option value="WF">Wallis and Futuna</option>
                            <option value="EH">Western Sahara</option>
                            <option value="WS">Western Samoa</option>
                            <option value="YE">Yemen</option>
                            <option value="ZM">Zambia</option>
                            <option value="ZW">Zimbabwe</option>
                        </select>
                        <br><br>
                        <label for="subject">Any Comment</label><br>
                        <textarea id="subject" name="subject" placeholder="Your comments..." style="height: 100px;width: 1000px" ></textarea>

                        <input type="submit" value="Send" style="background: #1c7430">

                    </form>
                </div>
            </div>
        </div>
        <div id="order_review" style="position: relative;">
            <table class="shop_table">
                <thead>
                    <tr>
                        <th class="product-name">Product</th>
                        <th class="product-total">Total</th>
                    </tr>
                </thead>
                <tbody>
                    <tr class="cart_item">
                        <td class="product-name">
                            Ship Your Idea <strong class="product-quantity">× 1</strong> </td>
                        <td class="product-total">
                            <span class="amount">£500.00</span> </td>
                    </tr>
                </tbody>
                <tfoot>

                    <tr class="cart-subtotal">
                        <th>Cart Subtotal</th>
                        <td><span class="amount">£500.00</span>
                        </td>
                    </tr>

                    <tr class="shipping">
                        <th>Shipping and Handling</th>
                        <td>

                            Shipping Cost
                            <input type="hidden" class="shipping_method" value=""""),
format.raw("""free_shipping" id="shipping_method_0" data-index="0" name="shipping_method[0]">
                        </td>
                    </tr>


                    <tr class="order-total">
                        <th>Order Total</th>
                        <td><strong><span class="amount">£500.00</span></strong> </td>
                    </tr>

                </tfoot>
            </table>


            <div id="payment">
                <ul class="payment_methods methods">
                    <li class="payment_method_bacs">
                        <input type="radio" data-order_button_text="" checked="checked" value="bacs" name="payment_method" class="input-radio" id="payment_method_bacs">
                        <label for="payment_method_bacs">Direct Bank Transfer </label>
                    </li>
                    <li class="payment_method_cheque">
                        <input type="radio" data-order_button_text="" value="cheque" name="payment_method" class="input-radio" id="payment_method_cheque">
                        <label for="payment_method_cheque">Cheque Payment </label>
                        <div style="display: none;" class="payment_box payment_method_cheque">
                            <p>Please send your cheque to Store Name, Store Street, Store Town, Store State / County, Store Postcode.</p>
                        </div>
                    </li>
                    <li class="payment_method_paypal">
                        <input type="radio" data-order_button_text="Proceed to PayPal" value="paypal" name="payment_method" class="input-radio" id="payment_method_paypal">
                        <label for="payment_method_paypal">
                            PayPal <img alt="PayPal Acceptance Mark" src="https://www.paypalobjects.com/webstatic/mktg/Logo/AM_mc_vs_ms_ae_UK.png"><a title="What is PayPal?" onclick="javascript:window.open('https://www.paypal.com/gb/webapps/mpp/paypal-popup', 'WIPaypal', 'toolbar=no, location=no, directories=no, status=no, menubar=no, scrollbars=yes, resizable=yes, width=1060, height=700');
                        return false;" class="about_paypal" href="https://www.paypal.com/gb/webapps/mpp/paypal-popup">
                            What is PayPal?</a>
                        </label>
                        <div style="display: none;" class="payment_box payment_method_paypal">
                            <p>Pay via PayPal; you can pay with your credit card if you don’t have a PayPal account.</p>
                        </div>
                    </li>
                </ul>

                <div class="clear"></div>

            </div>
        </div>


        <div class="footer-bottom-area">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright" style="padding-left: 40px">
                        <p>European standards   <img height="20" width="20" src=""""),_display_(/*462.83*/routes/*462.89*/.Assets.versioned("/img/eu.png")),format.raw/*462.121*/(""""></p><br>
                        <p>&copy; 2020 eShop. All Rights Reserved.</p>
                    </div>
                </div>
            </div>
        </div>

            <!-- End footer bottom area -->


            <!-- JavaScript , Bootstrap ,Jquery files-->
        <script src=""""),_display_(/*473.23*/routes/*473.29*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*473.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*474.23*/routes/*474.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*474.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*475.23*/routes/*475.29*/.Assets.versioned("js/main.js")),format.raw/*475.60*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*476.23*/routes/*476.29*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*476.72*/(""""></script>
        <script src=""""),_display_(/*477.23*/routes/*477.29*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*477.77*/(""""></script>
        <script src=""""),_display_(/*478.23*/routes/*478.29*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*478.72*/(""""></script>
        <script src=""""),_display_(/*479.23*/routes/*479.29*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*479.69*/(""""></script>

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
                  DATE: 2020-12-18T16:36:31.909
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/checkout.scala.html
                  HASH: ced166ffcd5a3b7e0716dce5e15bd1f7a780add2
                  MATRIX: 725->1|821->3|855->12|879->28|918->30|954->40|1319->377|1335->383|1394->420|1525->524|1540->530|1583->552|1670->611|1686->617|1742->651|1870->752|1885->758|1932->784|2019->843|2035->849|2092->884|2224->989|2239->995|2283->1018|2370->1077|2386->1083|2443->1118|2572->1220|2587->1226|2634->1252|2714->1304|2730->1310|2788->1346|4847->3378|4862->3384|4906->3407|5027->3501|5042->3507|5103->3546|5930->4346|5945->4352|5989->4375|6144->4503|6159->4509|6202->4531|6358->4660|6373->4666|6416->4688|6571->4816|6586->4822|6633->4848|6793->4981|6808->4987|6854->5012|29863->27973|29879->27979|29934->28011|30265->28314|30281->28320|30346->28363|30432->28421|30448->28427|30510->28467|30596->28525|30612->28531|30665->28562|30751->28620|30767->28626|30832->28669|30895->28704|30911->28710|30981->28758|31044->28793|31060->28799|31125->28842|31188->28877|31204->28883|31266->28923
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|35->10|35->10|35->10|37->12|37->12|37->12|37->12|37->12|37->12|39->14|39->14|39->14|39->14|39->14|39->14|41->16|41->16|41->16|41->16|41->16|41->16|43->18|43->18|43->18|43->18|43->18|43->18|82->57|82->57|82->57|83->58|83->58|83->58|103->78|103->78|103->78|106->81|106->81|106->81|109->84|109->84|109->84|112->87|112->87|112->87|115->90|115->90|115->90|488->462|488->462|488->462|499->473|499->473|499->473|500->474|500->474|500->474|501->475|501->475|501->475|502->476|502->476|502->476|503->477|503->477|503->477|504->478|504->478|504->478|505->479|505->479|505->479
                  -- GENERATED --
              */
          