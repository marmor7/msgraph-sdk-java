// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.ListItemVersion;
import com.microsoft.graph.requests.ListItemVersionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.ListItemVersionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the List Item Version Collection Page.
 */
public class ListItemVersionCollectionPage extends BaseCollectionPage<ListItemVersion, ListItemVersionCollectionRequestBuilder> {

    /**
     * A collection page for ListItemVersion
     *
     * @param response the serialized ListItemVersionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ListItemVersionCollectionPage(@Nonnull final ListItemVersionCollectionResponse response, @Nonnull final ListItemVersionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ListItemVersion
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ListItemVersionCollectionPage(@Nonnull final java.util.List<ListItemVersion> pageContents, @Nullable final ListItemVersionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
