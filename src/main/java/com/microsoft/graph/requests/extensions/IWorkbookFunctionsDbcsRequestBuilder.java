// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDbcsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Dbcs Request Builder.
 */
public interface IWorkbookFunctionsDbcsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDbcsRequest
     *
     * @return the IWorkbookFunctionsDbcsRequest instance
     */
    IWorkbookFunctionsDbcsRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsDbcsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDbcsRequest instance
     */
    IWorkbookFunctionsDbcsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
