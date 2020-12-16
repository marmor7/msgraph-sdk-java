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
 * The class for the Workbook Functions Fixed Body.
 */
public class WorkbookFunctionsFixedBody {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The decimals.
     * 
     */
    @SerializedName(value = "decimals", alternate = {"Decimals"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement decimals;

    /**
     * The no Commas.
     * 
     */
    @SerializedName(value = "noCommas", alternate = {"NoCommas"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement noCommas;


    /**
     * Instiaciates a new WorkbookFunctionsFixedBody
     */
    public WorkbookFunctionsFixedBody() {}
    private WorkbookFunctionsFixedBody(@Nonnull final WorkbookFunctionsFixedBodyBuilder builder) {
        this.number = builder.number;
        this.decimals = builder.decimals;
        this.noCommas = builder.noCommas;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFixedBodyBuilder newBuilder() {
        return new WorkbookFunctionsFixedBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFixedBody
     */
    public static final class WorkbookFunctionsFixedBodyBuilder {
        private com.google.gson.JsonElement number;
        /**
         * Sets the name Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedBodyBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        private com.google.gson.JsonElement decimals;
        /**
         * Sets the name Decimals
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedBodyBuilder withDecimals(@Nullable final com.google.gson.JsonElement val) {
            this.decimals = val;
            return this;
        }
        private com.google.gson.JsonElement noCommas;
        /**
         * Sets the name NoCommas
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFixedBodyBuilder withNoCommas(@Nullable final com.google.gson.JsonElement val) {
            this.noCommas = val;
            return this;
        }
        private WorkbookFunctionsFixedBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFixedBody build() {
            return new WorkbookFunctionsFixedBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.decimals != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("decimals", decimals));
        }
        if(this.noCommas != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("noCommas", noCommas));
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
