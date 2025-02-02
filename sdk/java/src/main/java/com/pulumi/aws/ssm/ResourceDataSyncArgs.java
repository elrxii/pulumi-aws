// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm;

import com.pulumi.aws.ssm.inputs.ResourceDataSyncS3DestinationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceDataSyncArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceDataSyncArgs Empty = new ResourceDataSyncArgs();

    /**
     * Name for the configuration.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name for the configuration.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Amazon S3 configuration details for the sync.
     * 
     */
    @Import(name="s3Destination", required=true)
    private Output<ResourceDataSyncS3DestinationArgs> s3Destination;

    /**
     * @return Amazon S3 configuration details for the sync.
     * 
     */
    public Output<ResourceDataSyncS3DestinationArgs> s3Destination() {
        return this.s3Destination;
    }

    private ResourceDataSyncArgs() {}

    private ResourceDataSyncArgs(ResourceDataSyncArgs $) {
        this.name = $.name;
        this.s3Destination = $.s3Destination;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceDataSyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceDataSyncArgs $;

        public Builder() {
            $ = new ResourceDataSyncArgs();
        }

        public Builder(ResourceDataSyncArgs defaults) {
            $ = new ResourceDataSyncArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name for the configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name for the configuration.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param s3Destination Amazon S3 configuration details for the sync.
         * 
         * @return builder
         * 
         */
        public Builder s3Destination(Output<ResourceDataSyncS3DestinationArgs> s3Destination) {
            $.s3Destination = s3Destination;
            return this;
        }

        /**
         * @param s3Destination Amazon S3 configuration details for the sync.
         * 
         * @return builder
         * 
         */
        public Builder s3Destination(ResourceDataSyncS3DestinationArgs s3Destination) {
            return s3Destination(Output.of(s3Destination));
        }

        public ResourceDataSyncArgs build() {
            $.s3Destination = Objects.requireNonNull($.s3Destination, "expected parameter 's3Destination' to be non-null");
            return $;
        }
    }

}
