package MaxPointOnALine;

import java.util.HashMap;

public class CodeClass {

    public static void main(String[] args) {
        System.out.println(maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
    }


    public static int maxPoints(int[][] points) {
        HashMap<Integer, Integer> mathFunction = new HashMap<>();
        int maxPoints, x, y;
        for(int i = 0; i < points.length; ++i) {
            x = points[i][0];
            y = points[i][1];
        }

        return 5;
    }


}
