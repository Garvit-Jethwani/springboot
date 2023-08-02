package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_success_cbb331a0e6_Test {

    @Test
    public void testSuccessWithMessage() {
        String expectedMsg = "Success message";
        ServerResponse response = new ServerResponse();
        response.setSuccess(true);
        response.setCode(ResponseCode.SUCCESS.getCode());
        response.setMsg(expectedMsg);
        response.setData(null);

        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertEquals(expectedMsg, response.getMsg());
        Assert.assertNull(response.getData());
    }

    @Test
    public void testSuccessWithNullMessage() {
        ServerResponse response = new ServerResponse();
        response.setSuccess(true);
        response.setCode(ResponseCode.SUCCESS.getCode());
        response.setMsg(null);
        response.setData(null);

        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertNull(response.getMsg());
        Assert.assertNull(response.getData());
    }
}
