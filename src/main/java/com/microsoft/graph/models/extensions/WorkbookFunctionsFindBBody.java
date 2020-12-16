// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
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
 * The class for the Workbook Functions Find BBody.
 */
public class WorkbookFunctionsFindBBody {
    /**
     * The find Text.
     * 
     */
    @SerializedName(value = "findText", alternate = {"FindText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement findText;

    /**
     * The within Text.
     * 
     */
    @SerializedName(value = "withinText", alternate = {"WithinText"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement withinText;

    /**
     * The start Num.
     * 
     */
    @SerializedName(value = "startNum", alternate = {"StartNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement startNum;


    /**
     * Instiaciates a new WorkbookFunctionsFindBBody
     */
    public WorkbookFunctionsFindBBody() {}
    private WorkbookFunctionsFindBBody(@Nonnull final WorkbookFunctionsFindBBodyBuilder builder) {
        this.findText = builder.findText;
        this.withinText = builder.withinText;
        this.startNum = builder.startNum;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFindBBodyBuilder newBuilder() {
        return new WorkbookFunctionsFindBBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFindBBody
     */
    public static final class WorkbookFunctionsFindBBodyBuilder {
        private com.google.gson.JsonElement findText;
        /**
         * Sets the name FindText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFindBBodyBuilder withFindText(@Nullable final com.google.gson.JsonElement val) {
            this.findText = val;
            return this;
        }
        private com.google.gson.JsonElement withinText;
        /**
         * Sets the name WithinText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFindBBodyBuilder withWithinText(@Nullable final com.google.gson.JsonElement val) {
            this.withinText = val;
            return this;
        }
        private com.google.gson.JsonElement startNum;
        /**
         * Sets the name StartNum
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFindBBodyBuilder withStartNum(@Nullable final com.google.gson.JsonElement val) {
            this.startNum = val;
            return this;
        }
        private WorkbookFunctionsFindBBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFindBBody build() {
            return new WorkbookFunctionsFindBBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.findText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("findText", findText));
        }
        if(this.withinText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("withinText", withinText));
        }
        if(this.startNum != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("startNum", startNum));
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
