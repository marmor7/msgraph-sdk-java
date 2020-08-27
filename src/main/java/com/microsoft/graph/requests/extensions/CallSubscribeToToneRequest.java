// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CallSubscribeToToneBody;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.requests.extensions.ICallSubscribeToToneRequest;
import com.microsoft.graph.requests.extensions.CallSubscribeToToneRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Subscribe To Tone Request.
 */
public class CallSubscribeToToneRequest extends BaseRequest implements ICallSubscribeToToneRequest {
    protected final CallSubscribeToToneBody body;

    /**
     * The request for this CallSubscribeToTone
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallSubscribeToToneRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SubscribeToToneOperation.class);
        body = new CallSubscribeToToneBody();
    }

    public void post(final ICallback<SubscribeToToneOperation> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public SubscribeToToneOperation post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICallSubscribeToToneRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CallSubscribeToToneRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICallSubscribeToToneRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (CallSubscribeToToneRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICallSubscribeToToneRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CallSubscribeToToneRequest)this;
    }

}
