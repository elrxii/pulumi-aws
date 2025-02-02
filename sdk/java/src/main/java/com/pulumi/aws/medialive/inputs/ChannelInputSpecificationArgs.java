// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelInputSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputSpecificationArgs Empty = new ChannelInputSpecificationArgs();

    @Import(name="codec", required=true)
    private Output<String> codec;

    public Output<String> codec() {
        return this.codec;
    }

    @Import(name="inputResolution", required=true)
    private Output<String> inputResolution;

    public Output<String> inputResolution() {
        return this.inputResolution;
    }

    @Import(name="maximumBitrate", required=true)
    private Output<String> maximumBitrate;

    public Output<String> maximumBitrate() {
        return this.maximumBitrate;
    }

    private ChannelInputSpecificationArgs() {}

    private ChannelInputSpecificationArgs(ChannelInputSpecificationArgs $) {
        this.codec = $.codec;
        this.inputResolution = $.inputResolution;
        this.maximumBitrate = $.maximumBitrate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputSpecificationArgs $;

        public Builder() {
            $ = new ChannelInputSpecificationArgs();
        }

        public Builder(ChannelInputSpecificationArgs defaults) {
            $ = new ChannelInputSpecificationArgs(Objects.requireNonNull(defaults));
        }

        public Builder codec(Output<String> codec) {
            $.codec = codec;
            return this;
        }

        public Builder codec(String codec) {
            return codec(Output.of(codec));
        }

        public Builder inputResolution(Output<String> inputResolution) {
            $.inputResolution = inputResolution;
            return this;
        }

        public Builder inputResolution(String inputResolution) {
            return inputResolution(Output.of(inputResolution));
        }

        public Builder maximumBitrate(Output<String> maximumBitrate) {
            $.maximumBitrate = maximumBitrate;
            return this;
        }

        public Builder maximumBitrate(String maximumBitrate) {
            return maximumBitrate(Output.of(maximumBitrate));
        }

        public ChannelInputSpecificationArgs build() {
            $.codec = Objects.requireNonNull($.codec, "expected parameter 'codec' to be non-null");
            $.inputResolution = Objects.requireNonNull($.inputResolution, "expected parameter 'inputResolution' to be non-null");
            $.maximumBitrate = Objects.requireNonNull($.maximumBitrate, "expected parameter 'maximumBitrate' to be non-null");
            return $;
        }
    }

}
