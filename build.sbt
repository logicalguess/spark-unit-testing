name := "SparkUnitTesting"

version := "1.0"

scalaVersion := "2.10.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.4.0"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.4.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.4.0"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.4.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"

libraryDependencies += "com.holdenkarau" %% "spark-testing-base" % "1.4.0_0.2.1"
    