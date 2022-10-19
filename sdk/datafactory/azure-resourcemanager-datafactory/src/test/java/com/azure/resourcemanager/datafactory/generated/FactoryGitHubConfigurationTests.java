// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FactoryGitHubConfiguration;
import com.azure.resourcemanager.datafactory.models.GitHubClientSecret;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FactoryGitHubConfigurationTests {
    @Test
    public void testDeserialize() {
        FactoryGitHubConfiguration model =
            BinaryData
                .fromString(
                    "{\"type\":\"FactoryGitHubConfiguration\",\"hostName\":\"rilbywdx\",\"clientId\":\"icc\",\"clientSecret\":{\"byoaSecretAkvUrl\":\"fscjfnynszquji\",\"byoaSecretName\":\"voqyt\"},\"accountName\":\"byowbblgyavutp\",\"repositoryName\":\"hjoxo\",\"collaborationBranch\":\"smsks\",\"rootFolder\":\"pi\",\"lastCommitId\":\"qolj\",\"disablePublish\":false}")
                .toObject(FactoryGitHubConfiguration.class);
        Assertions.assertEquals("byowbblgyavutp", model.accountName());
        Assertions.assertEquals("hjoxo", model.repositoryName());
        Assertions.assertEquals("smsks", model.collaborationBranch());
        Assertions.assertEquals("pi", model.rootFolder());
        Assertions.assertEquals("qolj", model.lastCommitId());
        Assertions.assertEquals(false, model.disablePublish());
        Assertions.assertEquals("rilbywdx", model.hostname());
        Assertions.assertEquals("icc", model.clientId());
        Assertions.assertEquals("fscjfnynszquji", model.clientSecret().byoaSecretAkvUrl());
        Assertions.assertEquals("voqyt", model.clientSecret().byoaSecretName());
    }

    @Test
    public void testSerialize() {
        FactoryGitHubConfiguration model =
            new FactoryGitHubConfiguration()
                .withAccountName("byowbblgyavutp")
                .withRepositoryName("hjoxo")
                .withCollaborationBranch("smsks")
                .withRootFolder("pi")
                .withLastCommitId("qolj")
                .withDisablePublish(false)
                .withHostname("rilbywdx")
                .withClientId("icc")
                .withClientSecret(
                    new GitHubClientSecret().withByoaSecretAkvUrl("fscjfnynszquji").withByoaSecretName("voqyt"));
        model = BinaryData.fromObject(model).toObject(FactoryGitHubConfiguration.class);
        Assertions.assertEquals("byowbblgyavutp", model.accountName());
        Assertions.assertEquals("hjoxo", model.repositoryName());
        Assertions.assertEquals("smsks", model.collaborationBranch());
        Assertions.assertEquals("pi", model.rootFolder());
        Assertions.assertEquals("qolj", model.lastCommitId());
        Assertions.assertEquals(false, model.disablePublish());
        Assertions.assertEquals("rilbywdx", model.hostname());
        Assertions.assertEquals("icc", model.clientId());
        Assertions.assertEquals("fscjfnynszquji", model.clientSecret().byoaSecretAkvUrl());
        Assertions.assertEquals("voqyt", model.clientSecret().byoaSecretName());
    }
}