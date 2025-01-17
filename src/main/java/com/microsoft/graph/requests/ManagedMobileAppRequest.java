// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedMobileApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile App Request.
 */
public class ManagedMobileAppRequest extends BaseRequest<ManagedMobileApp> {
	
    /**
     * The request for the ManagedMobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedMobileAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedMobileApp.class);
    }

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileApp> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedMobileApp from the service
     *
     * @return the ManagedMobileApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileApp> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedMobileApp delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileApp> patchAsync(@Nonnull final ManagedMobileApp sourceManagedMobileApp) {
        return sendAsync(HttpMethod.PATCH, sourceManagedMobileApp);
    }

    /**
     * Patches this ManagedMobileApp with a source
     *
     * @param sourceManagedMobileApp the source object with updates
     * @return the updated ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileApp patch(@Nonnull final ManagedMobileApp sourceManagedMobileApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileApp> postAsync(@Nonnull final ManagedMobileApp newManagedMobileApp) {
        return sendAsync(HttpMethod.POST, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the new object to create
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileApp post(@Nonnull final ManagedMobileApp newManagedMobileApp) throws ClientException {
        return send(HttpMethod.POST, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedMobileApp> putAsync(@Nonnull final ManagedMobileApp newManagedMobileApp) {
        return sendAsync(HttpMethod.PUT, newManagedMobileApp);
    }

    /**
     * Creates a ManagedMobileApp with a new object
     *
     * @param newManagedMobileApp the object to create/update
     * @return the created ManagedMobileApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedMobileApp put(@Nonnull final ManagedMobileApp newManagedMobileApp) throws ClientException {
        return send(HttpMethod.PUT, newManagedMobileApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedMobileAppRequest select(@Nonnull final String value) {
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
     public ManagedMobileAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

