package SingleNumber;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void singleNumberForGood() {
        Assert.assertEquals(CodeClass.singleNumber(new int[]{1, 2, 3, 4, 4, 2, 1}), 3);
        Assert.assertEquals(CodeClass.singleNumber(new int[]{1}), 1);
        Assert.assertEquals(CodeClass.singleNumber(new int[]{1, 1}), 0);
        Assert.assertEquals(CodeClass.singleNumber(new int[]{105, 105, 24, 24, 21, 21, 1}), 1);

    }
}
