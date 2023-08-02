package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_error_67c4212269_Test {

    @Test
    public void testErrorWithMessageAndData() {
        String msg = "Error message";
        Object data = new Object();
        
        ServerResponse response = new ServerResponse();
        response.error(msg, data);
        
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertEquals(msg, response.getMsg());
        Assert.assertEquals(data, response.getData());
    }
    
    @Test
    public void testErrorWithMessageOnly() {
        String msg = "Error message";
        
        ServerResponse response = new ServerResponse();
        response.error(msg, null);
        
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertEquals(msg, response.getMsg());
        Assert.assertNull(response.getData());
    }
}
