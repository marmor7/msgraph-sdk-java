// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.OnlineMeetingCreateOrGetRequest;
import com.microsoft.graph.models.ChatInfo;
import com.microsoft.graph.models.MeetingParticipants;
import com.microsoft.graph.models.OnlineMeeting;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.OnlineMeetingCreateOrGetParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Online Meeting Create Or Get Request Builder.
 */
public class OnlineMeetingCreateOrGetRequestBuilder extends BaseActionRequestBuilder<OnlineMeeting> {

    private OnlineMeetingCreateOrGetParameterSet body;
    /**
     * The request builder for this OnlineMeetingCreateOrGet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public OnlineMeetingCreateOrGetRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final OnlineMeetingCreateOrGetParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the OnlineMeetingCreateOrGetRequest
     *
     * @param requestOptions the options for the request
     * @return the OnlineMeetingCreateOrGetRequest instance
     */
    @Nonnull
    public OnlineMeetingCreateOrGetRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the OnlineMeetingCreateOrGetRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the OnlineMeetingCreateOrGetRequest instance
     */
    @Nonnull
    public OnlineMeetingCreateOrGetRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final OnlineMeetingCreateOrGetRequest request = new OnlineMeetingCreateOrGetRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
