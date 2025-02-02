// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SdkvoiceSipMediaApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SdkvoiceSipMediaApplicationArgs Empty = new SdkvoiceSipMediaApplicationArgs();

    /**
     * The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     * 
     */
    @Import(name="awsRegion", required=true)
    private Output<String> awsRegion;

    /**
     * @return The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     * 
     */
    public Output<String> awsRegion() {
        return this.awsRegion;
    }

    /**
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * 
     */
    @Import(name="endpoints", required=true)
    private Output<SdkvoiceSipMediaApplicationEndpointsArgs> endpoints;

    /**
     * @return List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * 
     */
    public Output<SdkvoiceSipMediaApplicationEndpointsArgs> endpoints() {
        return this.endpoints;
    }

    /**
     * The name of the AWS Chime SDK Voice Sip Media Application.
     * 
     * The following arguments are optional:
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the AWS Chime SDK Voice Sip Media Application.
     * 
     * The following arguments are optional:
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private SdkvoiceSipMediaApplicationArgs() {}

    private SdkvoiceSipMediaApplicationArgs(SdkvoiceSipMediaApplicationArgs $) {
        this.awsRegion = $.awsRegion;
        this.endpoints = $.endpoints;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SdkvoiceSipMediaApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SdkvoiceSipMediaApplicationArgs $;

        public Builder() {
            $ = new SdkvoiceSipMediaApplicationArgs();
        }

        public Builder(SdkvoiceSipMediaApplicationArgs defaults) {
            $ = new SdkvoiceSipMediaApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsRegion The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(Output<String> awsRegion) {
            $.awsRegion = awsRegion;
            return this;
        }

        /**
         * @param awsRegion The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
         * 
         * @return builder
         * 
         */
        public Builder awsRegion(String awsRegion) {
            return awsRegion(Output.of(awsRegion));
        }

        /**
         * @param endpoints List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(Output<SdkvoiceSipMediaApplicationEndpointsArgs> endpoints) {
            $.endpoints = endpoints;
            return this;
        }

        /**
         * @param endpoints List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
         * 
         * @return builder
         * 
         */
        public Builder endpoints(SdkvoiceSipMediaApplicationEndpointsArgs endpoints) {
            return endpoints(Output.of(endpoints));
        }

        /**
         * @param name The name of the AWS Chime SDK Voice Sip Media Application.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the AWS Chime SDK Voice Sip Media Application.
         * 
         * The following arguments are optional:
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public SdkvoiceSipMediaApplicationArgs build() {
            $.awsRegion = Objects.requireNonNull($.awsRegion, "expected parameter 'awsRegion' to be non-null");
            $.endpoints = Objects.requireNonNull($.endpoints, "expected parameter 'endpoints' to be non-null");
            return $;
        }
    }

}
