// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupValidatePropertiesRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Validate Properties Request Builder.
 */
public interface IGroupValidatePropertiesRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupValidatePropertiesRequest
     *
     * @return the IGroupValidatePropertiesRequest instance
     */
    IGroupValidatePropertiesRequest buildRequest();

    /**
     * Creates the IGroupValidatePropertiesRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupValidatePropertiesRequest instance
     */
    IGroupValidatePropertiesRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}