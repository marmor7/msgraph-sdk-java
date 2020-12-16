// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookSortField;
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
 * The class for the Workbook Table Sort Apply Body.
 */
public class WorkbookTableSortApplyBody {
    /**
     * The fields.
     * 
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
	@Nullable
    public java.util.List<WorkbookSortField> fields;

    /**
     * The match Case.
     * 
     */
    @SerializedName(value = "matchCase", alternate = {"MatchCase"})
    @Expose
	@Nullable
    public Boolean matchCase;

    /**
     * The method.
     * 
     */
    @SerializedName(value = "method", alternate = {"Method"})
    @Expose
	@Nullable
    public String method;


    /**
     * Instiaciates a new WorkbookTableSortApplyBody
     */
    public WorkbookTableSortApplyBody() {}
    private WorkbookTableSortApplyBody(@Nonnull final WorkbookTableSortApplyBodyBuilder builder) {
        this.fields = builder.fields;
        this.matchCase = builder.matchCase;
        this.method = builder.method;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookTableSortApplyBodyBuilder newBuilder() {
        return new WorkbookTableSortApplyBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookTableSortApplyBody
     */
    public static final class WorkbookTableSortApplyBodyBuilder {
        private java.util.List<WorkbookSortField> fields;
        /**
         * Sets the name Fields
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableSortApplyBodyBuilder withFields(@Nullable final java.util.List<WorkbookSortField> val) {
            this.fields = val;
            return this;
        }
        private Boolean matchCase;
        /**
         * Sets the name MatchCase
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableSortApplyBodyBuilder withMatchCase(@Nullable final Boolean val) {
            this.matchCase = val;
            return this;
        }
        private String method;
        /**
         * Sets the name Method
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookTableSortApplyBodyBuilder withMethod(@Nullable final String val) {
            this.method = val;
            return this;
        }
        private WorkbookTableSortApplyBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookTableSortApplyBody build() {
            return new WorkbookTableSortApplyBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.fields != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fields", fields));
        }
        if(this.matchCase != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("matchCase", matchCase));
        }
        if(this.method != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("method", method));
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
