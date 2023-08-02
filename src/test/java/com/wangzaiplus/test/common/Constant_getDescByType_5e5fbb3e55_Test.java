package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundTypeDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

public class Constant_getDescByType_5e5fbb3e55_Test {

    private static final String UNKNOWN_TYPE = "Unknown Type";

    @Test
    public void testGetDescByType_ExistingType_ShouldReturnDescription() {
        // Arrange
        Integer type = 1;
        FundTypeDto[] values = {new FundTypeDto(1, "Growth"), new FundTypeDto(2, "Value"), new FundTypeDto(3, "Blend")};

        // Act
        String result = Constant.getDescByType(type);

        // Assert
        Assertions.assertEquals("Growth", result);
    }

    @Test
    public void testGetDescByType_NonExistingType_ShouldReturnUnknownType() {
        // Arrange
        Integer type = 4;
        FundTypeDto[] values = {new FundTypeDto(1, "Growth"), new FundTypeDto(2, "Value"), new FundTypeDto(3, "Blend")};

        // Act
        String result = Constant.getDescByType(type);

        // Assert
        Assertions.assertEquals(UNKNOWN_TYPE, result);
    }
}
