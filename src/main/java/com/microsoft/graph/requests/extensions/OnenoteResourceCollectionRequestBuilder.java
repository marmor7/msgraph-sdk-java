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

import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteResourceCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Resource Collection Request Builder.
 */
public class OnenoteResourceCollectionRequestBuilder extends BaseRequestBuilder implements IOnenoteResourceCollectionRequestBuilder {

    /**
     * The request builder for this collection of Onenote
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteResourceCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOnenoteResourceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOnenoteResourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OnenoteResourceCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenoteResourceRequestBuilder byId(final String id) {
        return new OnenoteResourceRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
