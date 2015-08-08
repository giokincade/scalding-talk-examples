lazy val root = (project in file(".")).
    settings(
        name := "hello",
        version := "1.0",
        scalaVersion := "2.10.4",
        resolvers += "conjars.org" at "http://conjars.org/repo",
        libraryDependencies += "com.twitter" % "scalding-core_2.10" % "0.12.0",
        libraryDependencies += "com.twitter" % "scalding-commons_2.10" % "0.12.0",
        libraryDependencies += "com.twitter" % "scalding-args_2.10" % "0.12.0",
        libraryDependencies += "com.twitter" % "scalding-date_2.10" % "0.12.0"
    )
