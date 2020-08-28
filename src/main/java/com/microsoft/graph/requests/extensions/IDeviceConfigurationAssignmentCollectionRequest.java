// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration Assignment Collection Request.
 */
public interface IDeviceConfigurationAssignmentCollectionRequest {

    void get(final ICallback<IDeviceConfigurationAssignmentCollectionPage> callback);

    IDeviceConfigurationAssignmentCollectionPage get() throws ClientException;

    void post(final DeviceConfigurationAssignment newDeviceConfigurationAssignment, final ICallback<DeviceConfigurationAssignment> callback);

    DeviceConfigurationAssignment post(final DeviceConfigurationAssignment newDeviceConfigurationAssignment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceConfigurationAssignmentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceConfigurationAssignmentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceConfigurationAssignmentCollectionRequest top(final int value);

}
