package dev.vishsali.exponent.sdecodingquestions.array;

import java.util.*;

public class ThreeSum {

    public  List<List<Integer>> threeSum(int[] nums) {
        // your code goes here
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length; i++){

        }



        return res;
    }


    public List<List<Integer>> solution_1(int[] nums){

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n  = nums.length;

        for(int i = 0; i < n - 2; i++){
            for(int j = i +1; j < n -1; j++){
                for(int k = j +1 ; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }


        return new ArrayList<>(res);

    }


    public List<List<Integer>> solution_2(int[] nums){

        Set<List<Integer>> res = new HashSet<>();

        Arrays.sort(nums);

        for(int i = 0 ; i< nums.length; i++ ){

            int start = i +1, end = nums.length-1;

            while (start <= end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                }
                if(sum < 0){
                    start ++;
                }else end --;
            }
        }

        return new ArrayList<>(res);

    }


    public List<List<Integer>> solution_3 (int[] nums){
        Set<List<Integer>> res = new HashSet<>();

        for(int i  = 0; i< nums.length; i++){

            twoSum(i, nums, res);
        }

        return new ArrayList<>(res);
    }

    private void twoSum(int i, int[] nums, Set<List<Integer>> res){
        int start = i+1, end = nums.length-1;


        while(start < end){
            int sum = nums[i] + nums[start] + nums[end];

            if(sum == 0) res.add(Arrays.asList(nums[i], nums[start], nums[end]));
            else if(sum < 0) start ++;
            else end --;
        }
    }


    public List<List<Integer>> solution_4(int[] nums){
        Set<List<Integer>> res = new HashSet<>();

        for(int i  = 0; i< nums.length; i++){

            twoSum(i, nums, res);
        }

        return new ArrayList<>(res);
    }


}




/*
nums = [-1, 0, 1, 2, -1, -4]
output: [[-1, -1, 2], [-1, 0, 1]]


-4, -1, -1, 0 , 1 , 2



*/

