package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_error_df81d4fb46_Test {

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testErrorMethodWithValidMessage() {
        String testMessage = "Test error message";
        ServerResponse response = new ServerResponse();
        response = response.error(testMessage);
        assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        assertEquals(testMessage, response.getMsg());
    }

    @Test
    public void testErrorMethodWithNullMessage() {
        String testMessage = null;
        ServerResponse response = new ServerResponse();
        response = response.error(testMessage);
        assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        assertEquals(testMessage, response.getMsg());
    }
}
