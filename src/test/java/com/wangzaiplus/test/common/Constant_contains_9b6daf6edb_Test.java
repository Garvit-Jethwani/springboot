package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundYieldDto;
import org.junit.Test;
import java.util.Arrays;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Constant_contains_9b6daf6edb_Test {

    public static boolean contains(String yield) {
        FundYield[] values = FundYield.values();
        return Arrays.stream(values)
                .filter(fundYield -> fundYield.getYield().equals(yield))
                .findAny()
                .isPresent();
    }

    @Test
    public void testContains_WhenYieldExists_ReturnsTrue() {
        // Arrange
        String yield = "10%";

        // Act
        boolean result = contains(yield);

        // Assert
        assertTrue(result);
    }

    @Test
    public void testContains_WhenYieldDoesNotExist_ReturnsFalse() {
        // Arrange
        String yield = "15%";

        // Act
        boolean result = contains(yield);

        // Assert
        assertFalse(result);
    }
}
