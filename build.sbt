ThisBuild / version := "0.1.0-SNAPSHOT"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.3.0"
ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "myApp",
  )
