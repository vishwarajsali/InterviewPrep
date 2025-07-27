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

    public int[] solution_1(int[] nums, int target) {

        for(int i = 0; i< nums.length-1; i++){

            int sum  = target - nums[i];

            for(int j = i+1; j< nums.length; j++){
                if(nums[j] == sum) return new int[]{i , j };
            }

        }
        return new int[]{-1, -1};
    }


    public int[] solution_2(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int sum  = target - nums[i];
            if(map.containsKey(nums[i])) return new int[]{map.get(nums[i]), i};

            map.put(sum, i);

        }
        return new int[]{-1, -1};
    }
}
