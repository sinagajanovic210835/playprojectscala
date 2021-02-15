
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

object start extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <title>welcome</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" media="screen"
          href='"""),_display_(/*9.18*/routes/*9.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.65*/("""'>
</head>
<br>
<div class="container">
<b>

<a href='"""),_display_(/*15.11*/routes/*15.17*/.Products.listProds("All products", "")),format.raw/*15.56*/("""'>STORE</a>
<hr>
<a href=""""),_display_(/*17.11*/routes/*17.17*/.Products.updateProducts()),format.raw/*17.43*/("""">Products update / insert page</a>
</b>

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
                  DATE: 2021-02-13T18:11:02.452
                  SOURCE: F:/playprojectscala/app/views/start.scala.html
                  HASH: c88d51bc6bbaa5c1a28f25f59a7d11f1473fe7e3
                  MATRIX: 722->1|818->4|1297->457|1311->463|1372->504|1454->559|1469->565|1529->604|1583->631|1598->637|1645->663
                  LINES: 21->1|26->2|33->9|33->9|33->9|39->15|39->15|39->15|41->17|41->17|41->17
                  -- GENERATED --
              */
          