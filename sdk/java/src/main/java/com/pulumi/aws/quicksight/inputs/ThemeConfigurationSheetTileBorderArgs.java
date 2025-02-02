// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ThemeConfigurationSheetTileBorderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ThemeConfigurationSheetTileBorderArgs Empty = new ThemeConfigurationSheetTileBorderArgs();

    /**
     * The option to enable display of borders for visuals.
     * 
     */
    @Import(name="show")
    private @Nullable Output<Boolean> show;

    /**
     * @return The option to enable display of borders for visuals.
     * 
     */
    public Optional<Output<Boolean>> show() {
        return Optional.ofNullable(this.show);
    }

    private ThemeConfigurationSheetTileBorderArgs() {}

    private ThemeConfigurationSheetTileBorderArgs(ThemeConfigurationSheetTileBorderArgs $) {
        this.show = $.show;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeConfigurationSheetTileBorderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeConfigurationSheetTileBorderArgs $;

        public Builder() {
            $ = new ThemeConfigurationSheetTileBorderArgs();
        }

        public Builder(ThemeConfigurationSheetTileBorderArgs defaults) {
            $ = new ThemeConfigurationSheetTileBorderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param show The option to enable display of borders for visuals.
         * 
         * @return builder
         * 
         */
        public Builder show(@Nullable Output<Boolean> show) {
            $.show = show;
            return this;
        }

        /**
         * @param show The option to enable display of borders for visuals.
         * 
         * @return builder
         * 
         */
        public Builder show(Boolean show) {
            return show(Output.of(show));
        }

        public ThemeConfigurationSheetTileBorderArgs build() {
            return $;
        }
    }

}
