package controllers

import play.api.mvc._

import javax.inject._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val messagesControllerComponents: MessagesControllerComponents) extends MessagesAbstractController(messagesControllerComponents) {

  def index()= Action{ implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.start())
  }

}
