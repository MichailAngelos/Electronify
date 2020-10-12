
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>

            <!--fonts from Google -->
        <link href=""""),_display_(/*15.22*/routes/*15.28*/.Assets.versioned("css/google1.css")),format.raw/*15.64*/(""""  rel='stylesheet' type='text/css'>
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("css/google2.css")),format.raw/*16.64*/(""""  rel='stylesheet' type='text/css'>
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("css/google3.css")),format.raw/*17.64*/("""" rel='stylesheet' type='text/css'>

            <!-- Custom Css -->
        <link rel="stylesheet" href="""),_display_(/*20.38*/routes/*20.44*/.Assets.versioned("css/owl.carousel.css")),format.raw/*20.85*/(""">
        <link rel="stylesheet" href="""),_display_(/*21.38*/routes/*21.44*/.Assets.versioned("css/responsive.css")),format.raw/*21.83*/(""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*22.54*/routes/*22.60*/.Assets.versioned("css/style.css")),format.raw/*22.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*23.54*/routes/*23.60*/.Assets.versioned("css/bootstrap.min.css")),format.raw/*23.102*/("""">

    </head>
    <body id="mainDiv">
       <div class="container-fluid" >
        """),_display_(/*28.10*/body),format.raw/*28.14*/("""

            """),format.raw/*30.13*/("""<!-- JavaScript , Bootstrap ,Jquery files-->
        <script src=""""),_display_(/*31.23*/routes/*31.29*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*31.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*32.23*/routes/*32.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*32.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("js/main.js")),format.raw/*33.60*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("js/jquery-3.5.0.min.js")),format.raw/*34.72*/(""""></script>
        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("js/jquery.easing.1.3.min.js")),format.raw/*35.77*/(""""></script>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*36.72*/(""""></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("js/jquery.sticky.js")),format.raw/*37.69*/(""""></script>
       </div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-10-12T09:44:02.166
                  SOURCE: /home/michail/dev/Electronify/app/views/main.scala.html
                  HASH: 48493394e93dba8066d16aea6eff367cce2bf1cf
                  MATRIX: 733->2|854->30|881->31|1140->263|1166->268|1262->337|1277->343|1334->379|1419->437|1434->443|1491->479|1576->537|1591->543|1648->579|1781->685|1796->691|1858->732|1924->771|1939->777|1999->816|2081->871|2096->877|2151->911|2234->967|2249->973|2313->1015|2427->1102|2452->1106|2494->1120|2588->1187|2603->1193|2667->1236|2751->1293|2766->1299|2827->1339|2911->1396|2926->1402|2978->1433|3062->1490|3077->1496|3141->1539|3202->1573|3217->1579|3286->1627|3347->1661|3362->1667|3426->1710|3487->1744|3502->1750|3563->1790
                  LINES: 21->2|26->3|27->4|35->12|35->12|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|43->20|43->20|43->20|44->21|44->21|44->21|45->22|45->22|45->22|46->23|46->23|46->23|51->28|51->28|53->30|54->31|54->31|54->31|55->32|55->32|55->32|56->33|56->33|56->33|57->34|57->34|57->34|58->35|58->35|58->35|59->36|59->36|59->36|60->37|60->37|60->37
                  -- GENERATED --
              */
          