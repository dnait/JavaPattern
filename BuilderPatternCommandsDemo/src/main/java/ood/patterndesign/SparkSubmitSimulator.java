package ood.patterndesign;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
   --class org.apache.spark.examples.SparkPi --master yarn --deploy-mode client --driver-memory 4g --num-executors 2 --executor-memory 2g --executor-cores 2 /opt/apps/spark-1.6.0-bin-hadoop2.6/lib/spark-examples*.jar 10
 */
public class SparkSubmitSimulator {
    private String className;
    private String master;
    private String deployMode;
    private String driverMemory;
    private int numExecutors;
    private String executorMemory;
    private int executorCores;
    private String jars;
    private String arguments;

    public SparkSubmitSimulator(Builder builder) {
        this.className = builder.className;
        this.master = builder.master;
        this.deployMode = builder.deployMode;
        this.driverMemory = builder.driverMemory;
        this.numExecutors = builder.numExecutors;
        this.executorMemory = builder.executorMemory;
        this.executorCores = builder.executorCores;
        this.jars = builder.jars;
        this.arguments = builder.arguments;
    }

    public static class Builder {
        //Required
        private String className;

        //optional
        private String master = "yarn";
        private String deployMode = "client";
        private String driverMemory = "4g";
        private int numExecutors = 2;
        private String executorMemory = "2g";
        private int executorCores = 2;
        private String jars;
        private String arguments;

        //constructor
        public Builder(String className) {
            this.className = className;
        }

        public Builder withMaster(String master) {
            this.master = master;
            return this;
        }

        public Builder withDeployMode(String deployMode) {
            this.deployMode = deployMode;
            return this;
        }

        public Builder withDriverMemory(String driverMemory) {
            this.driverMemory = driverMemory;
            return this;
        }

        public Builder withNumExecutors(int numExecutors) {
            this.numExecutors = numExecutors;
            return this;
        }

        public Builder withExecutorMemory(String executorMemory) {
            this.executorMemory = executorMemory;
            return this;
        }

        public Builder withExecutorCores(int executorCores) {
            this.executorCores = executorCores;
            return this;
        }

        public Builder withJars(String jars) {
            this.jars = jars;
            return this;
        }

        public Builder withArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }

        public SparkSubmitSimulator build() {
            return new SparkSubmitSimulator(this);
        }
    }

    /*
   --class org.apache.spark.examples.SparkPi --master yarn
   --deploy-mode client --driver-memory 4g --num-executors 2
   --executor-memory 2g --executor-cores 2
   /opt/apps/spark-1.6.0-bin-hadoop2.6/lib/spark-examples*.jar 10
    */
    public void call() throws Exception {
        String cmd = String.format("spark2-submit --class \"%s\"" +
                "--master \"%s\"" +
                "--deploy-mode \"%s\"" +
                "--driver-memory \"%s\"" +
                "--num-executors \"%s\"" +
                "--executor-memory \"%s\"" +
                "--executor-cores \"%s\"" +
                " \"%s\" " + "\"%s\""
        );
        Process process = Runtime.getRuntime().exec(cmd);
        // Redirect output stream of the command to the input stream of current program
        try (BufferedReader stdIn = new BufferedReader(new InputStreamReader(process.getInputStream()));
             BufferedReader stdErr = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {

            String s;
            while ((s = stdIn.readLine()) != null) {
                System.out.println(s);
            }
            while ((s = stdErr.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
    public String getClassName() {
        return className;
    }


}

