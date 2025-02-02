// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.msk.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetConfigurationResult {
    /**
     * @return ARN of the configuration.
     * 
     */
    private String arn;
    /**
     * @return Description of the configuration.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return List of Apache Kafka versions which can use this configuration.
     * 
     */
    private List<String> kafkaVersions;
    /**
     * @return Latest revision of the configuration.
     * 
     */
    private Integer latestRevision;
    private String name;
    /**
     * @return Contents of the server.properties file.
     * 
     */
    private String serverProperties;

    private GetConfigurationResult() {}
    /**
     * @return ARN of the configuration.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Description of the configuration.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return List of Apache Kafka versions which can use this configuration.
     * 
     */
    public List<String> kafkaVersions() {
        return this.kafkaVersions;
    }
    /**
     * @return Latest revision of the configuration.
     * 
     */
    public Integer latestRevision() {
        return this.latestRevision;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Contents of the server.properties file.
     * 
     */
    public String serverProperties() {
        return this.serverProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private String id;
        private List<String> kafkaVersions;
        private Integer latestRevision;
        private String name;
        private String serverProperties;
        public Builder() {}
        public Builder(GetConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.kafkaVersions = defaults.kafkaVersions;
    	      this.latestRevision = defaults.latestRevision;
    	      this.name = defaults.name;
    	      this.serverProperties = defaults.serverProperties;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kafkaVersions(List<String> kafkaVersions) {
            this.kafkaVersions = Objects.requireNonNull(kafkaVersions);
            return this;
        }
        public Builder kafkaVersions(String... kafkaVersions) {
            return kafkaVersions(List.of(kafkaVersions));
        }
        @CustomType.Setter
        public Builder latestRevision(Integer latestRevision) {
            this.latestRevision = Objects.requireNonNull(latestRevision);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serverProperties(String serverProperties) {
            this.serverProperties = Objects.requireNonNull(serverProperties);
            return this;
        }
        public GetConfigurationResult build() {
            final var o = new GetConfigurationResult();
            o.arn = arn;
            o.description = description;
            o.id = id;
            o.kafkaVersions = kafkaVersions;
            o.latestRevision = latestRevision;
            o.name = name;
            o.serverProperties = serverProperties;
            return o;
        }
    }
}
