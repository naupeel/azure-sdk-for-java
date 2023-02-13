// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.WorkspaceAadAdminInfoInner;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceAadAdminInfoInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceAadAdminInfoInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"tenantId\":\"efdeesve\",\"login\":\"ijpxtx\",\"administratorType\":\"wprtu\",\"sid\":\"sawddjibabxvi\"},\"id\":\"itvtzeexavo\",\"name\":\"tfgle\",\"type\":\"dmdqb\"}")
                .toObject(WorkspaceAadAdminInfoInner.class);
        Assertions.assertEquals("efdeesve", model.tenantId());
        Assertions.assertEquals("ijpxtx", model.login());
        Assertions.assertEquals("wprtu", model.administratorType());
        Assertions.assertEquals("sawddjibabxvi", model.sid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceAadAdminInfoInner model =
            new WorkspaceAadAdminInfoInner()
                .withTenantId("efdeesve")
                .withLogin("ijpxtx")
                .withAdministratorType("wprtu")
                .withSid("sawddjibabxvi");
        model = BinaryData.fromObject(model).toObject(WorkspaceAadAdminInfoInner.class);
        Assertions.assertEquals("efdeesve", model.tenantId());
        Assertions.assertEquals("ijpxtx", model.login());
        Assertions.assertEquals("wprtu", model.administratorType());
        Assertions.assertEquals("sawddjibabxvi", model.sid());
    }
}