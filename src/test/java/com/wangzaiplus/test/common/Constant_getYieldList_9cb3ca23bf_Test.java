package com.wangzaiplus.test.common;

import com.wangzaiplus.test.dto.FundYieldDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Constant_getYieldList_9cb3ca23bf_Test {

    @InjectMocks
    private Constant constant;

    @BeforeEach
    void setUp() {
        constant = new Constant();
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetYieldListSuccess() {
        List<FundYieldDto> result = constant.getYieldList();
        assertEquals(2, result.size());
        assertEquals("yield1", result.get(0).getYield());
        assertEquals("desc1", result.get(0).getDesc());
        assertEquals("yield2", result.get(1).getYield());
        assertEquals("desc2", result.get(1).getDesc());
    }

    @Test
    public void testGetYieldListFailure() {
        List<FundYieldDto> result = constant.getYieldList();
        assertEquals(0, result.size());
    }
}
