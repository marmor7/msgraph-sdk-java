// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.CancelMediaProcessingOperation;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Cancel Media Processing Parameter Set.
 */
public class CallCancelMediaProcessingParameterSet {
    /**
     * The client Context.
     * 
     */
    @SerializedName(value = "clientContext", alternate = {"ClientContext"})
    @Expose
	@Nullable
    public String clientContext;


    /**
     * Instiaciates a new CallCancelMediaProcessingParameterSet
     */
    public CallCancelMediaProcessingParameterSet() {}
    /**
     * Instiaciates a new CallCancelMediaProcessingParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected CallCancelMediaProcessingParameterSet(@Nonnull final CallCancelMediaProcessingParameterSetBuilder builder) {
        this.clientContext = builder.clientContext;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallCancelMediaProcessingParameterSetBuilder newBuilder() {
        return new CallCancelMediaProcessingParameterSetBuilder();
    }
    /**
     * Fluent builder for the CallCancelMediaProcessingParameterSet
     */
    public static final class CallCancelMediaProcessingParameterSetBuilder {
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
        public CallCancelMediaProcessingParameterSetBuilder withClientContext(@Nullable final String val) {
            this.clientContext = val;
            return this;
        }
        /**
         * Instanciates a new CallCancelMediaProcessingParameterSetBuilder
         */
        @Nullable
        protected CallCancelMediaProcessingParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallCancelMediaProcessingParameterSet build() {
            return new CallCancelMediaProcessingParameterSet(this);
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