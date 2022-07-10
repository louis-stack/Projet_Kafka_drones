
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig}

import java.util.Properties
import org.apache.kafka.producer.KafkaProducer
import org.apache.kafka.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer


object main extends App {
  /*
  case class Message(sender: String, recipient: String, body: String)
  val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")

  println("message1.sender " + message1.sender)
  println("message1.recipient " + message1.recipient)
  println("message1.body " + message1.body)
  */

  var props:Properties = new Properties()
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, classOf[StringSerializer])

  val producer : KafkaProducer[String, String] = new KafkaProducer[String, String](props)

}
