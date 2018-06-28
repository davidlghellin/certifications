name := "docker-compose"

version := "0.1"

scalaVersion := "2.11.8"

enablePlugins(DockerPlugin, DockerComposePlugin)

dockerImageCreationTask := docker.value


dockerfile in docker := {

//  val classpath: Classpath = (fullClasspath in Test).value
//  sLog.value.debug(s"Classpath is ${classpath.files.mkString("\n")}\n")

  new Dockerfile {
    val dockerAppPath = "/app/"
    from("mysql")
//    add(classpath.files, dockerAppPath)

//    entryPoint("java", "-cp", s"$dockerAppPath:$dockerAppPath*", "example.CalculatorServer")
  }
}