ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.2.0"

mainClass := Some("kafkaProducer")

mainClass := Some("kafkaConsumer")

lazy val root = (project in file("."))
  .settings(
    name := "untitled"
  )

