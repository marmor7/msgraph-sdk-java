// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookWorksheetCellRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Worksheet Cell Request Builder.
 */
public interface IWorkbookWorksheetCellRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookWorksheetCellRequest
     *
     * @return the IWorkbookWorksheetCellRequest instance
     */
    IWorkbookWorksheetCellRequest buildRequest();

    /**
     * Creates the IWorkbookWorksheetCellRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookWorksheetCellRequest instance
     */
    IWorkbookWorksheetCellRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
