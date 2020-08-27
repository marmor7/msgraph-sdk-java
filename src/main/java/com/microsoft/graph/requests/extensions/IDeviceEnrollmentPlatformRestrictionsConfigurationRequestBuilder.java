// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentPlatformRestrictionsConfigurationRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Enrollment Platform Restrictions Configuration Request Builder.
 */
public interface IDeviceEnrollmentPlatformRestrictionsConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceEnrollmentPlatformRestrictionsConfigurationRequest instance
     */
    IDeviceEnrollmentPlatformRestrictionsConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceEnrollmentPlatformRestrictionsConfigurationRequest instance
     */
    IDeviceEnrollmentPlatformRestrictionsConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


}
