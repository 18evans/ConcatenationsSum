package solution.impl;

import solution.ConcatenationSumStrategy;

public class LinearSolution implements ConcatenationSumStrategy {
    @Override
    public long concatenationSum(int[] a) {
        int n = a.length;

        int sumLow = 0;
        long sumHighOffset = 0;

        //step 1: get all of the same integer: ie. i == j
        for (int j : a) {
            sumLow += j;

            int digit = String.valueOf(j).length();
            sumHighOffset += Math.pow(10, digit);
        }

        return sumLow * (n + sumHighOffset);
    }
}
