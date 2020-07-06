package io.openize.training.java.core.utils;

import java.util.Random;

public class Helpers {

    public int[] addRandomElementsInArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 1000);
        return array;
    }
}
