package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServerResponse_getStatus_c517c08a29_Test {

    @Test
    public void testGetStatus_Success() {
        ServerResponse serverResponse = new ServerResponse(200, "Success");
        Assertions.assertEquals(200, serverResponse.getStatus());
    }

    @Test
    public void testGetStatus_Failure() {
        ServerResponse serverResponse = new ServerResponse(500, "Internal Server Error");
        Assertions.assertEquals(500, serverResponse.getStatus());
    }
}

class ServerResponse {
    private Integer status;
    private String message;

    public ServerResponse() {
    }

    public ServerResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
