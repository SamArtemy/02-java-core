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
        Assert.assertEquals(370.3703308105469, value * 3, 0.0f);
        Assert.assertEquals(12.345678329467773, value / 10, 0.0f);
        Assert.assertTrue(Float.isInfinite(value / 0));
    }

    @Test
    public void testDoublePrimitive() {
        double value = (double) 123.45678;
        Assert.assertEquals(123.0, value, 123.45678);
        Assert.assertEquals("123.45678", String.valueOf(value));
        Assert.assertEquals(370.37034, value * 3, 0.0f);
        Assert.assertEquals(12.345678, value / 10, 0.0f);
        Assert.assertTrue(Double.isInfinite(value / 0));
    }

    @Test
    public void testIntegerObject() {
        Assert.assertEquals(new Integer(123), Integer.valueOf((int) 123.45678));
        Assert.assertEquals("123", Integer.toString((int) 123.45678));
        Assert.assertEquals(new Integer(369), Integer.valueOf((int) 123.45678 * 3));
        Assert.assertEquals(new Integer(12), Integer.valueOf((int) 123.45678 / 10));
    }

    @Test
    public void testShortObject() {
        short value = (short) 123.45678;
        Assert.assertTrue(123 == new Short(value));
        Assert.assertEquals("123", Short.toString((short) 123.45678));
        Assert.assertTrue(369 == new Short(value) * 3);
        Assert.assertTrue(12 == new Short(value) / 10);
    }

    @Test
    public void testByteObject() {
        Assert.assertEquals(new Byte((byte) 123.45678), Byte.valueOf((byte) 123.45678));
        Assert.assertEquals("123", Byte.toString((byte) 123.45678));
        Assert.assertEquals(new Byte((byte) 114), new Byte((byte) (123.45678 * 3)));
        Assert.assertTrue(12 == new Byte((byte) (123 / 10)));
    }

    @Test
    public void testLongObject() {
        Assert.assertEquals(new Long((long) 123.45678), Long.valueOf((long) 123.45678));
        Assert.assertEquals("123", Long.toString((long) 123.45678));
        Assert.assertEquals(new Long(370), new Long((long) (123.45678 * 3)));
        Assert.assertTrue(12.0 == new Long((long) (123 / 10)));
    }

    @Test
    public void testFloatObject() {
        Float value = new Float(123.45678);
        Assert.assertEquals(new Float(123.45678), Float.valueOf(value));
        Assert.assertEquals("123.0", Float.toString((long) 123.45678));
        Assert.assertEquals(new Float(370.37033), new Float((float) (123.45678 * 3)));
        Assert.assertTrue(12.0 == new Float((float) (123 / 10)));
        Assert.assertTrue(Float.isInfinite(value / 0));

    }

    @Test
    public void testDoubleObject() {
        Double value = new Double(123.45678);
        Assert.assertEquals(new Double(123.45678), Double.valueOf(value));
        Assert.assertEquals("123.0", Double.toString((long) 123.45678));
        Assert.assertEquals(new Double(370.37034), new Double(123.45678 * 3));
        Assert.assertEquals(new Double(12.345678), new Double(123.45678 / 10));
        Assert.assertTrue(Double.isInfinite(value / 0));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroShortType() {
        int shouldThrowException = (short) 123.45678 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroIntType() {

        int shouldThrowException = (int) 123.45678 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroByteType() {
        int shouldThrowException = (byte) 123.45678 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroLongType() {
        long shouldThrowException = (long) 123.45678 / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroShortObject() {
        Short value = new Short((short) 123.4567);
        int shouldThrowException = value / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroIntObject() {
        Integer value = new Integer((int) 123.4567);
        int shouldThrowException = value / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroByteObject() {
        Byte value = new Byte((byte) 123.4567);
        int shouldThrowException = value / 0;
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroLongObject() {
        Long value = new Long((long) 123.4567);
        long shouldThrowException = value / 0;
    }


}



