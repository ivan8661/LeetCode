package WeakCharacters;

import org.junit.Assert;
import org.junit.Test;

public class TestClass {


    @Test
    public void testOnSuccessAmountOfWeak(){
        Assert.assertEquals(CodeClass.numberOfWeakCharacters(new int[][]{{4, 10}, {2, 2}, {8, 8}, {10, 2}, {5, 5}, {9, 10}, {2, 6}}), 4);
    }
}
