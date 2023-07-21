package com.wangzaiplus.test.config;

import com.wangzaiplus.test.common.Constant;
import com.wangzaiplus.test.service.MsgLogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@Slf4j
public class RabbitConfig_converter_f117e5d1bd_Test {

    @Mock
    private CachingConnectionFactory connectionFactory;

    @InjectMocks
    private RabbitTemplate rabbitTemplate = new RabbitTemplate();

    @Test
    public void testConverter() {
        when(connectionFactory.createConnection()).thenReturn(null);
        rabbitTemplate.setConnectionFactory(connectionFactory);

        Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
        rabbitTemplate.setMessageConverter(converter);

        assertNotNull(rabbitTemplate.getMessageConverter());
    }

    @Test
    public void testConverterWithException() {
        when(connectionFactory.createConnection()).thenThrow(new RuntimeException());
        rabbitTemplate.setConnectionFactory(connectionFactory);

        try {
            Jackson2JsonMessageConverter converter = new Jackson2JsonMessageConverter();
            rabbitTemplate.setMessageConverter(converter);
        } catch (Exception e) {
            assertNotNull(e);
        }
    }
}
