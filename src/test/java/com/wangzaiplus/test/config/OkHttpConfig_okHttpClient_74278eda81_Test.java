package com.wangzaiplus.test.config;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.net.ssl.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OkHttpConfig_okHttpClient_74278eda81_Test {

    @Mock
    private SSLSocketFactory sslSocketFactory;

    @Mock
    private X509TrustManager x509TrustManager;

    @Mock
    private ConnectionPool connectionPool;

    private int connectTimeout = 10;
    private int readTimeout = 10;
    private int writeTimeout = 10;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testOkHttpClientSuccess() {
        OkHttpClient client = new OkHttpClient.Builder()
                .sslSocketFactory(sslSocketFactory, x509TrustManager)
                .retryOnConnectionFailure(false)
                .connectionPool(connectionPool)
                .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                .readTimeout(readTimeout, TimeUnit.SECONDS)
                .writeTimeout(writeTimeout,TimeUnit.SECONDS)
                .hostnameVerifier((hostname, session) -> true)
                .build();

        assertNotNull(client);
        assertEquals(connectTimeout, client.connectTimeoutMillis()/1000);
        assertEquals(readTimeout, client.readTimeoutMillis()/1000);
        assertEquals(writeTimeout, client.writeTimeoutMillis()/1000);
    }

    @Test
    public void testOkHttpClientFailure() throws Exception {
        when(sslSocketFactory.createSocket()).thenThrow(new RuntimeException());

        assertThrows(RuntimeException.class, () -> {
            OkHttpClient client = new OkHttpClient.Builder()
                    .sslSocketFactory(sslSocketFactory, x509TrustManager)
                    .retryOnConnectionFailure(false)
                    .connectionPool(connectionPool)
                    .connectTimeout(connectTimeout, TimeUnit.SECONDS)
                    .readTimeout(readTimeout, TimeUnit.SECONDS)
                    .writeTimeout(writeTimeout,TimeUnit.SECONDS)
                    .hostnameVerifier((hostname, session) -> true)
                    .build();
        });
    }
}
