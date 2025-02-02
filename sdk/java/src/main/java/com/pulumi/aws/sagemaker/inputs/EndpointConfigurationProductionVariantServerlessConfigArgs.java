// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointConfigurationProductionVariantServerlessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointConfigurationProductionVariantServerlessConfigArgs Empty = new EndpointConfigurationProductionVariantServerlessConfigArgs();

    /**
     * The maximum number of concurrent invocations your serverless endpoint can process. Valid values are between `1` and `200`.
     * 
     */
    @Import(name="maxConcurrency", required=true)
    private Output<Integer> maxConcurrency;

    /**
     * @return The maximum number of concurrent invocations your serverless endpoint can process. Valid values are between `1` and `200`.
     * 
     */
    public Output<Integer> maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * The memory size of your serverless endpoint. Valid values are in 1 GB increments: `1024` MB, `2048` MB, `3072` MB, `4096` MB, `5120` MB, or `6144` MB.
     * 
     */
    @Import(name="memorySizeInMb", required=true)
    private Output<Integer> memorySizeInMb;

    /**
     * @return The memory size of your serverless endpoint. Valid values are in 1 GB increments: `1024` MB, `2048` MB, `3072` MB, `4096` MB, `5120` MB, or `6144` MB.
     * 
     */
    public Output<Integer> memorySizeInMb() {
        return this.memorySizeInMb;
    }

    /**
     * The amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or equal to `max_concurrency`. Valid values are between `1` and `200`.
     * 
     */
    @Import(name="provisionedConcurrency")
    private @Nullable Output<Integer> provisionedConcurrency;

    /**
     * @return The amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or equal to `max_concurrency`. Valid values are between `1` and `200`.
     * 
     */
    public Optional<Output<Integer>> provisionedConcurrency() {
        return Optional.ofNullable(this.provisionedConcurrency);
    }

    private EndpointConfigurationProductionVariantServerlessConfigArgs() {}

    private EndpointConfigurationProductionVariantServerlessConfigArgs(EndpointConfigurationProductionVariantServerlessConfigArgs $) {
        this.maxConcurrency = $.maxConcurrency;
        this.memorySizeInMb = $.memorySizeInMb;
        this.provisionedConcurrency = $.provisionedConcurrency;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointConfigurationProductionVariantServerlessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointConfigurationProductionVariantServerlessConfigArgs $;

        public Builder() {
            $ = new EndpointConfigurationProductionVariantServerlessConfigArgs();
        }

        public Builder(EndpointConfigurationProductionVariantServerlessConfigArgs defaults) {
            $ = new EndpointConfigurationProductionVariantServerlessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint can process. Valid values are between `1` and `200`.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(Output<Integer> maxConcurrency) {
            $.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * @param maxConcurrency The maximum number of concurrent invocations your serverless endpoint can process. Valid values are between `1` and `200`.
         * 
         * @return builder
         * 
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            return maxConcurrency(Output.of(maxConcurrency));
        }

        /**
         * @param memorySizeInMb The memory size of your serverless endpoint. Valid values are in 1 GB increments: `1024` MB, `2048` MB, `3072` MB, `4096` MB, `5120` MB, or `6144` MB.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeInMb(Output<Integer> memorySizeInMb) {
            $.memorySizeInMb = memorySizeInMb;
            return this;
        }

        /**
         * @param memorySizeInMb The memory size of your serverless endpoint. Valid values are in 1 GB increments: `1024` MB, `2048` MB, `3072` MB, `4096` MB, `5120` MB, or `6144` MB.
         * 
         * @return builder
         * 
         */
        public Builder memorySizeInMb(Integer memorySizeInMb) {
            return memorySizeInMb(Output.of(memorySizeInMb));
        }

        /**
         * @param provisionedConcurrency The amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or equal to `max_concurrency`. Valid values are between `1` and `200`.
         * 
         * @return builder
         * 
         */
        public Builder provisionedConcurrency(@Nullable Output<Integer> provisionedConcurrency) {
            $.provisionedConcurrency = provisionedConcurrency;
            return this;
        }

        /**
         * @param provisionedConcurrency The amount of provisioned concurrency to allocate for the serverless endpoint. Should be less than or equal to `max_concurrency`. Valid values are between `1` and `200`.
         * 
         * @return builder
         * 
         */
        public Builder provisionedConcurrency(Integer provisionedConcurrency) {
            return provisionedConcurrency(Output.of(provisionedConcurrency));
        }

        public EndpointConfigurationProductionVariantServerlessConfigArgs build() {
            $.maxConcurrency = Objects.requireNonNull($.maxConcurrency, "expected parameter 'maxConcurrency' to be non-null");
            $.memorySizeInMb = Objects.requireNonNull($.memorySizeInMb, "expected parameter 'memorySizeInMb' to be non-null");
            return $;
        }
    }

}
