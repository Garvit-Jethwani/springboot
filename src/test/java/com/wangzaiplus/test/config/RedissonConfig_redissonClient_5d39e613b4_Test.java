package com.wangzaiplus.test.config;

import org.junit.Assert;
import org.junit.Test;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private int port;

    @Value("${redis.password}")
    private String password;

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://" + host + ":" + port).setPassword(password);
        return Redisson.create(config);
    }

    @Test
    public void testRedissonClient() {
        RedissonClient redissonClient = redissonClient();
        Assert.assertNotNull(redissonClient);
    }

    @Test
    public void testRedissonClientConfig() {
        RedissonClient redissonClient = redissonClient();
        Config config = redissonClient.getConfig();
        Assert.assertNotNull(config);
        Assert.assertEquals("redis://" + host + ":" + port, config.useSingleServer().getAddress());
        Assert.assertEquals(password, config.useSingleServer().getPassword());
    }
}
