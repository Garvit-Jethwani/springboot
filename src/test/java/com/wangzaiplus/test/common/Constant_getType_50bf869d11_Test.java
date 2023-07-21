package com.wangzaiplus.test.common;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class Constant_getType_50bf869d11_Test {

    @InjectMocks
    private Constant constant;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetType_Success() {
        constant.setType("TestType");
        String result = constant.getType();
        assertEquals("TestType", result);
    }

    @Test
    public void testGetType_Null() {
        constant.setType(null);
        String result = constant.getType();
        assertEquals(null, result);
    }
}
