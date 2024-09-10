package dev.vishsali.neetcode.practice.blind75.binarySearch;

public class FindTargetinRotatedSortedArray {


    public int search(int[] nums, int target) {
        if(nums.length == 1) return 0;
        int left = 0, right = nums.length-1;


        while(left < right){

            int mid = (left + right) / 2;

            if(target == nums[mid]) return mid;
            else if(nums[mid] > nums[right]) left = mid+1;
            else right = mid;
        }





        return -1;
    }
}
