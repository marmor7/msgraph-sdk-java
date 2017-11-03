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
 * The class for the Base Workbook Functions Base Request Builder.
 */
public class BaseWorkbookFunctionsBaseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBase
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsBaseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement radix, final com.google.gson.JsonElement minLength) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("radix", radix);
        bodyParams.put("minLength", minLength);
    }

    /**
     * Creates the IWorkbookFunctionsBaseRequest
     *
     * @return The IWorkbookFunctionsBaseRequest instance
     */
    public IWorkbookFunctionsBaseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBaseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsBaseRequest instance
     */
    public IWorkbookFunctionsBaseRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsBaseRequest request = new WorkbookFunctionsBaseRequest(
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

        if (hasParameter("minLength")) {
            request.body.minLength = getParameter("minLength");
        }

        return request;
    }
}
