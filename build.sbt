name := "play2-doma-sample"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.h2database" % "h2" % "1.3.175",
  "org.seasar.doma" % "doma" % "1.35.0",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
