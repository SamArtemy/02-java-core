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
    public void testRepeatMethodEmptyText() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.repeat("", 3);
        Assert.assertEquals("", res);
    }

    @Test
    public void testRemoveSymbolMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("United", "ntd");
        Assert.assertEquals("Uie", res);
    }

    @Test
    public void testRemoveSymbolMethodRepeatSymbols() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("tttt", "t");
        Assert.assertEquals("", res);
    }

    @Test
    public void testRemoveSymbolMethodEmptyText() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("", "t");
        Assert.assertEquals("", res);
    }

    @Test
    public void testRemoveSymbolMethodEmptySymbols() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("ttt", "");
        Assert.assertEquals("ttt", res);
    }

    @Test
    public void testRemoveSymbolMethodEmptyAll() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.removeChars("", "");
        Assert.assertEquals("", res);
    }

    @Test
    public void testUpperCaseMethod() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.toUpperCase("dad");
        Assert.assertEquals("DAD", res);
    }

    @Test
    public void testUpperCaseMethodEmpty() {
        StringUtils stringUtils = new StringUtils();
        String res = stringUtils.toUpperCase("");
        Assert.assertEquals("", res);
    }

}
