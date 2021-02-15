
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[String,String,Set[String],Html,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, cart:String, categ:Set[String])(content: Html)(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" media="screen"
          href='"""),_display_(/*10.18*/routes/*10.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.65*/("""'>
</head>
<body>
<div><!-------------------------------------------------------------------------->
    """),_display_(/*14.6*/arround/*14.13*/.header(cart, categ)),format.raw/*14.33*/("""
       """),format.raw/*15.8*/("""<div class="row" style="min-height:40vw">
           """),_display_(/*16.13*/arround/*16.20*/.left()),format.raw/*16.27*/("""
           """),_display_(/*17.13*/content),format.raw/*17.20*/("""
           """),_display_(/*18.13*/arround/*18.20*/.right()),format.raw/*18.28*/("""
       """),format.raw/*19.8*/("""</div>
    """),_display_(/*20.6*/arround/*20.13*/.bottom()),format.raw/*20.22*/("""
"""),format.raw/*21.1*/("""</div><!-------------------------------------------------------------------------->

<!-- javascript files-->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script src='"""),_display_(/*27.15*/routes/*27.21*/.Assets.versioned("javascripts/main.js")),format.raw/*27.61*/("""'></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,cart:String,categ:Set[String],content:Html,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(title,cart,categ)(content)(messages)

  def f:((String,String,Set[String]) => (Html) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (title,cart,categ) => (content) => (messages) => apply(title,cart,categ)(content)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:11:02.420
                  SOURCE: F:/playprojectscala/app/views/main.scala.html
                  HASH: cb321427cb6fd2b7aeed1b3b6ae5c23eaa3de0e6
                  MATRIX: 761->1|945->92|972->93|1050->145|1075->150|1497->545|1512->551|1574->592|1706->698|1722->705|1763->725|1798->733|1879->787|1895->794|1923->801|1963->814|1991->821|2031->834|2047->841|2076->849|2111->857|2149->869|2165->876|2195->885|2223->886|2964->1600|2979->1606|3040->1646
                  LINES: 21->1|26->2|27->3|30->6|30->6|34->10|34->10|34->10|38->14|38->14|38->14|39->15|40->16|40->16|40->16|41->17|41->17|42->18|42->18|42->18|43->19|44->20|44->20|44->20|45->21|51->27|51->27|51->27
                  -- GENERATED --
              */
          