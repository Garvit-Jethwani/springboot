package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_ServerResponse_6c901490ae_Test {
    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        serverResponse = new ServerResponse();
        serverResponse.setStatus(200);
        serverResponse.setMsg("Success");
        serverResponse.setData("Test Data");
    }

    @Test
    public void testServerResponseStatus() {
        assertEquals(200, serverResponse.getStatus(), "Status should be 200");
    }

    @Test
    public void testServerResponseMsg() {
        assertEquals("Success", serverResponse.getMsg(), "Message should be Success");
    }

    @Test
    public void testServerResponseData() {
        assertEquals("Test Data", serverResponse.getData(), "Data should be Test Data");
    }
}
