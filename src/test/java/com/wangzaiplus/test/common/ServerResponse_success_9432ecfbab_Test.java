package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ServerResponse_success_9432ecfbab_Test {

    @InjectMocks
    private ServerResponse serverResponse;

    @Mock
    private ResponseCode responseCode;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSuccess_withValidData() {
        String data = "Valid Data";
        when(serverResponse.success(data)).thenReturn(new ServerResponse(responseCode.SUCCESS.getCode(), data));
        ServerResponse response = serverResponse.success(data);
        assertEquals(responseCode.SUCCESS.getCode(), response.getCode());
        assertEquals(data, response.getData());
    }

    @Test
    public void testSuccess_withNullData() {
        when(serverResponse.success(null)).thenReturn(new ServerResponse(responseCode.SUCCESS.getCode(), null));
        ServerResponse response = serverResponse.success(null);
        assertEquals(responseCode.SUCCESS.getCode(), response.getCode());
        assertEquals(null, response.getData());
    }
}
