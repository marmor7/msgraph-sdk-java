// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.GroupAssignLicenseRequest;
import com.microsoft.graph.models.AssignedLicense;
import com.microsoft.graph.models.Group;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.GroupAssignLicenseParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Assign License Request Builder.
 */
public class GroupAssignLicenseRequestBuilder extends BaseActionRequestBuilder<Group> {

    private GroupAssignLicenseParameterSet body;
    /**
     * The request builder for this GroupAssignLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public GroupAssignLicenseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final GroupAssignLicenseParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the GroupAssignLicenseRequest
     *
     * @param requestOptions the options for the request
     * @return the GroupAssignLicenseRequest instance
     */
    @Nonnull
    public GroupAssignLicenseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the GroupAssignLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the GroupAssignLicenseRequest instance
     */
    @Nonnull
    public GroupAssignLicenseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final GroupAssignLicenseRequest request = new GroupAssignLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
