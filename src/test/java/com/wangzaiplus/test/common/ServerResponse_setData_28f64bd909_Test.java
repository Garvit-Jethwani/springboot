package com.wangzaiplus.test.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ServerResponse_setData_28f64bd909_Test {

    private ServerResponse serverResponse;

    @BeforeEach
    public void setUp() {
        serverResponse = new ServerResponse();
    }

    @Test
    public void testSetDataWithNonNullValue() {
        String testData = "Test Data";
        serverResponse.setData(testData);
        assertEquals(testData, serverResponse.getData(), "The data should match the set value");
    }

    @Test
    public void testSetDataWithNullValue() {
        serverResponse.setData(null);
        assertNull(serverResponse.getData(), "The data should be null");
    }
}
