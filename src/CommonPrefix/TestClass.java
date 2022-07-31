package CommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {


    @Test
    public void check_On_correct_input_and_correct_answer() {
        Assert.assertEquals(CodeClass.longestCommonPrefix(new String[]{"str", "st", "stf"}), "st");
        Assert.assertEquals(CodeClass.longestCommonPrefix(new String[]{"s", "s", "s"}), "s");
        Assert.assertEquals(CodeClass.longestCommonPrefix(new String[]{"str", "str", "str"}), "str");
        Assert.assertEquals(CodeClass.longestCommonPrefix(new String[]{"str", "str", "str"}), "str");
        Assert.assertEquals(CodeClass.longestCommonPrefix(new String[]{"ab", "a"}), "a");
    }


}
