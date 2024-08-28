package dev.vishsali.exponent.sdecodingquestions.array;

public class MaximumSubarraySum {



    /*
    * Input: nums = [2, 3, -2, 4]
      Output: 7
      Explanation: Maximum sum is 2 + 3 + (-2) + 4 = 7.
    *
    * */

    public int maxSubarraySum(int[] arr) {
        // your code goes here

        if(arr.length == 0) return 0;

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i< arr.length; i++){
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
