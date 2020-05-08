package io.openize.training.java.core;

import org.junit.Assert;
import org.junit.Test;

public class NumberClass {

    @Test
    public void testShortPrimitive() {
        short value = (short) 123.45678;
        Assert.assertEquals(123, value);
        Assert.assertEquals("123", String.valueOf(value));
        Assert.assertEquals(369, value * 3);
        Assert.assertEquals(12, value / 10);
    }


    @Test()
    public void testBytePrimitive() {
        byte value = (byte) 123.45678;
        Assert.assertEquals(123, value);
        Assert.assertEquals("123", String.valueOf(value));
        Assert.assertEquals(369, value * 3);
        Assert.assertEquals(12, value / 10);
    }

    @Test
    public void testIntPrimitive() {
        int value = (int) 123.45678;
        Assert.assertEquals(123, value);
        Assert.assertEquals("123", String.valueOf(value));
        Assert.assertEquals(369, value * 3);
        Assert.assertEquals(12, value / 10);
    }

    @Test
    public void testLongPrimitive() {
        long value = (long) 123.45678;
        Assert.assertEquals(123, value);
        Assert.assertEquals("123", String.valueOf(value));
        Assert.assertEquals(369, value * 3);
        Assert.assertEquals(12, value / 10);
    }

    @Test
    public void testFloatPrimitive() {
        float value = (float) 123.45678;
        Assert.assertEquals(123.0, value, 123.45677947998047);
        Assert.assertEquals("123.45678", String.valueOf(value));
        Assert.assertEquals(123.45677947998047, value, 1e-8);
        Assert.assertEquals(123.45677947998047, value, 1e-8);
        Assert.assertTrue(Float.isInfinite(value / 0));
    }

    @Test
    public void testDoublePrimitive() {
        double value = (double) 123.45678;
        Assert.assertEquals(123.0, value, 123.45678);
        Assert.assertEquals("123.45678", String.valueOf(value));
        Assert.assertEquals(123.45678, value, 1e-8);
        Assert.assertEquals(123.45678, value, 1e-8);
        Assert.assertTrue(Double.isInfinite(value / 0));
    }

    @Test
    public void testIntegerObject() {
        Assert.assertEquals(new Integer((int) 123.45678), Integer.valueOf((int) 123.45678));
    }

    @Test
    public void testShortObject() {
        Assert.assertEquals(new Short((short) 123.45678), Short.valueOf((short) 123.45678));
    }

    @Test
    public void testByteObject() {
        Assert.assertEquals(new Byte((byte) 123.45678), Byte.valueOf((byte) 123.45678));
    }

    @Test
    public void testLongObject() {
        Assert.assertEquals(new Long((long) 123.45678), Long.valueOf((long) 123.45678));
    }

    @Test
    public void testFloatObject() {
        Float value = new Float(123.45678);
        Assert.assertEquals(new Float(123.45678), Float.valueOf(value));
        Assert.assertTrue(Float.isInfinite(value / 0));

    }

    @Test
    public void testDoubleObject() {
        Double value = new Double(123.45678);
        Assert.assertEquals(new Double(123.45678), Double.valueOf(value));
        Assert.assertTrue(Double.isInfinite(value / 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroShortType() {
        Assert.assertNotNull(((short) 123.45678) / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroIntType() {
        Assert.assertNotNull(((int) 123.45678) / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroByteType() {
        Assert.assertNotNull(((byte) 123.45678) / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroLongType() {
        Assert.assertNotNull(((long) 123.45678) / 0);
    }

    // https://stackoverflow.com/questions/11526432/java-instantiate-short-object-in-java
    // I'm not sure I did it right 4 tests
    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroShortObject() {
        Short value = new Short((short) 123.4567);
        Assert.assertNotNull(value / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroIntObject() {
        Integer value = new Integer((int) 123.4567);
        Assert.assertNotNull(value / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroByteObject() {
        Byte value = new Byte((byte) 123.4567);
        Assert.assertNotNull(value / 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroLongObject() {
        Long value = new Long((long) 123.4567);
        Assert.assertNotNull(value / 0);
    }


}



