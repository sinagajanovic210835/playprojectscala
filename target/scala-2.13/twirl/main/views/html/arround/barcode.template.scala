
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

object barcode extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Long,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ean: Long, ir:Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<img class="barcode" alt=""""),_display_(/*2.28*/ean),format.raw/*2.31*/("""" src=""""),_display_(/*2.39*/routes/*2.45*/.Barcodes.barcode(ean, ir)),format.raw/*2.71*/("""">"""))
      }
    }
  }

  def render(ean:Long,ir:Int): play.twirl.api.HtmlFormat.Appendable = apply(ean,ir)

  def f:((Long,Int) => play.twirl.api.HtmlFormat.Appendable) = (ean,ir) => apply(ean,ir)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:11:02.294
                  SOURCE: F:/playprojectscala/app/views/arround/barcode.scala.html
                  HASH: b546a6e2166aee83fbd7db9740f71c91c6e56eb5
                  MATRIX: 741->1|854->21|907->48|930->51|964->59|978->65|1024->91
                  LINES: 21->1|26->2|26->2|26->2|26->2|26->2|26->2
                  -- GENERATED --
              */
          