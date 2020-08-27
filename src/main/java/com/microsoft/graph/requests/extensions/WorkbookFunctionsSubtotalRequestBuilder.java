// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsSubtotalRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsSubtotalRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Subtotal Request Builder.
 */
public class WorkbookFunctionsSubtotalRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsSubtotalRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsSubtotal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param functionNum the functionNum
     * @param values the values
     */
    public WorkbookFunctionsSubtotalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement functionNum, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("functionNum", functionNum);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsSubtotalRequest
     *
     * @return the IWorkbookFunctionsSubtotalRequest instance
     */
    public IWorkbookFunctionsSubtotalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsSubtotalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsSubtotalRequest instance
     */
    public IWorkbookFunctionsSubtotalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsSubtotalRequest request = new WorkbookFunctionsSubtotalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("functionNum")) {
            request.body.functionNum = getParameter("functionNum");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
