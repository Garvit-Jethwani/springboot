package com.wangzaiplus.test.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class JedisConfig_redisPoolFactory_5cfb63322b_Test {

    @InjectMocks
    private JedisConfig jedisConfig;

    @Mock
    private JedisPoolConfig jedisPoolConfig;

    @Mock
    private JedisPool jedisPool;

    @Test
    public void testRedisPoolFactory_Success() {
        doNothing().when(jedisPoolConfig).setMaxIdle(anyInt());
        doNothing().when(jedisPoolConfig).setMaxWaitMillis(anyLong());
        doNothing().when(jedisPoolConfig).setMinIdle(anyInt());

        JedisPool result = jedisConfig.redisPoolFactory();

        verify(jedisPoolConfig, times(1)).setMaxIdle(anyInt());
        verify(jedisPoolConfig, times(1)).setMaxWaitMillis(anyLong());
        verify(jedisPoolConfig, times(1)).setMinIdle(anyInt());
    }

    @Test(expected = Exception.class)
    public void testRedisPoolFactory_Failure() {
        doThrow(new RuntimeException("Failed to set Max Idle")).when(jedisPoolConfig).setMaxIdle(anyInt());
        jedisConfig.redisPoolFactory();
    }
}
