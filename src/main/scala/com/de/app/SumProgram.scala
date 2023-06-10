package com.de.app
import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkConf

object SumProgram {
    def main(args: Array[String]): Unit = {
        // Create a Spark configuration
        val conf = new SparkConf()
          .setAppName("SumProgram")
          .setMaster("local[*]") // Run Spark locally with all available cores
          .set("spark.ui.enabled", "false") // Disable Spark UI for simplicity

        // Create a Spark context
        // val sc = new SparkContext(conf)
      val spark = SparkSession.builder().appName("SumProgram").master("local[*]").getOrCreate()
      import spark.implicits._

        try {
            // Input data
             val data1 = List(4, 7, 9)
             val dataSeq = Seq(("Java", 20000), ("Python", 100000), ("Scala", 3000))

            // Parallelize the data into an RDD
             val rdd = spark.sparkContext.parallelize(dataSeq)
             val rdd1 = spark.sparkContext.parallelize(data1)
            val df_dataSeq = rdd.toDF()
            df_dataSeq.show()
            val data = Seq(("James"," ","Smith","1991-04-01","M",3000),
                           ("Michael","Rose"," ","2000-05-19","M",4000),
                           ("Robert"," ","Williams","1978-09-05","M",4000),
                           ("Maria","Anne","Jones","1967-12-01","F",4000),
                           ("Jen","Mary","Brown","1980-02-17","F",-1)
)
          val columns = Seq("firstname", "middlename", "lastname", "dob", "gender", "salary")
          val df = spark.createDataFrame(data).toDF(columns: _*)
          df.show()

            // Calculate the sum using the reduce operation
            val sum = rdd1.reduce((x,y)=>x+y)

            // Print the sum
             println("Sum: " + sum)
        } finally {
            // Stop the Spark context
            spark.stop()
        }
    }
}
