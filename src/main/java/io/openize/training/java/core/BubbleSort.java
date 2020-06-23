package io.openize.training.java.core;

public class BubbleSort implements ArraySort {
    @Override
    public int[] sort(int[] nums) {
        boolean isSort = false;
        int element;
        if (nums != null && nums.length > 0) {
            while (!isSort) {
                isSort = true;
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        isSort = false;
                        element = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = element;
                    }
                }
            }
            return nums;
        } else throw new IllegalArgumentException("Array is null/empty");
    }
}
