
package views.html.arround

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

object bottom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<div class="=row" style="background-color:#e6e6e6; min-height:100px; border:1px solid black">
    <div class = "row">
        <div class="col">
        <a href=""""),_display_(/*6.19*/routes/*6.25*/.HomeController.index),format.raw/*6.46*/("""" class="btn btn-link" style="margin-left:20px;"><b>Back</b></a>
        </div>
        <div class="col">
         <h2 style=" cursor:pointer; " onclick="funcJson(this, '"""),_display_(/*9.66*/routes/*9.72*/.Products.jsprod),format.raw/*9.88*/("""')">JSON</h2>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-15T09:15:48.989
                  SOURCE: F:/playprojectscala/app/views/arround/bottom.scala.html
                  HASH: 3828739c0ca2daaceb1f6e31df33b3ed848f94dd
                  MATRIX: 731->1|827->4|854->5|1042->167|1056->173|1097->194|1294->365|1308->371|1344->387
                  LINES: 21->1|26->2|27->3|30->6|30->6|30->6|33->9|33->9|33->9
                  -- GENERATED --
              */
          