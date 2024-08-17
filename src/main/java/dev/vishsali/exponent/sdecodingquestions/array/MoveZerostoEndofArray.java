package dev.vishsali.exponent.sdecodingquestions.array;

public class MoveZerostoEndofArray {

    public int[] moveZerosToEnd(int[] arr) {
        // your code goes here

        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }
}
