ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.2.0"


lazy val root = (project in file("."))
  .settings(
    name := "untitled"
  )

