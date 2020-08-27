// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopItemsFilterRequest;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyTopItemsFilterRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Top Items Filter Request Builder.
 */
public class WorkbookFilterApplyTopItemsFilterRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFilterApplyTopItemsFilterRequestBuilder {

    /**
     * The request builder for this WorkbookFilterApplyTopItemsFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param count the count
     */
    public WorkbookFilterApplyTopItemsFilterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("count", count);
    }

    /**
     * Creates the IWorkbookFilterApplyTopItemsFilterRequest
     *
     * @return the IWorkbookFilterApplyTopItemsFilterRequest instance
     */
    public IWorkbookFilterApplyTopItemsFilterRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFilterApplyTopItemsFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyTopItemsFilterRequest instance
     */
    public IWorkbookFilterApplyTopItemsFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyTopItemsFilterRequest request = new WorkbookFilterApplyTopItemsFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("count")) {
            request.body.count = getParameter("count");
        }

        return request;
    }
}
