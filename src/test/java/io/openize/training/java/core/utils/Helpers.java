package io.openize.training.java.core.utils;

public class Helpers {

    private int[] addRandomElementsInArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 1000);
        return array;
    }

    public int[][] createListofRandomArrays(int[][] listArray, int[] array) {
        for(int i = 0; i <listArray.length; i++)
            listArray[i] = addRandomElementsInArray(array);
        return listArray;
    }

}
