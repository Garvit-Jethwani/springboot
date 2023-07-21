package com.wangzaiplus.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@RunWith(MockitoJUnitRunner.class)
public class TestApplication_corsFilter_e909ceaf29_Test {

    @InjectMocks
    TestApplication testApplication;

    @Mock
    UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource;

    @Mock
    CorsConfiguration corsConfiguration;

    @Before
    public void setUp() {
        when(corsConfiguration.isAllowCredentials()).thenReturn(true);
        when(corsConfiguration.getAllowedOrigins()).thenReturn(Arrays.asList("*"));
        when(corsConfiguration.getAllowedHeaders()).thenReturn(Arrays.asList("*"));
        when(corsConfiguration.getAllowedMethods()).thenReturn(Arrays.asList("*"));
        when(urlBasedCorsConfigurationSource.getCorsConfigurations()).thenReturn(Collections.singletonMap("/**", corsConfiguration));
    }

    @Test
    public void testCorsFilter() {
        when(testApplication.corsFilter()).thenReturn(new CorsFilter(urlBasedCorsConfigurationSource));
        CorsFilter corsFilter = testApplication.corsFilter();
        assertTrue(corsFilter instanceof CorsFilter);
    }

    @Test
    public void testCorsFilterFailure() {
        when(testApplication.corsFilter()).thenReturn(null);
        CorsFilter corsFilter = testApplication.corsFilter();
        assertTrue(corsFilter == null);
    }
}
