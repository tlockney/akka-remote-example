name := "remoting-worker"

organization := "net.lockney"

version := "1.0"

libraryDependencies ++= Seq("com.typesafe.akka" % "akka-actor" % "2.0.2", "com.typesafe.akka" % "akka-remote" % "2.0.2")

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
