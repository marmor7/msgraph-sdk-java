// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.SettingSource;
import com.microsoft.graph.models.ComplianceStatus;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Setting State.
 */
public class DeviceCompliancePolicySettingState implements IJsonBackedObject {

    /** the OData type of the object as returned by the service */
    @SerializedName("@odata.type")
    @Expose
    @Nullable
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    @Nonnull
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Current Value.
     * Current value of setting on device
     */
    @SerializedName(value = "currentValue", alternate = {"CurrentValue"})
    @Expose
	@Nullable
    public String currentValue;

    /**
     * The Error Code.
     * Error code for the setting
     */
    @SerializedName(value = "errorCode", alternate = {"ErrorCode"})
    @Expose
	@Nullable
    public Long errorCode;

    /**
     * The Error Description.
     * Error description
     */
    @SerializedName(value = "errorDescription", alternate = {"ErrorDescription"})
    @Expose
	@Nullable
    public String errorDescription;

    /**
     * The Instance Display Name.
     * Name of setting instance that is being reported.
     */
    @SerializedName(value = "instanceDisplayName", alternate = {"InstanceDisplayName"})
    @Expose
	@Nullable
    public String instanceDisplayName;

    /**
     * The Setting.
     * The setting that is being reported
     */
    @SerializedName(value = "setting", alternate = {"Setting"})
    @Expose
	@Nullable
    public String setting;

    /**
     * The Setting Name.
     * Localized/user friendly setting name that is being reported
     */
    @SerializedName(value = "settingName", alternate = {"SettingName"})
    @Expose
	@Nullable
    public String settingName;

    /**
     * The Sources.
     * Contributing policies
     */
    @SerializedName(value = "sources", alternate = {"Sources"})
    @Expose
	@Nullable
    public java.util.List<SettingSource> sources;

    /**
     * The State.
     * The compliance state of the setting. Possible values are: unknown, notApplicable, compliant, remediated, nonCompliant, error, conflict, notAssigned.
     */
    @SerializedName(value = "state", alternate = {"State"})
    @Expose
	@Nullable
    public ComplianceStatus state;

    /**
     * The User Email.
     * UserEmail
     */
    @SerializedName(value = "userEmail", alternate = {"UserEmail"})
    @Expose
	@Nullable
    public String userEmail;

    /**
     * The User Id.
     * UserId
     */
    @SerializedName(value = "userId", alternate = {"UserId"})
    @Expose
	@Nullable
    public String userId;

    /**
     * The User Name.
     * UserName
     */
    @SerializedName(value = "userName", alternate = {"UserName"})
    @Expose
	@Nullable
    public String userName;

    /**
     * The User Principal Name.
     * UserPrincipalName.
     */
    @SerializedName(value = "userPrincipalName", alternate = {"UserPrincipalName"})
    @Expose
	@Nullable
    public String userPrincipalName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}