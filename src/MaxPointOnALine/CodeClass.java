package MaxPointOnALine;

import java.lang.reflect.Parameter;
import java.util.*;
import java.util.stream.Stream;


class CodeClass {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 9, 10, 0, 0, 0, 0, 0}, 3, new int[]{2, 5, 6, 7, 10}, 5)));
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
        System.out.println(Arrays.toString(merge(new int[]{0}, 0, new int[]{1}, 1)));
        System.out.println(Arrays.toString(merge(new int[]{1}, 1, new int[]{}, 0)));
        System.out.println(Arrays.toString(merge(new int[]{2, 0}, 2, new int[]{1}, 1)));
        System.out.println(Arrays.toString(merge(new int[]{-1, 3, 0, 0, 0, 0, 0}, 2, new int[]{0, 0, 1, 2, 3}, 5)));
    }
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
            int l = 0, r = 0, offset = 0;
            if(m == 0){
                nums1[0] = nums2[0];
                return nums1;
            }
            while(r < n){
                if(nums1[l] >= nums2[r]){
                    System.arraycopy(nums1, l, nums1, l+1, nums1.length-1-l);
                    nums1[l] = nums2[r];
                    r++;
                } else {
                    l++;
                }
            }
            return nums1;
    }
}
