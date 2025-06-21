package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public boolean hasDuplicate1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)) return true;
            map.put(i, map.getOrDefault(i, 1)+1);
        }

        return false;
    }

    public boolean hasDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)) return true;
            set.add(i);
        }

        return false;
    }
}
