name := """wstore"""
organization := "com.sina"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"


libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  jdbc,
  guice,
  "org.playframework.anorm" %% "anorm" % "2.6.5",
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "mysql" % "mysql-connector-java" % "5.1.46+",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
  "net.sf.barcode4j" % "barcode4j" % "2.0",

//"ws.securesocial" %% "securesocial" % "2.1.4"

)

