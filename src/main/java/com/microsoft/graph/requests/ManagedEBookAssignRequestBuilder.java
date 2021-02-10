// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedEBookAssignRequest;
import com.microsoft.graph.models.ManagedEBook;
import com.microsoft.graph.models.ManagedEBookAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedEBookAssignParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assign Request Builder.
 */
public class ManagedEBookAssignRequestBuilder extends BaseActionRequestBuilder<ManagedEBook> {

    private ManagedEBookAssignParameterSet body;
    /**
     * The request builder for this ManagedEBookAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedEBookAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedEBookAssignParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedEBookAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedEBookAssignRequest instance
     */
    @Nonnull
    public ManagedEBookAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedEBookAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedEBookAssignRequest instance
     */
    @Nonnull
    public ManagedEBookAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedEBookAssignRequest request = new ManagedEBookAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
