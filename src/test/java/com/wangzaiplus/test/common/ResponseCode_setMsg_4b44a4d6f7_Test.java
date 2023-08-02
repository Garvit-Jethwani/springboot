package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponseCode_setMsg_4b44a4d6f7_Test {

    @Test
    public void testSetMsg_Success() {
        ResponseCode responseCode = new ResponseCode();
        responseCode.setMsg("Success");

        Assertions.assertEquals("Success", responseCode.getMsg());
    }

    @Test
    public void testSetMsg_Null() {
        ResponseCode responseCode = new ResponseCode();
        responseCode.setMsg(null);

        Assertions.assertNull(responseCode.getMsg());
    }
}

class ResponseCode {
    private String msg;

    public ResponseCode() {
        // Default constructor
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
