// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EventMessage;
import com.microsoft.graph.requests.extensions.IEventRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Event Message Request Builder.
 */
public interface IEventMessageRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IEventMessageRequest instance
     */
    IEventMessageRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IEventMessageRequest instance
     */
    IEventMessageRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    ISingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(final String id);

    IMultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(final String id);

    IAttachmentCollectionRequestBuilder attachments();

    IAttachmentRequestBuilder attachments(final String id);

    IExtensionCollectionRequestBuilder extensions();

    IExtensionRequestBuilder extensions(final String id);

    /**
     * Gets the request builder for Event
     *
     * @return the IEventRequestBuilder instance
     */
    IEventRequestBuilder event();

}