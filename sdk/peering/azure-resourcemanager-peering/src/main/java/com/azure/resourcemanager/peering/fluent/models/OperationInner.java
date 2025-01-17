// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.peering.models.OperationDisplayInfo;
import java.io.IOException;

/**
 * The peering API operation.
 */
@Immutable
public final class OperationInner implements JsonSerializable<OperationInner> {
    /*
     * The name of the operation.
     */
    private String name;

    /*
     * The information related to the operation.
     */
    private OperationDisplayInfo display;

    /*
     * The flag that indicates whether the operation applies to data plane.
     */
    private Boolean isDataAction;

    /**
     * Creates an instance of OperationInner class.
     */
    public OperationInner() {
    }

    /**
     * Get the name property: The name of the operation.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: The information related to the operation.
     * 
     * @return the display value.
     */
    public OperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Get the isDataAction property: The flag that indicates whether the operation applies to data plane.
     * 
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationInner.
     */
    public static OperationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationInner deserializedOperationInner = new OperationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedOperationInner.name = reader.getString();
                } else if ("display".equals(fieldName)) {
                    deserializedOperationInner.display = OperationDisplayInfo.fromJson(reader);
                } else if ("isDataAction".equals(fieldName)) {
                    deserializedOperationInner.isDataAction = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationInner;
        });
    }
}
