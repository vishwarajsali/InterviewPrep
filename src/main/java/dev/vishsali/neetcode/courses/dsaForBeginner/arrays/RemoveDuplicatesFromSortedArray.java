package dev.vishsali.neetcode.courses.dsaForBeginner.arrays;

public class RemoveDuplicatesFromSortedArray {


    public int solution_1(int[] nums) {

      int first = 0, second = 0, sorted = 1;

      for(int i = 0; i< nums.length; i++){

          if(nums[first] != nums[second]){
              first++;
              nums[first] = nums[second];
              sorted++;
          }
          second++;
      }

      return sorted;
    }
}
