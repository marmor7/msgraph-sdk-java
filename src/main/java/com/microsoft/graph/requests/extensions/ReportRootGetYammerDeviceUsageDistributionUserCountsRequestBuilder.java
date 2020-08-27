// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageDistributionUserCountsRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageDistributionUserCountsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Device Usage Distribution User Counts Request Builder.
 */
public class ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder {

    /**
     * The request builder for this ReportRootGetYammerDeviceUsageDistributionUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageDistributionUserCountsRequest
     *
     * @return the IReportRootGetYammerDeviceUsageDistributionUserCountsRequest instance
     */
    public IReportRootGetYammerDeviceUsageDistributionUserCountsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetYammerDeviceUsageDistributionUserCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetYammerDeviceUsageDistributionUserCountsRequest instance
     */
    public IReportRootGetYammerDeviceUsageDistributionUserCountsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetYammerDeviceUsageDistributionUserCountsRequest request = new ReportRootGetYammerDeviceUsageDistributionUserCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
