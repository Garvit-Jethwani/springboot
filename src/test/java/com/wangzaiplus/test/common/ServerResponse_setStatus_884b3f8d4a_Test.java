package com.wangzaiplus.test.common;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServerResponse_setStatus_884b3f8d4a_Test {

    @InjectMocks
    private ServerResponse serverResponse = new ServerResponse();

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testSetStatus_positive() {
        Integer expectedStatus = 200;
        serverResponse.setStatus(expectedStatus);
        assertEquals(expectedStatus, serverResponse.getStatus(), "Status should be set to the provided value");
    }

    @Test
    public void testSetStatus_negative() {
        Integer expectedStatus = -1;
        serverResponse.setStatus(expectedStatus);
        assertEquals(expectedStatus, serverResponse.getStatus(), "Status should be set to the provided value even if it's negative");
    }
}
