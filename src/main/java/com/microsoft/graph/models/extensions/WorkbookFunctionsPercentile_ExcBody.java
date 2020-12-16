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
 * The class for the Workbook Functions Percentile_Exc Body.
 */
public class WorkbookFunctionsPercentile_ExcBody {
    /**
     * The array.
     * 
     */
    @SerializedName(value = "array", alternate = {"Array"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement array;

    /**
     * The k.
     * 
     */
    @SerializedName(value = "k", alternate = {"K"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement k;


    /**
     * Instiaciates a new WorkbookFunctionsPercentile_ExcBody
     */
    public WorkbookFunctionsPercentile_ExcBody() {}
    private WorkbookFunctionsPercentile_ExcBody(@Nonnull final WorkbookFunctionsPercentile_ExcBodyBuilder builder) {
        this.array = builder.array;
        this.k = builder.k;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPercentile_ExcBodyBuilder newBuilder() {
        return new WorkbookFunctionsPercentile_ExcBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPercentile_ExcBody
     */
    public static final class WorkbookFunctionsPercentile_ExcBodyBuilder {
        private com.google.gson.JsonElement array;
        /**
         * Sets the name Array
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcBodyBuilder withArray(@Nullable final com.google.gson.JsonElement val) {
            this.array = val;
            return this;
        }
        private com.google.gson.JsonElement k;
        /**
         * Sets the name K
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcBodyBuilder withK(@Nullable final com.google.gson.JsonElement val) {
            this.k = val;
            return this;
        }
        private WorkbookFunctionsPercentile_ExcBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPercentile_ExcBody build() {
            return new WorkbookFunctionsPercentile_ExcBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.array != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("array", array));
        }
        if(this.k != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("k", k));
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
