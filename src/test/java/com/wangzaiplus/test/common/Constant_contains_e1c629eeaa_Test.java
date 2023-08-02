package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Constant_contains_e1c629eeaa_Test {

    @Test
    public void testContains_ExistingType_ReturnsTrue() {
        // Arrange
        Integer type = 1;

        // Act
        boolean result = Constant.contains(type);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testContains_NonExistingType_ReturnsFalse() {
        // Arrange
        Integer type = 5;

        // Act
        boolean result = Constant.contains(type);

        // Assert
        assertFalse(result);
    }
}
