package com.wangzaiplus.test.common;

import org.junit.Assert;
import org.junit.Test;

public class ServerResponse_error_df81d4fb46_Test {

    @Test
    public void testError_Success() {
        // Arrange
        String expectedMsg = "Success";
        
        // Act
        ServerResponse response = new ServerResponse();
        response.error(expectedMsg);
        
        // Assert
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertEquals(expectedMsg, response.getMsg());
        Assert.assertNull(response.getData());
    }
    
    @Test
    public void testError_Failure() {
        // Arrange
        String expectedMsg = "Failure";
        
        // Act
        ServerResponse response = new ServerResponse();
        response.error(expectedMsg);
        
        // Assert
        Assert.assertEquals(ResponseCode.ERROR.getCode(), response.getCode());
        Assert.assertEquals(expectedMsg, response.getMsg());
        Assert.assertNull(response.getData());
    }
}
