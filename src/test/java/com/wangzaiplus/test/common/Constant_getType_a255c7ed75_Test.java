package com.wangzaiplus.test.common;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Constant_getType_a255c7ed75_Test {

    @Test
    public void testGetType_WithValidType_ShouldReturnInteger() {
        Constant constant = new Constant();
        constant.setType(1);

        Integer result = constant.getType();

        Assertions.assertEquals(1, result);
    }

    @Test
    public void testGetType_WithInvalidType_ShouldReturnNull() {
        Constant constant = new Constant();
        constant.setType(null);

        Integer result = constant.getType();

        Assertions.assertNull(result);
    }
}

class Constant {
    private Integer type;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
