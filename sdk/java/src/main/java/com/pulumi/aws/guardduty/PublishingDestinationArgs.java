// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PublishingDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PublishingDestinationArgs Empty = new PublishingDestinationArgs();

    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @Import(name="destinationArn", required=true)
    private Output<String> destinationArn;

    /**
     * @return The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    public Output<String> destinationArn() {
        return this.destinationArn;
    }

    /**
     * Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
     * 
     */
    @Import(name="destinationType")
    private @Nullable Output<String> destinationType;

    /**
     * @return Currently there is only &#34;S3&#34; available as destination type which is also the default value
     * 
     * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
     * 
     */
    public Optional<Output<String>> destinationType() {
        return Optional.ofNullable(this.destinationType);
    }

    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Import(name="detectorId", required=true)
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }

    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @Import(name="kmsKeyArn", required=true)
    private Output<String> kmsKeyArn;

    /**
     * @return The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    public Output<String> kmsKeyArn() {
        return this.kmsKeyArn;
    }

    private PublishingDestinationArgs() {}

    private PublishingDestinationArgs(PublishingDestinationArgs $) {
        this.destinationArn = $.destinationArn;
        this.destinationType = $.destinationType;
        this.detectorId = $.detectorId;
        this.kmsKeyArn = $.kmsKeyArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PublishingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PublishingDestinationArgs $;

        public Builder() {
            $ = new PublishingDestinationArgs();
        }

        public Builder(PublishingDestinationArgs defaults) {
            $ = new PublishingDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param destinationArn The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(Output<String> destinationArn) {
            $.destinationArn = destinationArn;
            return this;
        }

        /**
         * @param destinationArn The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
         * 
         * @return builder
         * 
         */
        public Builder destinationArn(String destinationArn) {
            return destinationArn(Output.of(destinationArn));
        }

        /**
         * @param destinationType Currently there is only &#34;S3&#34; available as destination type which is also the default value
         * 
         * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationType(@Nullable Output<String> destinationType) {
            $.destinationType = destinationType;
            return this;
        }

        /**
         * @param destinationType Currently there is only &#34;S3&#34; available as destination type which is also the default value
         * 
         * &gt; **Note:** In case of missing permissions (S3 Bucket Policy _or_ KMS Key permissions) the resource will fail to create. If the permissions are changed after resource creation, this can be asked from the AWS API via the &#34;DescribePublishingDestination&#34; call (https://docs.aws.amazon.com/cli/latest/reference/guardduty/describe-publishing-destination.html).
         * 
         * @return builder
         * 
         */
        public Builder destinationType(String destinationType) {
            return destinationType(Output.of(destinationType));
        }

        /**
         * @param detectorId The detector ID of the GuardDuty.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(Output<String> detectorId) {
            $.detectorId = detectorId;
            return this;
        }

        /**
         * @param detectorId The detector ID of the GuardDuty.
         * 
         * @return builder
         * 
         */
        public Builder detectorId(String detectorId) {
            return detectorId(Output.of(detectorId));
        }

        /**
         * @param kmsKeyArn The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        public PublishingDestinationArgs build() {
            $.destinationArn = Objects.requireNonNull($.destinationArn, "expected parameter 'destinationArn' to be non-null");
            $.detectorId = Objects.requireNonNull($.detectorId, "expected parameter 'detectorId' to be non-null");
            $.kmsKeyArn = Objects.requireNonNull($.kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
            return $;
        }
    }

}
