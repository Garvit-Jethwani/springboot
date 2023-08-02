import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitConfig_mailQueue_abe8eee10d_Test {

    @Autowired
    private RabbitConfig rabbitConfig;

    @Test
    public void testMailQueue() {
        Queue queue = rabbitConfig.mailQueue();
        assertEquals("MAIL_QUEUE_NAME", queue.getName());
        assertEquals(true, queue.isDurable());
    }

    @Test
    public void testMailQueueWithDifferentName() {
        Queue queue = rabbitConfig.mailQueue();
        assertEquals("OTHER_MAIL_QUEUE_NAME", queue.getName());
        assertEquals(true, queue.isDurable());
    }
}
