package MediumFromDataStream;

import org.junit.Assert;

public class Test {

    @org.junit.Test(timeout = 1000)
    // 5 6 7   14   15 16 17
    public void MediumFromDataStreamForGood14Median() {
        Code code = new Code();
        code.addNum(5);
        Assert.assertEquals(code.findMedian(), 5, 0.01);
        code.addNum(7);
        Assert.assertEquals(code.findMedian(), 6, 0.01);
        code.addNum(6);
        code.addNum(14);
        code.addNum(15);
        code.addNum(16);
        code.addNum(17);
        Assert.assertEquals(code.findMedian(), 14, 0.01);
    }
    @org.junit.Test(timeout = 1000)
    // 1 2 3  5 6  7 8 9
    public void MediumFromDataStreamForGood5dot5Median() {
        Code code = new Code();
        code.addNum(1);
        code.addNum(2);
        code.addNum(3);
        code.addNum(5);
        code.addNum(6);
        code.addNum(7);
        code.addNum(8);
        code.addNum(9);
        Assert.assertEquals(code.findMedian(), 5.5, 0.01);
    }

    @org.junit.Test(timeout = 1000)
    // 2 3
    public void MediumFromDataStreamForGood2dot5Median() {
        Code code = new Code();
        code.addNum(2);
        code.addNum(3);
        Assert.assertEquals(code.findMedian(), 2.5, 0.01);
    }
    @org.junit.Test(timeout = 1000)
    // 2 3 4
    public void MediumFromDataStreamForGood3Median() {
        Code code = new Code();
        code.addNum(2);
        code.addNum(3);
        code.addNum(4);
        Assert.assertEquals(code.findMedian(), 3, 0.01);
    }
    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    public void isExceptionHere() {
        Code code = new Code();
        code.findMedian();
    }


}
