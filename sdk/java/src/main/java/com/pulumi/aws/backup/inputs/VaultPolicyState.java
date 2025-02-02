// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VaultPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final VaultPolicyState Empty = new VaultPolicyState();

    /**
     * The ARN of the vault.
     * 
     */
    @Import(name="backupVaultArn")
    private @Nullable Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Optional<Output<String>> backupVaultArn() {
        return Optional.ofNullable(this.backupVaultArn);
    }

    /**
     * Name of the backup vault to add policy for.
     * 
     */
    @Import(name="backupVaultName")
    private @Nullable Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add policy for.
     * 
     */
    public Optional<Output<String>> backupVaultName() {
        return Optional.ofNullable(this.backupVaultName);
    }

    /**
     * The backup vault access policy document in JSON format.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return The backup vault access policy document in JSON format.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private VaultPolicyState() {}

    private VaultPolicyState(VaultPolicyState $) {
        this.backupVaultArn = $.backupVaultArn;
        this.backupVaultName = $.backupVaultName;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VaultPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VaultPolicyState $;

        public Builder() {
            $ = new VaultPolicyState();
        }

        public Builder(VaultPolicyState defaults) {
            $ = new VaultPolicyState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(@Nullable Output<String> backupVaultArn) {
            $.backupVaultArn = backupVaultArn;
            return this;
        }

        /**
         * @param backupVaultArn The ARN of the vault.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultArn(String backupVaultArn) {
            return backupVaultArn(Output.of(backupVaultArn));
        }

        /**
         * @param backupVaultName Name of the backup vault to add policy for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(@Nullable Output<String> backupVaultName) {
            $.backupVaultName = backupVaultName;
            return this;
        }

        /**
         * @param backupVaultName Name of the backup vault to add policy for.
         * 
         * @return builder
         * 
         */
        public Builder backupVaultName(String backupVaultName) {
            return backupVaultName(Output.of(backupVaultName));
        }

        /**
         * @param policy The backup vault access policy document in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy The backup vault access policy document in JSON format.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        public VaultPolicyState build() {
            return $;
        }
    }

}
