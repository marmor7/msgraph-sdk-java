// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.generated.RejectReason;
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
 * The class for the Call Reject Body.
 */
public class CallRejectBody {
    /**
     * The reason.
     * 
     */
    @SerializedName(value = "reason", alternate = {"Reason"})
    @Expose
	@Nullable
    public RejectReason reason;

    /**
     * The callback Uri.
     * 
     */
    @SerializedName(value = "callbackUri", alternate = {"CallbackUri"})
    @Expose
	@Nullable
    public String callbackUri;


    /**
     * Instiaciates a new CallRejectBody
     */
    public CallRejectBody() {}
    private CallRejectBody(@Nonnull final CallRejectBodyBuilder builder) {
        this.reason = builder.reason;
        this.callbackUri = builder.callbackUri;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static CallRejectBodyBuilder newBuilder() {
        return new CallRejectBodyBuilder();
    }
    /**
     * Fluent builder for the CallRejectBody
     */
    public static final class CallRejectBodyBuilder {
        private RejectReason reason;
        /**
         * Sets the name Reason
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRejectBodyBuilder withReason(@Nullable final RejectReason val) {
            this.reason = val;
            return this;
        }
        private String callbackUri;
        /**
         * Sets the name CallbackUri
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public CallRejectBodyBuilder withCallbackUri(@Nullable final String val) {
            this.callbackUri = val;
            return this;
        }
        private CallRejectBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public CallRejectBody build() {
            return new CallRejectBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.reason != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("reason", reason));
        }
        if(this.callbackUri != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("callbackUri", callbackUri));
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
