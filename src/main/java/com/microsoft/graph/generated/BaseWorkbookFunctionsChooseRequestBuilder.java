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
 * The class for the Base Workbook Functions Choose Request Builder.
 */
public class BaseWorkbookFunctionsChooseRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsChoose
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookFunctionsChooseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions, final com.google.gson.JsonElement indexNum, final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("indexNum", indexNum);
        bodyParams.put("values", values);
    }

    /**
     * Creates the IWorkbookFunctionsChooseRequest
     *
     * @return The IWorkbookFunctionsChooseRequest instance
     */
    public IWorkbookFunctionsChooseRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsChooseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsChooseRequest instance
     */
    public IWorkbookFunctionsChooseRequest buildRequest(final java.util.List<Option> requestOptions) {
        WorkbookFunctionsChooseRequest request = new WorkbookFunctionsChooseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("indexNum")) {
            request.body.indexNum = getParameter("indexNum");
        }

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}
