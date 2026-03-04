package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        if(nums == null  || nums.length == 0) return 0;

        int consecutive = 0;
        Arrays.sort(nums);

        int start = 1, end = nums.length;
        int prev = nums[0];
        int count = 1;
        while(start< end){
            int curr = nums[start];
            if(prev == curr) {
                start++;
                continue;
            }
            if(curr - prev != 1 ){
                consecutive = Math.max(consecutive, count);
                count = 1;
            }else {
                count++;
            }


            prev = curr;
            start++;
        }
        consecutive = Math.max(consecutive, count);

        return consecutive;
    }




    public int solution_1(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        int consecutive = 0;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(Integer.valueOf(n));

        for (int n : set) {
            int count = 0;
            if (!set.contains(Optional.of(n - 1))) {
                int length = 1;

                while (set.contains(Optional.of(n + length))){
                    length++;
                }

                consecutive = Math.max(consecutive, count);
            }
        }

        return consecutive;
    }


}
