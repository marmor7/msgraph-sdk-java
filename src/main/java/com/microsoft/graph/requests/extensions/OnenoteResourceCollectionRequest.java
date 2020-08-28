// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Onenote;
import com.microsoft.graph.models.extensions.OnenoteResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionPage;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequest;
import com.microsoft.graph.requests.extensions.OnenoteResourceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Resource Collection Request.
 */
public class OnenoteResourceCollectionRequest extends BaseCollectionRequest<OnenoteResourceCollectionResponse, IOnenoteResourceCollectionPage> implements IOnenoteResourceCollectionRequest {

    /**
     * The request builder for this collection of OnenoteResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteResourceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteResourceCollectionResponse.class, IOnenoteResourceCollectionPage.class);
    }

    public void get(final ICallback<IOnenoteResourceCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IOnenoteResourceCollectionPage get() throws ClientException {
        final OnenoteResourceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final OnenoteResource newOnenoteResource, final ICallback<OnenoteResource> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new OnenoteResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOnenoteResource, callback);
    }

    public OnenoteResource post(final OnenoteResource newOnenoteResource) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new OnenoteResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newOnenoteResource);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOnenoteResourceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (OnenoteResourceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOnenoteResourceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (OnenoteResourceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOnenoteResourceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (OnenoteResourceCollectionRequest)this;
    }

    public IOnenoteResourceCollectionPage buildFromResponse(final OnenoteResourceCollectionResponse response) {
        final IOnenoteResourceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OnenoteResourceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final OnenoteResourceCollectionPage page = new OnenoteResourceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
