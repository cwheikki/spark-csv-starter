# spark-csv-starter
Starter template for spark csv processing


To run:

```
sbt package
spark-submit --master "local[*]" --class com.heik.spark.Main target/scala-2.11/heik-spark_2.11-0.1.jar <SomeFile.csv>
```
