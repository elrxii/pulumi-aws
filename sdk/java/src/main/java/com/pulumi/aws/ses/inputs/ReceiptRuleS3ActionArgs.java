// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptRuleS3ActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleS3ActionArgs Empty = new ReceiptRuleS3ActionArgs();

    /**
     * The name of the S3 bucket
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    /**
     * @return The name of the S3 bucket
     * 
     */
    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * The ARN of the KMS key
     * 
     */
    @Import(name="kmsKeyArn")
    private @Nullable Output<String> kmsKeyArn;

    /**
     * @return The ARN of the KMS key
     * 
     */
    public Optional<Output<String>> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }

    /**
     * The key prefix of the S3 bucket
     * 
     */
    @Import(name="objectKeyPrefix")
    private @Nullable Output<String> objectKeyPrefix;

    /**
     * @return The key prefix of the S3 bucket
     * 
     */
    public Optional<Output<String>> objectKeyPrefix() {
        return Optional.ofNullable(this.objectKeyPrefix);
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
    private Output<Integer> position;

    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
    private @Nullable Output<String> topicArn;

    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Optional<Output<String>> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    private ReceiptRuleS3ActionArgs() {}

    private ReceiptRuleS3ActionArgs(ReceiptRuleS3ActionArgs $) {
        this.bucketName = $.bucketName;
        this.kmsKeyArn = $.kmsKeyArn;
        this.objectKeyPrefix = $.objectKeyPrefix;
        this.position = $.position;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleS3ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleS3ActionArgs $;

        public Builder() {
            $ = new ReceiptRuleS3ActionArgs();
        }

        public Builder(ReceiptRuleS3ActionArgs defaults) {
            $ = new ReceiptRuleS3ActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        /**
         * @param kmsKeyArn The ARN of the KMS key
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            $.kmsKeyArn = kmsKeyArn;
            return this;
        }

        /**
         * @param kmsKeyArn The ARN of the KMS key
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyArn(String kmsKeyArn) {
            return kmsKeyArn(Output.of(kmsKeyArn));
        }

        /**
         * @param objectKeyPrefix The key prefix of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder objectKeyPrefix(@Nullable Output<String> objectKeyPrefix) {
            $.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        /**
         * @param objectKeyPrefix The key prefix of the S3 bucket
         * 
         * @return builder
         * 
         */
        public Builder objectKeyPrefix(String objectKeyPrefix) {
            return objectKeyPrefix(Output.of(objectKeyPrefix));
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(@Nullable Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public ReceiptRuleS3ActionArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            return $;
        }
    }

}
