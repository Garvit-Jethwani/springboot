package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServerResponse_setData_28f64bd909_Test {

    private ServerResponse serverResponse;

    @Before
    public void setUp() {
        serverResponse = new ServerResponse();
    }

    @Test
    public void testSetData_Success() {
        // Arrange
        Object expectedData = new Object();

        // Act
        serverResponse.setData(expectedData);

        // Assert
        Object actualData = serverResponse.getData();
        Assert.assertEquals(expectedData, actualData);
    }

    @Test
    public void testSetData_Null() {
        // Arrange
        Object expectedData = null;

        // Act
        serverResponse.setData(expectedData);

        // Assert
        Object actualData = serverResponse.getData();
        Assert.assertEquals(expectedData, actualData);
    }

    private static class ServerResponse implements Serializable {
        @JsonIgnore
        private Object data;

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }
    }
}
