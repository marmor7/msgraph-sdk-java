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
 * The class for the Base Workbook Functions Confidence_TRequest Builder.
 */
public class BaseWorkbookFunctionsConfidence_TRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsConfidence_T
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsConfidence_TRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement alpha, final com.google.gson.JsonElement standardDev, final com.google.gson.JsonElement size) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("alpha", alpha);
        bodyParams.put("standardDev", standardDev);
        bodyParams.put("size", size);
    }

    /**
     * Creates the IWorkbookFunctionsConfidence_TRequest
     *
     * @return The IWorkbookFunctionsConfidence_TRequest instance
     */
    public IWorkbookFunctionsConfidence_TRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsConfidence_TRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsConfidence_TRequest instance
     */
    public IWorkbookFunctionsConfidence_TRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsConfidence_TRequest request = new WorkbookFunctionsConfidence_TRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("alpha")) {
            request.body.alpha = getParameter("alpha");
        }

        if (hasParameter("standardDev")) {
            request.body.standardDev = getParameter("standardDev");
        }

        if (hasParameter("size")) {
            request.body.size = getParameter("size");
        }

        return request;
    }
}
