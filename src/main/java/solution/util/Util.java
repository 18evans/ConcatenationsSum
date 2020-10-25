package solution.util;

public class Util {

    public static int base2pow(int base, int pow) {
        int result = 1;
        for (int i = 1; i <= pow; i++)
            result *= base;

        return result;
    }

    public static long concat(int[] a, int i, int j) {
        return Long.parseLong(a[i] + String.valueOf(a[j]));
    }
}
