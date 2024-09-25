package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

public class RotationsinCircularlySortedArray {

    public int findRotations(int[] arr) {
        // your code goes here
        int len = arr.length;
        int left = 0, right = len -1;

        while(left < right){
            int mid = (left + right) / 2;
            if(arr[mid] < arr[right]) {
                right = mid ;
            }else left = mid+1 ;
        }


        return len - (len - left) ;
    }

}
