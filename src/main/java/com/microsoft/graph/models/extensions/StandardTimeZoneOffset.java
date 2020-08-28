// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.DayOfWeek;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Standard Time Zone Offset.
 */
public class StandardTimeZoneOffset implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Time.
     * Represents the time of day when the transition from daylight saving time to standard time occurs.
     */
    @SerializedName("time")
    @Expose
    public com.microsoft.graph.models.extensions.TimeOfDay time;

    /**
     * The Day Occurrence.
     * Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
     */
    @SerializedName("dayOccurrence")
    @Expose
    public Integer dayOccurrence;

    /**
     * The Day Of Week.
     * Represents the day of the week when the transition from daylight saving time to standard time.
     */
    @SerializedName("dayOfWeek")
    @Expose
    public DayOfWeek dayOfWeek;

    /**
     * The Month.
     * Represents the month of the year when the transition from daylight saving time to standard time occurs.
     */
    @SerializedName("month")
    @Expose
    public Integer month;

    /**
     * The Year.
     * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example, a value of 0 means every year.
     */
    @SerializedName("year")
    @Expose
    public Integer year;


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
