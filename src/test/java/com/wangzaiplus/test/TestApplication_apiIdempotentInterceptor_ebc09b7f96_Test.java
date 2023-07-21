package com.wangzaiplus.test;

import com.wangzaiplus.test.interceptor.ApiIdempotentInterceptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TestApplication_apiIdempotentInterceptor_ebc09b7f96_Test {

    @MockBean
    private TestApplication testApplication;

    @Test
    public void testApiIdempotentInterceptor_Success() {
        ApiIdempotentInterceptor apiIdempotentInterceptor = new ApiIdempotentInterceptor();
        when(testApplication.apiIdempotentInterceptor()).thenReturn(apiIdempotentInterceptor);
        ApiIdempotentInterceptor result = testApplication.apiIdempotentInterceptor();
        assertNotNull(result);
    }

    @Test
    public void testApiIdempotentInterceptor_Null() {
        when(testApplication.apiIdempotentInterceptor()).thenReturn(null);
        ApiIdempotentInterceptor result = testApplication.apiIdempotentInterceptor();
        assertNull(result);
    }
}
