package dev.vishsali.exponent.sdecodingquestions.graphAndTrees;

import java.util.*;

public class SentenceSimilarity {
    public  boolean areSentencesSimilar(String[] sentence1, String[] sentence2, String[][] similarPairs) {
        // your code goes here

        if(sentence1.length != sentence2.length) return false;

        Map<String, List<String>> map = new HashMap<>();
        for(String[] strs : similarPairs){
            String word1 = strs[0];
            String word2 = strs[1];

            if(!map.containsKey(word1)) map.put(word1, new ArrayList<>());
            if(!map.containsKey(word2)) map.put(word2, new ArrayList<>());

            map.get(word1).add(word2);
            map.get(word2).add(word1);
        }


        for(int i = 0; i< sentence1.length; i++){
            String word1 = sentence1[i];
            String word2 = sentence2[i];
            if(word1.equals(word2)) continue;

            if(!map.containsKey(word1) || !map.containsKey(word2)) return false;

            if (!dfs(map, new HashSet<>(), word1, word2)) {
                return false;
            }


         }


        return true;
    }

    private boolean dfs(Map<String, List<String>> map, HashSet<Object> seen, String word1, String word2) {

        if(word2.equals(word1)) return true;
        if(seen.contains(word1)) return false;

        seen.add(word1);

        if(map.containsKey(word1)){
            for(String word : map.get(word1)){
                if(dfs(map, seen, word, word2)) return true;
            }
        }

        return false;
    }

}
