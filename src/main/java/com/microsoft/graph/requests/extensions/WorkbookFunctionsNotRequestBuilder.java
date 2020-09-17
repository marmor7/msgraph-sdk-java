// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNotRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsNotRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Not Request Builder.
 */
public class WorkbookFunctionsNotRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsNotRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsNot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param logical the logical
     */
    public WorkbookFunctionsNotRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement logical) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("logical", logical);
    }

    /**
     * Creates the IWorkbookFunctionsNotRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNotRequest instance
     */
    public IWorkbookFunctionsNotRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsNotRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNotRequest instance
     */
    public IWorkbookFunctionsNotRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsNotRequest request = new WorkbookFunctionsNotRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("logical")) {
            request.body.logical = getParameter("logical");
        }

        return request;
    }
}
