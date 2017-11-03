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
 * The class for the Base Workbook Functions Rightb Request Builder.
 */
public class BaseWorkbookFunctionsRightbRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRightb
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsRightbRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement text, final com.google.gson.JsonElement numBytes) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("text", text);
        bodyParams.put("numBytes", numBytes);
    }

    /**
     * Creates the IWorkbookFunctionsRightbRequest
     *
     * @return The IWorkbookFunctionsRightbRequest instance
     */
    public IWorkbookFunctionsRightbRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRightbRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsRightbRequest instance
     */
    public IWorkbookFunctionsRightbRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsRightbRequest request = new WorkbookFunctionsRightbRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("text")) {
            request.body.text = getParameter("text");
        }

        if (hasParameter("numBytes")) {
            request.body.numBytes = getParameter("numBytes");
        }

        return request;
    }
}
