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

    int[] LOAD_TEST_ARRAY = new int[1000];
    int LOAD_TEST_ITER_COUNT = 1000;

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
    public void loadTest_BubbleSort_Array() {
        StopWatch timer = new StopWatch();
        precondition(LOAD_TEST_ARRAY);
        timer.start();
        for (int i = 0; i < LOAD_TEST_ITER_COUNT; i++) {
            bubbleSort.sort(LOAD_TEST_ARRAY);
        }
        timer.stop();
        System.out.println("BubbleSort: " + (timer.getNanoTime() / 1000) + " ns");
    }

    private int[] precondition(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 1000);
        return array;
    }
}