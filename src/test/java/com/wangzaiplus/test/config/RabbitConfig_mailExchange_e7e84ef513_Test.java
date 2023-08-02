import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class RabbitConfig_mailExchange_e7e84ef513_Test {

    private RabbitConfig rabbitConfig;
    
    @Before
    public void setup() {
        rabbitConfig = new RabbitConfig();
    }
    
    @Test
    public void testMailExchangeCreation() {
        DirectExchange exchange = rabbitConfig.mailExchange();
        
        assertEquals("MAIL_EXCHANGE_NAME", exchange.getName());
        assertEquals(true, exchange.isDurable());
        assertEquals(false, exchange.isAutoDelete());
    }
    
    @Test
    public void testMailExchangeCreationWithMock() {
        DirectExchange exchangeMock = mock(DirectExchange.class);
        
        assertEquals(exchangeMock, rabbitConfig.mailExchange());
    }
}
