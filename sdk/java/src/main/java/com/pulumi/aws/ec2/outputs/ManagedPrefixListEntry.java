// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedPrefixListEntry {
    /**
     * @return CIDR block of this entry.
     * 
     */
    private String cidr;
    /**
     * @return Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
     * 
     */
    private @Nullable String description;

    private ManagedPrefixListEntry() {}
    /**
     * @return CIDR block of this entry.
     * 
     */
    public String cidr() {
        return this.cidr;
    }
    /**
     * @return Description of this entry. Due to API limitations, updating only the description of an existing entry requires temporarily removing and re-adding the entry.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedPrefixListEntry defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cidr;
        private @Nullable String description;
        public Builder() {}
        public Builder(ManagedPrefixListEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidr = defaults.cidr;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder cidr(String cidr) {
            this.cidr = Objects.requireNonNull(cidr);
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public ManagedPrefixListEntry build() {
            final var o = new ManagedPrefixListEntry();
            o.cidr = cidr;
            o.description = description;
            return o;
        }
    }
}
