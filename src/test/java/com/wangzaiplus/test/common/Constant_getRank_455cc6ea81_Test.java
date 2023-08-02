package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class Constant_getRank_455cc6ea81_Test {

    @Test
    public void testGetRank_Success() {
        Constant constant = new Constant();
        constant.setRank(5);
        
        Integer expectedRank = 5;
        Integer actualRank = constant.getRank();
        
        Assert.assertEquals(expectedRank, actualRank);
    }
    
    @Test
    public void testGetRank_Null() {
        Constant constant = new Constant();
        constant.setRank(null);
        
        Integer expectedRank = null;
        Integer actualRank = constant.getRank();
        
        Assert.assertEquals(expectedRank, actualRank);
    }
}
