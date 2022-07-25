package RotateImage;

import java.util.Arrays;

public class CodeClass {

    public static void main(String[] args) {
        int [][] data = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        printPicture(data);
        rotate(data);
        System.out.println();
//        printPicture(data);
    }

    public static void printPicture(int[][] data){
        for(int i = 0; i < data.length; ++i){
            for(int j = 0; j < data.length; ++j){
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void rotate(int[][] matrix) {
        int buf;
        for(int i = 0; i < matrix.length; ++i){
            //transpose matrix
            for(int j = 0; j < i; ++j){
                buf = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = buf;
            }
        }
        //replace for true order
        for(int i = 0; i < matrix.length; ++i){
            for(int j = 0; j < matrix.length/2; ++j){
                buf = matrix[i][j];
                matrix[i][j] = matrix [i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = buf;
            }
        }
    }



}
