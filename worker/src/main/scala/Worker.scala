import akka.actor._

// define the messages
case class Start()
case class DoWork()

class Worker extends Actor {
  def receive = {
    case DoWork() => {
      println("I've been working in a coalmine...")
    }
  }
}
