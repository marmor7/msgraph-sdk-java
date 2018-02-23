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
 * The class for the Base Workbook Functions Vlookup Request Builder.
 */
public class BaseWorkbookFunctionsVlookupRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsVlookup
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param lookupValue The lookupValue
     * @param tableArray The tableArray
     * @param colIndexNum The colIndexNum
     * @param rangeLookup The rangeLookup
     */
    public BaseWorkbookFunctionsVlookupRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement lookupValue, final com.google.gson.JsonElement tableArray, final com.google.gson.JsonElement colIndexNum, final com.google.gson.JsonElement rangeLookup) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("lookupValue", lookupValue);
        bodyParams.put("tableArray", tableArray);
        bodyParams.put("colIndexNum", colIndexNum);
        bodyParams.put("rangeLookup", rangeLookup);
    }

    /**
     * Creates the IWorkbookFunctionsVlookupRequest
     *
     * @return The IWorkbookFunctionsVlookupRequest instance
     */
    public IWorkbookFunctionsVlookupRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsVlookupRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsVlookupRequest instance
     */
    public IWorkbookFunctionsVlookupRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsVlookupRequest request = new WorkbookFunctionsVlookupRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("lookupValue")) {
            request.body.lookupValue = getParameter("lookupValue");
        }

        if (hasParameter("tableArray")) {
            request.body.tableArray = getParameter("tableArray");
        }

        if (hasParameter("colIndexNum")) {
            request.body.colIndexNum = getParameter("colIndexNum");
        }

        if (hasParameter("rangeLookup")) {
            request.body.rangeLookup = getParameter("rangeLookup");
        }

        return request;
    }
}
