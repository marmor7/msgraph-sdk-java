// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Sheet Parameter Set.
 */
public class WorkbookFunctionsSheetParameterSet {
    /**
     * The value.
     * 
     */
    @SerializedName(value = "value", alternate = {"Value"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement value;


    /**
     * Instiaciates a new WorkbookFunctionsSheetParameterSet
     */
    public WorkbookFunctionsSheetParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsSheetParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsSheetParameterSet(@Nonnull final WorkbookFunctionsSheetParameterSetBuilder builder) {
        this.value = builder.value;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsSheetParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsSheetParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsSheetParameterSet
     */
    public static final class WorkbookFunctionsSheetParameterSetBuilder {
        /**
         * The value parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement value;
        /**
         * Sets the Value
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsSheetParameterSetBuilder withValue(@Nullable final com.google.gson.JsonElement val) {
            this.value = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsSheetParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsSheetParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsSheetParameterSet build() {
            return new WorkbookFunctionsSheetParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.value != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("value", value));
        }
        return result;
    }
}
