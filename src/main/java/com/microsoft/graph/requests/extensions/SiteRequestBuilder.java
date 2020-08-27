// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISiteRequest;
import com.microsoft.graph.requests.extensions.SiteRequest;
import com.microsoft.graph.requests.extensions.IItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemAnalyticsWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.ColumnDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ContentTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.BaseItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IListRequestBuilder;
import com.microsoft.graph.requests.extensions.ListRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteGetByPathRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteGetByPathRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Request Builder.
 */
public class SiteRequestBuilder extends BaseRequestBuilder implements ISiteRequestBuilder {

    /**
     * The request builder for the Site
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISiteRequest instance
     */
    public ISiteRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISiteRequest instance
     */
    public ISiteRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SiteRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for ItemAnalytics
     *
     * @return the IItemAnalyticsWithReferenceRequestBuilder instance
     */
    public IItemAnalyticsWithReferenceRequestBuilder analytics() {
        return new ItemAnalyticsWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("analytics"), getClient(), null);
    }
    public IColumnDefinitionCollectionRequestBuilder columns() {
        return new ColumnDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("columns"), getClient(), null);
    }

    public IColumnDefinitionRequestBuilder columns(final String id) {
        return new ColumnDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("columns") + "/" + id, getClient(), null);
    }
    public IContentTypeCollectionRequestBuilder contentTypes() {
        return new ContentTypeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes"), getClient(), null);
    }

    public IContentTypeRequestBuilder contentTypes(final String id) {
        return new ContentTypeRequestBuilder(getRequestUrlWithAdditionalSegment("contentTypes") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Drive
     *
     * @return the IDriveRequestBuilder instance
     */
    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }
    public IDriveCollectionRequestBuilder drives() {
        return new DriveCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("drives"), getClient(), null);
    }

    public IDriveRequestBuilder drives(final String id) {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drives") + "/" + id, getClient(), null);
    }
    public IBaseItemCollectionRequestBuilder items() {
        return new BaseItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IBaseItemRequestBuilder items(final String id) {
        return new BaseItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }
    public IListCollectionRequestBuilder lists() {
        return new ListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("lists"), getClient(), null);
    }

    public IListRequestBuilder lists(final String id) {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("lists") + "/" + id, getClient(), null);
    }
    public ISiteCollectionRequestBuilder sites() {
        return new SiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    public ISiteRequestBuilder sites(final String id) {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Onenote
     *
     * @return the IOnenoteRequestBuilder instance
     */
    public IOnenoteRequestBuilder onenote() {
        return new OnenoteRequestBuilder(getRequestUrlWithAdditionalSegment("onenote"), getClient(), null);
    }

    public ISiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval() {
        return new SiteGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null);
    }

    public ISiteGetActivitiesByIntervalCollectionRequestBuilder getActivitiesByInterval(final String startDateTime, final String endDateTime, final String interval) {
        return new SiteGetActivitiesByIntervalCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getActivitiesByInterval"), getClient(), null, startDateTime, endDateTime, interval);
    }

    public ISiteGetByPathRequestBuilder getByPath(final String path) {
        return new SiteGetByPathRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getByPath"), getClient(), null, path);
    }
}

