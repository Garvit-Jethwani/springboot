package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_success_ed5805ebe1_Test {

    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        serverResponse = new ServerResponse();
    }

    @Test
    public void testSuccessMethod_withValidMsgAndData() {
        String expectedMsg = "Operation Successful";
        String expectedData = "Test Data";
        serverResponse.success(expectedMsg, expectedData);
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getCode());
        assertEquals(expectedMsg, serverResponse.getMsg());
        assertEquals(expectedData, serverResponse.getData());
    }

    @Test
    public void testSuccessMethod_withEmptyMsgAndData() {
        String expectedMsg = "";
        String expectedData = "";
        serverResponse.success(expectedMsg, expectedData);
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getCode());
        assertEquals(expectedMsg, serverResponse.getMsg());
        assertEquals(expectedData, serverResponse.getData());
    }

    @Test
    public void testSuccessMethod_withNullMsgAndData() {
        String expectedMsg = null;
        String expectedData = null;
        serverResponse.success(expectedMsg, expectedData);
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getCode());
        assertEquals(expectedMsg, serverResponse.getMsg());
        assertEquals(expectedData, serverResponse.getData());
    }
}
