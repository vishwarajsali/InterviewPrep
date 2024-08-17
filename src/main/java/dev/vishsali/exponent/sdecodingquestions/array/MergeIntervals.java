package dev.vishsali.exponent.sdecodingquestions.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    public int[][] mergeIntervals(int[][] intervals) {
        // your code goes here
        List<int[]> res = new LinkedList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for(int[] interval: intervals){
            if(res.isEmpty() || res.getLast()[1] < interval[0]) res.add(interval);
            else res.getLast()[1] = Math.max(res.getLast()[1], interval[1]);
        }

        return res.toArray(new int[res.size()][]);
    }
}
