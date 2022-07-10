
import java.util.Properties
import org.apache.kafka.common.serialization.StringSerializer
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig}

object Producer extends App{

  var props:Properties = new Properties()
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")

  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])

  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, classOf[StringSerializer])

  val producer : KafkaProducer[String, String] = new KafkaProducer[String, String](props)



  print("coucou")
}
