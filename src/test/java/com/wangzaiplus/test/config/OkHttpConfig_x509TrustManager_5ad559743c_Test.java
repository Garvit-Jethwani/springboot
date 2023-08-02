package com.wangzaiplus.test.config;

import org.junit.Assert;
import org.junit.Test;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public class OkHttpConfig_x509TrustManager_5ad559743c_Test {

    @Test
    public void testCheckClientTrusted() {
        X509TrustManager trustManager = new OkHttpConfig().x509TrustManager();
        X509Certificate[] chain = new X509Certificate[0];
        String authType = "client";

        try {
            trustManager.checkClientTrusted(chain, authType);
        } catch (CertificateException e) {
            Assert.fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testCheckServerTrusted() {
        X509TrustManager trustManager = new OkHttpConfig().x509TrustManager();
        X509Certificate[] chain = new X509Certificate[0];
        String authType = "server";

        try {
            trustManager.checkServerTrusted(chain, authType);
        } catch (CertificateException e) {
            Assert.fail("Exception thrown: " + e.getMessage());
        }
    }

    @Test
    public void testGetAcceptedIssuers() {
        X509TrustManager trustManager = new OkHttpConfig().x509TrustManager();

        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        Assert.assertNotNull(acceptedIssuers);
        Assert.assertEquals(0, acceptedIssuers.length);
    }
}
