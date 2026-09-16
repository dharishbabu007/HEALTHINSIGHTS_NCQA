
name := "NcqaHedisGICTempLoad"

version := "0.2"

scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.5.1" exclude("commons-codec" , "commons-codec"),
  "org.apache.spark" %% "spark-sql" % "3.5.1" exclude("commons-codec" , "commons-codec")
)
