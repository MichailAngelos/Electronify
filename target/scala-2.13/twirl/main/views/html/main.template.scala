
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


Seq[Any](format.raw/*2.29*/("""

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
                  DATE: 2020-12-18T16:36:31.961
                  SOURCE: C:/Users/micha/IdeaProjects/Electronify/app/views/main.scala.html
                  HASH: 5abeba81e270859334fab17d7b4ccba32b36d16f
                  MATRIX: 733->3|855->30|885->34|1152->274|1178->279|1277->351|1292->357|1349->393|1435->452|1450->458|1507->494|1593->553|1608->559|1665->595|1801->704|1816->710|1878->751|1945->791|1960->797|2020->836|2103->892|2118->898|2173->932|2257->989|2272->995|2336->1037|2455->1129|2480->1133|2524->1149|2619->1217|2634->1223|2698->1266|2783->1324|2798->1330|2859->1370|2944->1428|2959->1434|3011->1465|3096->1523|3111->1529|3175->1572|3237->1607|3252->1613|3321->1661|3383->1696|3398->1702|3462->1745|3524->1780|3539->1786|3600->1826
                  LINES: 21->2|26->2|28->4|36->12|36->12|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|52->28|52->28|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|60->36|60->36|60->36|61->37|61->37|61->37
                  -- GENERATED --
              */
          