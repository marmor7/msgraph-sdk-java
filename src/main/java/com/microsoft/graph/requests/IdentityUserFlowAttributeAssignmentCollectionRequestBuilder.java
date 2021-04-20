// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.B2xIdentityUserFlow;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignment;
import com.microsoft.graph.models.AssignmentOrder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentCollectionRequest;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentSetOrderRequestBuilder;
import com.microsoft.graph.requests.IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.IdentityUserFlowAttributeAssignmentSetOrderParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity User Flow Attribute Assignment Collection Request Builder.
 */
public class IdentityUserFlowAttributeAssignmentCollectionRequestBuilder extends BaseCollectionRequestBuilder<IdentityUserFlowAttributeAssignment, IdentityUserFlowAttributeAssignmentRequestBuilder, IdentityUserFlowAttributeAssignmentCollectionResponse, IdentityUserFlowAttributeAssignmentCollectionPage, IdentityUserFlowAttributeAssignmentCollectionRequest> {

    /**
     * The request builder for this collection of B2xIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IdentityUserFlowAttributeAssignmentCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IdentityUserFlowAttributeAssignmentRequestBuilder.class, IdentityUserFlowAttributeAssignmentCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentSetOrderRequestBuilder setOrder(@Nonnull final IdentityUserFlowAttributeAssignmentSetOrderParameterSet parameters) {
        return new IdentityUserFlowAttributeAssignmentSetOrderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.setOrder"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder getOrder() {
        return new IdentityUserFlowAttributeAssignmentGetOrderRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOrder"), getClient(), null);
    }

    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}
