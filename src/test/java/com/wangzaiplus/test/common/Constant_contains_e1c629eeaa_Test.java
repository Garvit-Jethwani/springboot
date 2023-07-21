package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundTypeDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class Constant_contains_e1c629eeaa_Test {

    @Mock
    private FundTypeDto fundTypeDto;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testContainsWithExistingType() {
        int existingType = 1;
        when(fundTypeDto.getType()).thenReturn(existingType);
        assertTrue(Constant.contains(existingType));
    }

    @Test
    public void testContainsWithNonExistingType() {
        int nonExistingType = 100;
        when(fundTypeDto.getType()).thenReturn(nonExistingType);
        assertFalse(Constant.contains(nonExistingType));
    }
}
