// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Mailbox Usage Quota Status Mailbox Counts Request Builder.
 */
public interface IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest instance
     */
    IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest instance
     */
    IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
