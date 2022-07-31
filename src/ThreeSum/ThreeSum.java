package ThreeSum;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4, 3, -3, -2}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        LinkedList<Integer> positiveList = new LinkedList<>();
        LinkedList<Integer> negativeList = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        int pos = 0;
        for(int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                negativeList.add(nums[i]);
                pos = i;
            }
        }
        pos++;
        for(int i = pos; i < nums.length; ++i) {
            positiveList.add(nums[i]);
        }
        System.out.println("positive: " + positiveList);
        System.out.println("negative: " + negativeList);
        int j = 0, k = 1;
        System.out.println("j: " + j + " k: " + k);
        for(int i = 0; i < negativeList.size(); ++i) {
            j = 0; k = 1;
            while(k < positiveList.size()) {
                if (negativeList.get(i) + positiveList.get(j) + positiveList.get(k) == 0)
                    result.add(new LinkedList<>(List.of(negativeList.get(i), positiveList.get(j), positiveList.get(k))));
                j++;
                k++;
            }
        }
        return result;
    }

}
