// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Bessel YRequest Builder.
 */
public class BaseWorkbookFunctionsBesselYRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBesselY
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBesselYRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement x, final com.google.gson.JsonElement n) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("x", x);
        bodyParams.put("n", n);
    }

    /**
     * Creates the IWorkbookFunctionsBesselYRequest
     *
     * @return The IWorkbookFunctionsBesselYRequest instance
     */
    public IWorkbookFunctionsBesselYRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBesselYRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBesselYRequest instance
     */
    public IWorkbookFunctionsBesselYRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsBesselYRequest request = new WorkbookFunctionsBesselYRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("x")) {
            request.body.x = getParameter("x");
        }

        if (hasParameter("n")) {
            request.body.n = getParameter("n");
        }

        return request;
    }
}
