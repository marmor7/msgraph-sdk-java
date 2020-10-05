// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PlannerProgressTaskBoardTaskFormat;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Progress Task Board Task Format Request.
 */
public class PlannerProgressTaskBoardTaskFormatRequest extends BaseRequest implements IPlannerProgressTaskBoardTaskFormatRequest {
	
    /**
     * The request for the PlannerProgressTaskBoardTaskFormat
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlannerProgressTaskBoardTaskFormatRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PlannerProgressTaskBoardTaskFormat.class);
    }

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerProgressTaskBoardTaskFormat from the service
     *
     * @return the PlannerProgressTaskBoardTaskFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Patches this PlannerProgressTaskBoardTaskFormat with a source
     *
     * @param sourcePlannerProgressTaskBoardTaskFormat the source object with updates
     * @return the updated PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat patch(final PlannerProgressTaskBoardTaskFormat sourcePlannerProgressTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.POST, callback, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the new object to create
     * @return the created PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat post(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.POST, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat, final ICallback<? super PlannerProgressTaskBoardTaskFormat> callback) {
        send(HttpMethod.PUT, callback, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Creates a PlannerProgressTaskBoardTaskFormat with a new object
     *
     * @param newPlannerProgressTaskBoardTaskFormat the object to create/update
     * @return the created PlannerProgressTaskBoardTaskFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PlannerProgressTaskBoardTaskFormat put(final PlannerProgressTaskBoardTaskFormat newPlannerProgressTaskBoardTaskFormat) throws ClientException {
        return send(HttpMethod.PUT, newPlannerProgressTaskBoardTaskFormat);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlannerProgressTaskBoardTaskFormatRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlannerProgressTaskBoardTaskFormatRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlannerProgressTaskBoardTaskFormatRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlannerProgressTaskBoardTaskFormatRequest)this;
     }

}

