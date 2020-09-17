// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsLogNorm_DistRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Log Norm_Dist Request Builder.
 */
public interface IWorkbookFunctionsLogNorm_DistRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsLogNorm_DistRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLogNorm_DistRequest instance
     */
    IWorkbookFunctionsLogNorm_DistRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsLogNorm_DistRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsLogNorm_DistRequest instance
     */
    IWorkbookFunctionsLogNorm_DistRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
