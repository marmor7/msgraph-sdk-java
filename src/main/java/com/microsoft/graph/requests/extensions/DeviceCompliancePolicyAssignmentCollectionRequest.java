// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assignment Collection Request.
 */
public class DeviceCompliancePolicyAssignmentCollectionRequest extends BaseCollectionRequest<DeviceCompliancePolicyAssignmentCollectionResponse, IDeviceCompliancePolicyAssignmentCollectionPage> implements IDeviceCompliancePolicyAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignmentCollectionResponse.class, IDeviceCompliancePolicyAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IDeviceCompliancePolicyAssignmentCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceCompliancePolicyAssignmentCollectionPage get() throws ClientException {
        final DeviceCompliancePolicyAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment, final ICallback<DeviceCompliancePolicyAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceCompliancePolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceCompliancePolicyAssignment, callback);
    }

    public DeviceCompliancePolicyAssignment post(final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceCompliancePolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceCompliancePolicyAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceCompliancePolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceCompliancePolicyAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceCompliancePolicyAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceCompliancePolicyAssignmentCollectionRequest)this;
    }

    public IDeviceCompliancePolicyAssignmentCollectionPage buildFromResponse(final DeviceCompliancePolicyAssignmentCollectionResponse response) {
        final IDeviceCompliancePolicyAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceCompliancePolicyAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceCompliancePolicyAssignmentCollectionPage page = new DeviceCompliancePolicyAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
