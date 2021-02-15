package models

import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json._
case class Product(id:Int,name:String, price:Int, stack:Int, pictureURL:String, category:String, ean:Long, description:String)

object Product {
      //var productList = List[Product]()

      var productList = List[Product](
        Product(1, "Hard disk HDD 3.5\" SATA3 7200 1TB WD Blue WD10EZEX, 64MB", 5999, 12, "https://www.winwin.rs/media/catalog/product/420x420/678/91/6789144.jpg", "hard disk", 6111111111111l," Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(2, "Transcend TS500GSJ25A3K Eksterni hard disk 2.5\" 500GB", 7499, 10 , "https://cdn2.emmezeta.rs/media/catalog/product/cache/71a0a3c4bed4bde6e0639628e13ab2b6/2/1/21139614-transcend-ts500gsj25a3k-eksterni-hard-disk-2-5-500gb_1.jpg","hard disk", 2222222222222l, " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(3, "Matična ploča Gigabyte Z390 M GAMING rev. 1.0", 19090, 5, "https://gamecentarrs.b-cdn.net/media/catalog/product/cache/1/image/9df78eab33525d08d6e5fb8d27136e95/2/0/20912-maticna-ploca-gigabyte-z390-m-gaming-rev.-1.0-prodaja-cena-20912-2.jpg.jpg","maticna ploca", 1212121212121l,  " Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; desc"),
        Product(4, "MSI grafička kartica PCIe GTX 1080 Ti GAMING X 11G"   , 133920, 11, "https://dijaspora.shop/media/catalog/product/cache/1/thumbnail/1000x1000/9df78eab33525d08d6e5fb8d27136e95/i/m/img_6497png.png", "graficka kartica",3333333333333l, "description tra la la Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(5, "Grafička karta Asus RTX 2060 6GB Dual OC EVO DVI/2HDM", 100000, 2, "https://www.uspon.rs/img/products/graficka_karta_asus_rtx_2060_6gb_dual_oc_evo_dvi-2hdmi-dp-1602599873-679.png", "graficka kartica", 4444444444444l, "dadad kldladk Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(6, "Procesor AMD AM4 Ryzen 5 2600 3.4 GHz", 10000, 8, "https://www.uspon.rs/img/products/procesor_amd_am4_ryzen_5_2600_3-4_ghz_tray-1594042859-552.jpg", "procesor", 1231111000000l, "desc Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(7, "INTEL procesor Core i5 760",    11399, 6, "https://dijaspora.shop/media/catalog/product/cache/1/image/1000x1000/9df78eab33525d08d6e5fb8d27136e95/0/3/0300394_big.jpg", "procesor", 4444445454545l, "desc Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; "),
        Product(8, "INTEL PROCESOR Core i3 9100F" , 13490,8, "https://www.tempo-tehnika.rs/images/products/big/17100.png", "procesor", 3211111111111000l, "jdjjdadja Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque lorem purus, posuere non tincidunt at, aliquam vitae enim. Integer justo metus, bibendum non vehicula at, blandit a neque. Fusce finibus laoreet urna, sed volutpat dui efficitur at. Etiam ornare odio ut dui efficitur efficitur. Nullam finibus dapibus odio eu vestibulum. Aliquam elementum at sapien non maximus. Phasellus congue interdum ipsum vitae imperdiet. Integer et turpis vel sapien pretium euismod. Integer pulvinar nulla nec augue posuere, in pretium dui tempus. Mauris pharetra lectus nec eleifend iaculis. Nullam ut erat enim. Fusce viverra diam vel placerat luctus. Nulla ornare erat tortor, quis condimentum ex porta id. Vivamus malesuada posuere libero at mollis. Quisque quis tincidunt magna, luctus lobortis nisl.\n\nPhasellus a egestas quam, id egestas lacus. Phasellus hendrerit arcu sem, ut pulvinar magna sollicitudin vitae. Integer tellus magna, efficitur sed fermentum eu, accumsan ut nibh. Aenean quis condimentum orci, quis tristique odio. Maecenas in dignissim mauris. Pellentesque dapibus laoreet sollicitudin. Etiam molestie accumsan molestie. Nunc ut lorem at nisl suscipit lacinia. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; ")
      ).sortBy(_.category)


      var categories = Set[String]()


  /*implicit val productReads:Reads[Product] = (
    (JsPath \ "id").read[Int] and
      (JsPath \ "name").read[String] and
      (JsPath \ "price").read[Int] and
      (JsPath \ "stack").read[Int] and
      (JsPath \ "pictureURL").read[String] and
      (JsPath \ "category").read[String] and
      (JsPath \ "ean").read[Long] and
      (JsPath \ "description").read[String]
    ) (Product.apply _)

  implicit val productWrites:Writes[Product] = (
    (JsPath \ "id").write[Int] and
      (JsPath \ "name").write[String] and
      (JsPath \ "price").write[Int] and
      (JsPath \ "stack").write[Int] and
      (JsPath \ "pictureURL").write[String] and
      (JsPath \ "category").write[String] and
      (JsPath \ "ean").write[Long] and
      (JsPath \ "description").write[String]
    ) (unlift(Product.unapply))
    implicit val productFormat = Format(productReads, productWrites)
    same as */

  /*implicit val productFormat: Format[Product] = (
      (JsPath \ "id").format[Int] and
      (JsPath \ "name").format[String] and
      (JsPath \ "price").format[Int] and
      (JsPath \ "stack").format[Int] and
      (JsPath \ "pictureURL").format[String] and
      (JsPath \ "category").format[String] and
      (JsPath \ "ean").format[Long] and
      (JsPath \ "description").format[String]
    )(Product.apply , unlift(Product.unapply))*/

  //or all in one line
  implicit val prodFormat = Json.format[Product]
}
object ProductForm {

  case class ProdData(name:String, price:Int, stack:Int, pictureURL:String, category:String, ean:Long, description:String)

  val prodForm = Form(
    mapping(
      "name"        -> nonEmptyText,
      "price"       -> number,
      "stack"       -> number,
      "pictureURL"  -> nonEmptyText,
      "category"    -> nonEmptyText,
      "ean"         -> longNumber,
      "description" -> nonEmptyText
    )(ProdData.apply)(ProdData.unapply)
  )


}