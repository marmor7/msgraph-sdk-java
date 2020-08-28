// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileCustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile Custom Configuration Request.
 */
public class AndroidWorkProfileCustomConfigurationRequest extends BaseRequest implements IAndroidWorkProfileCustomConfigurationRequest {
	
    /**
     * The request for the AndroidWorkProfileCustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileCustomConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileCustomConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileCustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidWorkProfileCustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileCustomConfiguration from the service
     *
     * @return the AndroidWorkProfileCustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidWorkProfileCustomConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileCustomConfiguration with a source
     *
     * @param sourceAndroidWorkProfileCustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidWorkProfileCustomConfiguration sourceAndroidWorkProfileCustomConfiguration, final ICallback<AndroidWorkProfileCustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileCustomConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileCustomConfiguration with a source
     *
     * @param sourceAndroidWorkProfileCustomConfiguration the source object with updates
     * @return the updated AndroidWorkProfileCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCustomConfiguration patch(final AndroidWorkProfileCustomConfiguration sourceAndroidWorkProfileCustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileCustomConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration, final ICallback<AndroidWorkProfileCustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileCustomConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileCustomConfiguration with a new object
     *
     * @param newAndroidWorkProfileCustomConfiguration the new object to create
     * @return the created AndroidWorkProfileCustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidWorkProfileCustomConfiguration post(final AndroidWorkProfileCustomConfiguration newAndroidWorkProfileCustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileCustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidWorkProfileCustomConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidWorkProfileCustomConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidWorkProfileCustomConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidWorkProfileCustomConfigurationRequest)this;
     }

}

