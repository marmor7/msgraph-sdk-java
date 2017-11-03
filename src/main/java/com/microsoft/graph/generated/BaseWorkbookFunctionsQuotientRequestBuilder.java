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
 * The class for the Base Workbook Functions Quotient Request Builder.
 */
public class BaseWorkbookFunctionsQuotientRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsQuotient
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsQuotientRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement numerator, final com.google.gson.JsonElement denominator) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("numerator", numerator);
        bodyParams.put("denominator", denominator);
    }

    /**
     * Creates the IWorkbookFunctionsQuotientRequest
     *
     * @return The IWorkbookFunctionsQuotientRequest instance
     */
    public IWorkbookFunctionsQuotientRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsQuotientRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsQuotientRequest instance
     */
    public IWorkbookFunctionsQuotientRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsQuotientRequest request = new WorkbookFunctionsQuotientRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("numerator")) {
            request.body.numerator = getParameter("numerator");
        }

        if (hasParameter("denominator")) {
            request.body.denominator = getParameter("denominator");
        }

        return request;
    }
}
