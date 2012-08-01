import akka.actor._    

object RequestorApp extends App {
      val system = ActorSystem("RequestorSystem")
      val worker = system.actorOf(Props[Worker], "worker")
      worker ! DoWork()
    }
