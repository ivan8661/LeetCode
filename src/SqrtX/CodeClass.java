package SqrtX;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }

    public static int mySqrt(int x) {
        long n = 0;
        while(true) {
            if(n*n == x)
                return (int) n;
            if(n*n > x)
                return (int) n-1;
            else
                n++;
        }
    }
}
