package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeat {


    public int longestSubstringWithoutRepeat(String s) {
        // your code goes here
        int maxSubStr = 0;
        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                len = 1;
            }else {
                len++;
            }
            maxSubStr = Math.max(maxSubStr, len);

            map.put(c, i);

        }

        return maxSubStr;
    }

}
