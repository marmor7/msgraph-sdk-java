// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.BookingType;
import com.microsoft.graph.models.extensions.Place;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room.
 */
public class Room extends Place implements IJsonBackedObject {


    /**
     * The Email Address.
     * Email address of the room.
     */
    @SerializedName("emailAddress")
    @Expose
    public String emailAddress;

    /**
     * The Nickname.
     * Specifies a nickname for the room, for example, 'conf room'.
     */
    @SerializedName("nickname")
    @Expose
    public String nickname;

    /**
     * The Building.
     * Specifies the building name or building number that the room is in.
     */
    @SerializedName("building")
    @Expose
    public String building;

    /**
     * The Floor Number.
     * Specifies the floor number that the room is on.
     */
    @SerializedName("floorNumber")
    @Expose
    public Integer floorNumber;

    /**
     * The Label.
     * Specifies a descriptive label for the room, for example, a number or name.
     */
    @SerializedName("label")
    @Expose
    public String label;

    /**
     * The Capacity.
     * Specifies the capacity of the room.
     */
    @SerializedName("capacity")
    @Expose
    public Integer capacity;

    /**
     * The Booking Type.
     * Type of room. Possible values are standard, and reserved.
     */
    @SerializedName("bookingType")
    @Expose
    public BookingType bookingType;

    /**
     * The Audio Device Name.
     * Specifies the name of the audio device in the room.
     */
    @SerializedName("audioDeviceName")
    @Expose
    public String audioDeviceName;

    /**
     * The Video Device Name.
     * Specifies the name of the video device in the room.
     */
    @SerializedName("videoDeviceName")
    @Expose
    public String videoDeviceName;

    /**
     * The Display Device Name.
     * Specifies the name of the display device in the room.
     */
    @SerializedName("displayDeviceName")
    @Expose
    public String displayDeviceName;

    /**
     * The Is Wheel Chair Accessible.
     * 
     */
    @SerializedName("isWheelChairAccessible")
    @Expose
    public Boolean isWheelChairAccessible;

    /**
     * The Tags.
     * Specifies additional features of the room, for example, details like the type of view or furniture type.
     */
    @SerializedName("tags")
    @Expose
    public java.util.List<String> tags;

    /**
     * The Floor Label.
     * Specifies a descriptive label for the floor, for example, P.
     */
    @SerializedName("floorLabel")
    @Expose
    public String floorLabel;


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
