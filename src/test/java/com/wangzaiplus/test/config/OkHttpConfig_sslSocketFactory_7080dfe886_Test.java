package com.wangzaiplus.test.config;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

@Configuration
public class OkHttpConfig_sslSocketFactory_7080dfe886_Test {

    @Bean
    public SSLSocketFactory sslSocketFactory() {
        try {
            // Trust any connection
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, new TrustManager[]{x509TrustManager()}, new SecureRandom());
            return sslContext.getSocketFactory();
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public X509TrustManager x509TrustManager() {
        return new X509TrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    @Test
    public void testSslSocketFactoryNotNull() {
        SSLSocketFactory sslSocketFactory = sslSocketFactory();
        Assertions.assertNotNull(sslSocketFactory);
    }

    @Test
    public void testSslSocketFactoryIsInstanceOfSSLSocketFactory() {
        SSLSocketFactory sslSocketFactory = sslSocketFactory();
        Assertions.assertTrue(sslSocketFactory instanceof SSLSocketFactory);
    }
}
