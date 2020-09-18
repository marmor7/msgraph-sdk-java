// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.ComplianceStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Setting State.
 */
public class DeviceComplianceSettingState extends Entity implements IJsonBackedObject {


    /**
     * The Compliance Grace Period Expiration Date Time.
     * The DateTime when device compliance grace period expires
     */
    @SerializedName("complianceGracePeriodExpirationDateTime")
    @Expose
    public java.util.Calendar complianceGracePeriodExpirationDateTime;

    /**
     * The Device Id.
     * The Device Id that is being reported
     */
    @SerializedName("deviceId")
    @Expose
    public String deviceId;

    /**
     * The Device Model.
     * The device model that is being reported
     */
    @SerializedName("deviceModel")
    @Expose
    public String deviceModel;

    /**
     * The Device Name.
     * The Device Name that is being reported
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The Setting.
     * The setting class name and property name.
     */
    @SerializedName("setting")
    @Expose
    public String setting;

    /**
     * The Setting Name.
     * The Setting Name that is being reported
     */
    @SerializedName("settingName")
    @Expose
    public String settingName;

    /**
     * The State.
     * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName("state")
    @Expose
    public ComplianceStatus state;

    /**
     * The User Email.
     * The User email address that is being reported
     */
    @SerializedName("userEmail")
    @Expose
    public String userEmail;

    /**
     * The User Id.
     * The user Id that is being reported
     */
    @SerializedName("userId")
    @Expose
    public String userId;

    /**
     * The User Name.
     * The User Name that is being reported
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The User Principal Name.
     * The User PrincipalName that is being reported
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


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
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
