package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_getMsg_f997aa4efe_Test {

    @Test
    public void testGetMsg_WhenMsgIsNull_ReturnsNull() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setMsg(null);

        String result = serverResponse.getMsg();

        Assert.assertNull(result);
    }

    @Test
    public void testGetMsg_WhenMsgIsNotEmpty_ReturnsMsg() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setMsg("Hello, world!");

        String result = serverResponse.getMsg();

        Assert.assertEquals("Hello, world!", result);
    }
}
