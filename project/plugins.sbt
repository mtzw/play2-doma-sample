// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")

// Your Local-Repository
resolvers += "Local Maven Repository" at "file:///d:/m2repo"

// sbt-doma-plugin
addSbtPlugin("sbt-doma-plugin" % "sbt-doma-plugin" % "1.0")
