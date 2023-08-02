package com.wangzaiplus.test.config;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig_redisPoolFactory_5cfb63322b_Test {

    @Value("${redis.maxIdle}")
    private int maxIdle;

    @Value("${redis.maxWait}")
    private long maxWait;

    @Value("${redis.minIdle}")
    private int minIdle;

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private int port;

    @Value("${redis.timeout}")
    private int timeout;

    @Value("${redis.password}")
    private String password;

    @Test
    public void testRedisPoolFactory_Success() {
        JedisPool jedisPool = redisPoolFactory();

        Assert.assertNotNull(jedisPool);
        Assert.assertEquals(maxIdle, jedisPool.getConfig().getMaxIdle());
        Assert.assertEquals(maxWait, jedisPool.getConfig().getMaxWaitMillis());
        Assert.assertEquals(minIdle, jedisPool.getConfig().getMinIdle());
        Assert.assertEquals(host, jedisPool.getHost());
        Assert.assertEquals(port, jedisPool.getPort());
        Assert.assertEquals(timeout, jedisPool.getTimeout());
        Assert.assertEquals(password, jedisPool.getPassword());
    }

    @Test
    public void testRedisPoolFactory_NullValues() {
        maxIdle = 0;
        maxWait = 0;
        minIdle = 0;
        host = null;
        port = 0;
        timeout = 0;
        password = null;

        JedisPool jedisPool = redisPoolFactory();

        Assert.assertNotNull(jedisPool);
        Assert.assertEquals(0, jedisPool.getConfig().getMaxIdle());
        Assert.assertEquals(0, jedisPool.getConfig().getMaxWaitMillis());
        Assert.assertEquals(0, jedisPool.getConfig().getMinIdle());
        Assert.assertNull(jedisPool.getHost());
        Assert.assertEquals(0, jedisPool.getPort());
        Assert.assertEquals(0, jedisPool.getTimeout());
        Assert.assertNull(jedisPool.getPassword());
    }

    public JedisPool redisPoolFactory() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMaxWaitMillis(maxWait);
        jedisPoolConfig.setMinIdle(minIdle);

        JedisPool jedisPool = new JedisPool(jedisPoolConfig, host, port, timeout, password);

        return jedisPool;
    }
}
