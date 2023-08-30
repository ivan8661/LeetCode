package SearchRotatedArray;

import StringGreat.Code;
import org.junit.Assert;

public class TestClass {

    @org.junit.Test(timeout = 1000)
    public void StringGreatForGood() {
        Assert.assertEquals(CodeClass.search(new int[]{7, 9, 11, 13, 4, 5, 6}, 4), 4);
        Assert.assertEquals(CodeClass.search(new int[]{1}, 0), -1);
        Assert.assertEquals(CodeClass.search(new int[]{1, 2, 3, 4}, 5), -1);
        Assert.assertEquals(CodeClass.search(new int[]{1, 3}, 5), -1);
        Assert.assertEquals(CodeClass.search(new int[]{7, 1, 3}, 1), 1);
        Assert.assertEquals(CodeClass.search(new int[]{7, 8, 9, 3, 4, 5, 6}, 3), 3);
        Assert.assertEquals(CodeClass.search(new int[]{10, 14, 1, 2, 3, 4, 5, 6, 7, 8}, 1), 2);
        Assert.assertEquals(CodeClass.search(new int[]{11, 12, 13, 14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 1), 5);
        Assert.assertEquals(CodeClass.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), -1);
    }
}
