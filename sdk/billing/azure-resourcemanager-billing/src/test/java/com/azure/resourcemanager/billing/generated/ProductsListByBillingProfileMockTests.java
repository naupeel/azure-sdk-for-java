// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.BillingFrequency;
import com.azure.resourcemanager.billing.models.Product;
import com.azure.resourcemanager.billing.models.ProductStatusType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProductsListByBillingProfileMockTests {
    @Test
    public void testListByBillingProfile() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"autoRenew\":\"On\",\"displayName\":\"hzjmucftbyrp\",\"purchaseDate\":\"2020-12-22T05:32:19Z\",\"productTypeId\":\"kpigqfusu\",\"productType\":\"zmkw\",\"status\":\"Disabled\",\"endDate\":\"2021-04-09T11:30:43Z\",\"billingFrequency\":\"OneTime\",\"lastCharge\":{\"currency\":\"qe\",\"value\":32.821198},\"lastChargeDate\":\"2021-08-08T18:00:09Z\",\"quantity\":15.188092,\"skuId\":\"gwydyy\",\"skuDescription\":\"svkhgbv\",\"tenantId\":\"anarfdlpukhpyrne\",\"availabilityId\":\"jcpeogkhnmg\",\"invoiceSectionId\":\"ouxddbhfhpfpazj\",\"invoiceSectionDisplayName\":\"ywjxh\",\"billingProfileId\":\"ulontacnpqwteht\",\"billingProfileDisplayName\":\"vrh\",\"customerId\":\"jyoogwxh\",\"customerDisplayName\":\"duugwbsre\",\"reseller\":{\"resellerId\":\"q\",\"description\":\"uarenlv\"}},\"id\":\"htkln\",\"name\":\"nafvvkyfedev\",\"type\":\"bo\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        BillingManager manager =
            BillingManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Product> response =
            manager.products().listByBillingProfile("lyetndnbfqygg", "g", "lnlg", com.azure.core.util.Context.NONE);

        Assertions.assertEquals(AutoRenew.ON, response.iterator().next().autoRenew());
        Assertions.assertEquals(ProductStatusType.DISABLED, response.iterator().next().status());
        Assertions.assertEquals(BillingFrequency.ONE_TIME, response.iterator().next().billingFrequency());
    }
}