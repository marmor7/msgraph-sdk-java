// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base User Change Password Request Builder.
 */
public class BaseUserChangePasswordRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this UserChangePassword
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param currentPassword The currentPassword
     * @param newPassword The newPassword
     */
    public BaseUserChangePasswordRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String currentPassword, final String newPassword) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("currentPassword", currentPassword);
        bodyParams.put("newPassword", newPassword);
    }

    /**
     * Creates the IUserChangePasswordRequest
     *
     * @return The IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserChangePasswordRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IUserChangePasswordRequest instance
     */
    public IUserChangePasswordRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        UserChangePasswordRequest request = new UserChangePasswordRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("currentPassword")) {
            request.body.currentPassword = getParameter("currentPassword");
        }

        if (hasParameter("newPassword")) {
            request.body.newPassword = getParameter("newPassword");
        }

        return request;
    }
}
