package io.openize.training.java.core;

import org.junit.Assert;
import org.junit.Test;

public class FindAverageSolutionTest {

    FindAverageSolution findAverageSolution = new FindAverageSolution();

    @Test
    public void testArrayAverageElement(){
        double[] array = {1.2, 1.8, 1.5};

        Assert.assertEquals(1.5, findAverageSolution.findAverage(array), 0);
    }

    @Test
    public void testArrayAverageNegativeElement(){
        double[] array = {-1.2, -1.8, -1.5};

        Assert.assertEquals(-1.5, findAverageSolution.findAverage(array), 0);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayAverageNullElement(){
        double[] array = null;

        findAverageSolution.findAverage(array);
    }

    @Test
    public void testArrayAverageZeroElement(){
        double[] array = {0.0, 0.0, 0.0};

        Assert.assertEquals(0.0, findAverageSolution.findAverage(array), 0);
    }

    @Test()
    public void testArrayAverageEmptyElement(){
        double[] array = {};

        Assert.assertEquals(Double.NaN, findAverageSolution.findAverage(array), 0);
    }


}
