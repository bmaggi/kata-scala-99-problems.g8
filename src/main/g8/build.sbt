// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.12"
    )),
    name := "kata-scala-99-problems"
  )
libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.5" % "test"