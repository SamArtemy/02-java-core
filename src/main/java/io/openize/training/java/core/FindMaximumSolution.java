package io.openize.training.java.core;

public class FindMaximumSolution implements FindMaximumProblem {
    public int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
