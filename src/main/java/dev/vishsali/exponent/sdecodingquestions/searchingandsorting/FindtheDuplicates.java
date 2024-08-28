package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindtheDuplicates {

    public int[] findDuplicates(int[] arr1, int[] arr2) {
        // your code goes here

        List<Integer> res = new ArrayList<>();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();


        for(Integer i : arr1){
            setA.add(i);
        }
        for(Integer i : arr2){
            setB.add(i);
        }

        for(Integer i : arr1){
            if(setB.contains(i)) if(!res.contains(i)) res.add(i);
        }

        for(Integer i : arr2){
            if(setA.contains(i)) if(!res.contains(i)) res.add(i);
        }


        return res.stream().mapToInt(x -> x).toArray();
    }
}
