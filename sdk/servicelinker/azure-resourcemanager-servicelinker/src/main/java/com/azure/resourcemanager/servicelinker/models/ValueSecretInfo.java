// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicelinker.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The secret info when type is rawValue. It's for scenarios that user input the secret.
 */
@Fluent
public final class ValueSecretInfo extends SecretInfoBase {
    /*
     * The secret type.
     */
    private SecretType secretType = SecretType.RAW_VALUE;

    /*
     * The actual value of the secret.
     */
    private String value;

    /**
     * Creates an instance of ValueSecretInfo class.
     */
    public ValueSecretInfo() {
    }

    /**
     * Get the secretType property: The secret type.
     * 
     * @return the secretType value.
     */
    @Override
    public SecretType secretType() {
        return this.secretType;
    }

    /**
     * Get the value property: The actual value of the secret.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The actual value of the secret.
     * 
     * @param value the value value to set.
     * @return the ValueSecretInfo object itself.
     */
    public ValueSecretInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("secretType", this.secretType == null ? null : this.secretType.toString());
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValueSecretInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValueSecretInfo if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ValueSecretInfo.
     */
    public static ValueSecretInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValueSecretInfo deserializedValueSecretInfo = new ValueSecretInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("secretType".equals(fieldName)) {
                    deserializedValueSecretInfo.secretType = SecretType.fromString(reader.getString());
                } else if ("value".equals(fieldName)) {
                    deserializedValueSecretInfo.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValueSecretInfo;
        });
    }
}
