package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    /*Duplicate Integer
    Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

    Example 1:

    Input: nums = [1, 2, 3, 3]

    Output: true
    Example 2:

    Input: nums = [1, 2, 3, 4]

    Output: false
    */
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)) return true;
            map.put(i, map.getOrDefault(i, 1)+1);
        }

        return false;
    }
}
