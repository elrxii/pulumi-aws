// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lightsail.DomainEntryArgs;
import com.pulumi.aws.lightsail.inputs.DomainEntryState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a domain entry resource
 * 
 * &gt; **NOTE on `id`:** In an effort to simplify imports, this resource `id` field has been updated to the standard resource id separator, a comma (`,`). For backward compatibility, the previous separator (underscore `_`) can still be used to read and import existing resources. When state is refreshed, the `id` will be updated to use the new standard separator. The previous separator will be deprecated in a future major release.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lightsail.Domain;
 * import com.pulumi.aws.lightsail.DomainArgs;
 * import com.pulumi.aws.lightsail.DomainEntry;
 * import com.pulumi.aws.lightsail.DomainEntryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var testDomain = new Domain(&#34;testDomain&#34;, DomainArgs.builder()        
 *             .domainName(&#34;mydomain.com&#34;)
 *             .build());
 * 
 *         var testDomainEntry = new DomainEntry(&#34;testDomainEntry&#34;, DomainEntryArgs.builder()        
 *             .domainName(aws_lightsail_domain.domain_test().domain_name())
 *             .type(&#34;A&#34;)
 *             .target(&#34;127.0.0.1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * terraform import {
 * 
 *  to = aws_lightsail_domain_entry.example
 * 
 *  id = &#34;www,mydomain.com,A,127.0.0.1&#34; } Using `pulumi import`, import `aws_lightsail_domain_entry` using the id attribute. For exampleconsole % pulumi import aws_lightsail_domain_entry.example www,mydomain.com,A,127.0.0.1
 * 
 */
@ResourceType(type="aws:lightsail/domainEntry:DomainEntry")
public class DomainEntry extends com.pulumi.resources.CustomResource {
    /**
     * The name of the Lightsail domain in which to create the entry
     * 
     */
    @Export(name="domainName", refs={String.class}, tree="[0]")
    private Output<String> domainName;

    /**
     * @return The name of the Lightsail domain in which to create the entry
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * If the entry should be an alias Defaults to `false`
     * 
     */
    @Export(name="isAlias", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isAlias;

    /**
     * @return If the entry should be an alias Defaults to `false`
     * 
     */
    public Output<Optional<Boolean>> isAlias() {
        return Codegen.optional(this.isAlias);
    }
    /**
     * Name of the entry record
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the entry record
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Target of the domain entry
     * 
     */
    @Export(name="target", refs={String.class}, tree="[0]")
    private Output<String> target;

    /**
     * @return Target of the domain entry
     * 
     */
    public Output<String> target() {
        return this.target;
    }
    /**
     * Type of record
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Type of record
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainEntry(String name) {
        this(name, DomainEntryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainEntry(String name, DomainEntryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainEntry(String name, DomainEntryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/domainEntry:DomainEntry", name, args == null ? DomainEntryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainEntry(String name, Output<String> id, @Nullable DomainEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lightsail/domainEntry:DomainEntry", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DomainEntry get(String name, Output<String> id, @Nullable DomainEntryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainEntry(name, id, state, options);
    }
}
