// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetSharePointSiteUsageDetailRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Share Point Site Usage Detail Request Builder.
 */
public interface IReportRootGetSharePointSiteUsageDetailRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootGetSharePointSiteUsageDetailRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsageDetailRequest instance
     */
    IReportRootGetSharePointSiteUsageDetailRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootGetSharePointSiteUsageDetailRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetSharePointSiteUsageDetailRequest instance
     */
    IReportRootGetSharePointSiteUsageDetailRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
