package io.openize.training.java.core;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArrayTest {
    @Test
    public void testArrayInt() {
        int[] array = {1, 2, 3};
        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void testArray() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        Assert.assertArrayEquals(new int[]{1, 2, 3}, array);
    }

    @Test
    public void testCreateArray() {
        Arrays.asList(1, 2, 3);
    }


    @Test
    public void test() {
        int[][] m = {
                {1, 2, 3},
                {1, 2,},
                {1},
        };
        System.out.print(Arrays.deepToString(m));


    }
}
