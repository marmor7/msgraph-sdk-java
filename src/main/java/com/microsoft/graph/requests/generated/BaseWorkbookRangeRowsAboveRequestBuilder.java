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
 * The class for the Base Workbook Range Rows Above Request Builder.
 */
public class BaseWorkbookRangeRowsAboveRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeRowsAbove
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeRowsAboveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookRangeRowsAbove
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param count The count
     */
    public BaseWorkbookRangeRowsAboveRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer count) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("count", count));
    }

    /**
     * Creates the IWorkbookRangeRowsAboveRequest
     *
     * @return The IWorkbookRangeRowsAboveRequest instance
     */
    public IWorkbookRangeRowsAboveRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeRowsAboveRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeRowsAboveRequest instance
     */
    public IWorkbookRangeRowsAboveRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeRowsAboveRequest request = new WorkbookRangeRowsAboveRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
