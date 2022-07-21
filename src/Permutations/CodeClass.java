package Permutations;

import java.util.*;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(permute(new int[]{1, 2, 3, 4}));
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();
        recursion(nums, answer, 0);
        return answer;
    }


    public static void recursion(int[]nums, List<List<Integer>> answer, int index) {
        if(index==nums.length) {
            answer.add(Arrays.stream(nums).boxed().toList());
            return;
        }

        for(int i = index; i < nums.length; ++i){
            int buf = nums[i];
            nums[i] = nums[index];
            nums[index] = buf;
            recursion(nums, answer, index+1);
            buf = nums[i];
            nums[i] = nums[index];
            nums[index] = buf;
        }
    }
}
