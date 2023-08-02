package com.wangzaiplus.test.config;

import okhttp3.ConnectionPool;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class OkHttpConfig_pool_b79ae2095e_Test {

    @Value("${maxIdleConnections}")
    private int maxIdleConnections;

    @Value("${keepAliveDuration}")
    private long keepAliveDuration;

    @Test
    public void testPool_Success() {
        ConnectionPool connectionPool = pool();
        Assertions.assertEquals(maxIdleConnections, connectionPool.maxIdleConnections());
        Assertions.assertEquals(keepAliveDuration, connectionPool.keepAliveDurationSeconds());
    }

    @Test
    public void testPool_Failure() {
        ConnectionPool connectionPool = pool();
        Assertions.assertNotEquals(maxIdleConnections + 1, connectionPool.maxIdleConnections());
        Assertions.assertNotEquals(keepAliveDuration + 1, connectionPool.keepAliveDurationSeconds());
    }

    @Bean
    public ConnectionPool pool() {
        return new ConnectionPool(maxIdleConnections, keepAliveDuration, TimeUnit.SECONDS);
    }
}
