package StringGreat;

import org.junit.Assert;

public class Test {

    @org.junit.Test(timeout = 1000)
    public void StringGreatForGood() {
        Assert.assertEquals(Code.makeGood("leEeetcode"), "leetcode");
        Assert.assertEquals(Code.makeGood("abBAcC"), "");
        Assert.assertEquals(Code.makeGood("BbaACc"), "");
        Assert.assertEquals(Code.makeGood("aaaaaaA"), "aaaaa");
        Assert.assertEquals(Code.makeGood("bBaaaAcD"), "aacD");
        Assert.assertEquals(Code.makeGood("aaaaaaA"), "aaaaa");
    }
}
