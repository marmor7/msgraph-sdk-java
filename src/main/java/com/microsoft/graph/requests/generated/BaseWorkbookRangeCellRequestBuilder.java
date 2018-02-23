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
 * The class for the Base Workbook Range Cell Request Builder.
 */
public class BaseWorkbookRangeCellRequestBuilder extends BaseFunctionRequestBuilder {

    /**
     * The request builder for this WorkbookRangeCell
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param row The row
     * @param column The column
     */
    public BaseWorkbookRangeCellRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final Integer row, final Integer column) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new FunctionOption("row", row));
        functionOptions.add(new FunctionOption("column", column));
    }

    /**
     * Creates the IWorkbookRangeCellRequest
     *
     * @return The IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookRangeCellRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookRangeCellRequest instance
     */
    public IWorkbookRangeCellRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookRangeCellRequest request = new WorkbookRangeCellRequest(
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
