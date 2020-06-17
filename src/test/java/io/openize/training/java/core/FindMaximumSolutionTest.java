package io.openize.training.java.core;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumSolutionTest {

    @Test
    public void testArrayMaxElement() {
        FindMaximumSolution findMaximumSolution = new FindMaximumSolution();
        int[] array = {1, 2, 3};

        Assert.assertEquals(3, findMaximumSolution.findMax(array));
    }

    @Test
    public void testArrayNegativeMaxElement() {
        FindMaximumSolution findMaximumSolution = new FindMaximumSolution();
        int[] array = {-1, -2, -3};

        Assert.assertEquals(-1, findMaximumSolution.findMax(array));
    }

    @Test
    public void testArrayZeroAlleMaxElement() {
        FindMaximumSolution findMaximumSolution = new FindMaximumSolution();
        int[] array = {0, 0, 0};

        Assert.assertEquals(0, findMaximumSolution.findMax(array));
    }

    @Test(expected = NullPointerException.class)
    public void testArrayNullMaxElement() {
        FindMaximumSolution findMaximumSolution = new FindMaximumSolution();
        int[] array = null;

        findMaximumSolution.findMax(array);
    }
}
