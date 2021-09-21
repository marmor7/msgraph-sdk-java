// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests;
import com.microsoft.graph.termstore.models.Set;
import com.microsoft.graph.termstore.requests.SetCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.termstore.requests.SetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Set Collection Page.
 */
public class SetCollectionPage extends BaseCollectionPage<Set, SetCollectionRequestBuilder> {

    /**
     * A collection page for Set
     *
     * @param response the serialized SetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SetCollectionPage(@Nonnull final SetCollectionResponse response, @Nonnull final SetCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Set
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SetCollectionPage(@Nonnull final java.util.List<Set> pageContents, @Nullable final SetCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}