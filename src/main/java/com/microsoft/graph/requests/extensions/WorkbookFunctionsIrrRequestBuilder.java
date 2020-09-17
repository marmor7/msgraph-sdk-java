// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsIrrRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsIrrRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Irr Request Builder.
 */
public class WorkbookFunctionsIrrRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsIrrRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsIrr
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     * @param guess the guess
     */
    public WorkbookFunctionsIrrRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement values, final com.google.gson.JsonElement guess) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
        bodyParams.put("guess", guess);
    }

    /**
     * Creates the IWorkbookFunctionsIrrRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIrrRequest instance
     */
    public IWorkbookFunctionsIrrRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsIrrRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsIrrRequest instance
     */
    public IWorkbookFunctionsIrrRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsIrrRequest request = new WorkbookFunctionsIrrRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        if (hasParameter("guess")) {
            request.body.guess = getParameter("guess");
        }

        return request;
    }
}
