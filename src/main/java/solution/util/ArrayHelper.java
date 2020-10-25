package solution.util;

import java.util.Arrays;

/*
Answers:
//  198
//  137500
//  55000000
//  5500000000
//  550000000000
 */
public class ArrayHelper {

    public static int[] getArray3() {
        return new int[]{1, 2, 3};
    }
    public static long getArray3Answer() {
        return 198;
    }

    public static int[] getArray50() {
        int[] arr = new int[50];
        Arrays.fill(arr, 5);
        return arr;
    }
    public static long getArray50Answer() {
        return 137500;
    }

    public static int[] getArrayThousand() {
        int[] arr = new int[Util.base2pow(10, 3)];
        Arrays.fill(arr, 5);
        return arr;
    }
    public static long getArrayThousandAnswer() {
        return 55000000;
    }

    public static int[] getArray10Thousand() {
        int[] arr = new int[Util.base2pow(10, 4)];
        Arrays.fill(arr, 5);
        return arr;
    }
    public static long getArray10ThousandAnswer() {
        return 5500000000L;
    }

    public static int[] getArray100Thousand() {
        int[] arr = new int[Util.base2pow(10, 5)];
        Arrays.fill(arr, 5);
        return arr;
    }
    public static long getArray100ThousandAnswer() {
        return 550000000000L;
    }
}
