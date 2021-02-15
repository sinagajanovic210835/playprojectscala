
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

object updateprods extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],String,Set[String],Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(x:List[Product], cart:String, categories:Set[String])(implicit messages:Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Update/Insert/Delete Products", cart, categories)/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""


"""),format.raw/*5.1*/("""<div class="col" style="background-color:#4d4d4d;">
    <a href=""""),_display_(/*6.15*/routes/*6.21*/.Products.showProdForm(0)),format.raw/*6.46*/("""" class="btn btn-link " style="color:yellow"><i class="fa fa-plus-square" aria-hidden="true"></i> <b>Insert new product</b></a>
    <table class="table table-bordered table-striped table-sm table-hover table-dark">

        <thead class="thead-dark">
        <tr style="text-align:center">
            <td><h4>Product name</h4></td>
            <td><h4>Picture</h4></td>
            <td><h4>BAR code</h4></td>
            <td><h4>Price</h4></td>
            <td><h4>On stack</h4></td>
            <td><h4>Category</h4></td>
            <td><h4>ACTION</h4></td>
        </tr>
        </thead>
        <tbody>
        """),_display_(/*21.10*/for(p <- x) yield /*21.21*/{_display_(Seq[Any](format.raw/*21.22*/("""
        """),format.raw/*22.9*/("""<tr>
            <td>"""),_display_(/*23.18*/p/*23.19*/.name),format.raw/*23.24*/("""</td>
            <td><img src =""""),_display_(/*24.29*/p/*24.30*/.pictureURL),format.raw/*24.41*/("""" style="width:3vw"></td>
            <td><img src = """"),_display_(/*25.30*/routes/*25.36*/.Barcodes.barcode(p.ean, 80)),format.raw/*25.64*/("""" alt=""""),_display_(/*25.72*/p/*25.73*/.ean),format.raw/*25.77*/(""""></td>
            <td>"""),_display_(/*26.18*/p/*26.19*/.price),format.raw/*26.25*/("""</td>
            <td>"""),_display_(/*27.18*/p/*27.19*/.stack),format.raw/*27.25*/("""</td>
            <td>"""),_display_(/*28.18*/p/*28.19*/.category),format.raw/*28.28*/("""</td>
            <td style="text-align:center"><h3><a href=""""),_display_(/*29.57*/routes/*29.63*/.Products.showProdForm(p.id)),format.raw/*29.91*/("""" class="btn btn-outline-success"> <i class="fa fa-wrench" aria-hidden="true"></i> Update</a>
                &emsp;<a href=""""),_display_(/*30.33*/routes/*30.39*/.Products.delete(p.id)),format.raw/*30.61*/("""" class="btn btn-outline-danger" onclick="if (!(confirm('Are you sure you want to delete """),_display_(/*30.151*/p/*30.152*/.name),format.raw/*30.157*/("""?'))) return false;">
                    <i class="fa fa-trash-alt" aria-hidden="true"></i> Delete</a></h3>
            </td>
        </tr>
        """)))}),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""</tbody>
    </table>
</div>

""")))}))
      }
    }
  }

  def render(x:List[Product],cart:String,categories:Set[String],messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(x,cart,categories)(messages)

  def f:((List[Product],String,Set[String]) => (Messages) => play.twirl.api.HtmlFormat.Appendable) = (x,cart,categories) => (messages) => apply(x,cart,categories)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:11:02.468
                  SOURCE: F:/playprojectscala/app/views/updateprods.scala.html
                  HASH: e6763503f91c5f4bb2e7776b4dcd9a873b28902a
                  MATRIX: 770->1|946->85|1009->140|1048->142|1077->145|1169->211|1183->217|1228->242|1872->859|1899->870|1938->871|1974->880|2023->902|2033->903|2059->908|2120->942|2130->943|2162->954|2244->1009|2259->1015|2308->1043|2343->1051|2353->1052|2378->1056|2430->1081|2440->1082|2467->1088|2517->1111|2527->1112|2554->1118|2604->1141|2614->1142|2644->1151|2733->1213|2748->1219|2797->1247|2950->1373|2965->1379|3008->1401|3126->1491|3137->1492|3164->1497|3345->1647|3381->1656
                  LINES: 21->1|26->2|26->2|26->2|29->5|30->6|30->6|30->6|45->21|45->21|45->21|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|49->25|49->25|49->25|50->26|50->26|50->26|51->27|51->27|51->27|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|54->30|54->30|54->30|58->34|59->35
                  -- GENERATED --
              */
          