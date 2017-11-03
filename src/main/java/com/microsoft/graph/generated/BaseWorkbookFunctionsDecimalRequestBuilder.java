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
 * The class for the Base Workbook Functions Decimal Request Builder.
 */
public class BaseWorkbookFunctionsDecimalRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDecimal
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsDecimalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement radix) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("radix", radix);
    }

    /**
     * Creates the IWorkbookFunctionsDecimalRequest
     *
     * @return The IWorkbookFunctionsDecimalRequest instance
     */
    public IWorkbookFunctionsDecimalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDecimalRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDecimalRequest instance
     */
    public IWorkbookFunctionsDecimalRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsDecimalRequest request = new WorkbookFunctionsDecimalRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("radix")) {
            request.body.radix = getParameter("radix");
        }

        return request;
    }
}
