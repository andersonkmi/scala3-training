val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-training",
    version := "0.0.1",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq (
      "org.scalameta" %% "munit" % "0.7.29" % Test,
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )

