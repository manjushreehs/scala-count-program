# SCALA TEST EXAMPLE

The code contains two object scala files with two different functions. The idea of this sample scala project is to make you aware of how to write test in scalatest and run them

## Instructions:

- Run command sbt test from the root of the project
- It should pass 1 test case
- One of the test is ignored , follow the instructions over that function test case to enable it
- Now run the test cases again using sbt clean test
- This time there should be two test passing successfully

# Spark-Submit
- Download and extract Spark 2.4.0 (https://dlcdn.apache.org/spark/spark-3.2.1/spark-3.2.1-bin-hadoop3.2.tgz)
- set SPARK_HOME to the extracted folder
- Add SPARK_HOME/bin to PATH variable to make spark-submit available to be run from anywhere 

- Build the project jar 
- sbt clean package
- Run spark-submit command to check code is running
- spark-submit --class com.de.app.Sum --master local target/scala-2.12/in-de-codepair-template-scala_2.12-0.1.0-SNAPSHOT.jar
- Check sum=21 in the output

## Summary
Expect similar test cases in the actual coding round
You should be able to run these steps on your machine and Inform the Hiring team once you are able to run these steps successfully
