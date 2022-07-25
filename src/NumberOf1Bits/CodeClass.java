package NumberOf1Bits;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(hammingWeight(-3));
    }

    public static int hammingWeight(int n) {
        int counter = 0;
        String tmp = Integer.toBinaryString(n);
        for(int i = 0; i < tmp.length(); ++i){
            if(tmp.charAt(i) == '1')
                counter++;
        }
        return counter;
    }
}
