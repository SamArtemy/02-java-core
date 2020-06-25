package io.openize.training.java.core;

public class QuickSort implements ArraySort {

    @Override
    public int[] sort(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        if (nums.length != 0 && low < high) {

            int middle = low + (high - low) / 2;
            int mainElement = nums[middle];

            int i = low, j = high;
            while (i <= j) {
                while (nums[i] < mainElement) {
                    i++;
                }

                while (nums[j] > mainElement) {
                    j--;
                }

                if (i <= j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            }
        } else new IllegalArgumentException("end");
        return nums;
    }
}
