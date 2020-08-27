// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOct2DecRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Oct2Dec Request Builder.
 */
public interface IWorkbookFunctionsOct2DecRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsOct2DecRequest
     *
     * @return the IWorkbookFunctionsOct2DecRequest instance
     */
    IWorkbookFunctionsOct2DecRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsOct2DecRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOct2DecRequest instance
     */
    IWorkbookFunctionsOct2DecRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
