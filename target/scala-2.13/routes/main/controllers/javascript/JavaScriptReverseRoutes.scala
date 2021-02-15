// @GENERATOR:play-routes-compiler
// @SOURCE:F:/playprojectscala/conf/routes
// @DATE:Sun Feb 14 08:31:00 CET 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:3
  class ReverseBarcodes(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def barcode: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Barcodes.barcode",
      """
        function(ean0,in1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "barcode/" + (""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("ean", ean0) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("in", in1)])})
        }
      """
    )
  
  }

  // @LINE:2
  class ReverseProducts(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def jsprodsingle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.jsprodsingle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pjson/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:6
    def removeCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.removeCart",
      """
        function(id0,k1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removecart" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("k", k1)])})
        }
      """
    )
  
    // @LINE:8
    def jsprod: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.jsprod",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pjson"})
        }
      """
    )
  
    // @LINE:12
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.delete",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def updateProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.updateProducts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productpage"})
        }
      """
    )
  
    // @LINE:2
    def listProds: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.listProds",
      """
        function(categ0,cart1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "list/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("categ", categ0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("cart", cart1)])})
        }
      """
    )
  
    // @LINE:4
    def details: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.details",
      """
        function(cart0,id1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "details" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("cart", cart0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id1)])})
        }
      """
    )
  
    // @LINE:7
    def showCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.showCart",
      """
        function(k0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showcart" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("k", k0)])})
        }
      """
    )
  
    // @LINE:5
    def addCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.addCart",
      """
        function(id0,k1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcart" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("id", id0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("k", k1)])})
        }
      """
    )
  
    // @LINE:11
    def saveProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.saveProduct",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def showProdForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Products.showProdForm",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
