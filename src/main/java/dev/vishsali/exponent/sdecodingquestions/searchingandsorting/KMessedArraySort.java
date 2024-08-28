package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import java.util.PriorityQueue;

public class KMessedArraySort {

    public int[] sortKMessedArray(int[] arr, int k) {
        // your code goes here
        int n = arr.length;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0 ; i <= k && i < n; i++){
            minHeap.add(arr[i]);
        }

        int index = 0;

        for(int i = k +1; i< n; i++){

            arr[index++] = minHeap.poll();

            minHeap.add(arr[i]);
        }

      while(!minHeap.isEmpty()){
            arr[index++] = minHeap.poll();
        }


        return arr;
    }

}
