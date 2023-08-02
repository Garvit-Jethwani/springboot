package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ResponseCode_getCode_a35ebf8530_Test {

    private ResponseCode responseCode;

    @Before
    public void setUp() {
        responseCode = new ResponseCode();
    }

    @Test
    public void testGetCode_ReturnsCode_Success() {
        Integer expectedCode = 200;
        Integer actualCode = responseCode.getCode();
        Assert.assertEquals(expectedCode, actualCode);
    }

    @Test
    public void testGetCode_ReturnsNull_Failure() {
        Integer expectedCode = null;
        Integer actualCode = responseCode.getCode();
        Assert.assertEquals(expectedCode, actualCode);
    }
}
