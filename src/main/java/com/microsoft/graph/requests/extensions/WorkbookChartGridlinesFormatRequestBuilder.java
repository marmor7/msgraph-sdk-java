// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookChartGridlinesFormatRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesFormatRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines Format Request Builder.
 */
public class WorkbookChartGridlinesFormatRequestBuilder extends BaseRequestBuilder implements IWorkbookChartGridlinesFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartGridlinesFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartGridlinesFormatRequest instance
     */
    public IWorkbookChartGridlinesFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartGridlinesFormatRequest instance
     */
    public IWorkbookChartGridlinesFormatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookChartGridlinesFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartLineFormat
     *
     * @return the IWorkbookChartLineFormatRequestBuilder instance
     */
    public IWorkbookChartLineFormatRequestBuilder line() {
        return new WorkbookChartLineFormatRequestBuilder(getRequestUrlWithAdditionalSegment("line"), getClient(), null);
    }
}

