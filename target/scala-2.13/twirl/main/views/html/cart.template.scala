
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

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],String,Set[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(prodList:List[Product], cart:String, categories:Set[String])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Cart", cart, categories)/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""

"""),format.raw/*5.1*/("""<div class="col" style="background-color:#4d4d4d;">

    <table class="table table-bordered table-striped table-dark table-sm table-hover" style="margin-top:10px;">
        <thead>
        <tr><td><h1  style="text-align:center"></h1></td></tr>
        <tr><td style="text-align:center;"><h4>Product name</h4></td>
            <td style="text-align:center;"><h4>Picture</h4></td>
            <td style="text-align:center;"><h4>BAR code</h4></td>
            <td style="text-align:center;"><h4>Price</h4></td>
            <td style="text-align:center;"><h4>Category</h4></td>
            <td style="text-align:center;color:#00cc66"><h3><i class="fa fa-cash-register fa-lg" style="color:#00cc66"></i> """),_display_(/*15.126*/(prodList.map(_.price).sum)),format.raw/*15.153*/("""</h3></td></tr></thead>
        <tbody>
        """),_display_(/*17.10*/for(p <- prodList) yield /*17.28*/{_display_(Seq[Any](format.raw/*17.29*/("""
        """),format.raw/*18.9*/("""<tr>
            <td>"""),_display_(/*19.18*/p/*19.19*/.name),format.raw/*19.24*/("""</td>
            <td><a href=""""),_display_(/*20.27*/routes/*20.33*/.Products.details(cart, p.id)),format.raw/*20.62*/(""""><img src =""""),_display_(/*20.76*/p/*20.77*/.pictureURL),format.raw/*20.88*/("""" style="width:3vw"></a></td>
            <td><img src = """"),_display_(/*21.30*/routes/*21.36*/.Barcodes.barcode(p.ean, 80)),format.raw/*21.64*/(""""></td>
            <td>"""),_display_(/*22.18*/p/*22.19*/.price),format.raw/*22.25*/("""</td>
            <td>"""),_display_(/*23.18*/p/*23.19*/.category),format.raw/*23.28*/("""</td>
            <td style="text-align:center">
                <a href='"""),_display_(/*25.27*/routes/*25.33*/.Products.removeCart(p.id, prodList.map(_.id).mkString("",",",","))),format.raw/*25.100*/("""'
                   class="btn btn-outline-danger" onclick="if (!(confirm('Remove """),_display_(/*26.83*/p/*26.84*/.name),format.raw/*26.89*/(""" """),format.raw/*26.90*/("""from cart?'))) return false;">
                    <i class="fa fa-trash-alt"></i> Remove from cart</a></td>
        </tr>
        """)))}),format.raw/*29.10*/("""
        """),format.raw/*30.9*/("""</tbody>
    </table>
    <h1 style="text-align:center;"><a href = '' style="font-size:1vw" class="btn btn-link"><i class="fa fa-handshake fa-4x" style="color:yellow;"></i></a></h1>
    </div>

    """)))}))
      }
    }
  }

  def render(prodList:List[Product],cart:String,categories:Set[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(prodList,cart,categories)(messages)

  def f:((List[Product],String,Set[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (prodList,cart,categories) => (messages) => apply(prodList,cart,categories)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-14T08:51:30.709
                  SOURCE: F:/playprojectscala/app/views/cart.scala.html
                  HASH: 2a62c443e7dbaa9adda092dcb3188f306b67f033
                  MATRIX: 763->1|946->91|973->93|1011->123|1049->124|1077->126|1804->825|1853->852|1929->901|1963->919|2002->920|2038->929|2087->951|2097->952|2123->957|2182->989|2197->995|2247->1024|2288->1038|2298->1039|2330->1050|2416->1109|2431->1115|2480->1143|2532->1168|2542->1169|2569->1175|2619->1198|2629->1199|2659->1208|2761->1283|2776->1289|2865->1356|2976->1440|2986->1441|3012->1446|3041->1447|3204->1579|3240->1588
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|39->15|39->15|41->17|41->17|41->17|42->18|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|49->25|49->25|49->25|50->26|50->26|50->26|50->26|53->29|54->30
                  -- GENERATED --
              */
          