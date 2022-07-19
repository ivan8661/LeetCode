package SingleNumber;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1, 2, 3, 4, 5, 4, 5, 2, 1}));
        System.out.println(singleNumber(new int[]{1, 1}));
        System.out.println(singleNumber(new int[]{1, 2, 3, 3, 7, 4, 5, 4, 5, 2, 1}));
    }

    public static int singleNumber(int[] nums) {
        int num = nums[0];
        for(int i = 1; i < nums.length; ++i){
            num ^= nums[i];
        }
        return num;
    }
}
