package io.openize.training.java.core;

public class BubbleSort implements ArraySort {
    @Override
    public int[] sort(int[] nums) {
        boolean isSort = false;
        int count;
        if (nums != null && nums.length > 0) {
            while (!isSort) {
                isSort = true;
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        isSort = false;
                        count = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = count;
                    }
                }
            }
            return nums;
        } else throw new IllegalArgumentException("Array is null/empty");
    }
}
