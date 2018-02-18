package com.heik.spark

object Main extends App with SparkSessionWrapper {

  val fileName = args(0)

  val csv = spark
    .read
    .format("com.databricks.spark.csv")
    .option("header", "true") // Use first line of all files as header
    .option("inferSchema", "true") // Automatically infer data types
    .load(fileName)

  csv.show(10)
}
