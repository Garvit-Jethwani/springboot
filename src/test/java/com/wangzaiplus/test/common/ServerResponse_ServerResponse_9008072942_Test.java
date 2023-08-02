package com.wangzaiplus.test.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ServerResponseTest {

    @Test
    public void testGetCode() {
        ServerResponse response = new ServerResponse();
        response.setCode(200);
        assertEquals(200, response.getCode());
    }

    @Test
    public void testGetMessage() {
        ServerResponse response = new ServerResponse();
        response.setMessage("Success");
        assertEquals("Success", response.getMessage());
    }

    @Test
    public void testGetData() {
        ServerResponse response = new ServerResponse();
        response.setData("Data");
        assertEquals("Data", response.getData());
    }
}
