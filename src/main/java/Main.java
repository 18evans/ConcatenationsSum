import solution.ConcatenationSumStrategy;
import solution.impl.LinearSolution;
import solution.util.ArrayHelper;

public class Main {

    public static void main(String[] args) {
        int[] a = ArrayHelper.getArray3();

        ConcatenationSumStrategy method = new LinearSolution();
        System.out.println("Length array: " + a.length);
        System.out.println();

        //try dp
        long start = System.currentTimeMillis();
        System.out.println("Sum is: " + method.concatenationSum(a));
        System.out.println("Time taken: " + (System.currentTimeMillis() - start));
    }


}
