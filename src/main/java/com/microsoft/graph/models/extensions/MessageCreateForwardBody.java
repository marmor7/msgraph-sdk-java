// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.Recipient;
import com.microsoft.graph.models.extensions.Message;
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
 * The class for the Message Create Forward Body.
 */
public class MessageCreateForwardBody {
    /**
     * The to Recipients.
     * 
     */
    @SerializedName(value = "toRecipients", alternate = {"ToRecipients"})
    @Expose
	@Nullable
    public java.util.List<Recipient> toRecipients;

    /**
     * The message.
     * 
     */
    @SerializedName(value = "message", alternate = {"Message"})
    @Expose
	@Nullable
    public Message message;

    /**
     * The comment.
     * 
     */
    @SerializedName(value = "comment", alternate = {"Comment"})
    @Expose
	@Nullable
    public String comment;


    /**
     * Instiaciates a new MessageCreateForwardBody
     */
    public MessageCreateForwardBody() {}
    private MessageCreateForwardBody(@Nonnull final MessageCreateForwardBodyBuilder builder) {
        this.toRecipients = builder.toRecipients;
        this.message = builder.message;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MessageCreateForwardBodyBuilder newBuilder() {
        return new MessageCreateForwardBodyBuilder();
    }
    /**
     * Fluent builder for the MessageCreateForwardBody
     */
    public static final class MessageCreateForwardBodyBuilder {
        private java.util.List<Recipient> toRecipients;
        /**
         * Sets the name ToRecipients
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MessageCreateForwardBodyBuilder withToRecipients(@Nullable final java.util.List<Recipient> val) {
            this.toRecipients = val;
            return this;
        }
        private Message message;
        /**
         * Sets the name Message
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MessageCreateForwardBodyBuilder withMessage(@Nullable final Message val) {
            this.message = val;
            return this;
        }
        private String comment;
        /**
         * Sets the name Comment
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MessageCreateForwardBodyBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        private MessageCreateForwardBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MessageCreateForwardBody build() {
            return new MessageCreateForwardBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.toRecipients != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("toRecipients", toRecipients));
        }
        if(this.message != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("message", message));
        }
        if(this.comment != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("comment", comment));
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
