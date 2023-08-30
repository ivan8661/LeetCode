package SearchRotatedArray;

import org.junit.Assert;

public class CodeClass {
    public static void main(String[] args) {

        System.out.println(search(new int[]{1, 3}, 5));


    }


    public static int search(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while(left <= right){
            int center = left + (right-left)/2;
            if(nums[center] == target){
                return center;
            } else if(nums[center] >= nums[left]){
                if(target >= nums[left] && target < nums[center]){
                    right = center-1;
                } else {
                    left = center+1;
                }
            } else {
                if(target <= nums[right] && target > nums[center]){
                    left = center+1;
                } else {
                    right = center-1;
                }
            }

        }
        return -1;
    }
}
