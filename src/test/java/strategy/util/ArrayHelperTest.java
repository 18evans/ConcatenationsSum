package strategy.util;

import junit.framework.TestCase;
import solution.util.ArrayHelper;

public class ArrayHelperTest extends TestCase {

    public void testGetArray3() {
        assertEquals(3, ArrayHelper.getArray3().length);
    }

    public void testGetArray50() {
        assertEquals(50, ArrayHelper.getArray50().length);
    }

    public void testGetArrayThousand() {
        assertEquals(1_000, ArrayHelper.getArrayThousand().length);
    }

    public void testGetArray10Thousand() {
        assertEquals(10_000, ArrayHelper.getArray10Thousand().length);
    }

    public void testGetArray100Thousand() {
        assertEquals(100_000, ArrayHelper.getArray100Thousand().length);
    }
}