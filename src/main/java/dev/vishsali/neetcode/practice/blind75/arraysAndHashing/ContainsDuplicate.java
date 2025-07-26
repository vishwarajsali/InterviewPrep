package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.*;

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


    /*
     * sorting and lopping O(log N)
     *
     * Space = O(1)
     * Time = O(log N)
     *
     * */
    public boolean solution_1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }

        return false;
    }


    /*
     * sorting and lopping O(log N)
     *
     * Space = O(1)
     * Time = O(log N)
     *
     * */
    public boolean solution_2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) return true;
        }


        return false;
    }

    /*
     * Map
     *
     * Space = O(N)
     * Time = O( N)
     *
     * */
    public boolean solution_3(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){

            if(map.containsKey(num)) return true;

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        return false;
    }



    /*
     * Set
     *
     * Space = O(N)
     * Time = O( N)
     *
     * */
    public boolean solution_4(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int num : nums){

            if(set.contains(num)) return true;

            set.add(num);

        }

        return false;
    }
}