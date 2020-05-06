import org.junit.Assert;
import org.junit.Test;

import java.util.Date;


public class StringTest {

    @Test
    public void testEquality() {
        Assert.assertTrue("ABC" == "ABC");
        Assert.assertFalse("ABC" == new String("ABC"));
        Assert.assertFalse(new String("ABC") == new String("ABC"));
        Assert.assertFalse(new String("ABC").intern() == new String("ABC"));
        Assert.assertFalse(new String("ABC") == new String("ABC").intern());
        Assert.assertTrue(new String("ABC").intern() == new String("ABC").intern());
    }


    @Test
    public void testConcatenation() {
        Assert.assertEquals("nullnull", (String) null + (String) null);
        Assert.assertEquals("ABCnull", "ABC" + null);
        Assert.assertEquals("nullABC", (String) null + "ABC");
        Assert.assertEquals("ABCABC", "ABC" + "ABC");
    }


    @Test
    public void testStringLength() {
        Assert.assertEquals(3, "ABC".length());
    }

    @Test
    public void testStringIsEmpty() {
        Assert.assertEquals(true, "".isEmpty());
    }

    @Test
    public void testStringEquals() {
        Assert.assertEquals(true, "test".equals("test"));
        Assert.assertEquals(false, "test".equals("TEST"));
    }


    @Test
    public void testStringEqualsIgnoreCase() {
        Assert.assertEquals(true, "test".equalsIgnoreCase("TeSt"));
    }

    @Test
    public void testStringToString() {
        Assert.assertEquals("abc", "abc".toString());
    }

    @Test
    public void testStringCharAtTrue() {
        Assert.assertEquals('t', "test".charAt(0));
    }

    @Test
    public void testStringStartsWith() {
        Assert.assertTrue("Learning Java".startsWith("Learn"));
        Assert.assertFalse("Learning Java".startsWith("Java"));
    }


    @Test
    public void testStringEndsWithTrue() {
        Assert.assertTrue("Learning Java Junior".endsWith("or"));
        Assert.assertFalse("Learning Java Junior".endsWith("Jun"));
    }

    @Test
    public void testStringContainsTrue() {
        Assert.assertTrue("Learn about String API by unit testing the following String methods".contains("by unit testing the following"));
        Assert.assertFalse("Learn about String API by unit testing the following String methods".contains("concatenation"));

    }

    @Test
    public void testStringConcat() {
        Assert.assertEquals("Learn about String API by unit testing the following String methodsJAVA",
                "Learn about String API by unit testing the following String methods".concat("JAVA"));
    }

    @Test(expected = NullPointerException.class)
    public void testStringValueOf() {
        Date date = new Date(1588766615);
        Assert.assertEquals("12345", String.valueOf(12345));
        Assert.assertEquals("true", String.valueOf(true));
        Assert.assertEquals("Mon Jan 19 12:19:26 MSK 1970", String.valueOf(date));
        Assert.assertEquals(NullPointerException.class, String.valueOf(null));
    }

    @Test
    public void testStringReplace() {
        Assert.assertEquals("Jeve", "Java".replace("a", "e"));
    }
}
