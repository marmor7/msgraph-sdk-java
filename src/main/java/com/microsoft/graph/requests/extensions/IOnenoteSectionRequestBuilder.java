// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnenoteSection;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.requests.extensions.IOnenotePageCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenotePageRequestBuilder;
import com.microsoft.graph.requests.extensions.INotebookRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Onenote Section Request Builder.
 */
public interface IOnenoteSectionRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IOnenoteSectionRequest instance
     */
    IOnenoteSectionRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IOnenoteSectionRequest instance
     */
    IOnenoteSectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Notebook
     *
     * @return the INotebookRequestBuilder instance
     */
    INotebookRequestBuilder parentNotebook();

    /**
     * Gets the request builder for SectionGroup
     *
     * @return the ISectionGroupRequestBuilder instance
     */
    ISectionGroupRequestBuilder parentSectionGroup();

    IOnenotePageCollectionRequestBuilder pages();

    IOnenotePageRequestBuilder pages(final String id);
    IOnenoteSectionCopyToNotebookRequestBuilder copyToNotebook(final String id, final String groupId, final String renameAs, final String siteCollectionId, final String siteId);
    IOnenoteSectionCopyToSectionGroupRequestBuilder copyToSectionGroup(final String id, final String groupId, final String renameAs, final String siteCollectionId, final String siteId);

}