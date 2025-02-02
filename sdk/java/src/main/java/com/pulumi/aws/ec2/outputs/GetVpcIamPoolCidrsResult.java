// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetVpcIamPoolCidrsFilter;
import com.pulumi.aws.ec2.outputs.GetVpcIamPoolCidrsIpamPoolCidr;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcIamPoolCidrsResult {
    private @Nullable List<GetVpcIamPoolCidrsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The CIDRs provisioned into the IPAM pool, described below.
     * 
     */
    private List<GetVpcIamPoolCidrsIpamPoolCidr> ipamPoolCidrs;
    private String ipamPoolId;

    private GetVpcIamPoolCidrsResult() {}
    public List<GetVpcIamPoolCidrsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The CIDRs provisioned into the IPAM pool, described below.
     * 
     */
    public List<GetVpcIamPoolCidrsIpamPoolCidr> ipamPoolCidrs() {
        return this.ipamPoolCidrs;
    }
    public String ipamPoolId() {
        return this.ipamPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcIamPoolCidrsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetVpcIamPoolCidrsFilter> filters;
        private String id;
        private List<GetVpcIamPoolCidrsIpamPoolCidr> ipamPoolCidrs;
        private String ipamPoolId;
        public Builder() {}
        public Builder(GetVpcIamPoolCidrsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipamPoolCidrs = defaults.ipamPoolCidrs;
    	      this.ipamPoolId = defaults.ipamPoolId;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<GetVpcIamPoolCidrsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcIamPoolCidrsFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipamPoolCidrs(List<GetVpcIamPoolCidrsIpamPoolCidr> ipamPoolCidrs) {
            this.ipamPoolCidrs = Objects.requireNonNull(ipamPoolCidrs);
            return this;
        }
        public Builder ipamPoolCidrs(GetVpcIamPoolCidrsIpamPoolCidr... ipamPoolCidrs) {
            return ipamPoolCidrs(List.of(ipamPoolCidrs));
        }
        @CustomType.Setter
        public Builder ipamPoolId(String ipamPoolId) {
            this.ipamPoolId = Objects.requireNonNull(ipamPoolId);
            return this;
        }
        public GetVpcIamPoolCidrsResult build() {
            final var o = new GetVpcIamPoolCidrsResult();
            o.filters = filters;
            o.id = id;
            o.ipamPoolCidrs = ipamPoolCidrs;
            o.ipamPoolId = ipamPoolId;
            return o;
        }
    }
}
