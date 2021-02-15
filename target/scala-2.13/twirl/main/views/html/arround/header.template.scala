
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

object header extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Set[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cart:String, categ:Set[String])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<div class="row" style="border-bottom:1px solid black; background-color:#e6e6e6">
    <div class="col">
        &emsp;   <a href='"""),_display_(/*5.28*/routes/*5.34*/.Products.listProds("All products", cart)),format.raw/*5.75*/("""'><b><i class="fa fa-home fa-lg"></i></b></a>

       """),_display_(/*7.9*/for(c <- categ) yield /*7.24*/{_display_(Seq[Any](format.raw/*7.25*/("""

           """),format.raw/*9.12*/("""<a href = """"),_display_(/*9.24*/routes/*9.30*/.Products.listProds(c, cart)),format.raw/*9.58*/("""" class="btn btn-link"><b>"""),_display_(/*9.85*/c/*9.86*/.capitalize),format.raw/*9.97*/("""</b></a>

       """)))}),format.raw/*11.9*/("""
    """),format.raw/*12.5*/("""</div>
    <div class="col"  style="text-align:right; " >
           <a href = '"""),_display_(/*14.24*/(if(cart.isEmpty) "" else routes.Products.showCart(cart))),format.raw/*14.81*/("""'
           class="btn btn-link" style='color:"""),_display_(/*15.47*/(if(cart.isEmpty)"red; cursor:not-allowed;" else "green")),format.raw/*15.104*/("""'>
            <i class="fa fa-shopping-cart fa-lg"></i></a>
    </div>
</div>"""))
      }
    }
  }

  def render(cart:String,categ:Set[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(cart,categ)(messages)

  def f:((String,Set[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (cart,categ) => (messages) => apply(cart,categ)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-15T09:12:34.551
                  SOURCE: F:/playprojectscala/app/views/arround/header.scala.html
                  HASH: 5e2d045e9109e5344494cfb6dea544bd7e5278b8
                  MATRIX: 759->1|913->62|940->63|1097->194|1111->200|1172->241|1252->296|1282->311|1320->312|1360->325|1398->337|1412->343|1460->371|1513->398|1522->399|1553->410|1601->428|1633->433|1741->514|1819->571|1894->619|1973->676
                  LINES: 21->1|26->2|27->3|29->5|29->5|29->5|31->7|31->7|31->7|33->9|33->9|33->9|33->9|33->9|33->9|33->9|35->11|36->12|38->14|38->14|39->15|39->15
                  -- GENERATED --
              */
          