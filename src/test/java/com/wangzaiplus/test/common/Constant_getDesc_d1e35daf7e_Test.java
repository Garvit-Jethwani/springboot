package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Constant_getDesc_d1e35daf7e_Test {

    @InjectMocks
    private Constant constant;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetDescSuccess() {
        constant.setDesc("Test Success");
        String expectedDesc = "Test Success";
        String actualDesc = constant.getDesc();
        assertEquals(expectedDesc, actualDesc, "The expected description does not match the actual description");
    }

    @Test
    public void testGetDescFailure() {
        constant.setDesc("Test Failure");
        String expectedDesc = "Test Success";
        String actualDesc = constant.getDesc();
        assertEquals(expectedDesc, actualDesc, "The expected description does not match the actual description");
    }

    @Test
    public void testGetDescNull() {
        constant.setDesc(null);
        String expectedDesc = null;
        String actualDesc = constant.getDesc();
        assertNull(actualDesc, "The description should be null");
    }

    @Test
    public void testGetDescEmpty() {
        constant.setDesc("");
        String expectedDesc = "";
        String actualDesc = constant.getDesc();
        assertEquals(expectedDesc, actualDesc, "The expected description does not match the actual description");
    }

    @Test
    public void testGetDescWithSpaces() {
        constant.setDesc("   ");
        String expectedDesc = "   ";
        String actualDesc = constant.getDesc();
        assertEquals(expectedDesc, actualDesc, "The expected description does not match the actual description");
    }
}
