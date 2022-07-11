package Main1

import org.apache.kafka.clients.producer.{KafkaProducer, ProducerConfig, ProducerRecord}
import org.apache.kafka.common.serialization.StringSerializer

import java.util.Properties

object Producer extends App {

  var props: Properties = new Properties()
  props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092,88.163.185.58:9092")
  props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])
  props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, classOf[StringSerializer])

  val producer: KafkaProducer[String, String] = new KafkaProducer[String, String](props)
  val topic: String = "droneInfo"

  sendInfo(producer)

  def sendInfo(kafkaproducer: KafkaProducer[String, String]): Unit = {
    val drone = DroneRapport.createDrone()
    val droneString = DroneRapport.droneToJson(drone)
    println("drone.id : " + drone.id + "droneString : " + droneString)
    val record = new ProducerRecord[String, String](topic, drone.id, droneString)
    val data_envoyees = producer.send(record)
    printf(s"sent record(key=%s value=%s) " +
      "meta(partition=%d, offset=%d)\n",
      record.key(), record.value(),
      data_envoyees.get().partition(),
      data_envoyees.get().offset())

  }
  producer.close()
}
