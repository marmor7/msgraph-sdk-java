// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IFileAttachmentRequest;
import com.microsoft.graph.requests.extensions.FileAttachmentRequest;
import com.microsoft.graph.requests.extensions.IFileAttachmentStreamRequestBuilder;
import com.microsoft.graph.requests.extensions.FileAttachmentStreamRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Attachment Request Builder.
 */
public class FileAttachmentRequestBuilder extends BaseRequestBuilder implements IFileAttachmentRequestBuilder {

    /**
     * The request builder for the FileAttachment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileAttachmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IFileAttachmentRequest instance
     */
    public IFileAttachmentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IFileAttachmentRequest instance
     */
    public IFileAttachmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new FileAttachmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IFileAttachmentStreamRequestBuilder content() {
        return new FileAttachmentStreamRequestBuilder(getRequestUrlWithAdditionalSegment("$value"), getClient(), null);
    }
}

