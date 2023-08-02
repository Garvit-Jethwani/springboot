package com.wangzaiplus.test.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServerResponse_getData_9a28503eab_Test {

    private ServerResponse serverResponse;

    @Before
    public void setUp() {
        serverResponse = new ServerResponse();
    }

    @Test
    public void testGetDataSuccess() {
        // TODO: Change the value of 'data' to a valid response
        Object expectedData = null;

        serverResponse.setData(expectedData);

        Object actualData = serverResponse.getData();

        Assert.assertEquals(expectedData, actualData);
    }

    @Test
    public void testGetDataNull() {
        serverResponse.setData(null);

        Object actualData = serverResponse.getData();

        Assert.assertNull(actualData);
    }

    private static class ServerResponse {
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
