// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mediaservices.models.ChannelMapping;
import com.azure.resourcemanager.mediaservices.models.SelectAudioTrackById;
import org.junit.jupiter.api.Assertions;

public final class SelectAudioTrackByIdTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelectAudioTrackById model =
            BinaryData
                .fromString(
                    "{\"@odata.type\":\"#Microsoft.Media.SelectAudioTrackById\",\"trackId\":2089851457082178659,\"channelMapping\":\"Center\"}")
                .toObject(SelectAudioTrackById.class);
        Assertions.assertEquals(ChannelMapping.CENTER, model.channelMapping());
        Assertions.assertEquals(2089851457082178659L, model.trackId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelectAudioTrackById model =
            new SelectAudioTrackById().withChannelMapping(ChannelMapping.CENTER).withTrackId(2089851457082178659L);
        model = BinaryData.fromObject(model).toObject(SelectAudioTrackById.class);
        Assertions.assertEquals(ChannelMapping.CENTER, model.channelMapping());
        Assertions.assertEquals(2089851457082178659L, model.trackId());
    }
}