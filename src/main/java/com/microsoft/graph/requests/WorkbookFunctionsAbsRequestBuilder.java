// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookFunctionsAbsRequest;
import com.microsoft.graph.models.WorkbookFunctions;
import com.microsoft.graph.models.WorkbookFunctionResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.WorkbookFunctionsAbsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Abs Request Builder.
 */
public class WorkbookFunctionsAbsRequestBuilder extends BaseActionRequestBuilder<WorkbookFunctionResult> {

    private WorkbookFunctionsAbsParameterSet body;
    /**
     * The request builder for this WorkbookFunctionsAbs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookFunctionsAbsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookFunctionsAbsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the WorkbookFunctionsAbsRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAbsRequest instance
     */
    @Nonnull
    public WorkbookFunctionsAbsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFunctionsAbsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFunctionsAbsRequest instance
     */
    @Nonnull
    public WorkbookFunctionsAbsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookFunctionsAbsRequest request = new WorkbookFunctionsAbsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
