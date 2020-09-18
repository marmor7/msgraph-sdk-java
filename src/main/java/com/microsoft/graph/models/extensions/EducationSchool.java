// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.PhysicalAddress;
import com.microsoft.graph.models.extensions.IdentitySet;
import com.microsoft.graph.models.extensions.EducationClass;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationOrganization;
import com.microsoft.graph.requests.extensions.EducationClassCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationUserCollectionResponse;
import com.microsoft.graph.requests.extensions.EducationUserCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School.
 */
public class EducationSchool extends EducationOrganization implements IJsonBackedObject {


    /**
     * The Address.
     * Address of the school.
     */
    @SerializedName("address")
    @Expose
    public PhysicalAddress address;

    /**
     * The Created By.
     * Entity who created the school.
     */
    @SerializedName("createdBy")
    @Expose
    public IdentitySet createdBy;

    /**
     * The External Id.
     * ID of school in syncing system.
     */
    @SerializedName("externalId")
    @Expose
    public String externalId;

    /**
     * The External Principal Id.
     * ID of principal in syncing system.
     */
    @SerializedName("externalPrincipalId")
    @Expose
    public String externalPrincipalId;

    /**
     * The Fax.
     * 
     */
    @SerializedName("fax")
    @Expose
    public String fax;

    /**
     * The Highest Grade.
     * Highest grade taught.
     */
    @SerializedName("highestGrade")
    @Expose
    public String highestGrade;

    /**
     * The Lowest Grade.
     * Lowest grade taught.
     */
    @SerializedName("lowestGrade")
    @Expose
    public String lowestGrade;

    /**
     * The Phone.
     * Phone number of school.
     */
    @SerializedName("phone")
    @Expose
    public String phone;

    /**
     * The Principal Email.
     * Email address of the principal.
     */
    @SerializedName("principalEmail")
    @Expose
    public String principalEmail;

    /**
     * The Principal Name.
     * Name of the principal.
     */
    @SerializedName("principalName")
    @Expose
    public String principalName;

    /**
     * The School Number.
     * School Number.
     */
    @SerializedName("schoolNumber")
    @Expose
    public String schoolNumber;

    /**
     * The Classes.
     * Classes taught at the school. Nullable.
     */
    public EducationClassCollectionPage classes;

    /**
     * The Users.
     * Users in the school. Nullable.
     */
    public EducationUserCollectionPage users;


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


        if (json.has("classes")) {
            final EducationClassCollectionResponse response = new EducationClassCollectionResponse();
            if (json.has("classes@odata.nextLink")) {
                response.nextLink = json.get("classes@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("classes").toString(), JsonObject[].class);
            final EducationClass[] array = new EducationClass[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationClass.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            classes = new EducationClassCollectionPage(response, null);
        }

        if (json.has("users")) {
            final EducationUserCollectionResponse response = new EducationUserCollectionResponse();
            if (json.has("users@odata.nextLink")) {
                response.nextLink = json.get("users@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("users").toString(), JsonObject[].class);
            final EducationUser[] array = new EducationUser[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), EducationUser.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            users = new EducationUserCollectionPage(response, null);
        }
    }
}
