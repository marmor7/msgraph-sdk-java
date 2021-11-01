// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.requests.ReviewSetQueryApplyTagsRequest;
import com.microsoft.graph.ediscovery.models.ReviewSetQuery;
import com.microsoft.graph.ediscovery.models.Tag;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.ediscovery.models.ReviewSetQueryApplyTagsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Review Set Query Apply Tags Request Builder.
 */
public class ReviewSetQueryApplyTagsRequestBuilder extends BaseActionRequestBuilder<ReviewSetQuery> {

    /**
     * The request builder for this ReviewSetQueryApplyTags
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReviewSetQueryApplyTagsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ReviewSetQueryApplyTagsParameterSet body;
    /**
     * The request builder for this ReviewSetQueryApplyTags
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReviewSetQueryApplyTagsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReviewSetQueryApplyTagsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ReviewSetQueryApplyTagsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReviewSetQueryApplyTagsRequest instance
     */
    @Nonnull
    public ReviewSetQueryApplyTagsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReviewSetQueryApplyTagsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReviewSetQueryApplyTagsRequest instance
     */
    @Nonnull
    public ReviewSetQueryApplyTagsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReviewSetQueryApplyTagsRequest request = new ReviewSetQueryApplyTagsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}