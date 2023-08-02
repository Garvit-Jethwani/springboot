package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseCode_setCode_714f18434c_Test {

    @Test
    public void testSetCode_Success() {
        ResponseCode responseCode = new ResponseCode();
        responseCode.setCode(200);
        Assertions.assertEquals(200, responseCode.getCode());
    }
    
    @Test
    public void testSetCode_Null() {
        ResponseCode responseCode = new ResponseCode();
        responseCode.setCode(null);
        Assertions.assertNull(responseCode.getCode());
    }
}
