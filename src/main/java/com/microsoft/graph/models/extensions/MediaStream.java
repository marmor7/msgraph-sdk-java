// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.generated.MediaDirection;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Stream.
 */
public class MediaStream implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Media Type.
     * The media type. The possible value are unknown, audio, video, videoBasedScreenSharing, data.
     */
    @SerializedName("mediaType")
    @Expose
    public Modality mediaType;

    /**
     * The Label.
     * The media stream label.
     */
    @SerializedName("label")
    @Expose
    public String label;

    /**
     * The Source Id.
     * The source ID.
     */
    @SerializedName("sourceId")
    @Expose
    public String sourceId;

    /**
     * The Direction.
     * The direction. The possible values are inactive, sendOnly, receiveOnly, sendReceive.
     */
    @SerializedName("direction")
    @Expose
    public MediaDirection direction;

    /**
     * The Server Muted.
     * If the media is muted by the server.
     */
    @SerializedName("serverMuted")
    @Expose
    public Boolean serverMuted;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
