// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Summary.
 */
public class ManagedDeviceMobileAppConfigurationUserSummary extends Entity implements IJsonBackedObject {


    /**
     * The Pending Count.
     * Number of pending Users
     */
    @SerializedName("pendingCount")
    @Expose
    public Integer pendingCount;

    /**
     * The Not Applicable Count.
     * Number of not applicable users
     */
    @SerializedName("notApplicableCount")
    @Expose
    public Integer notApplicableCount;

    /**
     * The Success Count.
     * Number of succeeded Users
     */
    @SerializedName("successCount")
    @Expose
    public Integer successCount;

    /**
     * The Error Count.
     * Number of error Users
     */
    @SerializedName("errorCount")
    @Expose
    public Integer errorCount;

    /**
     * The Failed Count.
     * Number of failed Users
     */
    @SerializedName("failedCount")
    @Expose
    public Integer failedCount;

    /**
     * The Last Update Date Time.
     * Last update time
     */
    @SerializedName("lastUpdateDateTime")
    @Expose
    public java.util.Calendar lastUpdateDateTime;

    /**
     * The Configuration Version.
     * Version of the policy for that overview
     */
    @SerializedName("configurationVersion")
    @Expose
    public Integer configurationVersion;


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
