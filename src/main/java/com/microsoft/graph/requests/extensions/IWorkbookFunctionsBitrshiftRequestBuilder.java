// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBitrshiftRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Bitrshift Request Builder.
 */
public interface IWorkbookFunctionsBitrshiftRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsBitrshiftRequest
     *
     * @return the IWorkbookFunctionsBitrshiftRequest instance
     */
    IWorkbookFunctionsBitrshiftRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsBitrshiftRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBitrshiftRequest instance
     */
    IWorkbookFunctionsBitrshiftRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
