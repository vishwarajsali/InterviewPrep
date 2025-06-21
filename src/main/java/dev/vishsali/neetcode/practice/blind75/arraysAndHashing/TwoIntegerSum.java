package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoIntegerSum {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int sum = target - nums[i];

            if(map.containsKey(nums[i])) return new int[] {map.get(nums[i]), i};

            map.put(sum, i);
        }



        return new int[] {-1, -1};
    }
}
