ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "3.2.0"

libraryDependencies += "org.apache.kafka" % "spark-streams" % "2.1.0"

libraryDependencies += "org.apache.kafka" % "kafka-streams-scala" % "3.2.0"

libraryDependencies += "org.apache.spark" % "spark-streaming" % "3.0.3"

lazy val root = (project in file("."))
  .settings(
    name := "untitled"
  )

