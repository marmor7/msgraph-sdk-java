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
 * The class for the Base Workbook Functions Date Request Builder.
 */
public class BaseWorkbookFunctionsDateRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDate
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement year, final com.google.gson.JsonElement month, final com.google.gson.JsonElement day) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("year", year);
        bodyParams.put("month", month);
        bodyParams.put("day", day);
    }

    /**
     * Creates the IWorkbookFunctionsDateRequest
     *
     * @return The IWorkbookFunctionsDateRequest instance
     */
    public IWorkbookFunctionsDateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDateRequest instance
     */
    public IWorkbookFunctionsDateRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsDateRequest request = new WorkbookFunctionsDateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("year")) {
            request.body.year = getParameter("year");
        }

        if (hasParameter("month")) {
            request.body.month = getParameter("month");
        }

        if (hasParameter("day")) {
            request.body.day = getParameter("day");
        }

        return request;
    }
}
