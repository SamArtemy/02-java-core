import org.junit.Assert;
import org.junit.Test;

public class CharTest {

    @Test
    public void testCharEquality() {
        Assert.assertTrue('a' == 'a');
        Assert.assertTrue(Character.valueOf('a') == 'a');
        Assert.assertFalse(Character.valueOf('a') == new Character('a'));
        Assert.assertTrue(Character.valueOf('a') == Character.valueOf('a'));
    }

    @Test
    public void testCharDigit(){
        Assert.assertEquals(3, Character.digit('3', 10));
        Assert.assertEquals(10, Character.digit('A', 16));
    }

    @Test
    public void testCharForDigit(){
        Assert.assertEquals('3', Character.forDigit(3, 10));
        Assert.assertEquals('e', Character.forDigit(14, 16));

    }
    @Test
    public void testCharConcatenation(){
        Assert.assertEquals(131, 'A' + 'B');
        Assert.assertEquals("AB", 'A' + "B");
        Assert.assertEquals(77, ('A' + '\t' + '\u0003' ));
    }
}
