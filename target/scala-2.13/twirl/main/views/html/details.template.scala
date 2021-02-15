
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

object details extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Product,Set[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart:String, p:Product, categ:Set[String])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main(p.name, cart, categ)/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/("""

"""),format.raw/*5.1*/("""<div class="container" style="color:green;">

    <div style="display: flex; justify-content:space-around;">
        <div style="width:50vw">
            <img src =""""),_display_(/*9.25*/p/*9.26*/.pictureURL),format.raw/*9.37*/("""" style="width:40vw">
            <h4 style="text-align:center">"""),_display_(/*10.44*/p/*10.45*/.price),format.raw/*10.51*/(""" """),format.raw/*10.52*/("""RSD</h4><hr>
            <p style="text-align:center">
                <a href = """"),_display_(/*12.29*/routes/*12.35*/.Products.addCart(p.id, cart)),format.raw/*12.64*/("""" style="font-size:1vw" class="btn btn-outline-danger">
                    <i class="fa fa-cart-arrow-down"></i>Add to cart</a><br><br>
            </p>
        </div>
        <div>
            <p style="text-align:justify"><br>"""),_display_(/*17.48*/p/*17.49*/.description),format.raw/*17.61*/("""</p><hr>

        </div>
    </div>
</div>

""")))}))
      }
    }
  }

  def render(cart:String,p:Product,categ:Set[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(cart,p,categ)(messages)

  def f:((String,Product,Set[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (cart,p,categ) => (messages) => apply(cart,p,categ)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:11:02.383
                  SOURCE: F:/playprojectscala/app/views/details.scala.html
                  HASH: 29fd346e45539e035fd4c2f6512cffa304936d9a
                  MATRIX: 760->1|925->73|952->75|985->100|1023->101|1051->103|1243->269|1252->270|1283->281|1375->346|1385->347|1412->353|1441->354|1551->437|1566->443|1616->472|1873->702|1883->703|1916->715
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|33->9|33->9|33->9|34->10|34->10|34->10|34->10|36->12|36->12|36->12|41->17|41->17|41->17
                  -- GENERATED --
              */
          