// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.GroupType;
import com.microsoft.graph.models.extensions.ModifiedProperty;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Target Resource.
 */
public class TargetResource implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Id.
     * Indicates the unique ID of the resource.
     */
    @SerializedName("id")
    @Expose
    public String id;

    /**
     * The Display Name.
     * Indicates the visible name defined for the resource. Typically specified when the resource is created.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Type.
     * Describes the resource type.  Example values include Application, Group, ServicePrincipal, and User.
     */
    @SerializedName("type")
    @Expose
    public String type;

    /**
     * The User Principal Name.
     * When type is set to User, this includes the user name that initiated the action; null for other types.
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Group Type.
     * When type is set to Group, this indicates the group type.
     */
    @SerializedName("groupType")
    @Expose
    public GroupType groupType;

    /**
     * The Modified Properties.
     * Indicates name, old value and new value of each attribute that changed. Property values depend on the operation type.
     */
    @SerializedName("modifiedProperties")
    @Expose
    public java.util.List<ModifiedProperty> modifiedProperties;


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
