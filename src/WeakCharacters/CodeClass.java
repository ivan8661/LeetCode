package WeakCharacters;

import java.util.*;

public class CodeClass {
    public static void main(String[] args) {
        System.out.println(numberOfWeakCharacters(new int[][]{{1, 5}, {10, 4}, {4, 3}, {15, 25}, {15, 26}, {16,26}}));
    }

    public static int numberOfWeakCharacters(int[][] properties) {
        int counter = 0;
        Arrays.sort(properties, (f, s) -> (f[0] == s[0]) ? Integer.compare(s[1], f[1]) : Integer.compare(f[0],s[0]));
        for (int[] prop: properties) {
            System.out.println(Arrays.toString(prop));
        }
        int maxDefense = properties[properties.length-1][1];
        for(int i = properties.length-1; i >= 0; i--){
            if(properties[i][1] < maxDefense){
                counter++;
            } else {
                maxDefense = properties[i][1];
            }
        }
        return counter;
    }
}
