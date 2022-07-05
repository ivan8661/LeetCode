package MainCode;

import java.util.*;

public class MainCode {

    public static boolean isTrue = false;
    public static void main(String[] args) {
        System.out.println(isPossible(new int[]{1,1000000000}));
    }

    public static boolean isPossible(int[] target){
        int[] src = new int[target.length];
        Arrays.fill(src, 1);
        Arrays.sort(target);
        recursionMethod(src, target, 0);
        return isTrue;
    }



    public static int getArrSum(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum+=el;
        }
        return sum;
    }

    public static void recursionMethod(int[] source, int[] target, int curr) {
        System.out.println(Arrays.toString(source));
        int s = getArrSum(source);
        if(Arrays.equals(source, target))
            MainCode.isTrue = true;
        if(curr >= target.length)
            return;
        if(s == target[curr]){
            source[curr] = s;
            recursionMethod(source, target, ++curr);
        } else if(s < target[curr]){
            int buf = source[curr];
            source[curr]= s;
            recursionMethod(source, target, curr);
            source[curr] = buf;
            if(curr+1<target.length){
                source[curr+1] = s;
                recursionMethod(source, target, curr);
            }
        } else {
            recursionMethod(source, target, ++curr);
        }
    }



    }


