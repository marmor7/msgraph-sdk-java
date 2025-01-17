// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Plan Info.
 */
public class ServicePlanInfo implements IJsonBackedObject {

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
     * The Applies To.
     * The object the service plan can be assigned to. Possible values:'User' - service plan can be assigned to individual users.'Company' - service plan can be assigned to the entire tenant.
     */
    @SerializedName(value = "appliesTo", alternate = {"AppliesTo"})
    @Expose
	@Nullable
    public String appliesTo;

    /**
     * The Provisioning Status.
     * The provisioning status of the service plan. Possible values:'Success' - Service is fully provisioned.'Disabled' - Service has been disabled.'PendingInput' - Service is not yet provisioned; awaiting service confirmation.'PendingActivation' - Service is provisioned but requires explicit activation by administrator (for example, Intune_O365 service plan).'PendingProvisioning' - Microsoft has added a new service to the product SKU and it has not been activated in the tenant, yet.
     */
    @SerializedName(value = "provisioningStatus", alternate = {"ProvisioningStatus"})
    @Expose
	@Nullable
    public String provisioningStatus;

    /**
     * The Service Plan Id.
     * The unique identifier of the service plan.
     */
    @SerializedName(value = "servicePlanId", alternate = {"ServicePlanId"})
    @Expose
	@Nullable
    public java.util.UUID servicePlanId;

    /**
     * The Service Plan Name.
     * The name of the service plan.
     */
    @SerializedName(value = "servicePlanName", alternate = {"ServicePlanName"})
    @Expose
	@Nullable
    public String servicePlanName;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
