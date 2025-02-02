// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2clientvpn;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class NetworkAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkAssociationArgs Empty = new NetworkAssociationArgs();

    /**
     * The ID of the Client VPN endpoint.
     * 
     */
    @Import(name="clientVpnEndpointId", required=true)
    private Output<String> clientVpnEndpointId;

    /**
     * @return The ID of the Client VPN endpoint.
     * 
     */
    public Output<String> clientVpnEndpointId() {
        return this.clientVpnEndpointId;
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    @Import(name="subnetId", required=true)
    private Output<String> subnetId;

    /**
     * @return The ID of the subnet to associate with the Client VPN endpoint.
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }

    private NetworkAssociationArgs() {}

    private NetworkAssociationArgs(NetworkAssociationArgs $) {
        this.clientVpnEndpointId = $.clientVpnEndpointId;
        this.subnetId = $.subnetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkAssociationArgs $;

        public Builder() {
            $ = new NetworkAssociationArgs();
        }

        public Builder(NetworkAssociationArgs defaults) {
            $ = new NetworkAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(Output<String> clientVpnEndpointId) {
            $.clientVpnEndpointId = clientVpnEndpointId;
            return this;
        }

        /**
         * @param clientVpnEndpointId The ID of the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientVpnEndpointId(String clientVpnEndpointId) {
            return clientVpnEndpointId(Output.of(clientVpnEndpointId));
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        public NetworkAssociationArgs build() {
            $.clientVpnEndpointId = Objects.requireNonNull($.clientVpnEndpointId, "expected parameter 'clientVpnEndpointId' to be non-null");
            $.subnetId = Objects.requireNonNull($.subnetId, "expected parameter 'subnetId' to be non-null");
            return $;
        }
    }

}
