package io.openize.training.java.core;

import org.apache.commons.lang3.time.StopWatch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {

    BubbleSort bubbleSort = new BubbleSort();

    int[] arrayPositiveElements = {6, 65, 64, 57};
    int[] arrayNegativeElements = {-6, -65, -64, -57};
    int[] arrayMixedElements = {-6, 1, -64, 3};
    int[] arrayZeroElements = {0, 0, 0};
    int[] arrayNull = null;
    int[] arrayEmpty = {};
    int[] arraySingleElement = {6};
    int[] arrayRepeatElements = {6, 6, 6};

    @Test
    public void sortArrayPositiveElements() {
        Assert.assertEquals("[6, 57, 64, 65]", Arrays.toString(bubbleSort.sort(arrayPositiveElements)));
    }

    @Test
    public void sortArrayNegativeElements() {
        Assert.assertEquals("[-65, -64, -57, -6]", Arrays.toString(bubbleSort.sort(arrayNegativeElements)));
    }

    @Test
    public void sortArrayMixedElements() {
        Assert.assertEquals("[-64, -6, 1, 3]", Arrays.toString(bubbleSort.sort(arrayMixedElements)));
    }

    @Test
    public void sortArrayZeroElements() {
        Assert.assertEquals("[0, 0, 0]", Arrays.toString(bubbleSort.sort(arrayZeroElements)));
    }

    @Test
    public void sortArraySingleElement() {
        Assert.assertEquals("[6]", Arrays.toString(bubbleSort.sort(arraySingleElement)));
    }

    @Test
    public void sortArrayRepeatElements() {
        Assert.assertEquals("[6, 6, 6]", Arrays.toString(bubbleSort.sort(arrayRepeatElements)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortNullArray() {
        bubbleSort.sort(arrayNull);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sortEmptyArray() {
        bubbleSort.sort(arrayEmpty);
    }

    @Test
    public void loadTest_SortPositiveElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arrayPositiveElements);
        timer.stop();

        System.out.println("SortPositiveElements: " + (timer.getNanoTime()));
    }

    @Test
    public void loadTest_SortNegativeElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arrayNegativeElements);
        timer.stop();

        System.out.println("SortNegativeElements: " + (timer.getNanoTime()));
    }

    @Test
    public void loadTest_SortMixedElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arrayMixedElements);
        timer.stop();

        System.out.println("SortMixedElements: " + (timer.getNanoTime()));
    }

    @Test
    public void loadTest_SortZeroElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arrayZeroElements);
        timer.stop();

        System.out.println("SortZeroElements: " + (timer.getNanoTime()));
    }

    @Test
    public void loadTest_SortSingleElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arraySingleElement);
        timer.stop();

        System.out.println("SortSingleElement: " + (timer.getNanoTime()));
    }

    @Test
    public void loadTest_SortRepeatElements_Array() {
        StopWatch timer = new StopWatch();
        timer.start();
        bubbleSort.sort(arrayRepeatElements);
        timer.stop();

        System.out.println("SortRepeatElements: " + (timer.getNanoTime()));
    }
}