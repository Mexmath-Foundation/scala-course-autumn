val scala3Version = "3.5.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-course-autumn",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.18.1" % Test,

    testFrameworks += new TestFramework("org.scalacheck.ScalaCheckFramework")
  )
