package NumberOf1Bits;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
        int counter = 0;
        while(n != 0){
            counter += n&1;
            n = n>>>1;
        }
        return counter;
    }
}
