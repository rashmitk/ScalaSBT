organization := "com.cybage.scala.sbt"
version := "0.1.0"
scalaVersion := "2.11.6"

//Name of Project
name := "ScalaSBT"
sbtPlugin := true
jacoco.settings
seq(sonar.settings :_*)
seq(flywaySettings:_*)

enablePlugins(GatlingPlugin)

libraryDependencies ++= 
		Seq("junit" % "junit" % "4.10",
			"org.codehaus.sonar.runner" % "sonar-runner-dist" % "2.3",
			"io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.6" % "test",
			"io.gatling"            % "gatling-test-framework"    % "2.1.6" % "test",
			"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
			"mysql" % "mysql-connector-java" % "5.1.22" % "flyway"
			)
    
flywayOptions := Map("driver" -> "com.mysql.jdbc.Driver",
                     "url" -> "jdbc:mysql://localhost:3306/test",
                     "user" -> "root", 
                     "password" -> "admin") 
                     
publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
