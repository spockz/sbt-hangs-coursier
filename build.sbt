val commonSettings =
    Seq(
        scalaVersion := "2.11.11",
        javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
        autoScalaLibrary := true,
        updateOptions := updateOptions.value.withCachedResolution(true)
    )

name := "hang-test"


updateOptions := updateOptions.value.withCachedResolution(true)


val docs = (project in file("docs"))
  .settings(commonSettings)
  .settings(libraryDependencies ++= Dependencies.docs)

val root = (project in file("."))
  .settings(commonSettings)
  .aggregate(
    docs)
