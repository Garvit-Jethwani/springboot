import com.wangzaiplus.test.config.RabbitConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.DirectExchange;

public class RabbitConfig_logUserExchange_409f4a1191_Test {

    @Test
    public void testLogUserExchange_Success() {
        RabbitConfig rabbitConfig = new RabbitConfig();
        DirectExchange exchange = rabbitConfig.logUserExchange();
        Assertions.assertNotNull(exchange);
        Assertions.assertEquals("LOGIN_LOG_EXCHANGE_NAME", exchange.getName());
        Assertions.assertTrue(exchange.isDurable());
        Assertions.assertFalse(exchange.isAutoDelete());
    }

    @Test
    public void testLogUserExchange_Failure() {
        RabbitConfig rabbitConfig = new RabbitConfig();
        DirectExchange exchange = rabbitConfig.logUserExchange();
        Assertions.assertNotNull(exchange);
        Assertions.assertNotEquals("OTHER_EXCHANGE_NAME", exchange.getName());
        Assertions.assertTrue(exchange.isDurable());
        Assertions.assertFalse(exchange.isAutoDelete());
    }
}
