package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

            int match = 0;
            int start = 0;
            int minLen = s.length() + 1;
            int subStr = 0;

            for(int endwindow = 0; endwindow < s.length(); endwindow++){
                char right = s.charAt(endwindow);
                if(map.containsKey(right)){
                    map.put(right, map.get(right)-1);
                    if(map.get(right) == 0) match++;
                }

                while(match == map.size()){
                    if(minLen > endwindow - start +1 ){
                        minLen = endwindow - start +1 ;
                        subStr = start;
                    }


                    char deleted = s.charAt(start++);
                    if(map.containsKey(deleted)){
                        if(map.get(deleted) == 0) match --;
                        map.put(deleted, map.get(deleted)+1);
                    }
                }
            }


        return minLen > s.length() ? "" :s.substring(subStr, subStr + minLen);
    }
}
