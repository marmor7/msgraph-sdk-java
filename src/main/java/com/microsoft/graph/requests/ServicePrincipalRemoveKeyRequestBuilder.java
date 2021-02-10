// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ServicePrincipalRemoveKeyRequest;
import com.microsoft.graph.models.ServicePrincipal;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ServicePrincipalRemoveKeyParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Remove Key Request Builder.
 */
public class ServicePrincipalRemoveKeyRequestBuilder extends BaseActionRequestBuilder<ServicePrincipal> {

    private ServicePrincipalRemoveKeyParameterSet body;
    /**
     * The request builder for this ServicePrincipalRemoveKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ServicePrincipalRemoveKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ServicePrincipalRemoveKeyParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ServicePrincipalRemoveKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalRemoveKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalRemoveKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ServicePrincipalRemoveKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ServicePrincipalRemoveKeyRequest instance
     */
    @Nonnull
    public ServicePrincipalRemoveKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ServicePrincipalRemoveKeyRequest request = new ServicePrincipalRemoveKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
