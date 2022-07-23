package MinStack;


import org.junit.Assert;
import org.junit.Test;

public class TestStack {

@Test
public void forGoodStackCondition() {
    MinStack minStack = new MinStack();
    minStack.push(5);
    minStack.push(2);
    minStack.push(3);
    Assert.assertEquals(minStack.getSize(), 3);
    Assert.assertEquals(minStack.getMin(), 2);
    minStack.pop();
    minStack.pop();
    Assert.assertEquals(minStack.getMin(), 5);

    MinStack minStack1 = new MinStack();
    minStack1.push(2147483646);
    minStack1.push(2147483646);
    minStack1.push(2147483647);
    System.out.println(minStack1.top());
    minStack1.pop();
    System.out.println(minStack.getMin());
    minStack1.pop();
    minStack1.push(2147483647);
    System.out.println(minStack1.top());
    System.out.println(minStack1.getMin());
    minStack1.push(-2147483648);
    System.out.println(minStack1.top());
    System.out.println(minStack1.getMin());
    minStack1.pop();
    minStack1.getMin();

    MinStack minStack2 = new MinStack();
    minStack2.push(-10);
    minStack2.push(14);
    minStack2.push(-20);
    minStack2.pop();
    minStack2.push(-7);
    Assert.assertEquals(minStack2.getMin(), -10);
    minStack2.pop();
    Assert.assertEquals(minStack2.getMin(), -10);
}

@Test(expected = ArrayIndexOutOfBoundsException.class)
public void whenExceptionThrow_ThenAssertionSucceeds() {
    MinStack minStack = new MinStack();
    minStack.pop();
}
@Test(expected = ArrayIndexOutOfBoundsException.class)
public void WhenGetMinThrow_ThenSucceed() {
    MinStack minStack = new MinStack();
    minStack.getMin();
}
@Test(expected = ArrayIndexOutOfBoundsException.class)
public void WhenGetTopThrow_ThenSucceed() {
    MinStack minStack = new MinStack();
    minStack.top();
}

}
