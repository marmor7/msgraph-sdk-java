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
 * The class for the Base Workbook Functions Beta_Inv Request Builder.
 */
public class BaseWorkbookFunctionsBeta_InvRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBeta_Inv
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param probability The probability
     * @param alpha The alpha
     * @param beta The beta
     * @param a The a
     * @param b The b
     */
    public BaseWorkbookFunctionsBeta_InvRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement probability, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement beta, final com.google.gson.JsonElement a, final com.google.gson.JsonElement b) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("probability", probability);
        bodyParams.put("alpha", alpha);
        bodyParams.put("beta", beta);
        bodyParams.put("a", a);
        bodyParams.put("b", b);
    }

    /**
     * Creates the IWorkbookFunctionsBeta_InvRequest
     *
     * @return The IWorkbookFunctionsBeta_InvRequest instance
     */
    public IWorkbookFunctionsBeta_InvRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBeta_InvRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBeta_InvRequest instance
     */
    public IWorkbookFunctionsBeta_InvRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsBeta_InvRequest request = new WorkbookFunctionsBeta_InvRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("probability")) {
            request.body.probability = getParameter("probability");
        }

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("beta")) {
            request.body.beta = getParameter("beta");
        }

        if (hasParameter("a")) {
            request.body.a = getParameter("a");
        }

        if (hasParameter("b")) {
            request.body.b = getParameter("b");
        }

        return request;
    }
}
