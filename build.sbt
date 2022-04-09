name := """Electronify"""
organization := "com.electronics"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += jdbc
libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "42.3.3",
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.5.0"
)
libraryDependencies += ws
libraryDependencies ++= Seq(
  "org.playframework.anorm" %% "anorm-postgres" % "2.6.10"
)
libraryDependencies += ehcache
//libraryDependencies += filters