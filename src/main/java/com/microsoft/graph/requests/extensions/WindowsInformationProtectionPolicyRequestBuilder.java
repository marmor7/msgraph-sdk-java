// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Policy Request Builder.
 */
public class WindowsInformationProtectionPolicyRequestBuilder extends BaseRequestBuilder implements IWindowsInformationProtectionPolicyRequestBuilder {

    /**
     * The request builder for the WindowsInformationProtectionPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionPolicyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsInformationProtectionPolicyRequest instance
     */
    public IWindowsInformationProtectionPolicyRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsInformationProtectionPolicyRequest instance
     */
    public IWindowsInformationProtectionPolicyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WindowsInformationProtectionPolicyRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder protectedAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles"), getClient(), null);
    }

    public IWindowsInformationProtectionAppLockerFileRequestBuilder protectedAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("protectedAppLockerFiles") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionAppLockerFileCollectionRequestBuilder exemptAppLockerFiles() {
        return new WindowsInformationProtectionAppLockerFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles"), getClient(), null);
    }

    public IWindowsInformationProtectionAppLockerFileRequestBuilder exemptAppLockerFiles(final String id) {
        return new WindowsInformationProtectionAppLockerFileRequestBuilder(getRequestUrlWithAdditionalSegment("exemptAppLockerFiles") + "/" + id, getClient(), null);
    }
    public ITargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public ITargetedManagedAppPolicyAssignmentRequestBuilder assignments(final String id) {
        return new TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}
