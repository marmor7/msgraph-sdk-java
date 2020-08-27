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
import com.microsoft.graph.models.extensions.ScheduleItem;
import com.microsoft.graph.models.extensions.FreeBusyError;
import com.microsoft.graph.models.extensions.WorkingHours;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Information.
 */
public class ScheduleInformation implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Schedule Id.
     * An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
     */
    @SerializedName("scheduleId")
    @Expose
    public String scheduleId;

    /**
     * The Schedule Items.
     * Contains the items that describe the availability of the user or resource.
     */
    @SerializedName("scheduleItems")
    @Expose
    public java.util.List<ScheduleItem> scheduleItems;

    /**
     * The Availability View.
     * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots. Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working elsewhere.
     */
    @SerializedName("availabilityView")
    @Expose
    public String availabilityView;

    /**
     * The Error.
     * Error information from attempting to get the availability of the user, distribution list, or resource.
     */
    @SerializedName("error")
    @Expose
    public FreeBusyError error;

    /**
     * The Working Hours.
     * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's mailboxSettings.
     */
    @SerializedName("workingHours")
    @Expose
    public WorkingHours workingHours;


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
