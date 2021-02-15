// @GENERATOR:play-routes-compiler
// @SOURCE:F:/playprojectscala/conf/routes
// @DATE:Sun Feb 14 08:31:00 CET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_3: controllers.HomeController,
  // @LINE:2
  Products_1: controllers.Products,
  // @LINE:3
  Barcodes_0: controllers.Barcodes,
  // @LINE:15
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_3: controllers.HomeController,
    // @LINE:2
    Products_1: controllers.Products,
    // @LINE:3
    Barcodes_0: controllers.Barcodes,
    // @LINE:15
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_3, Products_1, Barcodes_0, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, Products_1, Barcodes_0, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """list/""" + "$" + """categ<[^/]+>""", """controllers.Products.listProds(categ:String, cart:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """barcode/""" + "$" + """ean<\d{13}>""", """controllers.Barcodes.barcode(ean:Long, in:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """details""", """controllers.Products.details(cart:String, id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcart""", """controllers.Products.addCart(id:Int, k:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removecart""", """controllers.Products.removeCart(id:Int, k:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showcart""", """controllers.Products.showCart(k:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pjson""", """controllers.Products.jsprod"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pjson/""" + "$" + """id<[^/]+>""", """controllers.Products.jsprodsingle(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/""" + "$" + """id<[^/]+>""", """controllers.Products.showProdForm(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """update/""" + "$" + """id<[^/]+>""", """controllers.Products.saveProduct(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete/""" + "$" + """id<[^/]+>""", """controllers.Products.delete(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productpage""", """controllers.Products.updateProducts"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_Products_listProds1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("list/"), DynamicPart("categ", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_listProds1_invoker = createInvoker(
    Products_1.listProds(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "listProds",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """list/""" + "$" + """categ<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_Barcodes_barcode2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("barcode/"), DynamicPart("ean", """\d{13}""",false)))
  )
  private[this] lazy val controllers_Barcodes_barcode2_invoker = createInvoker(
    Barcodes_0.barcode(fakeValue[Long], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Barcodes",
      "barcode",
      Seq(classOf[Long], classOf[Int]),
      "GET",
      this.prefix + """barcode/""" + "$" + """ean<\d{13}>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val controllers_Products_details3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("details")))
  )
  private[this] lazy val controllers_Products_details3_invoker = createInvoker(
    Products_1.details(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "details",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """details""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_Products_addCart4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcart")))
  )
  private[this] lazy val controllers_Products_addCart4_invoker = createInvoker(
    Products_1.addCart(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "addCart",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """addcart""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_Products_removeCart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removecart")))
  )
  private[this] lazy val controllers_Products_removeCart5_invoker = createInvoker(
    Products_1.removeCart(fakeValue[Int], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "removeCart",
      Seq(classOf[Int], classOf[String]),
      "GET",
      this.prefix + """removecart""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Products_showCart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showcart")))
  )
  private[this] lazy val controllers_Products_showCart6_invoker = createInvoker(
    Products_1.showCart(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "showCart",
      Seq(classOf[String]),
      "GET",
      this.prefix + """showcart""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Products_jsprod7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pjson")))
  )
  private[this] lazy val controllers_Products_jsprod7_invoker = createInvoker(
    Products_1.jsprod,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "jsprod",
      Nil,
      "GET",
      this.prefix + """pjson""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Products_jsprodsingle8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pjson/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_jsprodsingle8_invoker = createInvoker(
    Products_1.jsprodsingle(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "jsprodsingle",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """pjson/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Products_showProdForm9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_showProdForm9_invoker = createInvoker(
    Products_1.showProdForm(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "showProdForm",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Products_saveProduct10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_saveProduct10_invoker = createInvoker(
    Products_1.saveProduct(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "saveProduct",
      Seq(classOf[Int]),
      "POST",
      this.prefix + """update/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Products_delete11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Products_delete11_invoker = createInvoker(
    Products_1.delete(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "delete",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Products_updateProducts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productpage")))
  )
  private[this] lazy val controllers_Products_updateProducts12_invoker = createInvoker(
    Products_1.updateProducts,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Products",
      "updateProducts",
      Nil,
      "GET",
      this.prefix + """productpage""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:2
    case controllers_Products_listProds1_route(params@_) =>
      call(params.fromPath[String]("categ", None), params.fromQuery[String]("cart", None)) { (categ, cart) =>
        controllers_Products_listProds1_invoker.call(Products_1.listProds(categ, cart))
      }
  
    // @LINE:3
    case controllers_Barcodes_barcode2_route(params@_) =>
      call(params.fromPath[Long]("ean", None), params.fromQuery[Int]("in", None)) { (ean, in) =>
        controllers_Barcodes_barcode2_invoker.call(Barcodes_0.barcode(ean, in))
      }
  
    // @LINE:4
    case controllers_Products_details3_route(params@_) =>
      call(params.fromQuery[String]("cart", None), params.fromQuery[Int]("id", None)) { (cart, id) =>
        controllers_Products_details3_invoker.call(Products_1.details(cart, id))
      }
  
    // @LINE:5
    case controllers_Products_addCart4_route(params@_) =>
      call(params.fromQuery[Int]("id", None), params.fromQuery[String]("k", None)) { (id, k) =>
        controllers_Products_addCart4_invoker.call(Products_1.addCart(id, k))
      }
  
    // @LINE:6
    case controllers_Products_removeCart5_route(params@_) =>
      call(params.fromQuery[Int]("id", None), params.fromQuery[String]("k", None)) { (id, k) =>
        controllers_Products_removeCart5_invoker.call(Products_1.removeCart(id, k))
      }
  
    // @LINE:7
    case controllers_Products_showCart6_route(params@_) =>
      call(params.fromQuery[String]("k", None)) { (k) =>
        controllers_Products_showCart6_invoker.call(Products_1.showCart(k))
      }
  
    // @LINE:8
    case controllers_Products_jsprod7_route(params@_) =>
      call { 
        controllers_Products_jsprod7_invoker.call(Products_1.jsprod)
      }
  
    // @LINE:9
    case controllers_Products_jsprodsingle8_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Products_jsprodsingle8_invoker.call(Products_1.jsprodsingle(id))
      }
  
    // @LINE:10
    case controllers_Products_showProdForm9_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Products_showProdForm9_invoker.call(Products_1.showProdForm(id))
      }
  
    // @LINE:11
    case controllers_Products_saveProduct10_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Products_saveProduct10_invoker.call(Products_1.saveProduct(id))
      }
  
    // @LINE:12
    case controllers_Products_delete11_route(params@_) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Products_delete11_invoker.call(Products_1.delete(id))
      }
  
    // @LINE:13
    case controllers_Products_updateProducts12_route(params@_) =>
      call { 
        controllers_Products_updateProducts12_invoker.call(Products_1.updateProducts)
      }
  
    // @LINE:15
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
