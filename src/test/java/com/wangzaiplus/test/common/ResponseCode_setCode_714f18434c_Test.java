package com.wangzaiplus.test.common;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ResponseCode_setCode_714f18434c_Test {

    @InjectMocks
    private ResponseCode responseCode;

    @Before
    public void setUp() {
        responseCode = new ResponseCode();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetCode_success() {
        Integer expectedCode = 200;
        responseCode.setCode(expectedCode);
        assertEquals(expectedCode, responseCode.getCode());
    }

    @Test
    public void testSetCode_null() {
        responseCode.setCode(null);
        assertEquals(null, responseCode.getCode());
    }
}
