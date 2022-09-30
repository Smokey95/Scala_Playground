val scala3Version = "3.1.2"
val scalaTestVersion = "3.2.10"

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
    
    jacocoExcludes in Test := Seq(
      "Main*",
      "Utility*",
      "tictactoe.*"
    )
      
   )
  .enablePlugins(JacocoCoverallsPlugin)
  
  