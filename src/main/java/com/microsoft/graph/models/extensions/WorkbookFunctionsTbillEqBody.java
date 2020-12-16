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
 * The class for the Workbook Functions Tbill Eq Body.
 */
public class WorkbookFunctionsTbillEqBody {
    /**
     * The settlement.
     * 
     */
    @SerializedName(value = "settlement", alternate = {"Settlement"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement settlement;

    /**
     * The maturity.
     * 
     */
    @SerializedName(value = "maturity", alternate = {"Maturity"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement maturity;

    /**
     * The discount.
     * 
     */
    @SerializedName(value = "discount", alternate = {"Discount"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement discount;


    /**
     * Instiaciates a new WorkbookFunctionsTbillEqBody
     */
    public WorkbookFunctionsTbillEqBody() {}
    private WorkbookFunctionsTbillEqBody(@Nonnull final WorkbookFunctionsTbillEqBodyBuilder builder) {
        this.settlement = builder.settlement;
        this.maturity = builder.maturity;
        this.discount = builder.discount;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsTbillEqBodyBuilder newBuilder() {
        return new WorkbookFunctionsTbillEqBodyBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsTbillEqBody
     */
    public static final class WorkbookFunctionsTbillEqBodyBuilder {
        private com.google.gson.JsonElement settlement;
        /**
         * Sets the name Settlement
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTbillEqBodyBuilder withSettlement(@Nullable final com.google.gson.JsonElement val) {
            this.settlement = val;
            return this;
        }
        private com.google.gson.JsonElement maturity;
        /**
         * Sets the name Maturity
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTbillEqBodyBuilder withMaturity(@Nullable final com.google.gson.JsonElement val) {
            this.maturity = val;
            return this;
        }
        private com.google.gson.JsonElement discount;
        /**
         * Sets the name Discount
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsTbillEqBodyBuilder withDiscount(@Nullable final com.google.gson.JsonElement val) {
            this.discount = val;
            return this;
        }
        private WorkbookFunctionsTbillEqBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsTbillEqBody build() {
            return new WorkbookFunctionsTbillEqBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.settlement != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("settlement", settlement));
        }
        if(this.maturity != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("maturity", maturity));
        }
        if(this.discount != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("discount", discount));
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
