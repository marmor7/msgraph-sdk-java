// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IApplicationCollectionPage;
import com.microsoft.graph.requests.extensions.ApplicationCollectionResponse;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionRequest;
import com.microsoft.graph.requests.extensions.ApplicationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection Request.
 */
public class ApplicationCollectionRequest extends BaseCollectionRequest<ApplicationCollectionResponse, IApplicationCollectionPage> implements IApplicationCollectionRequest {

    /**
     * The request builder for this collection of Application
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ApplicationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ApplicationCollectionResponse.class, IApplicationCollectionPage.class);
    }

    public void get(final ICallback<IApplicationCollectionPage> callback) {
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

    public IApplicationCollectionPage get() throws ClientException {
        final ApplicationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Application newApplication, final ICallback<Application> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ApplicationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newApplication, callback);
    }

    public Application post(final Application newApplication) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ApplicationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newApplication);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IApplicationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ApplicationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IApplicationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ApplicationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IApplicationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ApplicationCollectionRequest)this;
    }

    public IApplicationCollectionPage buildFromResponse(final ApplicationCollectionResponse response) {
        final IApplicationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ApplicationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ApplicationCollectionPage page = new ApplicationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
