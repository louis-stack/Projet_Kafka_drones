
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig}

import java.util.Properties
import org.apache.kafka.producer.KafkaProducer
import org.apache.kafka.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer


object main {
  def main(args: Array[String]): Unit = {
    var props:Properties = new Properties()
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092")
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])
    props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, classOf[StringSerializer])

    val producer : KafkaProducer[String, String] = new KafkaProducer[String, String](props)
  }

}
