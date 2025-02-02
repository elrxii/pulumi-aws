// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pipes.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs Empty = new PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs();

    /**
     * The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default value of 0 is used. Maximum value of 100,000.
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    /**
     * @return The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default value of 0 is used. Maximum value of 100,000.
     * 
     */
    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * The short name of the capacity provider. Maximum value of 255.
     * 
     */
    @Import(name="capacityProvider", required=true)
    private Output<String> capacityProvider;

    /**
     * @return The short name of the capacity provider. Maximum value of 255.
     * 
     */
    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. The weight value is taken into consideration after the base value, if defined, is satisfied. Maximum value of 1,000.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. The weight value is taken into consideration after the base value, if defined, is satisfied. Maximum value of 1,000.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs() {}

    private PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs(PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs $;

        public Builder() {
            $ = new PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs();
        }

        public Builder(PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs defaults) {
            $ = new PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default value of 0 is used. Maximum value of 100,000.
         * 
         * @return builder
         * 
         */
        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        /**
         * @param base The base value designates how many tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined. If no value is specified, the default value of 0 is used. Maximum value of 100,000.
         * 
         * @return builder
         * 
         */
        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        /**
         * @param capacityProvider The short name of the capacity provider. Maximum value of 255.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(Output<String> capacityProvider) {
            $.capacityProvider = capacityProvider;
            return this;
        }

        /**
         * @param capacityProvider The short name of the capacity provider. Maximum value of 255.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(String capacityProvider) {
            return capacityProvider(Output.of(capacityProvider));
        }

        /**
         * @param weight The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. The weight value is taken into consideration after the base value, if defined, is satisfied. Maximum value of 1,000.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight The weight value designates the relative percentage of the total number of tasks launched that should use the specified capacity provider. The weight value is taken into consideration after the base value, if defined, is satisfied. Maximum value of 1,000.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public PipeTargetParametersEcsTaskParametersCapacityProviderStrategyArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            return $;
        }
    }

}
