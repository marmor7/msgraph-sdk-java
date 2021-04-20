// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemFilterByCurrentUserOptions;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItemFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Filter By Current User Collection Request Builder.
 */
public class AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<AccessReviewInstanceDecisionItem, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionResponse, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionPage, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of AccessReviewInstanceDecisionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder.class, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of AccessReviewInstanceDecisionItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AccessReviewInstanceDecisionItemFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequestBuilder.class, AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AccessReviewInstanceDecisionItemFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
          for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }
        return request;
    }
}
