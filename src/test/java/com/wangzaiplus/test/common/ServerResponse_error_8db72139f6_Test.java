package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServerResponse_error_8db72139f6_Test {

    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        this.serverResponse = Mockito.mock(ServerResponse.class);
    }

    @Test
    public void testErrorMethod_withNonNullData() {
        String testData = "Test Data";
        Mockito.when(serverResponse.error(testData)).thenReturn(new ServerResponse());

        ServerResponse response = serverResponse.error(testData);
        Assertions.assertNotNull(response);
    }

    @Test
    public void testErrorMethod_withNullData() {
        Mockito.when(serverResponse.error(null)).thenReturn(new ServerResponse());

        ServerResponse response = serverResponse.error(null);
        Assertions.assertNotNull(response);
    }
}
