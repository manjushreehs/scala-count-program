scalaVersion := "2.12.4"

val sparkVersion = "2.4.0"


lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4"
    )),
    name := "in-de-codepair-template-scala",
    libraryDependencies ++=  Seq(
	"org.apache.spark" %% "spark-core" % sparkVersion,
        "org.apache.spark" %% "spark-sql" % sparkVersion,
        "org.apache.spark" %% "spark-streaming" % sparkVersion,
      "org.scalatest" %% "scalatest" % "3.0.5" % "test")
  )



			
