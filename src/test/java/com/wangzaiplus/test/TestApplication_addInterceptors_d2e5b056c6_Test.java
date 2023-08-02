package com.wangzaiplus.test;

import com.wangzaiplus.test.interceptor.AccessLimitInterceptor;
import com.wangzaiplus.test.interceptor.ApiIdempotentInterceptor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
public class TestApplication_addInterceptors_d2e5b056c6_Test {

    @Mock
    private InterceptorRegistry registry;

    @Mock
    private ApiIdempotentInterceptor apiIdempotentInterceptor;

    @Mock
    private AccessLimitInterceptor accessLimitInterceptor;

    @InjectMocks
    private TestApplication testApplication;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddInterceptors() {
        testApplication.addInterceptors(registry);

        verify(registry).addInterceptor(apiIdempotentInterceptor);
        verify(registry).addInterceptor(accessLimitInterceptor);
    }
}
