package NumberOf1Bits;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
