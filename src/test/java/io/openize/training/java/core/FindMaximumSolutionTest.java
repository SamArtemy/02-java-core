package io.openize.training.java.core;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumSolutionTest {

    FindMaximumSolution findMaximumSolution = new FindMaximumSolution();


    @Test
    public void testArrayMaxElement() {
        int[] array = {1, 2, 3};

        Assert.assertEquals(3, findMaximumSolution.findMax(array));
    }

    @Test
    public void testArrayNegativeMaxElement() {
        int[] array = {-1, -2, -3};

        Assert.assertEquals(-1, findMaximumSolution.findMax(array));
    }

    @Test
    public void testArrayZeroAlleMaxElement() {
        int[] array = {0, 0, 0};

        Assert.assertEquals(0, findMaximumSolution.findMax(array));
    }

    @Test(expected = NullPointerException.class)
    public void testArrayNullMaxElement() {
        int[] array = null;

        findMaximumSolution.findMax(array);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayEmpty() {
        int[] array = {};

        findMaximumSolution.findMax(array);
    }

    @Test
    public void testArrayUnsortedeMaxElement() {
        int[] array = {4, 6, 1, 5, 8};

        Assert.assertEquals(8, findMaximumSolution.findMax(array));
    }

}
