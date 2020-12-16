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
 * The class for the Workbook Functions Left Body.
 */
public class WorkbookFunctionsLeftBody {
    /**
     * The text.
     * 
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement text;

    /**
     * The num Chars.
     * 
     */
    @SerializedName(value = "numChars", alternate = {"NumChars"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement numChars;


    /**
     * Instiaciates a new WorkbookFunctionsLeftBody
     */
    public WorkbookFunctionsLeftBody() {}
    private WorkbookFunctionsLeftBody(@Nonnull final WorkbookFunctionsLeftBodyBuilder builder) {
        this.text = builder.text;
        this.numChars = builder.numChars;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsLeftBodyBuilder newBuilder() {
        return new WorkbookFunctionsLeftBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsLeftBody
     */
    public static final class WorkbookFunctionsLeftBodyBuilder {
        private com.google.gson.JsonElement text;
        /**
         * Sets the name Text
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLeftBodyBuilder withText(@Nullable final com.google.gson.JsonElement val) {
            this.text = val;
            return this;
        }
        private com.google.gson.JsonElement numChars;
        /**
         * Sets the name NumChars
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsLeftBodyBuilder withNumChars(@Nullable final com.google.gson.JsonElement val) {
            this.numChars = val;
            return this;
        }
        private WorkbookFunctionsLeftBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsLeftBody build() {
            return new WorkbookFunctionsLeftBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.text != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("text", text));
        }
        if(this.numChars != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("numChars", numChars));
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
