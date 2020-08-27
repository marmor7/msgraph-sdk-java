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
import com.microsoft.graph.models.extensions.WorkbookRangeView;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionResponse;
import com.microsoft.graph.requests.extensions.WorkbookRangeViewCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range View.
 */
public class WorkbookRangeView extends Entity implements IJsonBackedObject {


    /**
     * The Cell Addresses.
     * Represents the cell addresses
     */
    @SerializedName("cellAddresses")
    @Expose
    public com.google.gson.JsonElement cellAddresses;

    /**
     * The Column Count.
     * Returns the number of visible columns. Read-only.
     */
    @SerializedName("columnCount")
    @Expose
    public Integer columnCount;

    /**
     * The Formulas.
     * Represents the formula in A1-style notation.
     */
    @SerializedName("formulas")
    @Expose
    public com.google.gson.JsonElement formulas;

    /**
     * The Formulas Local.
     * Represents the formula in A1-style notation, in the user's language and number-formatting locale. For example, the English '=SUM(A1, 1.5)' formula would become '=SUMME(A1; 1,5)' in German.
     */
    @SerializedName("formulasLocal")
    @Expose
    public com.google.gson.JsonElement formulasLocal;

    /**
     * The Formulas R1C1.
     * Represents the formula in R1C1-style notation.
     */
    @SerializedName("formulasR1C1")
    @Expose
    public com.google.gson.JsonElement formulasR1C1;

    /**
     * The Index.
     * Index of the range.
     */
    @SerializedName("index")
    @Expose
    public Integer index;

    /**
     * The Number Format.
     * Represents Excel's number format code for the given cell. Read-only.
     */
    @SerializedName("numberFormat")
    @Expose
    public com.google.gson.JsonElement numberFormat;

    /**
     * The Row Count.
     * Returns the number of visible rows. Read-only.
     */
    @SerializedName("rowCount")
    @Expose
    public Integer rowCount;

    /**
     * The Text.
     * Text values of the specified range. The Text value will not depend on the cell width. The # sign substitution that happens in Excel UI will not affect the text value returned by the API. Read-only.
     */
    @SerializedName("text")
    @Expose
    public com.google.gson.JsonElement text;

    /**
     * The Value Types.
     * Represents the type of data of each cell. Read-only. The possible values are: Unknown, Empty, String, Integer, Double, Boolean, Error.
     */
    @SerializedName("valueTypes")
    @Expose
    public com.google.gson.JsonElement valueTypes;

    /**
     * The Values.
     * Represents the raw values of the specified range view. The data returned could be of type string, number, or a boolean. Cell that contain an error will return the error string.
     */
    @SerializedName("values")
    @Expose
    public com.google.gson.JsonElement values;

    /**
     * The Rows.
     * Represents a collection of range views associated with the range. Read-only. Read-only.
     */
    public WorkbookRangeViewCollectionPage rows;


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


        if (json.has("rows")) {
            final WorkbookRangeViewCollectionResponse response = new WorkbookRangeViewCollectionResponse();
            if (json.has("rows@odata.nextLink")) {
                response.nextLink = json.get("rows@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rows").toString(), JsonObject[].class);
            final WorkbookRangeView[] array = new WorkbookRangeView[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), WorkbookRangeView.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rows = new WorkbookRangeViewCollectionPage(response, null);
        }
    }
}
