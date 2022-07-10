
import java.util.Properties
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}

object Producer extends App{

  var props:Properties = new Properties()
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, classOf[StringSerializer])

  val producer : KafkaProducer[String, String] = new KafkaProducer[String, String](props)
  val topic:String = "drone info"

  def sendInfo(kafkaproducer : KafkaProducer[String, String]): Unit = {
    val drone = droneRapport.createDrone()
    val droneString = droneRapport.droneToJson(drone)
    val record = new ProducerRecord[String, String](topic, drone.id, droneString)
    producer.send(record)
    sendInfo(kafkaproducer)
  }

}
