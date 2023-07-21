package com.wangzaiplus.test.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class OkHttpConfig_sslSocketFactory_7080dfe886_Test {

    @Mock
    private SSLContext sslContext;

    @InjectMocks
    private OkHttpConfig okHttpConfig;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSslSocketFactory_success() throws NoSuchAlgorithmException, KeyManagementException {
        when(SSLContext.getInstance("TLS")).thenReturn(sslContext);
        SSLSocketFactory expectedSocketFactory = mock(SSLSocketFactory.class);
        when(sslContext.getSocketFactory()).thenReturn(expectedSocketFactory);

        SSLSocketFactory actualSocketFactory = okHttpConfig.sslSocketFactory();

        assertEquals(expectedSocketFactory, actualSocketFactory);
    }

    @Test
    public void testSslSocketFactory_failure() throws NoSuchAlgorithmException, KeyManagementException {
        when(SSLContext.getInstance("TLS")).thenReturn(sslContext);
        when(sslContext.getSocketFactory()).thenThrow(new RuntimeException("Test Exception"));

        assertThrows(RuntimeException.class, () -> okHttpConfig.sslSocketFactory());
    }

    @Test
    public void testSslSocketFactory_null() throws NoSuchAlgorithmException, KeyManagementException {
        when(SSLContext.getInstance("TLS")).thenReturn(sslContext);
        when(sslContext.getSocketFactory()).thenReturn(null);

        SSLSocketFactory actualSocketFactory = okHttpConfig.sslSocketFactory();

        assertNull(actualSocketFactory);
    }
}
