package ood.patterndesign;

public class App {
    /*
    --class org.apache.spark.examples.SparkPi --master yarn
    --deploy-mode client --driver-memory 4g --num-executors 2
    --executor-memory 2g --executor-cores 2
    /opt/apps/spark-1.6.0-bin-hadoop2.6/lib/spark-examples*.jar 10
    */
    public static void main(String[] args) throws Exception {
        SparkSubmitSimulator sparkSimulator = new SparkSubmitSimulator.Builder("org.apache.spark.examples.SparkPi")
                .withMaster("yarn").withDeployMode("client").withDriverMemory("4g")
                .withNumExecutors(2).withExecutorMemory("2g").withExecutorCores(2)
                .withJars("/opt/apps/spark-1.6.0-bin-hadoop2.6/lib/spark-examples*.jar")
                .withArguments("10").build();

        sparkSimulator.call();
    }
}
