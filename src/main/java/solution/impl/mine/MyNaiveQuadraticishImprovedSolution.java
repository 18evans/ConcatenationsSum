package solution.impl.mine;

import solution.ConcatenationSumStrategy;

import static solution.util.Util.concat;

@SuppressWarnings("SpellCheckingInspection")
public class MyNaiveQuadraticishImprovedSolution implements ConcatenationSumStrategy {
    @Override
    public long concatenationSum(int[] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) sum += concat(a, i, i); //sum matching indices (i.e. if i == 10 then 10 with 10 == 1010

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) { //todo: confirm
                sum += concat(a, i, j);
                sum += concat(a, j, i);

            }
        }

        return sum;
    }
}
