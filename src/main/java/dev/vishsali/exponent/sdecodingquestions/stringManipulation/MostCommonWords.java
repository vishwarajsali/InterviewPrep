package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.*;

public class MostCommonWords {

    public String[][] mostCommonWords(String text) {
        // your code goes here
        Map<String, Integer> map = new HashMap<>();
        String punctuationRegex = "[.,;!\"'\\(\\)]";
        String sanitizedText = text.replaceAll(punctuationRegex, " ").toLowerCase();
        String[] str = sanitizedText.split("\\s+");


        for(String s : str){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByKey());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        String [][] res = new String[entries.size()][2];


        for(int i = 0; i< entries.size(); i++){
            res[i][0] = entries.get(i).getKey();
            res[i][1] = String.valueOf(entries.get(i).getValue());
        }


        return res;
    }
}
