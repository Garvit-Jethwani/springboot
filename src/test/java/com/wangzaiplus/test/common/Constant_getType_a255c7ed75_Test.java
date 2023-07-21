package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class Constant_getType_a255c7ed75_Test {

    @InjectMocks
    private Constant constant;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetTypeSuccess() {
        constant.setType(5);
        Integer expectedType = 5;
        Integer actualType = constant.getType();
        Assertions.assertEquals(expectedType, actualType, "The type should be 5");
    }

    @Test
    public void testGetTypeFailure() {
        constant.setType(7);
        Integer expectedType = 5;
        Integer actualType = constant.getType();
        Assertions.assertNotEquals(expectedType, actualType, "The type should not be 5");
    }

    @Test
    public void testGetTypeNull() {
        try {
            constant.setType(null);
            Integer actualType = constant.getType();
            Assertions.assertNull(actualType, "The type should be null");
        } catch (NullPointerException e) {
            Assertions.fail("Null should be allowed as a type");
        }
    }
}
