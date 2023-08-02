package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_success_4af13fa713_Test {

    @Test
    public void testSuccessWithNullData() {
        ServerResponse response = new ServerResponse();
        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertNull(response.getData());
        Assert.assertNull(response.getMessage());
    }

    @Test
    public void testSuccessWithNonNullData() {
        Object data = new Object();
        
        ServerResponse response = new ServerResponse(data);
        Assert.assertEquals(ResponseCode.SUCCESS.getCode(), response.getCode());
        Assert.assertEquals(data, response.getData());
        Assert.assertNull(response.getMessage());
    }
}
