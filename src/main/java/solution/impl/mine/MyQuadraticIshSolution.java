package solution.impl.mine;

import solution.ConcatenationSumStrategy;

public class MyQuadraticIshSolution implements ConcatenationSumStrategy {
    @Override
    public long concatenationSum(int[] a) {
        int n = a.length;
        int i = 0,
            j = 0;

        //concat first
        long sum = Long.parseLong(String.valueOf(a[i]) + a[j]); //concatenation

        for (int k = 1; k / n < n && k % n < n; k++) {
            i = k / n; //will be: 0, 0, 1, 1 for when i is 0, 1, 2, 3
            j = k % n;

            sum += Long.parseLong(String.valueOf(a[i]) + a[j]); //concatenation
        }

        return sum;
    }
}
