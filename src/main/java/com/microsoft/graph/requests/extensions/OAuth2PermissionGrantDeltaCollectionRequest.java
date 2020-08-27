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
 * The class for the OAuth2Permission Grant Delta Collection Request.
 */
public class OAuth2PermissionGrantDeltaCollectionRequest extends BaseCollectionRequest<OAuth2PermissionGrantDeltaCollectionResponse, IOAuth2PermissionGrantDeltaCollectionPage> implements IOAuth2PermissionGrantDeltaCollectionRequest {


    /**
     * The request for this OAuth2PermissionGrantDelta
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantDeltaCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantDeltaCollectionResponse.class, IOAuth2PermissionGrantDeltaCollectionPage.class);
    }


    public void get(final ICallback<IOAuth2PermissionGrantDeltaCollectionPage> callback) {
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

    public IOAuth2PermissionGrantDeltaCollectionPage get() throws ClientException {
        final OAuth2PermissionGrantDeltaCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IOAuth2PermissionGrantDeltaCollectionPage buildFromResponse(final OAuth2PermissionGrantDeltaCollectionResponse response) {
        final IOAuth2PermissionGrantDeltaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new OAuth2PermissionGrantDeltaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IOAuth2PermissionGrantDeltaCollectionPage page = new OAuth2PermissionGrantDeltaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantDeltaCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IOAuth2PermissionGrantDeltaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IOAuth2PermissionGrantDeltaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IOAuth2PermissionGrantDeltaCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IOAuth2PermissionGrantDeltaCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IOAuth2PermissionGrantDeltaCollectionRequest)this;
    }

}
