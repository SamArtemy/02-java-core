package io.openize.training.java.core;


import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testRepeatMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.repeat("do", 3);
        Assert.assertEquals("dododo", res);
    }

    @Test
    public void testRemoveSymbolMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("dad", 'a');
        Assert.assertEquals("dd", res);
    }

    @Test
    public void testUpperCaseMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.toUpperCase("dad");
        Assert.assertEquals("DAD", res);
    }

}
