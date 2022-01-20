name := """Electronify"""
organization := "com.electronics"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies += jdbc
libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "42.1.1",
  "com.typesafe.play" %% "play-slick" % "5.0.0"
)
libraryDependencies += ws
libraryDependencies ++= Seq(
  "org.playframework.anorm" %% "anorm-postgres" % "2.6.10"
)
libraryDependencies += ehcache