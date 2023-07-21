package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundYieldDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class Constant_contains_9b6daf6edb_Test {

    private FundYieldDto[] fundYields;

    @BeforeEach
    public void setUp() {
        FundYieldDto yield1 = new FundYieldDto();
        yield1.setYield("yield1");
        FundYieldDto yield2 = new FundYieldDto();
        yield2.setYield("yield2");
        FundYieldDto yield3 = new FundYieldDto();
        yield3.setYield("yield3");
        fundYields = new FundYieldDto[]{yield1, yield2, yield3};
    }

    @Test
    public void testContainsYieldSuccess() {
        String yield = "yield1";
        boolean result = contains(yield);
        assertTrue(result, "Expected true when yield is present in FundYield values");
    }

    @Test
    public void testContainsYieldFailure() {
        String yield = "yield4";
        boolean result = contains(yield);
        assertFalse(result, "Expected false when yield is not present in FundYield values");
    }

    public boolean contains(String yield) {
        return Arrays.stream(fundYields).anyMatch(fundYield -> fundYield.getYield().equals(yield));
    }
}
