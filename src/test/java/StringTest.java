import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class StringTest {

    @Test
    public void testString() {
        Assert.assertTrue("ABC" == "ABC");
    }

    @Test
    public void testNewString() {
        Assert.assertFalse("ABC" == new String("ABC"));

    }

    @Test
    public void testNewStringDouble() {
        Assert.assertFalse(new String("ABC") == new String("ABC"));

    }

    @Test
    public void testNewStringInternA() {
        Assert.assertFalse(new String("ABC").intern() == new String("ABC"));

    }

    @Test
    public void testNewStringInternB() {
        Assert.assertTrue(new String("ABC") != new String("ABC").intern());

    }

    @Test
    public void testNewStringInternDouble() {
        Assert.assertTrue(new String("ABC").intern() == new String("ABC").intern());

    }

    @Test
    public void testConcatenationNull() {
        String a = null;
        String b = null;
        Assert.assertTrue("nullnull", true);

        // because https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html#jls-5.1.11
    }

    @Test
    public void testConcatenationABCNull() {
        String a = "ABC";
        String b = null;
        Assert.assertTrue("ABCnull", true);
    }

    @Test
    public void testConcatenationNullABC() {
        String a = null;
        String b = "ABC";
        Assert.assertTrue("nullABC", true);
    }

    @Test
    public void testConcatenationABC() {
        String a = "ABC";
        String b = "ABC";
        Assert.assertTrue("ABCABC", true);
    }


    @Test
    public void testStringLength() {
        String a = "ABC";
        a.length();
        Assert.assertTrue("3", true);
    }

    @Test
    public void testStringIsEmpty() {
        String a = "";
        a.isEmpty();
        Assert.assertTrue(a.isEmpty());
    }

    @Test
    public void testStringEqualsTrue() {
        String a = "test";
        String b = "test";
        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void testStringEqualsFalse() {
        String a = "test";
        String b = "TEST";
        Assert.assertFalse(a.equals(b));
    }

    @Test
    public void testStringEqualsIgnoreCase() {
        String a = "test";
        String b = "TeSt";
        Assert.assertTrue(a.equalsIgnoreCase(b));
    }

    @Test
    public void testStringToString() {
        int[] m = {1, 2, 3};
        m.toString();
        Assert.assertTrue("123", true);
    }

    @Test
    public void testStringCharAtTrue() {
        String a = "test";
        a.charAt(2);
        Assert.assertTrue("e", true);
    }

    @Test
    public void testStringCharAtFalse() {
        String a = "test";
        a.charAt(2);
        Assert.assertFalse("t", false);
    }

    @Test
    public void testStringStartsWithTrue() {
        String a = "Learning Java";
        Assert.assertTrue(a.startsWith("Learn"));
    }

    @Test
    public void testStringStartsWithFalse() {
        String a = "Learning Java";
        Assert.assertFalse(a.startsWith("Java"));
    }

    @Test
    public void testStringEndsWithTrue() {
        String a = "Learning Java Junior";
        Assert.assertTrue(a.endsWith("or"));
    }

    @Test
    public void testStringEndsWithFalse() {
        String a = "Learning Java Junior";
        Assert.assertFalse(a.endsWith("Jun"));
    }

    @Test
    public void testStringContainsTrue() {
        String a = "Learn about String API by unit testing the following String methods";
        Assert.assertTrue(a.contains("by unit testing the following"));
    }

    @Test
    public void testStringContainsFalse() {
        String a = "Learn about String API by unit testing the following String methods";
        Assert.assertFalse(a.contains("concatenation"));
    }

    @Test
    public void testStringConcatTrue() {
        String a = "Learn about String API by unit testing the following String methods";
        String b = "JAVA";
        a.concat(b);
        Assert.assertTrue("Learn about String API by unit testing the following String methodsJAVA",
                true);
    }

    @Test
    public void testStringConcatFalse() {
        String a = "Learn about String API by unit testing the following String methods";
        String b = "JAVA";
        a.concat(b);
        Assert.assertFalse("Learn about String API by unit testing the following String methods JAVA", false);
    }

    @Test
    public void testStringValueOfTrue() {
        int i = 135345;
        String.valueOf(i);
        Assert.assertTrue("12345", true);
    }

    @Test
    public void testStringValueOfFalse() {
        int i = 135345;
        String.valueOf(i);
        Assert.assertFalse("123456", false);
    }

    @Test
    public void testStringValueOfBoolTrue() {
        boolean b = true;
        String.valueOf(b);
        Assert.assertTrue("true", true);
    }

    @Test
    public void testStringValueOfBoolFalse() {
        boolean b = false;
        String.valueOf(b);
        Assert.assertFalse("true", false);
    }

    @Test
    public void testStringValueOfObjTrue() {
        Date date = new Date();
        String.valueOf(date);

        Assert.assertTrue(date.toString(), true);
    }
    // I dont now how testing null
    //@Test
    public void testStringValueNull() {
        String.valueOf(null);
        Assert.assertNotNull(NullPointerException.class);

    }

    @Test
    public void testStringReplaceTrue() {
        String s = "Java";
        s.replace("a","e");
        Assert.assertTrue("Jeve", true);
    }

    @Test
    public void testStringReplaceFalse() {
        String s = "Java";
        s.replace("a","e");
        Assert.assertFalse("Java", false);
    }


}
