package dev.vishsali.neetcode.courses.dsaForBeginner.binarySearch;

import java.util.Arrays;

public class KokoEatingBananas {

    public int solution_1(int[] piles, int h) {
        long left = 1,
                right = Arrays.stream(piles).max().getAsInt(),
                res = 1;

        for(long speed = left; speed <= right; speed++){
            long totalTime = 0;
            for(int pile : piles){
                totalTime += (int) Math.ceil((double) pile/ speed);
            }

            if(totalTime <= h) return (int) speed;
            res = speed;
        }


        return (int)res;
    }


    public int solution_2(int[] piles, int h) {
        int left = 1,
                right = Arrays.stream(piles).max().getAsInt(),
                res = right;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long totalTime = 0;
            for(int pile : piles){
                totalTime += (int) Math.ceil((double) pile/ mid);
            }

            if(totalTime <= h) {
                res = mid;
                right = mid -1;
            }
            else  left = mid + 1;
        }


        return res;
    }
}
