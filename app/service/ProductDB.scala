/*
package service
import play.api.db.DBApi
import javax.inject._
import scala.language.postfixOps

@Singleton
class ProductDB @Inject()(d: DBApi)(implicit ec: DatabaseExecutionContext) {
    private val db = d.database("default")

    val prodParser = {
        get[Int]("id") ~
        get[String]("name") ~
        get[Int]("price") ~
        get[Int]("stack") ~
        get[String]("picture") ~
        get[String]("category") ~
        get[Long](name = "ean") ~
        get[String]("description")
    } map {
      case id ~ name ~ price ~ stack ~ picture ~ category ~ ean ~ description =>
        Product(id, name, price, stack, picture, category, ean, description)
    }

    def findAll = {
      val sql: SqlQuery = SQL("select * from products")
      db.withConnection { implicit conn =>
        sql.as(prodParser *)
      }
    }

      def findByEan(ean:Long) = {
        val sql: SqlQuery = SQL(s"select * from products where ean = ${ean}")
        db.withConnection { implicit conn =>
          sql.as(prodParser *).head
        }
      }
        def findById(id:Int) = {
          val sql: SqlQuery = SQL(s"select * from products where id = ${id}")
          db.withConnection { implicit conn =>
            sql.as(prodParser *).head
          }
    }

  def insertUpdate(p:Product) = {
    val sql: SqlQuery = if(p.id == 0)
      SQL(s"insert into products values(null, '${p.name}', ${p.price}, ${p.stack}, '${p.pictureURL}', '${p.category}', ${p.ean}, '${p.description}')")
    else
      SQL(s"update products set name = '${p.name}', price = ${p.price}, stack = ${p.stack}, picture = '${p.pictureURL}'," +
        s"category = '${p.category}', ean = ${p.ean}, description = '${p.description}' where id = ${p.id}")
    db.withConnection { implicit conn =>
      sql.execute
    }
  }

  def delete(id:Int) = {
    val sql: SqlQuery = SQL(s"delete from products where id = ${id}")
    db.withConnection { implicit conn =>
      sql.execute
    }
  }
}

*/
package service


  import models.Product
  import models.Product.productList

class ProductDB {
  def findAll = {
    productList.sortBy(_.id)
    }

  def findByEan(ean:Long):Option[Product] = {
    productList.find(_.ean == ean)
   }

  def findById(id:Int) = {
    productList.find(_.id == id).get
  }

  def insertUpdate(p:Product) = {
     if(p.id == 0){
       val p1 = Product(productList.map(_.id).max + 1, p.name, p.price, p.stack, p.pictureURL, p.category, p.ean, p.description)
       productList = (p1 :: productList).sortBy(_.id)
     }else {
       delete(p.id)
       productList = (p :: productList).sortBy(_.id)
     }
  }

  def delete(id:Int) = {
    productList = productList.filter(_.id != id)
  }
}
