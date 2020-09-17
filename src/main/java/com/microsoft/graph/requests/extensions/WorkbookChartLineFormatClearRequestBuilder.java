// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatClearRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatClearRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Line Format Clear Request Builder.
 */
public class WorkbookChartLineFormatClearRequestBuilder extends BaseActionRequestBuilder implements IWorkbookChartLineFormatClearRequestBuilder {

    /**
     * The request builder for this WorkbookChartLineFormatClear
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartLineFormatClearRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookChartLineFormatClearRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookChartLineFormatClearRequest instance
     */
    public IWorkbookChartLineFormatClearRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookChartLineFormatClearRequest request = new WorkbookChartLineFormatClearRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
