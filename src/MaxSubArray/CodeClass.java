package MaxSubArray;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1, -2, -3, -5, -7, -5, -3, -2, -10 , -5}));
    }

    public static int maxSubArray(int[] nums) {
        int bufSeq = 0;
        int maxSeq = Integer.MIN_VALUE;
        for (int num : nums) {
            bufSeq += num;
            if (maxSeq < bufSeq)
                maxSeq = bufSeq;
            if (bufSeq < 0)
                bufSeq = 0;
        }
        return maxSeq;
    }
}
