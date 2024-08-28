package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

public class NumberFinder {



//input = [200, 200, 200, ]200, 500, 500, 500 500 -> 4

    public  int findFirst(int[] array, int num) {
        // your code goes here
        if(array.length == 0) return -1;
        if(array[0] == num) return 0;
        int low = 0;
        int high = array.length-1;
        while(low <= high){
            int mid = (low + high) /2 ;
            if(array[mid-1] != array[mid] && array[mid] == num){
                return  mid;
            }
            if(array[mid] == num) high = mid;
            else low = mid+1;
        }

        return -1;
    }

}
