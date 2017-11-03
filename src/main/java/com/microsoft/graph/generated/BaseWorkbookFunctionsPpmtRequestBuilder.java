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
 * The class for the Base Workbook Functions Ppmt Request Builder.
 */
public class BaseWorkbookFunctionsPpmtRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsPpmt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsPpmtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement per, final com.google.gson.JsonElement nper, final com.google.gson.JsonElement pv, final com.google.gson.JsonElement fv, final com.google.gson.JsonElement type) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("rate", rate);
        bodyParams.put("per", per);
        bodyParams.put("nper", nper);
        bodyParams.put("pv", pv);
        bodyParams.put("fv", fv);
        bodyParams.put("type", type);
    }

    /**
     * Creates the IWorkbookFunctionsPpmtRequest
     *
     * @return The IWorkbookFunctionsPpmtRequest instance
     */
    public IWorkbookFunctionsPpmtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsPpmtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsPpmtRequest instance
     */
    public IWorkbookFunctionsPpmtRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsPpmtRequest request = new WorkbookFunctionsPpmtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("per")) {
            request.body.per = getParameter("per");
        }

        if (hasParameter("nper")) {
            request.body.nper = getParameter("nper");
        }

        if (hasParameter("pv")) {
            request.body.pv = getParameter("pv");
        }

        if (hasParameter("fv")) {
            request.body.fv = getParameter("fv");
        }

        if (hasParameter("type")) {
            request.body.type = getParameter("type");
        }

        return request;
    }
}
