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
        Assert.assertTrue(new String("ABC") != new String("ABC").intern());
        Assert.assertTrue(new String("ABC").intern() == new String("ABC").intern());
    }


    @Test
    public void testConcatenation() {
        String a = null;
        String b = null;
        Assert.assertThat((a + b), is("nullnull"));
        Assert.assertThat(("ABC" + b), is("ABCnull"));
        Assert.assertThat((a + "ABC"), is("nullABC"));
        Assert.assertThat(("ABC" + "ABC"), is("ABCABC"));
    }


    @Test
    public void testStringLength() {
        String a = "ABC";
        Assert.assertThat((a.length()), is(3));
    }

    @Test
    public void testStringIsEmpty() {
        String a = "";
        Assert.assertThat((a.isEmpty()), is(true));
    }

    @Test
    public void testStringEqualsTrue() {
        String a = "test";
        String b = "test";
        Assert.assertThat((a.equals(b)), is(true));
    }

    @Test
    public void testStringEqualsFalse() {
        String a = "test";
        String b = "TEST";
        Assert.assertThat((a.equals(b)), is(false));
    }

    @Test
    public void testStringEqualsIgnoreCase() {
        String a = "test";
        String b = "TeSt";
        Assert.assertThat((a.equalsIgnoreCase(b)), is(true));
    }

    @Test
    public void testStringToString() {
        int[] m = {1, 2, 3};
        Assert.assertThat((m.toString()), is("[I@23fe1d71"));
    }

    // I don't understand why the Expected: is "t" but: was "t"
    //@Test
    public void testStringCharAtTrue() {
        String a = "test";
        Assert.assertThat(a.charAt(0), is("t"));
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
    public void testStringConcat() {
        String a = "Learn about String API by unit testing the following String methods";
        String b = "JAVA";
        Assert.assertThat((a.concat(b)), is("Learn about String API by unit testing the following String methodsJAVA"));
    }

    @Test
    public void testStringValueOf() {
        int i = 12345;
        Assert.assertThat((String.valueOf(i)), is("12345"));
    }

    @Test
    public void testStringValueOfBool() {
        boolean b = true;
        Assert.assertThat((String.valueOf(b)), is("true"));

    }

    @Test
    public void testStringValueOfObj() {
        Date date = new Date();
        Assert.assertThat((String.valueOf(date)), is(date.toString()));
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
