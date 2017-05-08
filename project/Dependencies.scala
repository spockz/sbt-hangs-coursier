import sbt._

object Dependencies {

  // please keep in alphabetical order
  val finagleVersion = "6.43.0"
  val jerseyVersion = "2.25.1"


  //val finagleHttp: ModuleID = "com.twitter" %% "finagle-http" % finagleVersion

  object trap {
    lazy val jersey = Seq("org.glassfish.jersey.containers" % "jersey-container-servlet-core" % jerseyVersion)
  }


  
    val docs = Seq("com.twitter" %% "finagle-http" % finagleVersion,
      "com.twitter" %% "finagle-core" % finagleVersion) ++ trap.jersey


}
