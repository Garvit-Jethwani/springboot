package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class Constant_getDesc_d1e35daf7e_1690968729_Test {

    @Test
    public void testGetDesc_Success() {
        Constant constant = new Constant("Success");
        String expected = "Success";
        String actual = constant.getDesc();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDesc_Null() {
        Constant constant = new Constant(null);
        String expected = null;
        String actual = constant.getDesc();
        Assert.assertEquals(expected, actual);
    }
}

class Constant {
    private String desc;

    public Constant(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
