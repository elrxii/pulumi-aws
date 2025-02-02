// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterOutpostConfigControlPlanePlacement {
    /**
     * @return The name of the placement group for the Kubernetes control plane instances.
     * 
     */
    private String groupName;

    private GetClusterOutpostConfigControlPlanePlacement() {}
    /**
     * @return The name of the placement group for the Kubernetes control plane instances.
     * 
     */
    public String groupName() {
        return this.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterOutpostConfigControlPlanePlacement defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String groupName;
        public Builder() {}
        public Builder(GetClusterOutpostConfigControlPlanePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupName = defaults.groupName;
        }

        @CustomType.Setter
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public GetClusterOutpostConfigControlPlanePlacement build() {
            final var o = new GetClusterOutpostConfigControlPlanePlacement();
            o.groupName = groupName;
            return o;
        }
    }
}
