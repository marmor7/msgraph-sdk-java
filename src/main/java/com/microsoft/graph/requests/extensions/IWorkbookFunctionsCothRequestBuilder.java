// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCothRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Coth Request Builder.
 */
public interface IWorkbookFunctionsCothRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCothRequest
     *
     * @return the IWorkbookFunctionsCothRequest instance
     */
    IWorkbookFunctionsCothRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsCothRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCothRequest instance
     */
    IWorkbookFunctionsCothRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
