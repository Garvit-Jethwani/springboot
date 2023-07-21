package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_success_cbb331a0e6_Test {

    @Mock
    ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSuccessMethodWithValidMessage() {
        String message = "Operation was successful"; // TODO: Change this message as per your test scenario
        serverResponse.setStatus(ResponseCode.SUCCESS.getCode());
        serverResponse.setMsg(message);
        serverResponse.setData(null);
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getStatus());
        assertEquals(message, serverResponse.getMsg());
        assertEquals(null, serverResponse.getData());
    }

    @Test
    public void testSuccessMethodWithEmptyMessage() {
        String message = ""; // TODO: Change this message as per your test scenario
        serverResponse.setStatus(ResponseCode.SUCCESS.getCode());
        serverResponse.setMsg(message);
        serverResponse.setData(null);
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getStatus());
        assertEquals(message, serverResponse.getMsg());
        assertEquals(null, serverResponse.getData());
    }
}
