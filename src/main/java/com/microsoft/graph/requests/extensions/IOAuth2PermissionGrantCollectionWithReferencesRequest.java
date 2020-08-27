// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the OAuth2Permission Grant Collection With References Request.
 */
public interface IOAuth2PermissionGrantCollectionWithReferencesRequest {

    void get(final ICallback<IOAuth2PermissionGrantCollectionWithReferencesPage> callback);

    IOAuth2PermissionGrantCollectionWithReferencesPage get() throws ClientException;

    IOAuth2PermissionGrantCollectionWithReferencesRequest expand(final String value);
    
    IOAuth2PermissionGrantCollectionWithReferencesRequest select(final String value);

    IOAuth2PermissionGrantCollectionWithReferencesRequest top(final int value);

}
