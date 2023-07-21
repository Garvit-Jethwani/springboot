package com.wangzaiplus.test.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ResponseCode_getCode_a35ebf8530_Test {

    private ResponseCode responseCode;

    @BeforeEach
    public void setup() {
        responseCode = Mockito.mock(ResponseCode.class);
    }

    @Test
    public void testGetCode_Success() {
        // TODO: Change the value of the code as per your requirement.
        Integer expectedCode = 200;
        Mockito.when(responseCode.getCode()).thenReturn(expectedCode);

        Integer actualCode = responseCode.getCode();
        assertEquals(expectedCode, actualCode);
    }

    @Test
    public void testGetCode_Failure() {
        // TODO: Change the value of the code as per your requirement.
        Integer expectedCode = 200;
        Mockito.when(responseCode.getCode()).thenReturn(404);

        Integer actualCode = responseCode.getCode();
        assertNotEquals(expectedCode, actualCode);
    }
}
