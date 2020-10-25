package solution;

import org.junit.Assert;
import org.junit.Test;
import solution.util.ArrayHelper;

public abstract class ConcatenationSumTestCases {

    private static final int TIMEOUT_DURATION_MILLIS = 3000;

    private final ConcatenationSumStrategy sut;

    public ConcatenationSumTestCases(ConcatenationSumStrategy sut) {
        this.sut = sut;
    }

    @Test(timeout = TIMEOUT_DURATION_MILLIS)
    public void testConcatenationSum3() {
        Assert.assertEquals(sut.concatenationSum(ArrayHelper.getArray3()),
                ArrayHelper.getArray3Answer());
    }

    @Test(timeout = TIMEOUT_DURATION_MILLIS)
    public void testConcatenationSum50() {
        Assert.assertEquals(sut.concatenationSum(ArrayHelper.getArray50()),
                ArrayHelper.getArray50Answer());
    }

    @Test(timeout = TIMEOUT_DURATION_MILLIS)
    public void testConcatenationSumThousand() {
        Assert.assertEquals(sut.concatenationSum(ArrayHelper.getArrayThousand()),
                ArrayHelper.getArrayThousandAnswer());
    }

    @Test(timeout = TIMEOUT_DURATION_MILLIS)
    public void testConcatenationSum10Thousand() {
        Assert.assertEquals(sut.concatenationSum(ArrayHelper.getArray10Thousand()),
                ArrayHelper.getArray10ThousandAnswer());
    }

    @Test
//    @Test(timeout = TIMEOUT_DURATION_MILLIS)
    public void testConcatenationSum100Thousand() {
        long start = System.currentTimeMillis();
        Assert.assertEquals(sut.concatenationSum(ArrayHelper.getArray100Thousand()),
                ArrayHelper.getArray100ThousandAnswer());
        System.out.println("Operation took: " + (System.currentTimeMillis() - start) + " millis.");
    }
}
