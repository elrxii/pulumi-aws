// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs Empty = new InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="bucketPrefix")
    private @Nullable Output<String> bucketPrefix;

    public Optional<Output<String>> bucketPrefix() {
        return Optional.ofNullable(this.bucketPrefix);
    }

    @Import(name="logDeliveryStatus")
    private @Nullable Output<String> logDeliveryStatus;

    public Optional<Output<String>> logDeliveryStatus() {
        return Optional.ofNullable(this.logDeliveryStatus);
    }

    private InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs() {}

    private InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs(InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs $) {
        this.bucketName = $.bucketName;
        this.bucketPrefix = $.bucketPrefix;
        this.logDeliveryStatus = $.logDeliveryStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs $;

        public Builder() {
            $ = new InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs();
        }

        public Builder(InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs defaults) {
            $ = new InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder bucketPrefix(@Nullable Output<String> bucketPrefix) {
            $.bucketPrefix = bucketPrefix;
            return this;
        }

        public Builder bucketPrefix(String bucketPrefix) {
            return bucketPrefix(Output.of(bucketPrefix));
        }

        public Builder logDeliveryStatus(@Nullable Output<String> logDeliveryStatus) {
            $.logDeliveryStatus = logDeliveryStatus;
            return this;
        }

        public Builder logDeliveryStatus(String logDeliveryStatus) {
            return logDeliveryStatus(Output.of(logDeliveryStatus));
        }

        public InternetMonitorInternetMeasurementsLogDeliveryS3ConfigArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
