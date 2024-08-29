package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.Arrays;

public class ReverseaSentence {

    public char[] reverseWords(char[] arr) {
        // your code goes here
        StringBuilder sb = new StringBuilder();

        String str = new String(arr);

        String[] strArr = str.split(" ");
        if(strArr.length == 0) return arr;
        for(int i = strArr.length-1; i >= 0; i--){
            sb.append(strArr[i]);
           if(i != 0) sb.append(" ");
        }

        return sb.toString().toCharArray();
    }

}
