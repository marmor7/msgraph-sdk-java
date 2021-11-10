// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.EventMessageDetail;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel Deleted Event Message Detail.
 */
public class ChannelDeletedEventMessageDetail extends EventMessageDetail implements IJsonBackedObject {


    /**
     * The Channel Display Name.
     * Display name of the channel.
     */
    @SerializedName(value = "channelDisplayName", alternate = {"ChannelDisplayName"})
    @Expose
	@Nullable
    public String channelDisplayName;

    /**
     * The Channel Id.
     * Unique identifier of the channel.
     */
    @SerializedName(value = "channelId", alternate = {"ChannelId"})
    @Expose
	@Nullable
    public String channelId;

    /**
     * The Initiator.
     * Initiator of the event.
     */
    @SerializedName(value = "initiator", alternate = {"Initiator"})
    @Expose
	@Nullable
    public IdentitySet initiator;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
