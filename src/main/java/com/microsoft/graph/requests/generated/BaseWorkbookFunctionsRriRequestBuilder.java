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
 * The class for the Base Workbook Functions Rri Request Builder.
 */
public class BaseWorkbookFunctionsRriRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsRri
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param nper The nper
     * @param pv The pv
     * @param fv The fv
     */
    public BaseWorkbookFunctionsRriRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("nper", nper);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
    }

    /**
     * Creates the IWorkbookFunctionsRriRequest
     *
     * @return The IWorkbookFunctionsRriRequest instance
     */
    public IWorkbookFunctionsRriRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsRriRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsRriRequest instance
     */
    public IWorkbookFunctionsRriRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsRriRequest request = new WorkbookFunctionsRriRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        return request;
    }
}
