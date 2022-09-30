val scala3Version = "3.1.2"
val scalaTestVersion = "3.2.10"

lazy val excludes = jacocoExcludes in Test :=Seq(
  "src/main/scala/Main*",
  "src.main.scala.Main*",
  "src/main/scala/Main.scala"
)

lazy val jacoco = jacocoReportSettings in Test :=JacocoReportSettings(
  "Jacoco Coverage Report",
  None,
  JacocoThresholds(),
  Seq(JacocoReportFormats.ScalaHTML, JacocoReportFormats.XML),
  "utf-8"
)

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala_playground",
    
    version := "0.1.0-SNAPSHOT",
    
    scalaVersion := scala3Version,
    
    libraryDependencies ++= { 
      Seq(
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.scalactic" %% "scalactic" % scalaTestVersion,
      "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
      )
    },
    
    jacoco, excludes
      
   )
  .enablePlugins(JacocoCoverallsPlugin)
  
  