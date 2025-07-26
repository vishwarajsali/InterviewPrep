package dev.vishsali.leetcode.interview.assessment.amazon;

import java.util.HashSet;
import java.util.Set;

public class Assessment {

    public int countCharacters(String[] words, String chars) {
        int res = 0;
        Set<Character> set = new HashSet<>();

        char[] str = chars.toCharArray();

        for(char c : str) set.add(c);

        for(String word : words){

            char[] ch = word.toCharArray();
            boolean found = true;
            for(char c : ch) {
                if(!set.contains(c)){
                    found = false;
                    break;
                }
            }
            if (found) res += word.length();
        }

        return res;
    }
}
