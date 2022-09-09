package StampingSequence;

import java.util.Arrays;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(movesToStamp("abc", "ababc")));
    }


    public static int[] movesToStamp(String stamp, String target) {
        String s = "?".repeat(target.length());
        System.out.println(s);
        while(!s.equals(target)){
            if(target.contains(stamp)){
                System.out.println(s);
            }
        }




        return new int[]{1, 2};
    }
}
