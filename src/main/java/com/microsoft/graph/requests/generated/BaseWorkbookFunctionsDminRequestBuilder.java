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
 * The class for the Base Workbook Functions Dmin Request Builder.
 */
public class BaseWorkbookFunctionsDminRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsDmin
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param database The database
     * @param field The field
     * @param criteria The criteria
     */
    public BaseWorkbookFunctionsDminRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement database, final com.google.gson.JsonElement field, final com.google.gson.JsonElement criteria) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("database", database);
        bodyParams.put("field", field);
        bodyParams.put("criteria", criteria);
    }

    /**
     * Creates the IWorkbookFunctionsDminRequest
     *
     * @return The IWorkbookFunctionsDminRequest instance
     */
    public IWorkbookFunctionsDminRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsDminRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsDminRequest instance
     */
    public IWorkbookFunctionsDminRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsDminRequest request = new WorkbookFunctionsDminRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("database")) {
            request.body.database = getParameter("database");
        }

        if (hasParameter("field")) {
            request.body.field = getParameter("field");
        }

        if (hasParameter("criteria")) {
            request.body.criteria = getParameter("criteria");
        }

        return request;
    }
}
