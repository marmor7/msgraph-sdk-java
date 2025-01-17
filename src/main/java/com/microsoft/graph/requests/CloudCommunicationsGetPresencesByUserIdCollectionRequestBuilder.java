// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Presence;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder;
import com.microsoft.graph.requests.CloudCommunicationsGetPresencesByUserIdCollectionRequest;
import com.microsoft.graph.requests.CloudCommunicationsGetPresencesByUserIdCollectionResponse;
import com.microsoft.graph.models.CloudCommunicationsGetPresencesByUserIdParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Get Presences By User Id Collection Request Builder.
 */
public class CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder extends BaseActionCollectionRequestBuilder<Presence, CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder, CloudCommunicationsGetPresencesByUserIdCollectionResponse, CloudCommunicationsGetPresencesByUserIdCollectionPage, CloudCommunicationsGetPresencesByUserIdCollectionRequest> {

    /**
     * The request builder for this collection of CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder.class, CloudCommunicationsGetPresencesByUserIdCollectionRequest.class);
    }
    private CloudCommunicationsGetPresencesByUserIdParameterSet body;
    /**
     * The request builder for this collection of CloudCommunications
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CloudCommunicationsGetPresencesByUserIdParameterSet parameters) {
        super(requestUrl, client, requestOptions, CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder.class, CloudCommunicationsGetPresencesByUserIdCollectionRequest.class);
        this.body = parameters;
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CloudCommunicationsGetPresencesByUserIdCollectionRequest instance
     */
    @Override
    @Nonnull
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CloudCommunicationsGetPresencesByUserIdCollectionRequest request = super.buildRequest(requestOptions);
            request.body = this.body;
            return request;
    }
}
