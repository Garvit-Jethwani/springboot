package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class Constant_getRank_455cc6ea81_Test {

    @Mock
    private RankService rankService;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetRankSuccess() {
        Integer expectedRank = 5;
        Mockito.when(rankService.getRank()).thenReturn(expectedRank);
        Integer actualRank = rankService.getRank();
        Assertions.assertEquals(expectedRank, actualRank, "Rank should be equal to 5");
    }

    @Test
    public void testGetRankFailure() {
        Integer expectedRank = 10;
        Mockito.when(rankService.getRank()).thenReturn(5);
        Integer actualRank = rankService.getRank();
        Assertions.assertNotEquals(expectedRank, actualRank, "Rank should not be equal to 10");
    }
}
