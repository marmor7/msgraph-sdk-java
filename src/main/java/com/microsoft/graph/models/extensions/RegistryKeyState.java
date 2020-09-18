// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.RegistryHive;
import com.microsoft.graph.models.generated.RegistryOperation;
import com.microsoft.graph.models.generated.RegistryValueType;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Registry Key State.
 */
public class RegistryKeyState implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Hive.
     * A Windows registry hive : HKEY_CURRENT_CONFIG HKEY_CURRENT_USER HKEY_LOCAL_MACHINE/SAM HKEY_LOCAL_MACHINE/Security HKEY_LOCAL_MACHINE/Software HKEY_LOCAL_MACHINE/System HKEY_USERS/.Default. Possible values are: unknown, currentConfig, currentUser, localMachineSam, localMachineSecurity, localMachineSoftware, localMachineSystem, usersDefault.
     */
    @SerializedName("hive")
    @Expose
    public RegistryHive hive;

    /**
     * The Key.
     * Current (i.e. changed) registry key (excludes HIVE).
     */
    @SerializedName("key")
    @Expose
    public String key;

    /**
     * The Old Key.
     * Previous (i.e. before changed) registry key (excludes HIVE).
     */
    @SerializedName("oldKey")
    @Expose
    public String oldKey;

    /**
     * The Old Value Data.
     * Previous (i.e. before changed) registry key value data (contents).
     */
    @SerializedName("oldValueData")
    @Expose
    public String oldValueData;

    /**
     * The Old Value Name.
     * Previous (i.e. before changed) registry key value name.
     */
    @SerializedName("oldValueName")
    @Expose
    public String oldValueName;

    /**
     * The Operation.
     * Operation that changed the registry key name and/or value. Possible values are: unknown, create, modify, delete.
     */
    @SerializedName("operation")
    @Expose
    public RegistryOperation operation;

    /**
     * The Process Id.
     * Process ID (PID) of the process that modified the registry key (process details will appear in the alert 'processes' collection).
     */
    @SerializedName("processId")
    @Expose
    public Integer processId;

    /**
     * The Value Data.
     * Current (i.e. changed) registry key value data (contents).
     */
    @SerializedName("valueData")
    @Expose
    public String valueData;

    /**
     * The Value Name.
     * Current (i.e. changed) registry key value name
     */
    @SerializedName("valueName")
    @Expose
    public String valueName;

    /**
     * The Value Type.
     * Registry key value type REG_BINARY REG_DWORD REG_DWORD_LITTLE_ENDIAN REG_DWORD_BIG_ENDIANREG_EXPAND_SZ REG_LINK REG_MULTI_SZ REG_NONE REG_QWORD REG_QWORD_LITTLE_ENDIAN REG_SZ Possible values are: unknown, binary, dword, dwordLittleEndian, dwordBigEndian, expandSz, link, multiSz, none, qword, qwordlittleEndian, sz.
     */
    @SerializedName("valueType")
    @Expose
    public RegistryValueType valueType;


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
