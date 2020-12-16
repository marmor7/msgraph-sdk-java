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
 * The class for the Workbook Functions Lookup Body.
 */
public class WorkbookFunctionsLookupBody {
    /**
     * The lookup Value.
     * 
     */
    @SerializedName(value = "lookupValue", alternate = {"LookupValue"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement lookupValue;

    /**
     * The lookup Vector.
     * 
     */
    @SerializedName(value = "lookupVector", alternate = {"LookupVector"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement lookupVector;

    /**
     * The result Vector.
     * 
     */
    @SerializedName(value = "resultVector", alternate = {"ResultVector"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement resultVector;


    /**
     * Instiaciates a new WorkbookFunctionsLookupBody
     */
    public WorkbookFunctionsLookupBody() {}
    private WorkbookFunctionsLookupBody(@Nonnull final WorkbookFunctionsLookupBodyBuilder builder) {
        this.lookupValue = builder.lookupValue;
        this.lookupVector = builder.lookupVector;
        this.resultVector = builder.resultVector;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsLookupBodyBuilder newBuilder() {
        return new WorkbookFunctionsLookupBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsLookupBody
     */
    public static final class WorkbookFunctionsLookupBodyBuilder {
        private com.google.gson.JsonElement lookupValue;
        /**
         * Sets the name LookupValue
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLookupBodyBuilder withLookupValue(@Nullable final com.google.gson.JsonElement val) {
            this.lookupValue = val;
            return this;
        }
        private com.google.gson.JsonElement lookupVector;
        /**
         * Sets the name LookupVector
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLookupBodyBuilder withLookupVector(@Nullable final com.google.gson.JsonElement val) {
            this.lookupVector = val;
            return this;
        }
        private com.google.gson.JsonElement resultVector;
        /**
         * Sets the name ResultVector
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLookupBodyBuilder withResultVector(@Nullable final com.google.gson.JsonElement val) {
            this.resultVector = val;
            return this;
        }
        private WorkbookFunctionsLookupBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsLookupBody build() {
            return new WorkbookFunctionsLookupBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.lookupValue != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("lookupValue", lookupValue));
        }
        if(this.lookupVector != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("lookupVector", lookupVector));
        }
        if(this.resultVector != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("resultVector", resultVector));
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
