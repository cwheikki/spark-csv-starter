name := "heik-spark"

version := "0.1"

scalaVersion := "2.11.12"

sparkVersion := "2.2.0"
sparkComponents ++= Seq("sql")

libraryDependencies += "com.databricks" % "spark-csv_2.11" % "1.5.0"