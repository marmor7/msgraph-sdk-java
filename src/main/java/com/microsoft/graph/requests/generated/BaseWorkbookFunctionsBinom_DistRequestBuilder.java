// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Binom_Dist Request Builder.
 */
public class BaseWorkbookFunctionsBinom_DistRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBinom_Dist
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param numberS The numberS
     * @param trials The trials
     * @param probabilityS The probabilityS
     * @param cumulative The cumulative
     */
    public BaseWorkbookFunctionsBinom_DistRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement numberS, final com.google.gson.JsonElement trials, final com.google.gson.JsonElement probabilityS, final com.google.gson.JsonElement cumulative) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("numberS", numberS);
        bodyParams.put("trials", trials);
        bodyParams.put("probabilityS", probabilityS);
        bodyParams.put("cumulative", cumulative);
    }

    /**
     * Creates the IWorkbookFunctionsBinom_DistRequest
     *
     * @return The IWorkbookFunctionsBinom_DistRequest instance
     */
    public IWorkbookFunctionsBinom_DistRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBinom_DistRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBinom_DistRequest instance
     */
    public IWorkbookFunctionsBinom_DistRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBinom_DistRequest request = new WorkbookFunctionsBinom_DistRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numberS")) {
            request.body.numberS = getParameter("numberS");
        }

        if (hasParameter("trials")) {
            request.body.trials = getParameter("trials");
        }

        if (hasParameter("probabilityS")) {
            request.body.probabilityS = getParameter("probabilityS");
        }

        if (hasParameter("cumulative")) {
            request.body.cumulative = getParameter("cumulative");
        }

        return request;
    }
}
