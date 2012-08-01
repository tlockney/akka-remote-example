import akka.actor._

    object WorkerApp extends App {
      val system = ActorSystem("WorkerSystem")
      system.actorOf(Props[Worker], "worker")
    }
