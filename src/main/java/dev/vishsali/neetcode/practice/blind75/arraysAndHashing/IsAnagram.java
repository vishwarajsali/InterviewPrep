package dev.vishsali.neetcode.practice.blind75.arraysAndHashing;

import java.lang.reflect.Array;
import java.util.*;

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


    /*
     * Array
     *
     * Space = O(N)
     * Time = O(N)
     *
     * */
    public boolean solution_1(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] sArr = new int[26];

        for(char c : s.toCharArray()) sArr[c - 'a']++;


        for(char c : t.toCharArray()){
            sArr[c - 'a']--;
        }


        for(int n : sArr) {
            if(n != 0) return false;
        }

        return true;
    }

    /*
     * Sort
     *
     * Space = O(N)
     * Time = O(N)
     *
     * */
    public boolean solution_2(String s, String t) {

        if(s.length() != t.length()) return false;

        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);

        s = Arrays.toString(sChar);

        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);

        t = Arrays.toString(tChar);

        if(!s.equals(t)) return  false;

        return true;
    }


    /*
     * Map
     *
     * Space = O(N)
     * Time = O(N)
     *
     * */
    public boolean solution_3(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);

        for(char c : t.toCharArray()){
            if(!map.containsKey(c)) return false;

            map.put(c, map.getOrDefault(c, 0) -1);

            if(map.get(c) < 0) return false;
        }



        return true;
    }


}
