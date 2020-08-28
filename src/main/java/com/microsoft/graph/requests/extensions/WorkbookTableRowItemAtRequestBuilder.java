// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableRowItemAtRequest;
import com.microsoft.graph.requests.extensions.WorkbookTableRowItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookTableRow;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Item At Request Builder.
 */
public class WorkbookTableRowItemAtRequestBuilder extends BaseFunctionRequestBuilder implements IWorkbookTableRowItemAtRequestBuilder {

    /**
     * The request builder for this WorkbookTableRowItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookTableRowItemAtRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("index", index));
    }

    /**
     * Creates the IWorkbookTableRowItemAtRequest
     *
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    public IWorkbookTableRowItemAtRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookTableRowItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableRowItemAtRequest instance
     */
    public IWorkbookTableRowItemAtRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookTableRowItemAtRequest request = new WorkbookTableRowItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
