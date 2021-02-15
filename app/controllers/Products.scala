package controllers

import models.Product
import models.Product.{categories, productList}
import models.ProductForm.{ProdData, prodForm}
import play.api.data.Form
import play.api.libs.json._
import play.api.mvc._
import service.ProductDB
import javax.inject.Inject

class Products @Inject()(val messagesControllerComponents: MessagesControllerComponents, db:ProductDB)
                                                                   extends MessagesAbstractController(messagesControllerComponents) {

  productList = db.findAll
  categories = productList.map(_.category).toSet


     def listProds(categ:String, cart:String) = Action{implicit request:MessagesRequest[AnyContent] =>
       val l = if(categ == "All products") productList else productList.filter(_.category == categ)
         Ok(views.html.list(l, cart, categories))
     }

  def details(cart:String, id:Int) = Action{implicit request:MessagesRequest[AnyContent] =>
   val p = productList.find(_.id == id).get
    Ok(views.html.details(cart, p, categories))

  }

  def addCart(id:Int, cart:String) = Action { implicit request: MessagesRequest[AnyContent] =>
    val s = cart + id + ","
    Redirect(routes.Products.listProds("All products", s))
  }

  def removeCart(id:Int, cart:String) = Action { implicit request: MessagesRequest[AnyContent] =>
    val str = id + ","
    val s = cart.replaceFirst(str, "")
    if (s.isEmpty) {
      Redirect(routes.Products.listProds("All products", ""))
    } else {
      Redirect(routes.Products.showCart(s))
    }
  }
  def showCart(cart:String) = Action { implicit request: MessagesRequest[AnyContent] =>
    val ids = cart.init.split(",")
    val prodList = for(id <- ids) yield db.findById(Integer.parseInt(id))
    Ok(views.html.cart(prodList.toList, cart, categories))
  }
  def jsprod() = Action {
    Ok(Json.toJson(productList))
  }

  def jsprodsingle(id:Int) = Action {
    val p = db.findById(id)
    Ok(Json.toJson(p))
  }

  def updateProducts = Action { implicit request: MessagesRequest[AnyContent] =>
    val l = db.findAll
    Ok(views.html.updateprods(l, "", Set()))
  }



  def showProdForm(id:Int) = Action {implicit request:MessagesRequest[AnyContent] =>
    val postUrl = routes.Products.saveProduct(id)
    if(id == 0)
      Ok(views.html.prodform(prodForm, postUrl))
    else {
      val p = db.findById(id)
      val pd = ProdData(p.name, p.price, p.stack, p.pictureURL, p.category, p.ean, p.description)
      Ok(views.html.prodform(prodForm.fill(pd), postUrl))
    }
  }

  def saveProduct(id:Int) = Action { implicit request: MessagesRequest[AnyContent] => {
    val postUrl = routes.Products.saveProduct(id)
    val errorFunction = { formWithErrors: Form[ProdData] =>
      BadRequest(views.html.prodform(formWithErrors, postUrl))
    }
    val successFunction = { data: ProdData =>
      val product = Product(id, data.name, data.price, data.stack, data.pictureURL, data.category, data.ean, data.description)
      db.insertUpdate(product)
      Redirect(routes.Products.updateProducts)
    }
    val formValidationResult = prodForm.bindFromRequest
    formValidationResult.fold(errorFunction, successFunction)
  }
  }

  def delete(id:Int) = Action{implicit  request:MessagesRequest[AnyContent] =>
    db.delete(id)
    Redirect(routes.Products.updateProducts())
  }
}