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
import com.microsoft.graph.models.PhysicalAddress;
import com.microsoft.graph.models.BookingWorkHours;
import com.microsoft.graph.models.BookingSchedulingPolicy;
import com.microsoft.graph.models.BookingAppointment;
import com.microsoft.graph.models.BookingCustomerBase;
import com.microsoft.graph.models.BookingCustomQuestion;
import com.microsoft.graph.models.BookingService;
import com.microsoft.graph.models.BookingStaffMemberBase;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.BookingAppointmentCollectionPage;
import com.microsoft.graph.requests.BookingCustomerBaseCollectionPage;
import com.microsoft.graph.requests.BookingCustomQuestionCollectionPage;
import com.microsoft.graph.requests.BookingServiceCollectionPage;
import com.microsoft.graph.requests.BookingStaffMemberBaseCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Business.
 */
public class BookingBusiness extends Entity implements IJsonBackedObject {


    /**
     * The Address.
     * The street address of the business. The address property, together with phone and webSiteUrl, appear in the footer of a business scheduling page. The attribute type of physicalAddress is not supported in v1.0. Internally we map the addresses to the type others.
     */
    @SerializedName(value = "address", alternate = {"Address"})
    @Expose
	@Nullable
    public PhysicalAddress address;

    /**
     * The Business Hours.
     * The hours of operation for the business.
     */
    @SerializedName(value = "businessHours", alternate = {"BusinessHours"})
    @Expose
	@Nullable
    public java.util.List<BookingWorkHours> businessHours;

    /**
     * The Business Type.
     * The type of business.
     */
    @SerializedName(value = "businessType", alternate = {"BusinessType"})
    @Expose
	@Nullable
    public String businessType;

    /**
     * The Default Currency Iso.
     * The code for the currency that the business operates in on Microsoft Bookings.
     */
    @SerializedName(value = "defaultCurrencyIso", alternate = {"DefaultCurrencyIso"})
    @Expose
	@Nullable
    public String defaultCurrencyIso;

    /**
     * The Display Name.
     * The display name is suitable for human-readable interfaces.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Email.
     * The email address for the business.
     */
    @SerializedName(value = "email", alternate = {"Email"})
    @Expose
	@Nullable
    public String email;

    /**
     * The Is Published.
     * The scheduling page has been made available to external customers. Use the publish and unpublish actions to set this property. Read-only.
     */
    @SerializedName(value = "isPublished", alternate = {"IsPublished"})
    @Expose
	@Nullable
    public Boolean isPublished;

    /**
     * The Phone.
     * The telephone number for the business. The phone property, together with address and webSiteUrl, appear in the footer of a business scheduling page.
     */
    @SerializedName(value = "phone", alternate = {"Phone"})
    @Expose
	@Nullable
    public String phone;

    /**
     * The Public Url.
     * The URL for the scheduling page, which is set after you publish or unpublish the page. Read-only.
     */
    @SerializedName(value = "publicUrl", alternate = {"PublicUrl"})
    @Expose
	@Nullable
    public String publicUrl;

    /**
     * The Scheduling Policy.
     * Specifies how bookings can be created for this business.
     */
    @SerializedName(value = "schedulingPolicy", alternate = {"SchedulingPolicy"})
    @Expose
	@Nullable
    public BookingSchedulingPolicy schedulingPolicy;

    /**
     * The Web Site Url.
     * Example: https://www.contoso.com
     */
    @SerializedName(value = "webSiteUrl", alternate = {"WebSiteUrl"})
    @Expose
	@Nullable
    public String webSiteUrl;

    /**
     * The Appointments.
     * All the appointments of this business. Read-only. Nullable.
     */
    @SerializedName(value = "appointments", alternate = {"Appointments"})
    @Expose
	@Nullable
    public BookingAppointmentCollectionPage appointments;

    /**
     * The Calendar View.
     * The set of appointments of this business in a specified date range. Read-only. Nullable.
     */
    @SerializedName(value = "calendarView", alternate = {"CalendarView"})
    @Expose
	@Nullable
    public BookingAppointmentCollectionPage calendarView;

    /**
     * The Customers.
     * All the customers of this business. Read-only. Nullable.
     */
    @SerializedName(value = "customers", alternate = {"Customers"})
    @Expose
	@Nullable
    public BookingCustomerBaseCollectionPage customers;

    /**
     * The Custom Questions.
     * All the custom questions of this business. Read-only. Nullable.
     */
    @SerializedName(value = "customQuestions", alternate = {"CustomQuestions"})
    @Expose
	@Nullable
    public BookingCustomQuestionCollectionPage customQuestions;

    /**
     * The Services.
     * All the services offered by this business. Read-only. Nullable.
     */
    @SerializedName(value = "services", alternate = {"Services"})
    @Expose
	@Nullable
    public BookingServiceCollectionPage services;

    /**
     * The Staff Members.
     * All the staff members that provide services in this business. Read-only. Nullable.
     */
    @SerializedName(value = "staffMembers", alternate = {"StaffMembers"})
    @Expose
	@Nullable
    public BookingStaffMemberBaseCollectionPage staffMembers;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("appointments")) {
            appointments = serializer.deserializeObject(json.get("appointments"), BookingAppointmentCollectionPage.class);
        }

        if (json.has("calendarView")) {
            calendarView = serializer.deserializeObject(json.get("calendarView"), BookingAppointmentCollectionPage.class);
        }

        if (json.has("customers")) {
            customers = serializer.deserializeObject(json.get("customers"), BookingCustomerBaseCollectionPage.class);
        }

        if (json.has("customQuestions")) {
            customQuestions = serializer.deserializeObject(json.get("customQuestions"), BookingCustomQuestionCollectionPage.class);
        }

        if (json.has("services")) {
            services = serializer.deserializeObject(json.get("services"), BookingServiceCollectionPage.class);
        }

        if (json.has("staffMembers")) {
            staffMembers = serializer.deserializeObject(json.get("staffMembers"), BookingStaffMemberBaseCollectionPage.class);
        }
    }
}