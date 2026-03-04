package dev.vishsali.neetcode.practice.blind75.twoPointers;

public class ContainerWithMostWater {


    public int solution_2(int[] heights) {
        int maxWater = 0, start = 0, end = heights.length-1;

        for(int i =  0; i < heights.length; i++){
            for(int j = i+1; j< heights.length; j++){
                int area = Math.min(heights[i], heights[j]) * (j - i);
                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }


    public int solution_1(int[] heights) {
        int maxWater = 0, start = 0, end = heights.length-1;


        while(start < end){

            int area = Math.min(heights[start], heights[end]) * (end - start);
            maxWater = Math.max(maxWater, area);

            if(heights[start] < heights[end]) start++;
            else end--;
        }

        return maxWater;
    }
}
