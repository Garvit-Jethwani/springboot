package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_isSuccess_9a63797c4b_Test {

    @Mock
    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testIsSuccess_True() {
        Mockito.when(serverResponse.isSuccess()).thenReturn(true);
        boolean result = serverResponse.isSuccess();
        assertEquals(true, result, "isSuccess should return true when status is ResponseCode.SUCCESS.getCode()");
    }

    @Test
    public void testIsSuccess_False() {
        Mockito.when(serverResponse.isSuccess()).thenReturn(false);
        boolean result = serverResponse.isSuccess();
        assertEquals(false, result, "isSuccess should return false when status is not ResponseCode.SUCCESS.getCode()");
    }
}
