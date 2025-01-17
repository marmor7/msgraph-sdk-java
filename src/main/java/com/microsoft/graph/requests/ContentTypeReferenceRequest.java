// Template Source: BaseEntityReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContentType;
import com.microsoft.graph.models.ItemReference;
import com.microsoft.graph.requests.ContentTypeWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ContentTypeCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ColumnLinkCollectionRequestBuilder;
import com.microsoft.graph.requests.ColumnLinkRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionWithReferenceRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.ColumnDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Content Type Reference Request.
 */
public class ContentTypeReferenceRequest extends BaseReferenceRequest<ContentType> {

    /**
     * The request for the ContentType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContentTypeReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ContentType.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public ContentTypeReferenceRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public ContentTypeReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
    /**
     * Puts the ContentType
     *
     * @param srcContentType the ContentType reference to PUT
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ContentType> putAsync(@Nonnull final ContentType srcContentType) {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/directory/deletedItemsAsUser/{id}/followedSites/{id}/contentTypes/" + srcContentType.id));
        return sendAsync(HttpMethod.PUT, payload);
    }

    /**
     * Puts the ContentType
     *
     * @param srcContentType the ContentType reference to PUT
     * @return the ContentType
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public ContentType put(@Nonnull final ContentType srcContentType) throws ClientException {
        final JsonObject payload = new JsonObject();
        payload.add("@odata.id", new JsonPrimitive(this.getClient().getServiceRoot() + "/directory/deletedItemsAsUser/{id}/followedSites/{id}/contentTypes/" + srcContentType.id));
        return send(HttpMethod.PUT, payload);
    }
}
