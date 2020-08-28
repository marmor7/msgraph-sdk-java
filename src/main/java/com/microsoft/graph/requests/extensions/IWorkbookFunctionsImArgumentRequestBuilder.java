// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImArgumentRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Argument Request Builder.
 */
public interface IWorkbookFunctionsImArgumentRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImArgumentRequest
     *
     * @return the IWorkbookFunctionsImArgumentRequest instance
     */
    IWorkbookFunctionsImArgumentRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsImArgumentRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImArgumentRequest instance
     */
    IWorkbookFunctionsImArgumentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
