// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CallRedirectRequest;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.InvitationParticipantInfo;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.CallRedirectParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Redirect Request Builder.
 */
public class CallRedirectRequestBuilder extends BaseActionRequestBuilder<Call> {

    private CallRedirectParameterSet body;
    /**
     * The request builder for this CallRedirect
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallRedirectRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallRedirectParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the CallRedirectRequest
     *
     * @param requestOptions the options for the request
     * @return the CallRedirectRequest instance
     */
    @Nonnull
    public CallRedirectRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallRedirectRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallRedirectRequest instance
     */
    @Nonnull
    public CallRedirectRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallRedirectRequest request = new CallRedirectRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
