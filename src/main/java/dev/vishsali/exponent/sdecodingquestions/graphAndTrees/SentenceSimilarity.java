package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SentenceSimilarity {
    public  boolean areSentencesSimilar(String[] sentence1, String[] sentence2, String[][] similarPairs) {
        // your code goes here

        if(sentence1.length != sentence2.length) return false;

        Map<String, String> map = new HashMap<>();
        for(String[] strs : similarPairs){
            map.put(strs[0], strs[1]);
            map.put(strs[1], strs[0]);
        }


        for(int i = 0; i< sentence1.length; i++){
            String word1 = sentence1[i];
            String word2 = sentence2[i];

            if(!word1.equals(word2) && (!map.containsKey(word1) || !map.get(word1).equals(word2))) return false;
         }


        return true;
    }

}
