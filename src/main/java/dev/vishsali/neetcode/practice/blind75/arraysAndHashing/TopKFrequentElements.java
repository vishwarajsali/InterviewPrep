package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();


        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<int[]> arr = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]) ;
        int[] res = new int[k];
        for(int i =0; i< k; i++){
            res[i] = arr.get(i)[1];
        }

        return res;
    }
}
