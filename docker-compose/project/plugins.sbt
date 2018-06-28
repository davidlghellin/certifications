resolvers += Resolver.url("artifactory",url("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")



addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("se.marcuslonnberg" % "sbt-docker" % "1.5.0")

addSbtPlugin("com.tapad" % "sbt-docker-compose" % "1.0.34")
