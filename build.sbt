//List of plugins integrated
//IDE Plugin : subeclipse
//Test Dependency : Scalatest for Scala, JUnit for Java 
//Static Code Analysis Plugin : ScalaStyle, Scapegoat
//Code Coverage Plugin : Jacoco, SCoverage
//Automation Test Plugin : Gatling
//DB Migration Plugin : Flyway


//Integration not supported in Jenkins due to plug-in non-availability
//Scapegoat
//ScalaStyle


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
			"mysql" % "mysql-connector-java" % "5.1.22"
			)

flywayUrl := "jdbc:mysql://localhost:3306/myflyway"

flywayUser := "root" 
flywayPassword := "admin"
                     
publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
