

object main extends App {
  println("test")

  case class Message(sender: String, recipient: String, body: String)
  val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

  println("message1.sender " + message1.sender)
  println("message1.recipient " + message1.recipient)
  println("message1.body " + message1.body)


}
