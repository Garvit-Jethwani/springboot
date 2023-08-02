package com.wangzaiplus.test.common;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Constant_getDesc_d1e35daf7e_1690968496_Test {

    @Test
    public void testGetDesc_Success() {
        Constant constant = new Constant();
        constant.setDesc("Test Description");
        
        String expected = "Test Description";
        String actual = constant.getDesc();
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetDesc_Null() {
        Constant constant = new Constant();
        constant.setDesc(null);
        
        String expected = null;
        String actual = constant.getDesc();
        
        assertEquals(expected, actual);
    }
}

class Constant {
    private String desc;
    
    public Constant() {
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public String getDesc() {
        return desc;
    }
}
