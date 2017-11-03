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
 * The class for the Base Workbook Functions Type Request Builder.
 */
public class BaseWorkbookFunctionsTypeRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsType
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsTypeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement value) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("value", value);
    }

    /**
     * Creates the IWorkbookFunctionsTypeRequest
     *
     * @return The IWorkbookFunctionsTypeRequest instance
     */
    public IWorkbookFunctionsTypeRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsTypeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsTypeRequest instance
     */
    public IWorkbookFunctionsTypeRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsTypeRequest request = new WorkbookFunctionsTypeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("value")) {
            request.body.value = getParameter("value");
        }

        return request;
    }
}
