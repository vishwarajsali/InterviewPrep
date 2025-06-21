package dev.vishsali.neetcode.practice.blind75.twoPointers;

import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0; i< nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                twosum(i, nums, res);

            }

        }

        return new ArrayList<>(res);

    }

    private void twosum(int start,int[] nums, Set<List<Integer>> set ){
        int end = nums.length-1;
        int left = start+1,
                right = end;
        while(left< right){
            int sum = nums[start] + nums[left] + nums[right];

            if(sum == 0) {
                set.add(Arrays.asList(nums[start], nums[left], nums[right]));
                left++;
                right--;
                while (left< right && nums[left] == nums[left-1]) ++left;
            }
            else if(sum < 0) left++;
            else right--;

        }
    }


    //    Brut force N^ 3
    public List<List<Integer>> threeSum_1(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
                        res.add(list);
                    }
                }
            }
        }


        return new ArrayList<>(res);

    }
}
