package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundTypeDto;
import com.wangzaiplus.test.enums.FundType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Constant_getTypeList_4292783287_Test {

    @Test
    public void testGetTypeList_Success() {
        List<FundTypeDto> expected = Arrays.stream(FundType.values())
                .map(fundType -> new FundTypeDto(fundType.getType(), fundType.getDesc()))
                .collect(Collectors.toList());

        List<FundTypeDto> actual = Constant.getTypeList();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetTypeList_EmptyList() {
        List<FundTypeDto> expected = new ArrayList<>();

        List<FundTypeDto> actual = Constant.getTypeList();

        Assert.assertEquals(expected, actual);
    }
}
