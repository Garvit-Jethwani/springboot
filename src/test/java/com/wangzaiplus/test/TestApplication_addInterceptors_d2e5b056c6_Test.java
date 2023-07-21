package com.wangzaiplus.test;

import com.wangzaiplus.test.interceptor.AccessLimitInterceptor;
import com.wangzaiplus.test.interceptor.ApiIdempotentInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class TestApplication_addInterceptors_d2e5b056c6_Test {

    @InjectMocks
    private TestApplication_addInterceptors_d2e5b056c6 testApplication;

    @Mock
    private InterceptorRegistry interceptorRegistry;

    @Mock
    private ApiIdempotentInterceptor apiIdempotentInterceptor;

    @Mock
    private AccessLimitInterceptor accessLimitInterceptor;

    @Before
    public void setup() {
        testApplication.apiIdempotentInterceptor = apiIdempotentInterceptor;
        testApplication.accessLimitInterceptor = accessLimitInterceptor;
    }

    @Test
    public void testAddInterceptors() {
        testApplication.addInterceptors(interceptorRegistry);
        verify(interceptorRegistry, times(1)).addInterceptor(apiIdempotentInterceptor);
        verify(interceptorRegistry, times(1)).addInterceptor(accessLimitInterceptor);
    }

    @Test
    public void testAddInterceptorsWhenInterceptorIsNull() {
        testApplication.apiIdempotentInterceptor = null;
        testApplication.accessLimitInterceptor = null;
        testApplication.addInterceptors(interceptorRegistry);
        verify(interceptorRegistry, times(0)).addInterceptor(Mockito.any());
    }
}
