// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGatewayRouteSpecHttp2RouteActionRewriteHostname {
    private String defaultTargetHostname;

    private GetGatewayRouteSpecHttp2RouteActionRewriteHostname() {}
    public String defaultTargetHostname() {
        return this.defaultTargetHostname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGatewayRouteSpecHttp2RouteActionRewriteHostname defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String defaultTargetHostname;
        public Builder() {}
        public Builder(GetGatewayRouteSpecHttp2RouteActionRewriteHostname defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultTargetHostname = defaults.defaultTargetHostname;
        }

        @CustomType.Setter
        public Builder defaultTargetHostname(String defaultTargetHostname) {
            this.defaultTargetHostname = Objects.requireNonNull(defaultTargetHostname);
            return this;
        }
        public GetGatewayRouteSpecHttp2RouteActionRewriteHostname build() {
            final var o = new GetGatewayRouteSpecHttp2RouteActionRewriteHostname();
            o.defaultTargetHostname = defaultTargetHostname;
            return o;
        }
    }
}
