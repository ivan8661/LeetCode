package StringGreat;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Code {
    public static void main(String[] args) {
        System.out.println(makeGood("leeeEtcode"));
    }

    public static String makeGood(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        int i = 0;
        while((i+1) < stringBuilder.length()) {
            char firstLetter = stringBuilder.charAt(i), secondLetter = stringBuilder.charAt(i+1);
            if((Character.toLowerCase(firstLetter) == Character.toLowerCase(secondLetter)) &&
                    (Character.isUpperCase(secondLetter) ^ Character.isUpperCase(firstLetter))){
                stringBuilder.deleteCharAt(i+1);
                stringBuilder.deleteCharAt(i);
                i-=2;
            }
            if(i < 0)
                i = 0;
            else
                i++;
        }
        return stringBuilder.toString();
    }
}
