package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_error_8db72139f6_Test {

    @Test
    public void testErrorWithData() {
        Object data = new Object();
        ServerResponse response = new ServerResponse();
        response.error(data);
        
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertNull(response.getMessage());
        Assert.assertEquals(data, response.getData());
    }
    
    @Test
    public void testErrorWithoutData() {
        ServerResponse response = new ServerResponse();
        response.error(null);
        
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertNull(response.getMessage());
        Assert.assertNull(response.getData());
    }
}
