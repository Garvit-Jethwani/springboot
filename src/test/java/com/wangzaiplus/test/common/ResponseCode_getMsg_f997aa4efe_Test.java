package com.wangzaiplus.test.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ResponseCode_getMsg_f997aa4efe_Test {

    private ResponseCode responseCode;

    @BeforeEach
    public void setUp() {
        // assume that ResponseCode is an enum and SUCCESS is one of its constants
        responseCode = ResponseCode.SUCCESS;
    }

    @Test
    public void testGetMsg_success() {
        String expectedMessage = "Success message";
        responseCode.setMsg(expectedMessage);
        String actualMessage = responseCode.getMsg();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMsg_empty() {
        responseCode = ResponseCode.EMPTY;
        String expectedMessage = "";
        responseCode.setMsg(expectedMessage);
        String actualMessage = responseCode.getMsg();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetMsg_null() {
        responseCode = ResponseCode.NULL;
        String expectedMessage = null;
        responseCode.setMsg(expectedMessage);
        String actualMessage = responseCode.getMsg();
        assertEquals(expectedMessage, actualMessage);
    }
}
