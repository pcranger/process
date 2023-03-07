package java_lang.leetcode_problems.unsorted.easy;

import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(getPascalTriangle(5)));
    }
    public static int[][] getPascalTriangle(int numRows){
        int[][] result = new int[numRows][];
        for(int i = 0; i < numRows; i++){
            result[i] = new int[i+1];
            result[i][0] = 1;
            result[i][i] = 1;
            if(i > 1){
                for(int j = 1; j <= i -1; j++){
                    result[i][j] = result[i-1][j-1] + result[i-1][j] ;
                }
            }
        }
        return result;
    }
}
