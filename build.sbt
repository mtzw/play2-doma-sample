name := "play2-doma-sample"

version := "1.0-SNAPSHOT"

resolvers += "Local Maven Repository" at "file:///d:/m2repo"

libraryDependencies ++= Seq(
  "play2-doma" % "play2-doma" % "1.0",
  "com.h2database" % "h2" % "1.3.175",
  "org.seasar.doma" % "doma" % "1.35.0",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
