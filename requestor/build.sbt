libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.0.2", 
  "com.typesafe.akka" % "akka-remote" % "2.0.2",
  "net.lockney" %% "remoting-worker" % "1.0"
)

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
