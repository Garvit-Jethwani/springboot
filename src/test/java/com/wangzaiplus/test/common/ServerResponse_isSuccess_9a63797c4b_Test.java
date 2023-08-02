package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_isSuccess_9a63797c4b_Test {

    @Test
    public void testIsSuccess_WhenStatusIsSuccess_ReturnsTrue() {
        ServerResponse response = new ServerResponse();
        response.setStatus(ResponseCode.SUCCESS.getCode());
        response.setMessage("Success message");
        boolean actual = response.isSuccess();
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsSuccess_WhenStatusIsNotSuccess_ReturnsFalse() {
        ServerResponse response = new ServerResponse();
        response.setStatus(ResponseCode.ERROR.getCode());
        response.setMessage("Error message");
        boolean actual = response.isSuccess();
        Assert.assertFalse(actual);
    }
}
