package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_success_ed5805ebe1_Test {

    @Test
    public void testSuccessWithMessageAndData() {
        String expectedMsg = "Success";
        Object expectedData = new Object();

        ServerResponse response = new ServerResponse();
        response.setSuccess(expectedMsg, expectedData);

        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertEquals(expectedMsg, response.getMsg());
        Assert.assertEquals(expectedData, response.getData());
    }

    @Test
    public void testSuccessWithEmptyMessageAndNullData() {
        String expectedMsg = "";
        Object expectedData = null;

        ServerResponse response = new ServerResponse();
        response.setSuccess(expectedMsg, expectedData);

        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertEquals(expectedMsg, response.getMsg());
        Assert.assertEquals(expectedData, response.getData());
    }
}
