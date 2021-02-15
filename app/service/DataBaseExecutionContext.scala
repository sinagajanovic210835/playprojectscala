
package service


import akka.actor.ActorSystem
import play.api.libs.concurrent.CustomExecutionContext

import javax.inject._

class DatabaseExecutionContext @Inject()(system: ActorSystem) extends CustomExecutionContext(system, "database.dispatcher")

