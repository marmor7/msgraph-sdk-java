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
 * The interface for the User With Reference Request.
 */
public interface IUserWithReferenceRequest extends IHttpRequest {

    void post(final User newUser, final IJsonBackedObject payload, final ICallback<User> callback);

    User post(final User newUser, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<User> callback);

    User get() throws ClientException;

	void delete(final ICallback<User> callback);

	void delete() throws ClientException;

	void patch(final User sourceUser, final ICallback<User> callback);

	User patch(final User sourceUser) throws ClientException;

    IUserWithReferenceRequest select(final String value);

    IUserWithReferenceRequest expand(final String value);

}
