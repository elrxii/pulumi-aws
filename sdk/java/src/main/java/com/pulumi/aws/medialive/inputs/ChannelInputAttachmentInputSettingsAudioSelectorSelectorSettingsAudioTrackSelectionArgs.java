// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs Empty = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs();

    @Import(name="tracks", required=true)
    private Output<List<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs>> tracks;

    public Output<List<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs>> tracks() {
        return this.tracks;
    }

    private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs() {}

    private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs $) {
        this.tracks = $.tracks;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs(Objects.requireNonNull(defaults));
        }

        public Builder tracks(Output<List<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs>> tracks) {
            $.tracks = tracks;
            return this;
        }

        public Builder tracks(List<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs> tracks) {
            return tracks(Output.of(tracks));
        }

        public Builder tracks(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionTrackArgs... tracks) {
            return tracks(List.of(tracks));
        }

        public ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelectionArgs build() {
            $.tracks = Objects.requireNonNull($.tracks, "expected parameter 'tracks' to be non-null");
            return $;
        }
    }

}
