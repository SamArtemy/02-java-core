import org.junit.Assert;
import org.junit.Test;

public class NumberClass {

    @Test
    public void testShortPrimitive() {
        short value = (short) 123.45678;
        Assert.assertEquals(123, value);
    }

    @Test
    public void testBytePrimitive() {
        byte value = (byte) 123.45678;
        Assert.assertEquals(123, value);
    }

    @Test
    public void testIntPrimitive() {
        int value = (int) 123.45678;
        Assert.assertEquals(123, value);
    }

    @Test
    public void testLongPrimitive() {
        long value = (long) 123.45678;
        Assert.assertEquals(123, value);
    }

    @Test
    public void testFloatPrimitive() {
        float value = (float) 123.45678;
        Assert.assertEquals(123.0, value, 123.45677947998047);
    }

    @Test
    public void testDoublePrimitive() {
        double value = (double) 123.45678;
        Assert.assertEquals(123.0, value, 123.45678);
    }

    @Test
    public void testIntegerObject() {
        Assert.assertEquals(new Integer(123), Integer.valueOf(123));
    }

    @Test
    public void testPrimitiveObject() {
        Assert.assertEquals(new Short((short) 123.45678), Short.valueOf((short) 123));
        Assert.assertEquals(new Byte((byte) 123.45678), Byte.valueOf((byte) 123));
        Assert.assertEquals(new Long((long) 123.45678), Long.valueOf(123));
        Assert.assertEquals(new Float((float) 123.0), Float.valueOf(123));
        Assert.assertEquals(new Double(123.0), Double.valueOf(123));
    }

    @Test
    public void testStringRepresentationType() {
        Assert.assertEquals("123", String.valueOf(123));
        Assert.assertEquals("123", String.valueOf((byte) 123.45678));
        Assert.assertEquals("123", String.valueOf(123L));
        Assert.assertEquals("123.0", String.valueOf(123F));
        Assert.assertEquals("123.0", String.valueOf(123D));

    }

    @Test
    public void testMultiplicationType() {
        Assert.assertEquals(369, 123 * 3);
        Assert.assertEquals(369, (byte) 123.45678 * 3);
        Assert.assertEquals(369, 123L * 3);
        Assert.assertEquals(369.0, 123F * 3, 1e-8);
        Assert.assertEquals(369.0, 123D * 3, 1e-8);

    }

    @Test
    public void testDivision10Type() {
        Assert.assertEquals(12, 123 / 10);
        Assert.assertEquals(12, (byte) 123.45678 / 10);
        Assert.assertEquals(12, 123L / 10);
        Assert.assertEquals(12.300000190734863, 123F / 10, 1e-8);
        Assert.assertEquals(12.3, 123D / 10, 1e-8);

    }
    //I don't know how to correct this test
    @Test(expected = ArithmeticException.class)
    public void testDivisionZeroType() {
        Assert.assertEquals(12, 123 / 0);
        Assert.assertEquals(12, (byte) 123.45678 / 0);
        Assert.assertEquals(12, 123L / 0);
        Assert.assertEquals(12.300000190734863, 123F / 0, 1e-8);
        Assert.assertEquals(12.3, 123D / 0, 1e-8);

    }


}
