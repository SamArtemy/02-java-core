import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.CoreMatchers.is;

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
        Assert.assertThat((String)null + (String)null, is("nullnull"));
        Assert.assertThat(("ABC" + null), is("ABCnull"));
        Assert.assertThat(((String)null + "ABC"), is("nullABC"));
        Assert.assertThat(("ABC" + "ABC"), is("ABCABC"));
    }


    @Test
    public void testStringLength() {
        Assert.assertThat(("ABC".length()), is(3));
    }

    @Test
    public void testStringIsEmpty() {
        Assert.assertThat(("".isEmpty()), is(true));
    }

    @Test
    public void testStringEqualsTrue() {
        Assert.assertThat(("test".equals("test")), is(true));
    }

    @Test
    public void testStringEqualsFalse() {
        Assert.assertThat(("test".equals("TEST")), is(false));
    }

    @Test
    public void testStringEqualsIgnoreCase() {
        String a = "test";
        String b = "TeSt";
        Assert.assertThat(("test".equalsIgnoreCase("TeSt")), is(true));
    }

    @Test
    public void testStringToString() {
        int[] m = {1, 2, 3};
        Assert.assertThat((m.toString()), is("[I@23fe1d71"));
    }

    @Test
    public void testStringCharAtTrue() {
        String a = "test";
        Assert.assertThat(a.charAt(0), is('t'));
    }

    @Test
    public void testStringStartsWithTrue() {
        String a = "Learning Java";
        Assert.assertTrue(a.startsWith("Learn"));
    }

    @Test
    public void testStringStartsWithFalse() {
        Assert.assertFalse("Learning Java".startsWith("Java"));
    }

    @Test
    public void testStringEndsWithTrue() {
        Assert.assertTrue("Learning Java Junior".endsWith("or"));
    }

    @Test
    public void testStringEndsWithFalse() {
        Assert.assertFalse("Learning Java Junior".endsWith("Jun"));
    }

    @Test
    public void testStringContainsTrue() {
        Assert.assertTrue("Learn about String API by unit testing the following String methods".contains("by unit testing the following"));
    }

    @Test
    public void testStringContainsFalse() {
        Assert.assertFalse("Learn about String API by unit testing the following String methods".contains("concatenation"));
    }

    @Test
    public void testStringConcat() {
        Assert.assertThat(("Learn about String API by unit testing the following String methods".concat("JAVA")),
                is("Learn about String API by unit testing the following String methodsJAVA"));
    }

    @Test
    public void testStringValueOf() {
        Assert.assertThat((String.valueOf(12345)), is("12345"));
    }

    @Test
    public void testStringValueOfBool() {
        Assert.assertThat((String.valueOf(true)), is("true"));

    }

    @Test
    public void testStringValueOfObj() {
        Date date = new Date(1588766615);
        Assert.assertThat((String.valueOf(date)), is("Mon Jan 19 12:19:26 MSK 1970"));
    }

    // I dont now how testing null
    //@Test
    public void testStringValueNull() {
        String.valueOf(null);
        Assert.assertNotNull(NullPointerException.class);

    }

    @Test
    public void testStringReplace() {
        String s = "Java";
        Assert.assertThat((s.replace("a", "e")), is("Jeve"));
    }
}
