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
 * The class for the Workbook Functions Im Sub Body.
 */
public class WorkbookFunctionsImSubBody {
    /**
     * The inumber1.
     * 
     */
    @SerializedName(value = "inumber1", alternate = {"Inumber1"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber1;

    /**
     * The inumber2.
     * 
     */
    @SerializedName(value = "inumber2", alternate = {"Inumber2"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement inumber2;


    /**
     * Instiaciates a new WorkbookFunctionsImSubBody
     */
    public WorkbookFunctionsImSubBody() {}
    private WorkbookFunctionsImSubBody(@Nonnull final WorkbookFunctionsImSubBodyBuilder builder) {
        this.inumber1 = builder.inumber1;
        this.inumber2 = builder.inumber2;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsImSubBodyBuilder newBuilder() {
        return new WorkbookFunctionsImSubBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsImSubBody
     */
    public static final class WorkbookFunctionsImSubBodyBuilder {
        private com.google.gson.JsonElement inumber1;
        /**
         * Sets the name Inumber1
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImSubBodyBuilder withInumber1(@Nullable final com.google.gson.JsonElement val) {
            this.inumber1 = val;
            return this;
        }
        private com.google.gson.JsonElement inumber2;
        /**
         * Sets the name Inumber2
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsImSubBodyBuilder withInumber2(@Nullable final com.google.gson.JsonElement val) {
            this.inumber2 = val;
            return this;
        }
        private WorkbookFunctionsImSubBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsImSubBody build() {
            return new WorkbookFunctionsImSubBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.inumber1 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber1", inumber1));
        }
        if(this.inumber2 != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("inumber2", inumber2));
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
