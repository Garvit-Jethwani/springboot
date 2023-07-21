package com.wangzaiplus.test.config;

import com.wangzaiplus.test.common.Constant;
import com.wangzaiplus.test.service.MsgLogService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class RabbitConfig_rabbitTemplate_cc015388d5_Test {

    @InjectMocks
    RabbitConfig rabbitConfig = new RabbitConfig();

    @Mock
    CachingConnectionFactory connectionFactory = new CachingConnectionFactory();

    @Mock
    Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();

    @Mock
    MsgLogService msgLogService = new MsgLogService();

    @Test
    public void testRabbitTemplateSuccess() {
        RabbitTemplate rabbitTemplate = rabbitConfig.rabbitTemplate();
        assertEquals(true, rabbitTemplate.isMandatory());
        verify(connectionFactory, times(1)).createConnection();
    }

    @Test
    public void testRabbitTemplateFail() {
        when(connectionFactory.createConnection()).thenThrow(RuntimeException.class);
        assertThrows(RuntimeException.class, () -> rabbitConfig.rabbitTemplate());
        verify(connectionFactory, times(1)).createConnection();
    }
}
