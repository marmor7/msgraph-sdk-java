// Template Source: BaseMethodBody.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Verify Windows Enrollment Auto Discovery Body.
 */
public class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody {
    /**
     * The domain Name.
     * 
     */
    @SerializedName(value = "domainName", alternate = {"DomainName"})
    @Expose
	@Nullable
    public String domainName;


    /**
     * Instiaciates a new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody
     */
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody() {}
    private DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody(@Nonnull final DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder builder) {
        this.domainName = builder.domainName;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder newBuilder() {
        return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder();
    }
    /**
     * Fluent builder for the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody
     */
    public static final class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder {
        private String domainName;
        /**
         * Sets the name DomainName
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder withDomainName(@Nullable final String val) {
            this.domainName = val;
            return this;
        }
        private DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBodyBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody build() {
            return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryBody(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.domainName != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("domainName", domainName));
        }
        return result;
    }
    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
