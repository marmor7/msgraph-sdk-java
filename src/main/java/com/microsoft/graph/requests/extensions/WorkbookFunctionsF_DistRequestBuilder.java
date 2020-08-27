// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsF_DistRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsF_DistRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions F_Dist Request Builder.
 */
public class WorkbookFunctionsF_DistRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsF_DistRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsF_Dist
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param x the x
     * @param degFreedom1 the degFreedom1
     * @param degFreedom2 the degFreedom2
     * @param cumulative the cumulative
     */
    public WorkbookFunctionsF_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement degFreedom1, final com.google.gson.JsonElement degFreedom2, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("degFreedom1", degFreedom1);
        bodyParams.put("degFreedom2", degFreedom2);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsF_DistRequest
     *
     * @return the IWorkbookFunctionsF_DistRequest instance
     */
    public IWorkbookFunctionsF_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsF_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsF_DistRequest instance
     */
    public IWorkbookFunctionsF_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsF_DistRequest request = new WorkbookFunctionsF_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("degFreedom1")) {
            request.body.degFreedom1 = getParameter("degFreedom1");
        }

        if (hasParameter("degFreedom2")) {
            request.body.degFreedom2 = getParameter("degFreedom2");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
