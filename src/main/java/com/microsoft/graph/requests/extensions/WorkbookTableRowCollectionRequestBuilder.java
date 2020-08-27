// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Row Collection Request Builder.
 */
public class WorkbookTableRowCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookTableRowCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookTable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRowCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookTableRowCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookTableRowCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookTableRowCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookTableRowRequestBuilder byId(final String id) {
        return new WorkbookTableRowRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IWorkbookTableRowAddRequestBuilder add(final Integer index, final com.google.gson.JsonElement values) {
        return new WorkbookTableRowAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, index, values);
    }

    public IWorkbookTableRowItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookTableRowItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookTableRowCountRequestBuilder count() {
        return new WorkbookTableRowCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
