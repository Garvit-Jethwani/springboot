import com.wangzaiplus.test.interceptor.AccessLimitInterceptor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.web.servlet.HandlerInterceptor;

public class TestApplication_accessLimitInterceptor_9807676318_Test {

    private AccessLimitInterceptor accessLimitInterceptor;

    @Before
    public void setup() {
        accessLimitInterceptor = new AccessLimitInterceptor();
    }

    @Test
    public void testAccessLimitInterceptor() {
        Assert.assertNotNull(accessLimitInterceptor);
        Assert.assertTrue(accessLimitInterceptor instanceof HandlerInterceptor);
    }
}
