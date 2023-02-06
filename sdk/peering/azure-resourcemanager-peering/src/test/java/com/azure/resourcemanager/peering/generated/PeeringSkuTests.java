// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.models.Family;
import com.azure.resourcemanager.peering.models.PeeringSku;
import com.azure.resourcemanager.peering.models.Size;
import com.azure.resourcemanager.peering.models.Tier;
import org.junit.jupiter.api.Assertions;

public final class PeeringSkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringSku model =
            BinaryData
                .fromString(
                    "{\"name\":\"xofpdvhpfxxypi\",\"tier\":\"Premium\",\"family\":\"Direct\",\"size\":\"Unlimited\"}")
                .toObject(PeeringSku.class);
        Assertions.assertEquals("xofpdvhpfxxypi", model.name());
        Assertions.assertEquals(Tier.PREMIUM, model.tier());
        Assertions.assertEquals(Family.DIRECT, model.family());
        Assertions.assertEquals(Size.UNLIMITED, model.size());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringSku model =
            new PeeringSku()
                .withName("xofpdvhpfxxypi")
                .withTier(Tier.PREMIUM)
                .withFamily(Family.DIRECT)
                .withSize(Size.UNLIMITED);
        model = BinaryData.fromObject(model).toObject(PeeringSku.class);
        Assertions.assertEquals("xofpdvhpfxxypi", model.name());
        Assertions.assertEquals(Tier.PREMIUM, model.tier());
        Assertions.assertEquals(Family.DIRECT, model.family());
        Assertions.assertEquals(Size.UNLIMITED, model.size());
    }
}