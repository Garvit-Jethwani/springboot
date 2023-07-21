package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Import ServerResponse class
import com.wangzaiplus.test.ServerResponse;

public class ServerResponse_setMsg_4b44a4d6f7_Test {
    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        serverResponse = new ServerResponse();
    }

    @Test
    public void testSetMsg_NormalScenario() {
        String expectedMsg = "Test message";
        serverResponse.setMsg(expectedMsg);
        assertEquals(expectedMsg, serverResponse.getMsg());
    }

    @Test
    public void testSetMsg_EmptyString() {
        String expectedMsg = "";
        serverResponse.setMsg(expectedMsg);
        assertEquals(expectedMsg, serverResponse.getMsg());
    }

    @Test
    public void testSetMsg_Null() {
        String expectedMsg = null;
        serverResponse.setMsg(expectedMsg);
        assertEquals(expectedMsg, serverResponse.getMsg());
    }
}
