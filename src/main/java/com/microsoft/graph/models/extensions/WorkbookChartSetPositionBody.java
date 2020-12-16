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
 * The class for the Workbook Chart Set Position Body.
 */
public class WorkbookChartSetPositionBody {
    /**
     * The start Cell.
     * 
     */
    @SerializedName(value = "startCell", alternate = {"StartCell"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startCell;

    /**
     * The end Cell.
     * 
     */
    @SerializedName(value = "endCell", alternate = {"EndCell"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement endCell;


    /**
     * Instiaciates a new WorkbookChartSetPositionBody
     */
    public WorkbookChartSetPositionBody() {}
    private WorkbookChartSetPositionBody(@Nonnull final WorkbookChartSetPositionBodyBuilder builder) {
        this.startCell = builder.startCell;
        this.endCell = builder.endCell;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookChartSetPositionBodyBuilder newBuilder() {
        return new WorkbookChartSetPositionBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookChartSetPositionBody
     */
    public static final class WorkbookChartSetPositionBodyBuilder {
        private com.google.gson.JsonElement startCell;
        /**
         * Sets the name StartCell
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookChartSetPositionBodyBuilder withStartCell(@Nullable final com.google.gson.JsonElement val) {
            this.startCell = val;
            return this;
        }
        private com.google.gson.JsonElement endCell;
        /**
         * Sets the name EndCell
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookChartSetPositionBodyBuilder withEndCell(@Nullable final com.google.gson.JsonElement val) {
            this.endCell = val;
            return this;
        }
        private WorkbookChartSetPositionBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookChartSetPositionBody build() {
            return new WorkbookChartSetPositionBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.startCell != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startCell", startCell));
        }
        if(this.endCell != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("endCell", endCell));
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
