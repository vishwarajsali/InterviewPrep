package dev.vishsali.exponent.sdecodingquestions.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyaSpiralMatrix {
    static int[] spiralCopy(int[][] inputMatrix) {
        // your code goes here
        List<Integer> res = new ArrayList<>();
        int rows = inputMatrix.length, cols = inputMatrix[0].length;
        int i = 0, j = 0;
        boolean[][] dp = new boolean[rows][cols];
        while (rows > i && cols > j) {

            //right side
            for (int col = 0; col < cols; col++) {
                int row = i;
                if (!dp[row][col]) {
                    res.add(inputMatrix[row][col]);
                    dp[row][col] = true;
                }
            }
//            System.out.println("right side " + Arrays.deepToString(dp));
            //down side
            for (int row = 0; row < rows; row++) {
                int col = cols - j - 1;
                if (!dp[row][col]) {
                    res.add(inputMatrix[row][col]);
                    dp[row][col] = true;
                }
            }
//            System.out.println("down side " + Arrays.deepToString(dp));
            //left side
            for (int col = cols - 1; col >= 0; col--) {
                int row = rows - i - 1;
                if (!dp[row][col]) {
                    res.add(inputMatrix[row][col]);
                    dp[row][col] = true;
                }
            }
//            System.out.println("left side " + Arrays.deepToString(dp));
            //up side
            for (int row = rows - 1; row >= 0; row--) {
                int col = j;
                if (!dp[row][col]) {
                    res.add(inputMatrix[row][col]);
                    dp[row][col] = true;
                }
            }
//            System.out.println("up side " + Arrays.deepToString(dp));
            i++;
            j++;
        }


//1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12. 2]
//        System.out.println(res);
        return res.stream().mapToInt(x -> x).toArray();

    }
}
