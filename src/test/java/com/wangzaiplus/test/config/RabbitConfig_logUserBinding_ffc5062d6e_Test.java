import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RabbitConfig_logUserBinding_ffc5062d6e_Test {

    @Mock
    private RabbitConfig rabbitConfig;

    @Test
    public void testLogUserBinding_Success() {
        Queue mockQueue = mock(Queue.class);
        DirectExchange mockExchange = mock(DirectExchange.class);
        Binding mockBinding = mock(Binding.class);

        when(rabbitConfig.logUserQueue()).thenReturn(mockQueue);
        when(rabbitConfig.logUserExchange()).thenReturn(mockExchange);
        when(mockBinding.getRoutingKey()).thenReturn("LOGIN_LOG_ROUTING_KEY_NAME");

        Binding result = rabbitConfig.logUserBinding();

        Assertions.assertEquals(mockBinding, result);
    }

    @Test
    public void testLogUserBinding_Failure() {
        Queue mockQueue = mock(Queue.class);
        DirectExchange mockExchange = mock(DirectExchange.class);
        Binding mockBinding = mock(Binding.class);

        when(rabbitConfig.logUserQueue()).thenReturn(mockQueue);
        when(rabbitConfig.logUserExchange()).thenReturn(mockExchange);
        when(mockBinding.getRoutingKey()).thenReturn("INVALID_ROUTING_KEY_NAME");

        Binding result = rabbitConfig.logUserBinding();

        Assertions.assertNotEquals(mockBinding, result);
    }
}
