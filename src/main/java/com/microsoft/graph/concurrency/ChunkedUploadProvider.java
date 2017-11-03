// ------------------------------------------------------------------------------
// Copyright (c) 2017 Microsoft Corporation
//
// Permission is hereby granted, free of charge, to any person obtaining a copy
// of this software and associated documentation files (the "Software"), to deal
// in the Software without restriction, including without limitation the rights
// to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// copies of the Software, and to permit persons to whom the Software is
// furnished to do so, subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in
// all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
// THE SOFTWARE.
// ------------------------------------------------------------------------------

package com.microsoft.graph.concurrency;


import com.microsoft.graph.concurrency.ChunkedUploadResponseHandler;
import com.microsoft.graph.concurrency.IProgressCallback;
import com.microsoft.graph.extensions.ChunkedUploadRequest;
import com.microsoft.graph.extensions.ChunkedUploadResult;
import com.microsoft.graph.extensions.IGraphServiceClient;
import com.microsoft.graph.extensions.UploadSession;
import com.microsoft.graph.options.Option;

import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.List;

/**
 * ChunkedUpload service provider.
 *
 * @param <UploadType> The upload item type.
 */
public class ChunkedUploadProvider<UploadType> {

    /**
     * The default chunk size for upload. Currently set to 5 MiB.
     */
    private static final int DEFAULT_CHUNK_SIZE = 5 * 1024 * 1024;

    /**
     * The required chunk size increment by OneDrive Service, which is 320 KiB.
     */
    private static final int REQUIRED_CHUNK_SIZE_INCREMENT = 320 * 1024;

    /**
     * The maximum chunk size for a single upload allowed by OneDrive service.
     * Currently the value is 60 MiB.
     */
    private static final int MAXIMUM_CHUNK_SIZE = 60 * 1024 * 1024;

    /**
     * The default retry times for a simple chunk upload if failure happened.
     */
    private static final int MAXIMUM_RETRY_TIMES = 3;

    /**
     * The client.
     */
    private final IGraphServiceClient client;

    /**
     * The input stream.
     */
    private final InputStream inputStream;

    /**
     * The upload session url.
     */
    private final String uploadUrl;

    /**
     * The stream size.
     */
    private final int streamSize;

    /**
     * The upload response handler.
     */
    private final ChunkedUploadResponseHandler<UploadType> responseHandler;

    /**
     * The counter for how many bytes read from input stream.
     */
    private int readSoFar;

    /**
     * Create the ChunkedUploadProvider
     *
     * @param uploadSession   The initial upload session.
     * @param client          The OneDrive client.
     * @param inputStream     The input stream.
     * @param streamSize      The stream size.
     * @param uploadTypeClass The upload type class.
     */
    public ChunkedUploadProvider(final UploadSession uploadSession,
                                 final IGraphServiceClient client,
                                 final InputStream inputStream,
                                 final int streamSize,
                                 final Class<UploadType> uploadTypeClass) {
        if (uploadSession == null) {
            throw new InvalidParameterException("Upload session is null.");
        }

        if (client == null) {
            throw new InvalidParameterException("OneDrive client is null.");
        }

        if (inputStream == null) {
            throw new InvalidParameterException("Input stream is null.");
        }

        if (streamSize <= 0) {
            throw new InvalidParameterException("Stream size should larger than 0.");
        }

        this.client = client;
        this.readSoFar = 0;
        this.inputStream = inputStream;
        this.streamSize = streamSize;
        this.uploadUrl = uploadSession.uploadUrl;
        this.responseHandler = new ChunkedUploadResponseHandler<UploadType>(uploadTypeClass);
    }

    /**
     * Upload content to remote upload session based on the input stream.
     *
     * @param options  The upload options.
     * @param callback The progress callback invoked during uploading.
     * @param configs  The optional configurations for the upload options, [0] should be the customized chunk
     *                 size and the [1] should be the maxRetry for upload retry.
     * @throws IOException The IO exception happened during upload.
     */
    public void upload(final List<Option> options,
                       final IProgressCallback<UploadType> callback,
                       final int... configs)
            throws IOException {
        int chunkSize = DEFAULT_CHUNK_SIZE;

        if (configs.length > 0) {
            chunkSize = configs[0];
        }

        int maxRetry = MAXIMUM_RETRY_TIMES;

        if (configs.length > 1) {
            maxRetry = configs[1];
        }

        if (chunkSize % REQUIRED_CHUNK_SIZE_INCREMENT != 0) {
            throw new IllegalArgumentException("Chunk size must be a multiple of 320 KiB");
        }

        if (chunkSize > MAXIMUM_CHUNK_SIZE) {
            throw new IllegalArgumentException("Please set chunk size smaller than 60 MiB");
        }

        byte[] buffer = new byte[chunkSize];

        while (this.readSoFar < this.streamSize) {
            int read = this.inputStream.read(buffer);

            if (read == -1) {
                break;
            }

            ChunkedUploadRequest request =
                    new ChunkedUploadRequest(this.uploadUrl, this.client, options, buffer, read,
                            maxRetry, this.readSoFar, this.streamSize);
            ChunkedUploadResult result = request.upload(this.responseHandler);

            if (result.uploadCompleted()) {
                callback.progress(this.streamSize, this.streamSize);
                callback.success((UploadType) result.getItem());
                break;
            } else if (result.chunkCompleted()) {
                callback.progress(this.readSoFar, this.streamSize);
            } else if (result.hasError()) {
                callback.failure(result.getError());
                break;
            }

            this.readSoFar += read;
        }
    }
}
