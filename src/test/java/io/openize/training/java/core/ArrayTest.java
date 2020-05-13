package io.openize.training.java.core;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    @Test
    public void testCreateArray(){
        int[] array = {1,2,3};
        int[] integer = new int[3];
        Arrays.asList(1, 2, 3);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Integer[] arrayInt = list.toArray(Integer[]::new);
    }

    @Test
    public void test(){
        int[][] m = {
                {1, 2, 3},
                {1, 2,},
                {1},
        };

        System.out.print(m.toString());

    }
}
