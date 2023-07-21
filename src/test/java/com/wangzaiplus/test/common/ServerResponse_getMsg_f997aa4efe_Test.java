package com.wangzaiplus.test.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class ServerResponse_getMsg_f997aa4efe_Test {

    @InjectMocks
    ServerResponse serverResponse;

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetMsg_Success() {
        String msg = "Success";
        when(serverResponse.getMsg()).thenReturn(msg);
        String result = serverResponse.getMsg();
        assertEquals(msg, result);
    }

    @Test
    public void testGetMsg_Failure() {
        String msg = "Failure";
        when(serverResponse.getMsg()).thenReturn(msg);
        String result = serverResponse.getMsg();
        assertEquals(msg, result);
    }
}
