// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ServiceAnnouncementAttachment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Announcement Attachment Request.
 */
public class ServiceAnnouncementAttachmentRequest extends BaseRequest<ServiceAnnouncementAttachment> {
	
    /**
     * The request for the ServiceAnnouncementAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ServiceAnnouncementAttachmentRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ServiceAnnouncementAttachment.class);
    }

    /**
     * Gets the ServiceAnnouncementAttachment from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncementAttachment> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ServiceAnnouncementAttachment from the service
     *
     * @return the ServiceAnnouncementAttachment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncementAttachment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncementAttachment> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ServiceAnnouncementAttachment delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ServiceAnnouncementAttachment with a source
     *
     * @param sourceServiceAnnouncementAttachment the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncementAttachment> patchAsync(@Nonnull final ServiceAnnouncementAttachment sourceServiceAnnouncementAttachment) {
        return sendAsync(HttpMethod.PATCH, sourceServiceAnnouncementAttachment);
    }

    /**
     * Patches this ServiceAnnouncementAttachment with a source
     *
     * @param sourceServiceAnnouncementAttachment the source object with updates
     * @return the updated ServiceAnnouncementAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncementAttachment patch(@Nonnull final ServiceAnnouncementAttachment sourceServiceAnnouncementAttachment) throws ClientException {
        return send(HttpMethod.PATCH, sourceServiceAnnouncementAttachment);
    }

    /**
     * Creates a ServiceAnnouncementAttachment with a new object
     *
     * @param newServiceAnnouncementAttachment the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncementAttachment> postAsync(@Nonnull final ServiceAnnouncementAttachment newServiceAnnouncementAttachment) {
        return sendAsync(HttpMethod.POST, newServiceAnnouncementAttachment);
    }

    /**
     * Creates a ServiceAnnouncementAttachment with a new object
     *
     * @param newServiceAnnouncementAttachment the new object to create
     * @return the created ServiceAnnouncementAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncementAttachment post(@Nonnull final ServiceAnnouncementAttachment newServiceAnnouncementAttachment) throws ClientException {
        return send(HttpMethod.POST, newServiceAnnouncementAttachment);
    }

    /**
     * Creates a ServiceAnnouncementAttachment with a new object
     *
     * @param newServiceAnnouncementAttachment the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ServiceAnnouncementAttachment> putAsync(@Nonnull final ServiceAnnouncementAttachment newServiceAnnouncementAttachment) {
        return sendAsync(HttpMethod.PUT, newServiceAnnouncementAttachment);
    }

    /**
     * Creates a ServiceAnnouncementAttachment with a new object
     *
     * @param newServiceAnnouncementAttachment the object to create/update
     * @return the created ServiceAnnouncementAttachment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ServiceAnnouncementAttachment put(@Nonnull final ServiceAnnouncementAttachment newServiceAnnouncementAttachment) throws ClientException {
        return send(HttpMethod.PUT, newServiceAnnouncementAttachment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ServiceAnnouncementAttachmentRequest select(@Nonnull final String value) {
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
     public ServiceAnnouncementAttachmentRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}
