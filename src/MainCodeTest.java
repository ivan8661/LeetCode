import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class MainCodeTest {

    @Test
    public void binarySearchForBad() throws NoSuchFieldException, IllegalAccessException {
        Assert.assertFalse(MainCode.isPossible(new int[]{1, 1, 1, 2}));
        Assert.assertFalse(MainCode.isPossible(new int[]{1, 1, 1, 1, 1, 5}));
        Assert.assertTrue(MainCode.isPossible(new int[]{8, 5}));
        MainCode.isTrue = false;
        Assert.assertTrue(MainCode.isPossible(new int[]{9, 3, 5}));
        MainCode.isTrue = false;
        Assert.assertTrue(MainCode.isPossible(new int[]{1, 1, 1, 1, 1, 6}));
        MainCode.isTrue = false;
        Assert.assertFalse(MainCode.isPossible(new int[]{4, 4}));
        MainCode.isTrue = false;
        Assert.assertTrue(MainCode.isPossible(new int[]{5, 12, 3, 4}));

    }
}
