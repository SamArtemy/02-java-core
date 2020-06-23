package io.openize.training.java.core;

public class FindAverageSolution implements FindAverageProblem {

    public double findAverage(double[] nums) {

        if (nums.length > 0) {
            double total = 0;
            for (int i = 0; i < nums.length; i++) {
                total = total + nums[i];
            }
            double average = total / nums.length;
            return average;
        } else {
            throw new IllegalArgumentException("Array is empty");
        }

    }
}
