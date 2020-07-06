package io.openize.training.java.core;

import io.openize.training.java.core.utils.Helpers;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    QuickSort quickSort = new QuickSort();
    Helpers helpers = new Helpers();

    int[] arrayPositiveElements = {6, 65, 64, 57};
    int[] LOAD_TEST_ARRAY = new int[1000];
    int[][] LOAD_LIST_ARRAYS = new int[1000][1000];
    int LOAD_TEST_ITER_COUNT = 1000;


    @Test
    public void sortArray() {
        Assert.assertEquals("[6, 57, 64, 65]", Arrays.toString(quickSort.sort(arrayPositiveElements)));
    }

    @Test
    public void loadTest_QuickSort_Array() {
        StopWatch timer = new StopWatch();
        helpers.createListofRandomArrays(LOAD_LIST_ARRAYS, LOAD_TEST_ARRAY);
        timer.start();
        for (int i = 0; i < LOAD_TEST_ITER_COUNT; i++) {
            quickSort.sort(LOAD_LIST_ARRAYS[i]);
        }
        timer.stop();
        System.out.println("QuickSort: " + (timer.getNanoTime() / LOAD_TEST_ITER_COUNT) + " ns");
    }

    @Test
    public void loadTest_BubbleSort_Array() {
        BubbleSort bubbleSort = new BubbleSort();
        StopWatch timer = new StopWatch();
        helpers.createListofRandomArrays(LOAD_LIST_ARRAYS, LOAD_TEST_ARRAY);
        timer.start();
        for (int i = 0; i < LOAD_TEST_ITER_COUNT; i++) {
            bubbleSort.sort(LOAD_LIST_ARRAYS[i]);
        }
        timer.stop();
        System.out.println("BubbleSort: " + (timer.getNanoTime() / LOAD_TEST_ITER_COUNT) + " ns");
    }


}
