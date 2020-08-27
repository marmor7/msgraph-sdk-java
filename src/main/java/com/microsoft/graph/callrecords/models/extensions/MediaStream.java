// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.callrecords.models.generated.MediaStreamDirection;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Media Stream.
 */
public class MediaStream implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Stream Id.
     * Unique identifier for the stream.
     */
    @SerializedName("streamId")
    @Expose
    public String streamId;

    /**
     * The Start Date Time.
     * UTC time when the stream started. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("startDateTime")
    @Expose
    public java.util.Calendar startDateTime;

    /**
     * The End Date Time.
     * UTC time when the stream ended. The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
     */
    @SerializedName("endDateTime")
    @Expose
    public java.util.Calendar endDateTime;

    /**
     * The Stream Direction.
     * Indicates the direction of the media stream. Possible values are: callerToCallee, calleeToCaller.
     */
    @SerializedName("streamDirection")
    @Expose
    public MediaStreamDirection streamDirection;

    /**
     * The Average Audio Degradation.
     * Average Network Mean Opinion Score degradation for stream. Represents how much the network loss and jitter has impacted the quality of received audio.
     */
    @SerializedName("averageAudioDegradation")
    @Expose
    public float averageAudioDegradation;

    /**
     * The Average Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("averageJitter")
    @Expose
    public javax.xml.datatype.Duration averageJitter;

    /**
     * The Max Jitter.
     * Maximum jitter for the stream computed as specified in RFC 3550, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("maxJitter")
    @Expose
    public javax.xml.datatype.Duration maxJitter;

    /**
     * The Average Packet Loss Rate.
     * Average packet loss rate for stream.
     */
    @SerializedName("averagePacketLossRate")
    @Expose
    public float averagePacketLossRate;

    /**
     * The Max Packet Loss Rate.
     * Maximum packet loss rate for the stream.
     */
    @SerializedName("maxPacketLossRate")
    @Expose
    public float maxPacketLossRate;

    /**
     * The Average Ratio Of Concealed Samples.
     * Ratio of the number of audio frames with samples generated by packet loss concealment to the total number of audio frames.
     */
    @SerializedName("averageRatioOfConcealedSamples")
    @Expose
    public float averageRatioOfConcealedSamples;

    /**
     * The Max Ratio Of Concealed Samples.
     * Maximum ratio of packets concealed by the healer.
     */
    @SerializedName("maxRatioOfConcealedSamples")
    @Expose
    public float maxRatioOfConcealedSamples;

    /**
     * The Average Round Trip Time.
     * Average network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("averageRoundTripTime")
    @Expose
    public javax.xml.datatype.Duration averageRoundTripTime;

    /**
     * The Max Round Trip Time.
     * Maximum network propagation round-trip time computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("maxRoundTripTime")
    @Expose
    public javax.xml.datatype.Duration maxRoundTripTime;

    /**
     * The Packet Utilization.
     * Packet count for the stream.
     */
    @SerializedName("packetUtilization")
    @Expose
    public Long packetUtilization;

    /**
     * The Average Bandwidth Estimate.
     * Average estimated bandwidth available between two endpoints in bits per second.
     */
    @SerializedName("averageBandwidthEstimate")
    @Expose
    public Long averageBandwidthEstimate;

    /**
     * The Was Media Bypassed.
     * True if the media stream bypassed the Mediation Server and went straight between client and PSTN Gateway/PBX, false otherwise.
     */
    @SerializedName("wasMediaBypassed")
    @Expose
    public Boolean wasMediaBypassed;

    /**
     * The Post Forward Error Correction Packet Loss Rate.
     * Packet loss rate after FEC has been applied aggregated across all video streams and codecs.
     */
    @SerializedName("postForwardErrorCorrectionPacketLossRate")
    @Expose
    public float postForwardErrorCorrectionPacketLossRate;

    /**
     * The Average Video Frame Loss Percentage.
     * Average percentage of video frames lost as displayed to the user.
     */
    @SerializedName("averageVideoFrameLossPercentage")
    @Expose
    public float averageVideoFrameLossPercentage;

    /**
     * The Average Received Frame Rate.
     * Average frames per second received for all video streams computed over the duration of the session.
     */
    @SerializedName("averageReceivedFrameRate")
    @Expose
    public float averageReceivedFrameRate;

    /**
     * The Low Frame Rate Ratio.
     * Fraction of the call where frame rate is less than 7.5 frames per second.
     */
    @SerializedName("lowFrameRateRatio")
    @Expose
    public float lowFrameRateRatio;

    /**
     * The Average Video Packet Loss Rate.
     * Average fraction of packets lost, as specified in [RFC 3550][], computed over the duration of the session.
     */
    @SerializedName("averageVideoPacketLossRate")
    @Expose
    public float averageVideoPacketLossRate;

    /**
     * The Average Video Frame Rate.
     * Average frames per second received for a video stream, computed over the duration of the session.
     */
    @SerializedName("averageVideoFrameRate")
    @Expose
    public float averageVideoFrameRate;

    /**
     * The Low Video Processing Capability Ratio.
     * Fraction of the call that the client is running less than 70% expected video processing capability.
     */
    @SerializedName("lowVideoProcessingCapabilityRatio")
    @Expose
    public float lowVideoProcessingCapabilityRatio;

    /**
     * The Average Audio Network Jitter.
     * Average jitter for the stream computed as specified in [RFC 3550][], denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("averageAudioNetworkJitter")
    @Expose
    public javax.xml.datatype.Duration averageAudioNetworkJitter;

    /**
     * The Max Audio Network Jitter.
     * Maximum of audio network jitter computed over each of the 20 second windows during the session, denoted in [ISO 8601][] format. For example, 1 second is denoted as 'PT1S', where 'P' is the duration designator, 'T' is the time designator, and 'S' is the second designator.
     */
    @SerializedName("maxAudioNetworkJitter")
    @Expose
    public javax.xml.datatype.Duration maxAudioNetworkJitter;


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
