// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Share Body.
 */
public class ScheduleShareBody {
    /**
     * The notify Team.
     * 
     */
    @SerializedName(value = "notifyTeam", alternate = {"NotifyTeam"})
    @Expose
	@Nullable
    public Boolean notifyTeam;

    /**
     * The start Date Time.
     * 
     */
    @SerializedName(value = "startDateTime", alternate = {"StartDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar startDateTime;

    /**
     * The end Date Time.
     * 
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.util.Calendar endDateTime;


    /**
     * Instiaciates a new ScheduleShareBody
     */
    public ScheduleShareBody() {}
    private ScheduleShareBody(@Nonnull final ScheduleShareBodyBuilder builder) {
        this.notifyTeam = builder.notifyTeam;
        this.startDateTime = builder.startDateTime;
        this.endDateTime = builder.endDateTime;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ScheduleShareBodyBuilder newBuilder() {
        return new ScheduleShareBodyBuilder();
    }
    /**
     * Fluent builder for the ScheduleShareBody
     */
    public static final class ScheduleShareBodyBuilder {
        private Boolean notifyTeam;
        /**
         * Sets the name NotifyTeam
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ScheduleShareBodyBuilder withNotifyTeam(@Nullable final Boolean val) {
            this.notifyTeam = val;
            return this;
        }
        private java.util.Calendar startDateTime;
        /**
         * Sets the name StartDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ScheduleShareBodyBuilder withStartDateTime(@Nullable final java.util.Calendar val) {
            this.startDateTime = val;
            return this;
        }
        private java.util.Calendar endDateTime;
        /**
         * Sets the name EndDateTime
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ScheduleShareBodyBuilder withEndDateTime(@Nullable final java.util.Calendar val) {
            this.endDateTime = val;
            return this;
        }
        private ScheduleShareBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ScheduleShareBody build() {
            return new ScheduleShareBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.notifyTeam != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("notifyTeam", notifyTeam));
        }
        if(this.startDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startDateTime", startDateTime));
        }
        if(this.endDateTime != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endDateTime", endDateTime));
        }
        return result;
    }
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
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
