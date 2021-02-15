
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

object prodform extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[ProductForm.ProdData],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[ProductForm.ProdData], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Create/update product", "", Set())/*3.42*/{_display_(Seq[Any](format.raw/*3.43*/("""

"""),format.raw/*5.1*/("""<div style="text-align:center; color:green; background-color:#1a1a1a; min-width:70%"><br>

        <a href = """"),_display_(/*7.21*/routes/*7.27*/.Products.updateProducts),format.raw/*7.51*/("""" class="btn btn-link"><b><i class="fa fa-arrow-circle-left"></i> Back</b></a><br>
 

        """),_display_(/*10.10*/if(form.hasGlobalErrors)/*10.34*/ {_display_(Seq[Any](format.raw/*10.36*/("""
        """),_display_(/*11.10*/form/*11.14*/.globalErrors.map/*11.31*/ { error: FormError =>_display_(Seq[Any](format.raw/*11.53*/("""
        """),format.raw/*12.9*/("""<div style="color:red">
                """),_display_(/*13.18*/error/*13.23*/.key),format.raw/*13.27*/(""": """),_display_(/*13.30*/error/*13.35*/.message),format.raw/*13.43*/("""
        """),format.raw/*14.9*/("""</div>
            """)))}),format.raw/*15.14*/("""
            """)))}),format.raw/*16.14*/("""
        """),format.raw/*17.9*/("""<div class="form" >
            """),_display_(/*18.14*/helper/*18.20*/.form(postUrl)/*18.34*/ {_display_(Seq[Any](format.raw/*18.36*/("""

            """),_display_(/*20.14*/helper/*20.20*/.CSRF.formField),format.raw/*20.35*/("""

            """),format.raw/*22.13*/("""<div class="row">
                <div class="col"  style="text-align:center">
                """),_display_(/*24.18*/helper/*24.24*/.inputText(form("name"))),format.raw/*24.48*/("""
                """),format.raw/*25.17*/("""</div>
                <div class="col"  style="text-align:center">
                """),_display_(/*27.18*/helper/*27.24*/.inputText(form("price"))),format.raw/*27.49*/("""
                """),format.raw/*28.17*/("""</div>
                <div class="col"  style="text-align:center">
                    """),_display_(/*30.22*/helper/*30.28*/.inputText(form("stack"))),format.raw/*30.53*/("""
                """),format.raw/*31.17*/("""</div>
            </div>
            <div class="row">
                <div class="col"  style="text-align:center">
                    """),_display_(/*35.22*/helper/*35.28*/.inputText(form("pictureURL"))),format.raw/*35.58*/("""
                """),format.raw/*36.17*/("""</div>
                <div class="col"  style="text-align:center">
                    """),_display_(/*38.22*/helper/*38.28*/.select(form("category"), ("" -> "Choose category") :: (models.Product.categories.map(x => x -> x.capitalize).toList))),format.raw/*38.146*/("""
                """),format.raw/*39.17*/("""</div>
                <div class="col"  style="text-align:center">
                    """),_display_(/*41.22*/helper/*41.28*/.inputText(form("ean"))),format.raw/*41.51*/("""
                """),format.raw/*42.17*/("""</div>
            </div>



            """),_display_(/*47.14*/helper/*47.20*/.textarea(form("description"))),format.raw/*47.50*/("""


                """),format.raw/*50.17*/("""<input type="submit" class="btn btn-success" value="Save product">

            """)))}),format.raw/*52.14*/("""
        """),format.raw/*53.9*/("""</div>
</div>
""")))}))
      }
    }
  }

  def render(form:Form[ProductForm.ProdData],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,postUrl)(request)

  def f:((Form[ProductForm.ProdData],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,postUrl) => (request) => apply(form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2021-02-13T18:56:53.343
                  SOURCE: F:/playprojectscala/app/views/prodform.scala.html
                  HASH: 57eb000b4d05ba7c6d5507ffdf613920f8c5dc72
                  MATRIX: 779->1|963->92|990->94|1038->134|1076->135|1104->137|1241->248|1255->254|1299->278|1421->373|1454->397|1494->399|1531->409|1544->413|1570->430|1630->452|1666->461|1734->502|1748->507|1773->511|1803->514|1817->519|1846->527|1882->536|1933->556|1978->570|2014->579|2074->612|2089->618|2112->632|2152->634|2194->649|2209->655|2245->670|2287->684|2410->780|2425->786|2470->810|2515->827|2627->912|2642->918|2688->943|2733->960|2849->1049|2864->1055|2910->1080|2955->1097|3120->1235|3135->1241|3186->1271|3231->1288|3347->1377|3362->1383|3502->1501|3547->1518|3663->1607|3678->1613|3722->1636|3767->1653|3836->1695|3851->1701|3902->1731|3949->1750|4061->1831|4097->1840
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|31->7|31->7|31->7|34->10|34->10|34->10|35->11|35->11|35->11|35->11|36->12|37->13|37->13|37->13|37->13|37->13|37->13|38->14|39->15|40->16|41->17|42->18|42->18|42->18|42->18|44->20|44->20|44->20|46->22|48->24|48->24|48->24|49->25|51->27|51->27|51->27|52->28|54->30|54->30|54->30|55->31|59->35|59->35|59->35|60->36|62->38|62->38|62->38|63->39|65->41|65->41|65->41|66->42|71->47|71->47|71->47|74->50|76->52|77->53
                  -- GENERATED --
              */
          