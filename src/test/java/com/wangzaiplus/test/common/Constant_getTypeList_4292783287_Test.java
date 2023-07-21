package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundTypeDto;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class Constant_getTypeList_4292783287_Test {

    @Test
    public void testGetTypeList() {
        List<FundTypeDto> fundTypeDtoList = new ArrayList<>();

        // Test if the list is not empty
        Assert.assertFalse(fundTypeDtoList.isEmpty());

        // Test if the list size matches the number of enum values
        Assert.assertEquals(FundType.values().length, fundTypeDtoList.size());

        // Test if each item in the list has the expected type and description
        for (int i = 0; i < fundTypeDtoList.size(); i++) {
            Assert.assertEquals(FundType.values()[i].getType(), fundTypeDtoList.get(i).getType());
            Assert.assertEquals(FundType.values()[i].getDesc(), fundTypeDtoList.get(i).getDesc());
        }
    }

    @Test
    public void testGetTypeListWithNoFundTypes() {
        List<FundTypeDto> fundTypeDtoList = new ArrayList<>();

        // Test if the list is empty
        Assert.assertTrue(fundTypeDtoList.isEmpty());
    }
}
