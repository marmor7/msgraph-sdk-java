// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SubscribeToToneOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Subscribe To Tone Parameter Set.
 */
public class CallSubscribeToToneParameterSet {
    /**
     * The client Context.
     * 
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;


    /**
     * Instiaciates a new CallSubscribeToToneParameterSet
     */
    public CallSubscribeToToneParameterSet() {}
    /**
     * Instiaciates a new CallSubscribeToToneParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallSubscribeToToneParameterSet(@Nonnull final CallSubscribeToToneParameterSetBuilder builder) {
        this.clientContext = builder.clientContext;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallSubscribeToToneParameterSetBuilder newBuilder() {
        return new CallSubscribeToToneParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallSubscribeToToneParameterSet
     */
    public static final class CallSubscribeToToneParameterSetBuilder {
        /**
         * The clientContext parameter value
         */
        @Nullable
        protected String clientContext;
        /**
         * Sets the ClientContext
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallSubscribeToToneParameterSetBuilder withClientContext(@Nullable final String val) {
            this.clientContext = val;
            return this;
        }
        /**
         * Instanciates a new CallSubscribeToToneParameterSetBuilder
         */
        @Nullable
        protected CallSubscribeToToneParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallSubscribeToToneParameterSet build() {
            return new CallSubscribeToToneParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.clientContext != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("clientContext", clientContext));
        }
        return result;
    }
}