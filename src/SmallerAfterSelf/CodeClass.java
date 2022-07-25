package SmallerAfterSelf;

import java.util.LinkedList;
import java.util.List;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(countSmaller(new int[]{-1, -1}));
    }


    public static List<Integer> countSmaller(int [] nums) {
        List<Integer> answer = new LinkedList<>();
        for(int i = 0; i < nums.length; ++i) {
            int smallerCounter = 0;
            for(int j = i; j < nums.length; ++j){
                if(nums[j] < nums[i])
                    smallerCounter++;
            }
            answer.add(smallerCounter);
        }
        return answer;
    }
}
