package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServerResponse_success_4af13fa713_Test {

    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        serverResponse = new ServerResponse();
        serverResponse.setCode(ResponseCode.SUCCESS.getCode());
    }

    @Test
    public void testSuccessMethodReturnsSuccessCode() {
        assertEquals(ResponseCode.SUCCESS.getCode(), serverResponse.getCode());
    }

    @Test
    public void testSuccessMethodReturnsNullData() {
        assertNull(serverResponse.getData());
    }

    @Test
    public void testSuccessMethodReturnsNullMsg() {
        assertNull(serverResponse.getMsg());
    }
}
