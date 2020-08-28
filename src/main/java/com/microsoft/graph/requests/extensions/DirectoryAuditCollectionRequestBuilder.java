// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuditLogRoot;
import com.microsoft.graph.models.extensions.DirectoryAudit;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryAuditCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Audit Collection Request Builder.
 */
public class DirectoryAuditCollectionRequestBuilder extends BaseRequestBuilder implements IDirectoryAuditCollectionRequestBuilder {

    /**
     * The request builder for this collection of AuditLogRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryAuditCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDirectoryAuditCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryAuditCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DirectoryAuditCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDirectoryAuditRequestBuilder byId(final String id) {
        return new DirectoryAuditRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
