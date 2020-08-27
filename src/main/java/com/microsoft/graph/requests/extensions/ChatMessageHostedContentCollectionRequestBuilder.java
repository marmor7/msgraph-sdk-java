// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Chat Message Hosted Content Collection Request Builder.
 */
public class ChatMessageHostedContentCollectionRequestBuilder extends BaseRequestBuilder implements IChatMessageHostedContentCollectionRequestBuilder {

    /**
     * The request builder for this collection of ChatMessage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChatMessageHostedContentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IChatMessageHostedContentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IChatMessageHostedContentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ChatMessageHostedContentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IChatMessageHostedContentRequestBuilder byId(final String id) {
        return new ChatMessageHostedContentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
