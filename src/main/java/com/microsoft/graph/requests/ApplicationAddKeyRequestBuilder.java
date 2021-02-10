// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ApplicationAddKeyRequest;
import com.microsoft.graph.models.Application;
import com.microsoft.graph.models.KeyCredential;
import com.microsoft.graph.models.PasswordCredential;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ApplicationAddKeyParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Add Key Request Builder.
 */
public class ApplicationAddKeyRequestBuilder extends BaseActionRequestBuilder<KeyCredential> {

    private ApplicationAddKeyParameterSet body;
    /**
     * The request builder for this ApplicationAddKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ApplicationAddKeyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ApplicationAddKeyParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ApplicationAddKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddKeyRequest instance
     */
    @Nonnull
    public ApplicationAddKeyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ApplicationAddKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ApplicationAddKeyRequest instance
     */
    @Nonnull
    public ApplicationAddKeyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ApplicationAddKeyRequest request = new ApplicationAddKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
