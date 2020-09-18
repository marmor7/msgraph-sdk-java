// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.extensions.ManagedAppProtection;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.TargetedManagedAppPolicyAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection.
 */
public class TargetedManagedAppProtection extends ManagedAppProtection implements IJsonBackedObject {


    /**
     * The Is Assigned.
     * Indicates if the policy is deployed to any inclusion groups or not.
     */
    @SerializedName("isAssigned")
    @Expose
    public Boolean isAssigned;

    /**
     * The Assignments.
     * Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     */
    @SerializedName("assignments")
    @Expose
    public TargetedManagedAppPolicyAssignmentCollectionPage assignments;


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


        if (json.has("assignments")) {
            final TargetedManagedAppPolicyAssignmentCollectionResponse response = new TargetedManagedAppPolicyAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final TargetedManagedAppPolicyAssignment[] array = new TargetedManagedAppPolicyAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), TargetedManagedAppPolicyAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new TargetedManagedAppPolicyAssignmentCollectionPage(response, null);
        }
    }
}
