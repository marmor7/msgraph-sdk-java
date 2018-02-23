// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.requests.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Functions Odd LYield Request Builder.
 */
public class BaseWorkbookFunctionsOddLYieldRequestBuilder extends BaseActionRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsOddLYield
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param settlement The settlement
     * @param maturity The maturity
     * @param lastInterest The lastInterest
     * @param rate The rate
     * @param pr The pr
     * @param redemption The redemption
     * @param frequency The frequency
     * @param basis The basis
     */
    public BaseWorkbookFunctionsOddLYieldRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final com.google.gson.JsonElement settlement, final com.google.gson.JsonElement maturity, final com.google.gson.JsonElement lastInterest, final com.google.gson.JsonElement rate, final com.google.gson.JsonElement pr, final com.google.gson.JsonElement redemption, final com.google.gson.JsonElement frequency, final com.google.gson.JsonElement basis) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("settlement", settlement);
        bodyParams.put("maturity", maturity);
        bodyParams.put("lastInterest", lastInterest);
        bodyParams.put("rate", rate);
        bodyParams.put("pr", pr);
        bodyParams.put("redemption", redemption);
        bodyParams.put("frequency", frequency);
        bodyParams.put("basis", basis);
    }

    /**
     * Creates the IWorkbookFunctionsOddLYieldRequest
     *
     * @return The IWorkbookFunctionsOddLYieldRequest instance
     */
    public IWorkbookFunctionsOddLYieldRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsOddLYieldRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return The IWorkbookFunctionsOddLYieldRequest instance
     */
    public IWorkbookFunctionsOddLYieldRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WorkbookFunctionsOddLYieldRequest request = new WorkbookFunctionsOddLYieldRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("settlement")) {
            request.body.settlement = getParameter("settlement");
        }

        if (hasParameter("maturity")) {
            request.body.maturity = getParameter("maturity");
        }

        if (hasParameter("lastInterest")) {
            request.body.lastInterest = getParameter("lastInterest");
        }

        if (hasParameter("rate")) {
            request.body.rate = getParameter("rate");
        }

        if (hasParameter("pr")) {
            request.body.pr = getParameter("pr");
        }

        if (hasParameter("redemption")) {
            request.body.redemption = getParameter("redemption");
        }

        if (hasParameter("frequency")) {
            request.body.frequency = getParameter("frequency");
        }

        if (hasParameter("basis")) {
            request.body.basis = getParameter("basis");
        }

        return request;
    }
}
