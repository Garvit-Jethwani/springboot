import org.junit.Before;
import org.junit.Test;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestApplication_corsFilter_e909ceaf29_Test {

    private CorsFilter corsFilter;

    @Before
    public void setUp() {
        corsFilter = new CorsFilter(new UrlBasedCorsConfigurationSource());
    }

    @Test
    public void testCorsFilter_AllowedOrigin() {
        UrlBasedCorsConfigurationSource source = (UrlBasedCorsConfigurationSource) corsFilter.getConfigSource();
        CorsConfiguration configuration = source.getCorsConfiguration("/");

        assertNotNull(configuration);
        assertEquals(true, configuration.getAllowCredentials());
        assertEquals("*", configuration.getAllowedOrigins().get(0));
    }

    @Test
    public void testCorsFilter_AllowedHeaderAndMethod() {
        UrlBasedCorsConfigurationSource source = (UrlBasedCorsConfigurationSource) corsFilter.getConfigSource();
        CorsConfiguration configuration = source.getCorsConfiguration("/");

        assertNotNull(configuration);
        assertEquals("*", configuration.getAllowedHeaders().get(0));
        assertEquals("*", configuration.getAllowedMethods().get(0));
    }
}
