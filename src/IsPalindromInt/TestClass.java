package IsPalindromInt;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void test_On_Correct_Value_if_Correct_return_true() {
        Assert.assertTrue(CodeClass.isPalindrome(101));
        Assert.assertTrue(CodeClass.isPalindrome(1555555551));
        Assert.assertTrue(CodeClass.isPalindrome(1));
        Assert.assertTrue(CodeClass.isPalindrome(11));
        Assert.assertTrue(CodeClass.isPalindrome(101));
    }

    @Test
    public void test_On_Incorrect_Value_If_Wrong_return_true() {
        Assert.assertFalse(CodeClass.isPalindrome(-120));
        Assert.assertFalse(CodeClass.isPalindrome(12));
        Assert.assertFalse(CodeClass.isPalindrome(21));
        Assert.assertFalse(CodeClass.isPalindrome(-1001));
    }
}
