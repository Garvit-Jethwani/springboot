package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundYieldDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class Constant_getYield_37bc87f195_Test {

    @InjectMocks
    private FundYieldDto fundYieldDto;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetYield_success() {
        String expectedYield = "10%";
        fundYieldDto.setYield(expectedYield);
        String actualYield = fundYieldDto.getYield();
        assertEquals(expectedYield, actualYield);
    }

    @Test
    public void testGetYield_null() {
        fundYieldDto.setYield(null);
        String actualYield = fundYieldDto.getYield();
        assertEquals(null, actualYield);
    }
}
