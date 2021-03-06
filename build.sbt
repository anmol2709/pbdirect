name := "pbdirect"

version := "0.0.5"

scalaVersion := "2.12.2"

crossScalaVersions := Seq("2.11.11", "2.12.2")

libraryDependencies ++= Seq(
  "com.chuusai"         %% "shapeless"     % "2.3.2",
  "org.typelevel"       %% "cats-core"     % "1.0.0-MF",
  "com.google.protobuf" %  "protobuf-java" % "3.2.0",
  "org.scalatest"       %% "scalatest"     % "3.0.1" % Test
)

organization := "beyondthelines"

licenses := ("MIT", url("http://opensource.org/licenses/MIT")) :: Nil

bintrayOrganization := Some("beyondthelines")

bintrayPackageLabels := Seq("scala", "protobuf")

