package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServerResponse_setStatus_884b3f8d4a_Test {

    @Test
    public void testSetStatus_Success() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatus(200);
        
        Assertions.assertEquals(200, serverResponse.getStatus());
    }
    
    @Test
    public void testSetStatus_NullValue() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatus(null);
        
        Assertions.assertNull(serverResponse.getStatus());
    }
    
    @Test
    public void testSetStatus_NegativeValue() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatus(-1);
        
        Assertions.assertEquals(-1, serverResponse.getStatus());
    }
    
    @Test
    public void testSetStatus_ZeroValue() {
        ServerResponse serverResponse = new ServerResponse();
        serverResponse.setStatus(0);
        
        Assertions.assertEquals(0, serverResponse.getStatus());
    }
}
