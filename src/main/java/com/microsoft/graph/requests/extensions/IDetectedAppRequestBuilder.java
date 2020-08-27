// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDetectedAppRequest;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceWithReferenceRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Detected App Request Builder.
 */
public interface IDetectedAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDetectedAppRequest instance
     */
    IDetectedAppRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDetectedAppRequest instance
     */
    IDetectedAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IManagedDeviceCollectionWithReferencesRequestBuilder managedDevices();

    IManagedDeviceWithReferenceRequestBuilder managedDevices(final String id);

}
