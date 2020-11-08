package ood.patterndesign;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MeterSimulator {
    private String path;
    private String featureService;
    private String description;
    private String manufacture;
    private String model;
    private String lifecycleRecruited;
    private String lifecycleDecommissioned;
    private int totalRecruited;
    private int totalDecommissioned;
    
    public static class Builder {
        // Required
        private String path;
        
        // Optional
        private String featureService = "https://example.com/arcgis/rest/services/MeterMiles/FeatureServer/1";
        private String description = "abcdefghijklmnopqrstuvwxyz";
        private String manufacture = "ACME";
        private String model = "Integration";
        private String lifecycleRecruited = "New";
        private String lifecycleDecommissioned = "Decom";
        private int totalRecruited = 0;
        private int totalDecommissioned = 0;

        /**
         * constructor
         * @param path path to the meter-simulate.jar
         */
        public Builder(String path) {
            this.path = path;
        }

        public Builder withFeatureService(String featureService) {
            this.featureService = featureService;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withManufacture(String manufacture) {
            this.manufacture = manufacture;
            return this;
        }

        public Builder withModel(String model) {
            this.model = model;
            return this;
        }

        public Builder withLifecycleRecruited(String lifecycleRecruited) {
            this.lifecycleRecruited = lifecycleRecruited;
            return this;
        }

        public Builder withLifecycleDecommissioned(String lifecycleDecommissioned) {
            this.lifecycleDecommissioned = lifecycleDecommissioned;
            return this;
        }

        public Builder withTotalRecruited(int totalRecruited) {
            this.totalRecruited = totalRecruited;
            return this;
        }

        public Builder withTotalDecommissioned(int totalDecommissioned) {
            this.totalDecommissioned = totalDecommissioned;
            return this;
        }

        public MeterSimulator build() {
            return new MeterSimulator(this);
        }
    }

    public void call() throws Exception {
        String cmd = String.format("java -jar \"%s\"" +
                        " --meter.feature-service=\"%s\"" +
                        " --meter.description=\"%s\"" +
                        " --meter.manufacture=\"%s\"" +
                        " --meter.model-number=\"%s\"" +
                        " --meter.lifecycle-status.recruited=\"%s\"" +
                        " --meter.lifecycle-status.decommissioned=\"%s\"" +
                        " --meter.total.recruited=%d" +
                        " --meter.total.decommissioned=%d",
                path,
                featureService,
                description,
                manufacture,
                model,
                lifecycleRecruited,
                lifecycleDecommissioned,
                totalRecruited,
                totalDecommissioned);

        Process process = Runtime.getRuntime().exec(cmd);

        // Redirect output stream of the command to the input stream of current program
        try(BufferedReader stdIn = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdErr = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            
            String s;
            
            while((s = stdIn.readLine()) != null) {
                System.out.println(s);
            }

            while ((s = stdErr.readLine()) != null) {
                System.err.println(s);
            }
        }
    }

    private MeterSimulator(Builder builder) {
        this.path = builder.path;
        this.featureService = builder.featureService;
        this.description = builder.description;
        this.manufacture = builder.manufacture;
        this.model = builder.model;
        this.lifecycleRecruited = builder.lifecycleRecruited;
        this.lifecycleDecommissioned = builder.lifecycleDecommissioned;
        this.totalRecruited = builder.totalRecruited;
        this.totalDecommissioned = builder.totalDecommissioned;
    }
}