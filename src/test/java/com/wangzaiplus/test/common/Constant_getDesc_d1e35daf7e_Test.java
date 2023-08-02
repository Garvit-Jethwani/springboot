package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class Constant_getDesc_d1e35daf7e_Test {

    @Test
    public void testGetDesc_Success() {
        Constant constant = new Constant();
        String expectedDesc = "Description";
        constant.setDesc(expectedDesc);

        String actualDesc = constant.getDesc();

        Assert.assertEquals(expectedDesc, actualDesc);
    }

    @Test
    public void testGetDesc_NullDesc() {
        Constant constant = new Constant();
        String expectedDesc = null;

        String actualDesc = constant.getDesc();

        Assert.assertEquals(expectedDesc, actualDesc);
    }
}
