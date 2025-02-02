// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLambdaFunctionAssociationResult {
    private String functionArn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String instanceId;

    private GetLambdaFunctionAssociationResult() {}
    public String functionArn() {
        return this.functionArn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String instanceId() {
        return this.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLambdaFunctionAssociationResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionArn;
        private String id;
        private String instanceId;
        public Builder() {}
        public Builder(GetLambdaFunctionAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
        }

        @CustomType.Setter
        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public GetLambdaFunctionAssociationResult build() {
            final var o = new GetLambdaFunctionAssociationResult();
            o.functionArn = functionArn;
            o.id = id;
            o.instanceId = instanceId;
            return o;
        }
    }
}
