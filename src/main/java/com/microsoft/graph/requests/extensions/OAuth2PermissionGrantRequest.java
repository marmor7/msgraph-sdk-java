// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Request.
 */
public class OAuth2PermissionGrantRequest extends BaseRequest implements IOAuth2PermissionGrantRequest {
	
    /**
     * The request for the OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrant.class);
    }

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OAuth2PermissionGrant> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OAuth2PermissionGrant from the service
     *
     * @return the OAuth2PermissionGrant from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OAuth2PermissionGrant get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OAuth2PermissionGrant> callback) {
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
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OAuth2PermissionGrant sourceOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback) {
        send(HttpMethod.PATCH, callback, sourceOAuth2PermissionGrant);
    }

    /**
     * Patches this OAuth2PermissionGrant with a source
     *
     * @param sourceOAuth2PermissionGrant the source object with updates
     * @return the updated OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OAuth2PermissionGrant patch(final OAuth2PermissionGrant sourceOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.PATCH, sourceOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback) {
        send(HttpMethod.POST, callback, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the new object to create
     * @return the created OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OAuth2PermissionGrant post(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.POST, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OAuth2PermissionGrant newOAuth2PermissionGrant, final ICallback<? super OAuth2PermissionGrant> callback) {
        send(HttpMethod.PUT, callback, newOAuth2PermissionGrant);
    }

    /**
     * Creates a OAuth2PermissionGrant with a new object
     *
     * @param newOAuth2PermissionGrant the object to create/update
     * @return the created OAuth2PermissionGrant
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OAuth2PermissionGrant put(final OAuth2PermissionGrant newOAuth2PermissionGrant) throws ClientException {
        return send(HttpMethod.PUT, newOAuth2PermissionGrant);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOAuth2PermissionGrantRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OAuth2PermissionGrantRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOAuth2PermissionGrantRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OAuth2PermissionGrantRequest)this;
     }

}

