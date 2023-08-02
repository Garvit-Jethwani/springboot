package com.wangzaiplus.test.common;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ServerResponse_ServerResponse_6c901490ae_Test {

    @Test
    public void testConstructorWithValidParameters() {
        // Arrange
        Integer status = 200;
        String msg = "Success";
        Object data = new Object();

        // Act
        ServerResponse serverResponse = new ServerResponse(status, msg, data);

        // Assert
        assertEquals(status, serverResponse.getStatus());
        assertEquals(msg, serverResponse.getMsg());
        assertEquals(data, serverResponse.getData());
    }

    @Test
    public void testConstructorWithNullData() {
        // Arrange
        Integer status = 400;
        String msg = "Bad Request";
        Object data = null;

        // Act
        ServerResponse serverResponse = new ServerResponse(status, msg, data);

        // Assert
        assertEquals(status, serverResponse.getStatus());
        assertEquals(msg, serverResponse.getMsg());
        assertEquals(data, serverResponse.getData());
    }
}
