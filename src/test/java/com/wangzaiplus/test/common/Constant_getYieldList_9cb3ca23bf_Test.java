package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundYieldDto;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Constant_getYieldList_9cb3ca23bf_Test {

    @Test
    public void testGetYieldList_Success() {
        List<FundYieldDto> expected = Arrays.asList(
                new FundYieldDto(0.01, "Low Yield"),
                new FundYieldDto(0.05, "Medium Yield"),
                new FundYieldDto(0.1, "High Yield")
        );

        List<FundYieldDto> actual = Constant.getYieldList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetYieldList_Empty() {
        List<FundYieldDto> expected = Arrays.asList();

        List<FundYieldDto> actual = Constant.getYieldList();

        Assert.assertEquals(expected, actual);
    }
}
