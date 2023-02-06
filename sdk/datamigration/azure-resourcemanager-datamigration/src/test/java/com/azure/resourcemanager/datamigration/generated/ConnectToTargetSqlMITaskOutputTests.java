// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.ConnectToTargetSqlMITaskOutput;

public final class ConnectToTargetSqlMITaskOutputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectToTargetSqlMITaskOutput model =
            BinaryData
                .fromString(
                    "{\"id\":\"aljutiiswac\",\"targetServerVersion\":\"gdkz\",\"targetServerBrandVersion\":\"wkfvhqcrailvp\",\"logins\":[\"fuflrwdmhdlx\",\"jrxs\"],\"agentJobs\":[\"fcnihgwq\",\"pnedgf\"],\"validationErrors\":[{\"message\":\"cvqvpkeqdcv\",\"actionableMessage\":\"hvoodsotbobzd\",\"filePath\":\"cjwvn\",\"lineNumber\":\"ld\",\"hResult\":481946424,\"stackTrace\":\"cxrslpmutwuoe\"},{\"message\":\"pkhjwni\",\"actionableMessage\":\"sluicpdggkzz\",\"filePath\":\"mbmpaxmodfvuefy\",\"lineNumber\":\"bpfvm\",\"hResult\":1299993392,\"stackTrace\":\"fouyf\"},{\"message\":\"akcp\",\"actionableMessage\":\"yzvqt\",\"filePath\":\"ubex\",\"lineNumber\":\"zksmondj\",\"hResult\":1598005613,\"stackTrace\":\"vypomgkopkwho\"}]}")
                .toObject(ConnectToTargetSqlMITaskOutput.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectToTargetSqlMITaskOutput model = new ConnectToTargetSqlMITaskOutput();
        model = BinaryData.fromObject(model).toObject(ConnectToTargetSqlMITaskOutput.class);
    }
}