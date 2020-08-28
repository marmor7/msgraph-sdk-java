// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBinom_Dist_RangeRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBinom_Dist_RangeRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Binom_Dist_Range Request Builder.
 */
public class WorkbookFunctionsBinom_Dist_RangeRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBinom_Dist_RangeRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist_Range
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param trials the trials
     * @param probabilityS the probabilityS
     * @param numberS the numberS
     * @param numberS2 the numberS2
     */
    public WorkbookFunctionsBinom_Dist_RangeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement numberS2) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("trials", trials);
        bodyParams.put("probabilityS", probabilityS);
        bodyParams.put("numberS", numberS);
        bodyParams.put("numberS2", numberS2);
    }

    /**
     * Creates the IWorkbookFunctionsBinom_Dist_RangeRequest
     *
     * @return the IWorkbookFunctionsBinom_Dist_RangeRequest instance
     */
    public IWorkbookFunctionsBinom_Dist_RangeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBinom_Dist_RangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBinom_Dist_RangeRequest instance
     */
    public IWorkbookFunctionsBinom_Dist_RangeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBinom_Dist_RangeRequest request = new WorkbookFunctionsBinom_Dist_RangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("trials")) {
            request.body.trials = getParameter("trials");
        }

        if (hasParameter("probabilityS")) {
            request.body.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("numberS")) {
            request.body.numberS = getParameter("numberS");
        }

        if (hasParameter("numberS2")) {
            request.body.numberS2 = getParameter("numberS2");
        }

        return request;
    }
}
