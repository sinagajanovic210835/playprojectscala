// @GENERATOR:play-routes-compiler
// @SOURCE:F:/playprojectscala/conf/routes
// @DATE:Sun Feb 14 08:31:00 CET 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:3
  class ReverseBarcodes(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def barcode(ean:Long, in:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "barcode/" + implicitly[play.api.mvc.PathBindable[Long]].unbind("ean", ean) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("in", in)))))
    }
  
  }

  // @LINE:2
  class ReverseProducts(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def jsprodsingle(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pjson/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:6
    def removeCart(id:Int, k:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removecart" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("k", k)))))
    }
  
    // @LINE:8
    def jsprod(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pjson")
    }
  
    // @LINE:12
    def delete(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:13
    def updateProducts(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productpage")
    }
  
    // @LINE:2
    def listProds(categ:String, cart:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "list/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("categ", categ)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("cart", cart)))))
    }
  
    // @LINE:4
    def details(cart:String, id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "details" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("cart", cart)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)))))
    }
  
    // @LINE:7
    def showCart(k:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showcart" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("k", k)))))
    }
  
    // @LINE:5
    def addCart(id:Int, k:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addcart" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("id", id)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("k", k)))))
    }
  
    // @LINE:11
    def saveProduct(id:Int): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
    // @LINE:10
    def showProdForm(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "update/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }


}
