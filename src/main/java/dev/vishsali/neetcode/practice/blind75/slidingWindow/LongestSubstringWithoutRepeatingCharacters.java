package dev.vishsali.neetcode.practice.blind75.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int solution_1(String s) {
//        from o to end
//        should not have the duplicate valuw
//        should be conti

        int maxLen = 0, n = s.length();

        if( n == 0|| n == 1) return n;

        for(int i = 0; i < n-1;i++){
            int len = 1 ;
            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            for(int j = i+1; j < n; j++){
                if(set.contains(s.charAt(j))){
                    set = new HashSet<>();
                    break;
                }
                set.add(s.charAt(j));
                len++;
            }


            maxLen = Math.max(maxLen, len);
        }

        return maxLen;
    }

    public int solution_2(String s) {

        int maxLen = 1, n = s.length();

        if( n == 0|| n == 1) return n;

        for(int i = 0; i < n-1;i++){
            for(int j = i+1; j < n; j++){

                if(repeatingChar(s, i, j)){
                    maxLen = Math.max(maxLen, j - i + 1);
                }else break;
            }
        }

        return maxLen;
    }

    private boolean repeatingChar(String s, int start, int end){
        Set<Character> set = new HashSet<>();

        for(int i = start; i <= end; i++){
            if(set.contains(s.charAt(i))) return false;
            set.add(s.charAt(i));
        }

        return true;
    }

}
