package com.wangzaiplus.test.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OkHttpConfig_pool_b79ae2095e_Test {

    public class ConnectionPoolWrapper {
        private ConnectionPool connectionPool;

        public ConnectionPoolWrapper() {
            this.connectionPool = new ConnectionPool();
        }

        public int idleConnectionCount() {
            return connectionPool.idleConnectionCount();
        }

        public long keepAliveDurationNs() {
            return connectionPool.keepAliveDurationNs();
        }
    }

    @Mock
    private ConnectionPoolWrapper connectionPool;

    @InjectMocks
    private OkHttpConfig okHttpConfig;

    private int maxIdleConnections;
    private int keepAliveDuration;

    @BeforeEach
    void setUp() {
        maxIdleConnections = 5;
        keepAliveDuration = 5;
    }

    @Test
    public void testPool() {
        when(connectionPool.idleConnectionCount()).thenReturn(maxIdleConnections);
        when(connectionPool.keepAliveDurationNs()).thenReturn((long) keepAliveDuration);

        ConnectionPoolWrapper result = okHttpConfig.pool();

        assertEquals(maxIdleConnections, result.idleConnectionCount());
        assertEquals((long) keepAliveDuration, result.keepAliveDurationNs());
    }

    @Test
    public void testPool_WhenMaxIdleConnectionsIsZero() {
        maxIdleConnections = 0;

        when(connectionPool.idleConnectionCount()).thenReturn(maxIdleConnections);
        when(connectionPool.keepAliveDurationNs()).thenReturn((long) keepAliveDuration);

        ConnectionPoolWrapper result = okHttpConfig.pool();

        assertEquals(maxIdleConnections, result.idleConnectionCount());
        assertEquals((long) keepAliveDuration, result.keepAliveDurationNs());
    }
}
