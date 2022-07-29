package IsPalindromInt;

import java.util.ArrayList;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }
    
    public static boolean isPalindrome(int x) {
        int prev = x;
        if(x < 0)
            return false;
        int res = 0;
        while(x / 10 > 0) {
            res = res*10+x%10;
            x = x / 10;
        }
        res = res*10+x%10;
        return prev == res;
    }
}
