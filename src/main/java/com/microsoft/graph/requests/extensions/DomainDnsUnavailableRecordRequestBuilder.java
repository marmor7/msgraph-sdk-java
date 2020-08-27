// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDomainDnsUnavailableRecordRequest;
import com.microsoft.graph.requests.extensions.DomainDnsUnavailableRecordRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Domain Dns Unavailable Record Request Builder.
 */
public class DomainDnsUnavailableRecordRequestBuilder extends BaseRequestBuilder implements IDomainDnsUnavailableRecordRequestBuilder {

    /**
     * The request builder for the DomainDnsUnavailableRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DomainDnsUnavailableRecordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDomainDnsUnavailableRecordRequest instance
     */
    public IDomainDnsUnavailableRecordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDomainDnsUnavailableRecordRequest instance
     */
    public IDomainDnsUnavailableRecordRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DomainDnsUnavailableRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

