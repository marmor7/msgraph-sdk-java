// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDomainDnsCnameRecordRequest;
import com.microsoft.graph.requests.extensions.DomainDnsCnameRecordRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Cname Record Request Builder.
 */
public class DomainDnsCnameRecordRequestBuilder extends BaseRequestBuilder implements IDomainDnsCnameRecordRequestBuilder {

    /**
     * The request builder for the DomainDnsCnameRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsCnameRecordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDomainDnsCnameRecordRequest instance
     */
    public IDomainDnsCnameRecordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDomainDnsCnameRecordRequest instance
     */
    public IDomainDnsCnameRecordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DomainDnsCnameRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

