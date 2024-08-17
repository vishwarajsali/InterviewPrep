package dev.vishsali.neetcode.practice.arraysAndHashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsAnagram {


/*    Is Anagram
    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

    An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

    Example 1:

    Input: s = "racecar", t = "carrace"

    Output: true
    Example 2:

    Input: s = "jar", t = "jam"

    Output: false
    Constraints:

    s and t consist of lowercase English letters.*/

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();


        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Character c : t.toCharArray()){
            if(map.containsKey(c)) map.put(c, map.get(c)-1);
            else return false;

            if(map.get(c) < 0) return false;
        }

        for(int i : map.values()){
            if(i > 0 ) return false;
        }


        return true;

    }
}
