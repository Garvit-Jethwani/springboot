package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundRankDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Constant_getRankList_9326602f94_Test {

    @Test
    public void testGetRankList_Success() {
        List<FundRankDto> expected = Arrays.asList(
                new FundRankDto(1, "Rank 1"),
                new FundRankDto(2, "Rank 2"),
                new FundRankDto(3, "Rank 3")
        );

        List<FundRankDto> actual = Constant.getRankList();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetRankList_Empty() {
        List<FundRankDto> expected = Arrays.asList();

        List<FundRankDto> actual = Constant.getRankList();

        Assertions.assertEquals(expected, actual);
    }
}
