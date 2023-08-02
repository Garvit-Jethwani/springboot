package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class Constant_getDesc_d1e35daf7e_1690968195_Test {

    @Test
    public void testGetDesc_Success() {
        Constant constant = new Constant();
        constant.setDesc("Test Description");
        String expectedDesc = "Test Description";
        
        String actualDesc = constant.getDesc();
        
        Assert.assertEquals(expectedDesc, actualDesc);
    }
    
    @Test
    public void testGetDesc_Null() {
        Constant constant = new Constant();
        constant.setDesc(null);
        String expectedDesc = null;
        
        String actualDesc = constant.getDesc();
        
        Assert.assertEquals(expectedDesc, actualDesc);
    }
}
