package FirstUniqueCharacter;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {



    @Test
    public void forGoodFirstCharacter() {
        Assert.assertEquals(CodeClass.firstUniqChar("leetcode"), 0);
        Assert.assertEquals(CodeClass.firstUniqChar("a"), 0);
        Assert.assertEquals(CodeClass.firstUniqChar("aabbccddeefgghhe"), 10);
        Assert.assertEquals(CodeClass.firstUniqChar("glaabbccddeefflecz"), 0);
    }
}
