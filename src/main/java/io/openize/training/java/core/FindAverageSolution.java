package io.openize.training.java.core;

public class FindAverageSolution implements FindAverageProblem {

    public double findAverage(double[] nums) {
        double total = 0;
        for (int i = 0; i < nums.length; i++) {
            total = total + nums[i];
        }
        double average = total / nums.length;
        return average;
    }
}
