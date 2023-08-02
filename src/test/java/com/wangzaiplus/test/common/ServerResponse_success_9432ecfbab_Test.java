package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServerResponse_success_9432ecfbab_Test {

    @Test
    public void testSuccessWithData() {
        Object data = new Object();
        ServerResponse response = new ServerResponse();
        response.setSuccess(true);
        response.setCode(ResponseCode.SUCCESS.getCode());
        response.setData(data);

        Assertions.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assertions.assertNull(response.getMessage());
        Assertions.assertEquals(data, response.getData());
    }

    @Test
    public void testSuccessWithoutData() {
        ServerResponse response = new ServerResponse();
        response.setSuccess(true);
        response.setCode(ResponseCode.SUCCESS.getCode());

        Assertions.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assertions.assertNull(response.getMessage());
        Assertions.assertNull(response.getData());
    }
}
