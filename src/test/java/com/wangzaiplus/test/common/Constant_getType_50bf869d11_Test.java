import com.wangzaiplus.test.common.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Constant_getType_50bf869d11_Test {

    @Test
    public void testGetType_WhenTypeIsNull_ReturnsNull() {
        Constant constant = new Constant();
        String result = constant.getType();
        Assertions.assertNull(result);
    }

    @Test
    public void testGetType_WhenTypeIsNotNull_ReturnsType() {
        Constant constant = new Constant("exampleType");
        String result = constant.getType();
        Assertions.assertEquals("exampleType", result);
    }
}
