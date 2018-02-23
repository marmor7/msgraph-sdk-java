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
 * The class for the Base Workbook Functions Year Frac Request Builder.
 */
public class BaseWorkbookFunctionsYearFracRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsYearFrac
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param startDate The startDate
     * @param endDate The endDate
     * @param basis The basis
     */
    public BaseWorkbookFunctionsYearFracRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement startDate, final com.google.gson.JsonElement endDate, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("startDate", startDate);
        bodyParams.put("endDate", endDate);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest
     *
     * @return The IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsYearFracRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsYearFracRequest instance
     */
    public IWorkbookFunctionsYearFracRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsYearFracRequest request = new WorkbookFunctionsYearFracRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("startDate")) {
            request.body.startDate = getParameter("startDate");
        }

        if (hasParameter("endDate")) {
            request.body.endDate = getParameter("endDate");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
