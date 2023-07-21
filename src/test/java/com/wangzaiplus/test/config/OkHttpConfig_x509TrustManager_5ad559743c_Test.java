package com.wangzaiplus.test.config;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import javax.net.ssl.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OkHttpConfig_x509TrustManager_5ad559743c_Test {

    @Test
    public void testX509TrustManager_checkClientTrusted() throws CertificateException {
        X509TrustManager trustManager = Mockito.mock(X509TrustManager.class);
        X509Certificate[] chain = new X509Certificate[1];
        String authType = "authType";
        Mockito.doNothing().when(trustManager).checkClientTrusted(chain, authType);
        trustManager.checkClientTrusted(chain, authType);
        Mockito.verify(trustManager, Mockito.times(1)).checkClientTrusted(chain, authType);
    }

    @Test
    public void testX509TrustManager_checkClientTrusted_Exception() throws CertificateException {
        X509TrustManager trustManager = Mockito.mock(X509TrustManager.class);
        X509Certificate[] chain = new X509Certificate[1];
        String authType = "authType";
        Mockito.doThrow(new CertificateException()).when(trustManager).checkClientTrusted(chain, authType);
        assertThrows(CertificateException.class, () -> trustManager.checkClientTrusted(chain, authType));
    }

    @Test
    public void testX509TrustManager_checkServerTrusted() throws CertificateException {
        X509TrustManager trustManager = Mockito.mock(X509TrustManager.class);
        X509Certificate[] chain = new X509Certificate[1];
        String authType = "authType";
        Mockito.doNothing().when(trustManager).checkServerTrusted(chain, authType);
        trustManager.checkServerTrusted(chain, authType);
        Mockito.verify(trustManager, Mockito.times(1)).checkServerTrusted(chain, authType);
    }

    @Test
    public void testX509TrustManager_checkServerTrusted_Exception() throws CertificateException {
        X509TrustManager trustManager = Mockito.mock(X509TrustManager.class);
        X509Certificate[] chain = new X509Certificate[1];
        String authType = "authType";
        Mockito.doThrow(new CertificateException()).when(trustManager).checkServerTrusted(chain, authType);
        assertThrows(CertificateException.class, () -> trustManager.checkServerTrusted(chain, authType));
    }

    @Test
    public void testX509TrustManager_getAcceptedIssuers() {
        X509TrustManager trustManager = Mockito.mock(X509TrustManager.class);
        X509Certificate[] expectedCertificates = new X509Certificate[0];
        Mockito.when(trustManager.getAcceptedIssuers()).thenReturn(expectedCertificates);
        X509Certificate[] actualCertificates = trustManager.getAcceptedIssuers();
        assertEquals(expectedCertificates.length, actualCertificates.length);
    }
}
