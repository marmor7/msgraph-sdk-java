// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDevice;
import com.microsoft.graph.models.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyStateRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationStateRequestBuilder;
import com.microsoft.graph.requests.DeviceCategoryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceCleanWindowsDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceDeleteUserFromSharedAppleDeviceParameterSet;
import com.microsoft.graph.models.ManagedDeviceUpdateWindowsDeviceAccountParameterSet;
import com.microsoft.graph.models.ManagedDeviceWindowsDefenderScanParameterSet;
import com.microsoft.graph.models.ManagedDeviceWipeParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Request Builder.
 */
public class ManagedDeviceRequestBuilder extends BaseRequestBuilder<ManagedDevice> {

    /**
     * The request builder for the ManagedDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceRequest instance
     */
    @Nonnull
    public ManagedDeviceRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedDeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceCompliancePolicyState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceCompliancePolicyStateCollectionRequestBuilder deviceCompliancePolicyStates() {
        return new DeviceCompliancePolicyStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceCompliancePolicyState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceCompliancePolicyStateRequestBuilder deviceCompliancePolicyStates(@Nonnull final String id) {
        return new DeviceCompliancePolicyStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyStates") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public DeviceConfigurationStateCollectionRequestBuilder deviceConfigurationStates() {
        return new DeviceConfigurationStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public DeviceConfigurationStateRequestBuilder deviceConfigurationStates(@Nonnull final String id) {
        return new DeviceConfigurationStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCategory
     *
     * @return the DeviceCategoryRequestBuilder instance
     */
    @Nonnull
    public DeviceCategoryRequestBuilder deviceCategory() {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategory"), getClient(), null);
    }

    /**
     * Bypass activation lock
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceBypassActivationLockRequestBuilder bypassActivationLock() {
        return new ManagedDeviceBypassActivationLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.bypassActivationLock"), getClient(), null);
    }

    /**
     * Clean Windows device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceCleanWindowsDeviceRequestBuilder cleanWindowsDevice(@Nonnull final ManagedDeviceCleanWindowsDeviceParameterSet parameters) {
        return new ManagedDeviceCleanWindowsDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cleanWindowsDevice"), getClient(), null, parameters);
    }

    /**
     * Delete user from shared Apple device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder deleteUserFromSharedAppleDevice(@Nonnull final ManagedDeviceDeleteUserFromSharedAppleDeviceParameterSet parameters) {
        return new ManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.deleteUserFromSharedAppleDevice"), getClient(), null, parameters);
    }

    /**
     * Disable lost mode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceDisableLostModeRequestBuilder disableLostMode() {
        return new ManagedDeviceDisableLostModeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.disableLostMode"), getClient(), null);
    }

    /**
     * Locate a device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceLocateDeviceRequestBuilder locateDevice() {
        return new ManagedDeviceLocateDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.locateDevice"), getClient(), null);
    }

    /**
     * Logout shared Apple device active user
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder logoutSharedAppleDeviceActiveUser() {
        return new ManagedDeviceLogoutSharedAppleDeviceActiveUserRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.logoutSharedAppleDeviceActiveUser"), getClient(), null);
    }

    /**
     * Reboot device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRebootNowRequestBuilder rebootNow() {
        return new ManagedDeviceRebootNowRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.rebootNow"), getClient(), null);
    }

    /**
     * Recover passcode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRecoverPasscodeRequestBuilder recoverPasscode() {
        return new ManagedDeviceRecoverPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recoverPasscode"), getClient(), null);
    }

    /**
     * Remote lock
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRemoteLockRequestBuilder remoteLock() {
        return new ManagedDeviceRemoteLockRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remoteLock"), getClient(), null);
    }

    /**
     * Request remote assistance
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRequestRemoteAssistanceRequestBuilder requestRemoteAssistance() {
        return new ManagedDeviceRequestRemoteAssistanceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.requestRemoteAssistance"), getClient(), null);
    }

    /**
     * Reset passcode
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceResetPasscodeRequestBuilder resetPasscode() {
        return new ManagedDeviceResetPasscodeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetPasscode"), getClient(), null);
    }

    /**
     * Retire a device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceRetireRequestBuilder retire() {
        return new ManagedDeviceRetireRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.retire"), getClient(), null);
    }

    /**
     * Shut down device
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceShutDownRequestBuilder shutDown() {
        return new ManagedDeviceShutDownRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.shutDown"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceSyncDeviceRequestBuilder syncDevice() {
        return new ManagedDeviceSyncDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.syncDevice"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder updateWindowsDeviceAccount(@Nonnull final ManagedDeviceUpdateWindowsDeviceAccountParameterSet parameters) {
        return new ManagedDeviceUpdateWindowsDeviceAccountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateWindowsDeviceAccount"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderScanRequestBuilder windowsDefenderScan(@Nonnull final ManagedDeviceWindowsDefenderScanParameterSet parameters) {
        return new ManagedDeviceWindowsDefenderScanRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderScan"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder windowsDefenderUpdateSignatures() {
        return new ManagedDeviceWindowsDefenderUpdateSignaturesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.windowsDefenderUpdateSignatures"), getClient(), null);
    }

    /**
     * Wipe a device
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceWipeRequestBuilder wipe(@Nonnull final ManagedDeviceWipeParameterSet parameters) {
        return new ManagedDeviceWipeRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.wipe"), getClient(), null, parameters);
    }
}
