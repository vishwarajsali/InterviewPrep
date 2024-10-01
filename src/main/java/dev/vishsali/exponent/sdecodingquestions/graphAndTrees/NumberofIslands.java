package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

public class NumberofIslands {

    public int getNumberOfIslands(int[][] binaryMatrix) {
        // your code goes here
        int noOfIslands = 0;

        int rows = binaryMatrix.length,
                cols = binaryMatrix[0].length;

        for(int row = 0; row< rows; row++){
            for(int col = 0; col < cols; col++){
                if(binaryMatrix[row][col] == 1){
                    isIsland(binaryMatrix, rows, cols, row, col);
                    noOfIslands++;
                }
            }
        }

        return noOfIslands;
    }

    private void isIsland(int[][] binaryMatrix, int rows, int cols, int row, int col){
        if(row < 0 || col < 0 || row >= rows|| col >= cols || binaryMatrix[row][col] == 0 ) return ;

        binaryMatrix[row][col] = 0;
        isIsland(binaryMatrix, rows, cols, row+1, col);
        isIsland(binaryMatrix, rows, cols, row-1, col);
        isIsland(binaryMatrix, rows, cols, row, col+1);
        isIsland(binaryMatrix, rows, cols, row, col-1);
    }
}
