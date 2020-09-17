// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsFindRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsFindRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Find Request Builder.
 */
public class WorkbookFunctionsFindRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsFindRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsFind
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param findText the findText
     * @param withinText the withinText
     * @param startNum the startNum
     */
    public WorkbookFunctionsFindRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement findText, final com.google.gson.JsonElement withinText, final com.google.gson.JsonElement startNum) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("findText", findText);
        bodyParams.put("withinText", withinText);
        bodyParams.put("startNum", startNum);
    }

    /**
     * Creates the IWorkbookFunctionsFindRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFindRequest instance
     */
    public IWorkbookFunctionsFindRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWorkbookFunctionsFindRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsFindRequest instance
     */
    public IWorkbookFunctionsFindRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsFindRequest request = new WorkbookFunctionsFindRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("findText")) {
            request.body.findText = getParameter("findText");
        }

        if (hasParameter("withinText")) {
            request.body.withinText = getParameter("withinText");
        }

        if (hasParameter("startNum")) {
            request.body.startNum = getParameter("startNum");
        }

        return request;
    }
}
