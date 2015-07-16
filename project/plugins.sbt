addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.1.0")
addSbtPlugin("com.sksamuel.scapegoat" %% "sbt-scapegoat" % "1.0.0")
addSbtPlugin("com.ebiznext.sbt.plugins" % "sbt-sonar" % "0.1.1")
addSbtPlugin("io.gatling" % "gatling-sbt" % "2.1.6")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += "Sonatype Repository" at "https://oss.sonatype.org/content/groups/public"