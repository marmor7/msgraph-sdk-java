// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartPoint;
import com.microsoft.graph.requests.extensions.IWorkbookChartPointCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionPage;
import com.microsoft.graph.requests.extensions.WorkbookChartPointCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Collection Page.
 */
public class WorkbookChartPointCollectionPage extends BaseCollectionPage<WorkbookChartPoint, IWorkbookChartPointCollectionRequestBuilder> implements IWorkbookChartPointCollectionPage {

    /**
     * A collection page for WorkbookChartPoint
     *
     * @param response the serialized WorkbookChartPointCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartPointCollectionPage(final WorkbookChartPointCollectionResponse response, final IWorkbookChartPointCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
