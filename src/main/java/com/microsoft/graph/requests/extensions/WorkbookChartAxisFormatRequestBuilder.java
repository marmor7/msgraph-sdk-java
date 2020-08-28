// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisFormat;
import com.microsoft.graph.requests.extensions.IWorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartFontRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartLineFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartLineFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Format Request Builder.
 */
public class WorkbookChartAxisFormatRequestBuilder extends BaseRequestBuilder implements IWorkbookChartAxisFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartAxisFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWorkbookChartAxisFormatRequest instance
     */
    public IWorkbookChartAxisFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisFormatRequest instance
     */
    public IWorkbookChartAxisFormatRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartFont
     *
     * @return the IWorkbookChartFontRequestBuilder instance
     */
    public IWorkbookChartFontRequestBuilder font() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
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
