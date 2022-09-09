package FirstLastSortedArray;

import java.util.Arrays;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1, 2, 2}, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{1, 2};
    }


    public static int binarySearch(int[] nums, int target, boolean isLeft){
        int buf = -1;
        int leftIndex = 0;
        int rightIndex = nums.length-1;

        while(rightIndex >= leftIndex) {
            int half = leftIndex + (rightIndex-leftIndex)/2;

        }
        return 5;
    }
}
