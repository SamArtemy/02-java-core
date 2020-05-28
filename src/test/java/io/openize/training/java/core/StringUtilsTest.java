package io.openize.training.java.core;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    //not working
    @Test
    public void testRepeatMethod() {
        StringUtils stringUtils = new StringUtils();
        StringBuilder res = stringUtils.repeat("do", 3);
        Assert.assertEquals(new StringBuilder("dododo"), res);
    }

    @Test
    public void testRemoveSymbolMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("dad", "a");
        Assert.assertEquals("d d", res);
    }

    @Test
    public void testUpperCaseMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.toUpperCase("dad");
        Assert.assertEquals("DAD", res);
    }


}
