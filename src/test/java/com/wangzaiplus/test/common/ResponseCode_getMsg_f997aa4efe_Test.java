package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ResponseCode_getMsg_f997aa4efe_Test {

    @Test
    public void testGetMsg_ReturnsCorrectMessage() {
        ResponseCode responseCode = new ResponseCode();
        responseCode.setMsg("Success");

        String expected = "Success";
        String actual = responseCode.getMsg();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMsg_ReturnsNullMessage() {
        ResponseCode responseCode = new ResponseCode();

        String expected = null;
        String actual = responseCode.getMsg();

        Assert.assertEquals(expected, actual);
    }

    public class ResponseCode {
        private String msg;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
