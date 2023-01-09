package gasStation;

import java.util.ArrayList;

public class Code {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
        System.out.println(canCompleteCircuit(new int[]{5, 8, 2, 8}, new int[]{6, 5, 6, 6}));
        System.out.println(canCompleteCircuit(new int[]{2}, new int[]{2}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int currentGas = 0;
        int index = 0;
        int sum = 0;
        for(int i = 0; i < gas.length; ++i)
            sum = sum+gas[i]-cost[i];
        if(sum < 0)
            return -1;
        for(int i = 0; i < gas.length; ++i){
            currentGas += (gas[i]-cost[i]);
            if(currentGas < 0) {
                index = i+1;
                currentGas = 0;
            }
        }
        return index;
    }
}
