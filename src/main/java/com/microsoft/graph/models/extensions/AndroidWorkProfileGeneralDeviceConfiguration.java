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
import com.microsoft.graph.models.generated.AndroidWorkProfileRequiredPasswordType;
import com.microsoft.graph.models.generated.AndroidWorkProfileCrossProfileDataSharingType;
import com.microsoft.graph.models.generated.AndroidWorkProfileDefaultAppPermissionPolicyType;
import com.microsoft.graph.models.extensions.DeviceConfiguration;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile General Device Configuration.
 */
public class AndroidWorkProfileGeneralDeviceConfiguration extends DeviceConfiguration implements IJsonBackedObject {


    /**
     * The Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock.
     */
    @SerializedName("passwordBlockFingerprintUnlock")
    @Expose
    public Boolean passwordBlockFingerprintUnlock;

    /**
     * The Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents.
     */
    @SerializedName("passwordBlockTrustAgents")
    @Expose
    public Boolean passwordBlockTrustAgents;

    /**
     * The Password Expiration Days.
     * Number of days before the password expires. Valid values 1 to 365
     */
    @SerializedName("passwordExpirationDays")
    @Expose
    public Integer passwordExpirationDays;

    /**
     * The Password Minimum Length.
     * Minimum length of passwords. Valid values 4 to 16
     */
    @SerializedName("passwordMinimumLength")
    @Expose
    public Integer passwordMinimumLength;

    /**
     * The Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("passwordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer passwordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Password Previous Password Block Count.
     * Number of previous passwords to block. Valid values 0 to 24
     */
    @SerializedName("passwordPreviousPasswordBlockCount")
    @Expose
    public Integer passwordPreviousPasswordBlockCount;

    /**
     * The Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before factory reset. Valid values 1 to 16
     */
    @SerializedName("passwordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer passwordSignInFailureCountBeforeFactoryReset;

    /**
     * The Password Required Type.
     * Type of password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
     */
    @SerializedName("passwordRequiredType")
    @Expose
    public AndroidWorkProfileRequiredPasswordType passwordRequiredType;

    /**
     * The Work Profile Data Sharing Type.
     * Type of data sharing that is allowed. Possible values are: deviceDefault, preventAny, allowPersonalToWork, noRestrictions.
     */
    @SerializedName("workProfileDataSharingType")
    @Expose
    public AndroidWorkProfileCrossProfileDataSharingType workProfileDataSharingType;

    /**
     * The Work Profile Block Notifications While Device Locked.
     * Indicates whether or not to block notifications while device locked.
     */
    @SerializedName("workProfileBlockNotificationsWhileDeviceLocked")
    @Expose
    public Boolean workProfileBlockNotificationsWhileDeviceLocked;

    /**
     * The Work Profile Block Adding Accounts.
     * Block users from adding/removing accounts in work profile.
     */
    @SerializedName("workProfileBlockAddingAccounts")
    @Expose
    public Boolean workProfileBlockAddingAccounts;

    /**
     * The Work Profile Bluetooth Enable Contact Sharing.
     * Allow bluetooth devices to access enterprise contacts.
     */
    @SerializedName("workProfileBluetoothEnableContactSharing")
    @Expose
    public Boolean workProfileBluetoothEnableContactSharing;

    /**
     * The Work Profile Block Screen Capture.
     * Block screen capture in work profile.
     */
    @SerializedName("workProfileBlockScreenCapture")
    @Expose
    public Boolean workProfileBlockScreenCapture;

    /**
     * The Work Profile Block Cross Profile Caller Id.
     * Block display work profile caller ID in personal profile.
     */
    @SerializedName("workProfileBlockCrossProfileCallerId")
    @Expose
    public Boolean workProfileBlockCrossProfileCallerId;

    /**
     * The Work Profile Block Camera.
     * Block work profile camera.
     */
    @SerializedName("workProfileBlockCamera")
    @Expose
    public Boolean workProfileBlockCamera;

    /**
     * The Work Profile Block Cross Profile Contacts Search.
     * Block work profile contacts availability in personal profile.
     */
    @SerializedName("workProfileBlockCrossProfileContactsSearch")
    @Expose
    public Boolean workProfileBlockCrossProfileContactsSearch;

    /**
     * The Work Profile Block Cross Profile Copy Paste.
     * Boolean that indicates if the setting disallow cross profile copy/paste is enabled.
     */
    @SerializedName("workProfileBlockCrossProfileCopyPaste")
    @Expose
    public Boolean workProfileBlockCrossProfileCopyPaste;

    /**
     * The Work Profile Default App Permission Policy.
     * Type of password that is required. Possible values are: deviceDefault, prompt, autoGrant, autoDeny.
     */
    @SerializedName("workProfileDefaultAppPermissionPolicy")
    @Expose
    public AndroidWorkProfileDefaultAppPermissionPolicyType workProfileDefaultAppPermissionPolicy;

    /**
     * The Work Profile Password Block Fingerprint Unlock.
     * Indicates whether or not to block fingerprint unlock for work profile.
     */
    @SerializedName("workProfilePasswordBlockFingerprintUnlock")
    @Expose
    public Boolean workProfilePasswordBlockFingerprintUnlock;

    /**
     * The Work Profile Password Block Trust Agents.
     * Indicates whether or not to block Smart Lock and other trust agents for work profile.
     */
    @SerializedName("workProfilePasswordBlockTrustAgents")
    @Expose
    public Boolean workProfilePasswordBlockTrustAgents;

    /**
     * The Work Profile Password Expiration Days.
     * Number of days before the work profile password expires. Valid values 1 to 365
     */
    @SerializedName("workProfilePasswordExpirationDays")
    @Expose
    public Integer workProfilePasswordExpirationDays;

    /**
     * The Work Profile Password Minimum Length.
     * Minimum length of work profile password. Valid values 4 to 16
     */
    @SerializedName("workProfilePasswordMinimumLength")
    @Expose
    public Integer workProfilePasswordMinimumLength;

    /**
     * The Work Profile Password Min Numeric Characters.
     * Minimum # of numeric characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinNumericCharacters")
    @Expose
    public Integer workProfilePasswordMinNumericCharacters;

    /**
     * The Work Profile Password Min Non Letter Characters.
     * Minimum # of non-letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinNonLetterCharacters")
    @Expose
    public Integer workProfilePasswordMinNonLetterCharacters;

    /**
     * The Work Profile Password Min Letter Characters.
     * Minimum # of letter characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinLetterCharacters")
    @Expose
    public Integer workProfilePasswordMinLetterCharacters;

    /**
     * The Work Profile Password Min Lower Case Characters.
     * Minimum # of lower-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinLowerCaseCharacters")
    @Expose
    public Integer workProfilePasswordMinLowerCaseCharacters;

    /**
     * The Work Profile Password Min Upper Case Characters.
     * Minimum # of upper-case characters required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinUpperCaseCharacters")
    @Expose
    public Integer workProfilePasswordMinUpperCaseCharacters;

    /**
     * The Work Profile Password Min Symbol Characters.
     * Minimum # of symbols required in work profile password. Valid values 1 to 10
     */
    @SerializedName("workProfilePasswordMinSymbolCharacters")
    @Expose
    public Integer workProfilePasswordMinSymbolCharacters;

    /**
     * The Work Profile Password Minutes Of Inactivity Before Screen Timeout.
     * Minutes of inactivity before the screen times out.
     */
    @SerializedName("workProfilePasswordMinutesOfInactivityBeforeScreenTimeout")
    @Expose
    public Integer workProfilePasswordMinutesOfInactivityBeforeScreenTimeout;

    /**
     * The Work Profile Password Previous Password Block Count.
     * Number of previous work profile passwords to block. Valid values 0 to 24
     */
    @SerializedName("workProfilePasswordPreviousPasswordBlockCount")
    @Expose
    public Integer workProfilePasswordPreviousPasswordBlockCount;

    /**
     * The Work Profile Password Sign In Failure Count Before Factory Reset.
     * Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16
     */
    @SerializedName("workProfilePasswordSignInFailureCountBeforeFactoryReset")
    @Expose
    public Integer workProfilePasswordSignInFailureCountBeforeFactoryReset;

    /**
     * The Work Profile Password Required Type.
     * Type of work profile password that is required. Possible values are: deviceDefault, lowSecurityBiometric, required, atLeastNumeric, numericComplex, atLeastAlphabetic, atLeastAlphanumeric, alphanumericWithSymbols.
     */
    @SerializedName("workProfilePasswordRequiredType")
    @Expose
    public AndroidWorkProfileRequiredPasswordType workProfilePasswordRequiredType;

    /**
     * The Work Profile Require Password.
     * Password is required or not for work profile
     */
    @SerializedName("workProfileRequirePassword")
    @Expose
    public Boolean workProfileRequirePassword;

    /**
     * The Security Require Verify Apps.
     * Require the Android Verify apps feature is turned on.
     */
    @SerializedName("securityRequireVerifyApps")
    @Expose
    public Boolean securityRequireVerifyApps;


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
