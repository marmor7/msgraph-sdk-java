// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsNorm_S_InvRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Norm_S_Inv Request Builder.
 */
public interface IWorkbookFunctionsNorm_S_InvRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsNorm_S_InvRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_InvRequest instance
     */
    IWorkbookFunctionsNorm_S_InvRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsNorm_S_InvRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsNorm_S_InvRequest instance
     */
    IWorkbookFunctionsNorm_S_InvRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
