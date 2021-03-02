val scala3Version = "3.0.0-RC1"
val scala2Version = "2.13.5"

lazy val `macro-lib` = project
  .in(file("macro-lib"))
  .settings(
    scalaVersion := scala3Version,
    libraryDependencies += "org.scala-lang" % "scala-reflect" % scala2Version
  )

lazy val app = project
 .in(file("app"))
 .settings(
   scalaVersion := scala2Version,
   scalacOptions += "-Ytasty-reader"
 )
 .dependsOn(`macro-lib`)