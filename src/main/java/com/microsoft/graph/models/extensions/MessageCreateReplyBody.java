// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

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
 * The class for the Message Create Reply Body.
 */
public class MessageCreateReplyBody {
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
     * Instiaciates a new MessageCreateReplyBody
     */
    public MessageCreateReplyBody() {}
    private MessageCreateReplyBody(@Nonnull final MessageCreateReplyBodyBuilder builder) {
        this.message = builder.message;
        this.comment = builder.comment;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static MessageCreateReplyBodyBuilder newBuilder() {
        return new MessageCreateReplyBodyBuilder();
    }
    /**
     * Fluent builder for the MessageCreateReplyBody
     */
    public static final class MessageCreateReplyBodyBuilder {
        private Message message;
        /**
         * Sets the name Message
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public MessageCreateReplyBodyBuilder withMessage(@Nullable final Message val) {
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
        public MessageCreateReplyBodyBuilder withComment(@Nullable final String val) {
            this.comment = val;
            return this;
        }
        private MessageCreateReplyBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public MessageCreateReplyBody build() {
            return new MessageCreateReplyBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
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
