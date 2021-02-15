
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],String,Set[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(l:List[Product], cart:String, categories:Set[String])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Products", cart, categories)/*3.36*/{_display_(Seq[Any](format.raw/*3.37*/("""


"""),format.raw/*6.1*/("""<div class="col" style="display: flex; justify-content:space-around; flex-wrap:wrap;min-width:70%">
    """),_display_(/*7.6*/for(p <- l) yield /*7.17*/{_display_(Seq[Any](format.raw/*7.18*/("""
    """),format.raw/*8.5*/("""<div id="pr"""),_display_(/*8.17*/p/*8.18*/.id),format.raw/*8.21*/("""" style="text-align:center; margin-top:20px;margin-bottom:20px">
        <h6 style ="color:blue;">"""),_display_(/*9.35*/p/*9.36*/.name.capitalize),format.raw/*9.52*/("""</h6>

        <img src =""""),_display_(/*11.21*/p/*11.22*/.pictureURL),format.raw/*11.33*/("""" style="height:15vw">

        <h2 style ="color:green;">"""),_display_(/*13.36*/p/*13.37*/.price),format.raw/*13.43*/(""" """),format.raw/*13.44*/("""rsd</h2>
        <h1><a href=""""),_display_(/*14.23*/routes/*14.29*/.Products.details(cart, p.id)),format.raw/*14.58*/("""" class="btn btn-outline-success"><i class="fa fa-eye"></i> Details</a><br>
            <a href = '"""),_display_(/*15.25*/routes/*15.31*/.Products.addCart(p.id, cart)),format.raw/*15.60*/("""' style="font-size:1vw" class="btn btn-outline-danger"><i class="fa fa-cart-arrow-down"></i> Add to cart</a></h1>
    </div>
    """)))}),format.raw/*17.6*/("""
"""),format.raw/*18.1*/("""</div>

""")))}),format.raw/*20.2*/("""
"""))
      }
    }
  }

  def render(l:List[Product],cart:String,categories:Set[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(l,cart,categories)(messages)

  def f:((List[Product],String,Set[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (l,cart,categories) => (messages) => apply(l,cart,categories)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:11:02.401
                  SOURCE: F:/playprojectscala/app/views/list.scala.html
                  HASH: a55d118a5fd24be863e8916483bbd820d6af9887
                  MATRIX: 763->1|939->84|966->86|1008->120|1046->121|1075->124|1205->229|1231->240|1269->241|1300->246|1338->258|1347->259|1370->262|1495->361|1504->362|1540->378|1594->405|1604->406|1636->417|1722->476|1732->477|1759->483|1788->484|1846->515|1861->521|1911->550|2038->650|2053->656|2103->685|2263->815|2291->816|2330->825
                  LINES: 21->1|26->2|27->3|27->3|27->3|30->6|31->7|31->7|31->7|32->8|32->8|32->8|32->8|33->9|33->9|33->9|35->11|35->11|35->11|37->13|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|41->17|42->18|44->20
                  -- GENERATED --
              */
          