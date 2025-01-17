// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests;
import com.microsoft.graph.termstore.models.Relation;
import com.microsoft.graph.termstore.requests.RelationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.termstore.requests.RelationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relation Collection Page.
 */
public class RelationCollectionPage extends BaseCollectionPage<Relation, RelationCollectionRequestBuilder> {

    /**
     * A collection page for Relation
     *
     * @param response the serialized RelationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RelationCollectionPage(@Nonnull final RelationCollectionResponse response, @Nonnull final RelationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Relation
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RelationCollectionPage(@Nonnull final java.util.List<Relation> pageContents, @Nullable final RelationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
