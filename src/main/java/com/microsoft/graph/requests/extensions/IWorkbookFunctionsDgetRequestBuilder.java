// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsDgetRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Dget Request Builder.
 */
public interface IWorkbookFunctionsDgetRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsDgetRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDgetRequest instance
     */
    IWorkbookFunctionsDgetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsDgetRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsDgetRequest instance
     */
    IWorkbookFunctionsDgetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
