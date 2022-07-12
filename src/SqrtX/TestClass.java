package SqrtX;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {

    @Test
    public void sqrtForGood() {
        Assert.assertEquals(CodeClass.mySqrt(8), 2);
        Assert.assertEquals(CodeClass.mySqrt(9), 3);
        Assert.assertEquals(CodeClass.mySqrt(2147395600), 46340);
        Assert.assertEquals(CodeClass.mySqrt(2147395600), 46340);
        Assert.assertEquals(CodeClass.mySqrt(2000000000), 44721);
        Assert.assertEquals(CodeClass.mySqrt(2147483647), 44721);
    }
}
