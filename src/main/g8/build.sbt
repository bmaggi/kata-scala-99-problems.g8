// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.bmaggi",
      scalaVersion := "2.12.7"
    )),
    name := "kata-scala-99-problems"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"