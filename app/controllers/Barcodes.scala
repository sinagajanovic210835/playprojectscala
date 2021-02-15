package controllers

import org.krysalis.barcode4j.impl.upcean.EAN13Bean
import org.krysalis.barcode4j.output.bitmap.BitmapCanvasProvider
import play.api.mvc.{BaseController, ControllerComponents}

import java.io.ByteArrayOutputStream
import java.awt.image.BufferedImage
import javax.inject.{Inject, Singleton}

@Singleton
class Barcodes @Inject()(val controllerComponents: ControllerComponents)
  extends BaseController{


  def barcode(ean: Long, ImageResolution:Int) = Action {
    val mimeType = "image/png"
    try {
      val imageData = ean13BarCode(ean, mimeType, ImageResolution)
      Ok(imageData).as(mimeType)
    }
    catch {
      case e: java.lang.IllegalArgumentException =>
        BadRequest("Couldn’t generate bar code. Error: " + e.getMessage)
    }
  }

  def ean13BarCode(ean: Long, mimeType: String, ImageResolution:Int): Array[Byte] = {
    val output: ByteArrayOutputStream = new ByteArrayOutputStream
    val canvas: BitmapCanvasProvider =
      new BitmapCanvasProvider(output, mimeType, ImageResolution,
        BufferedImage.TYPE_BYTE_BINARY, false, 0)
    val barcode = new EAN13Bean()
    barcode.generateBarcode(canvas, String valueOf ean)
    canvas.finish
    output.toByteArray
  }
}



