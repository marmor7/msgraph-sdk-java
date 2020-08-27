// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsHex2OctRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Hex2Oct Request Builder.
 */
public interface IWorkbookFunctionsHex2OctRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsHex2OctRequest
     *
     * @return the IWorkbookFunctionsHex2OctRequest instance
     */
    IWorkbookFunctionsHex2OctRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsHex2OctRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsHex2OctRequest instance
     */
    IWorkbookFunctionsHex2OctRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
