package ContainDuplicate;

import java.util.*;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8}));
    }


    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; ++i){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
