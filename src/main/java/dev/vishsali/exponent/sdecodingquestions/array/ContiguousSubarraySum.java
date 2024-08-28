package dev.vishsali.exponent.sdecodingquestions.array;

import java.util.HashMap;
import java.util.Map;

public class ContiguousSubarraySum {

    private static final int MIN_GOOD_SUBARRAY_LIMIT = 2;
    public boolean hasGoodSubarray(int[] nums, int k) {
        // your code goes here
//        23, 2, 4, 7  -> 6

        if (nums == null) {
            return false;
        }

        long sumSoFar = 0;
        Map<Integer, Integer> remainderIndexMap = new HashMap<>();
        remainderIndexMap.put(0, -1);  // Manually put the initial key-value pair

        for (int currentIndex = 0; currentIndex < nums.length; currentIndex++) {
            sumSoFar += (long) nums[currentIndex];
            Integer firstIndex = remainderIndexMap.get((int) (sumSoFar % k));

            if (firstIndex == null) {
                remainderIndexMap.put((int) (sumSoFar % k), currentIndex);
            } else if (currentIndex - firstIndex >= MIN_GOOD_SUBARRAY_LIMIT) {
                return true;
            }
        }

        return false;
    }
}
