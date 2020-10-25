package solution.impl;

import solution.ConcatenationSumStrategy;
import solution.util.Util;

public class NaiveQuadraticSolution implements ConcatenationSumStrategy {
    @Override
    public long concatenationSum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum += Util.concat(a, i, j);
            }
        }

        return sum;
    }
}
