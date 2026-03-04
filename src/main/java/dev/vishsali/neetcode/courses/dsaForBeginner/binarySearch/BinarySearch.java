package dev.vishsali.neetcode.courses.dsaForBeginner.binarySearch;

public class BinarySearch {


    public int solution_1(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left < right){
//            following can be use however if both given array is max integer it can be overflow
//            int mid = left + right / 2;
//            edge case where it prevent overflow
            int mid = left + ((right - left) / 2); 
            if(nums[mid] == right) return mid;

            if(target > nums[mid]) left = mid +1;
            else right = mid -1;
        }

        return -1;
    }
}
