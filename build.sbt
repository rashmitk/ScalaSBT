enablePlugins(GatlingPlugin)

lazy val commonSettings = Seq(
  organization := "com.cybage.scala.sbt",
  version := "0.1.0",
  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "ScalaSBT",
    sbtPlugin := true,
    jacoco.settings,
	seq(sonar.settings :_*),
    libraryDependencies += "junit" % "junit" % "4.10",
	libraryDependencies += "org.codehaus.sonar.runner" % "sonar-runner-dist" % "2.3",
    libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.6" % "test",
	libraryDependencies += "io.gatling"            % "gatling-test-framework"    % "2.1.6" % "test",
    
	publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
  )