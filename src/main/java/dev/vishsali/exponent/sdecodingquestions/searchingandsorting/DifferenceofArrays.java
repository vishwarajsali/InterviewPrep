package dev.vishsali.exponent.sdecodingquestions.searchingandsorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceofArrays {

    public List<Integer> diff(Integer[] arrA, Integer[] arrB) {
        // your code goes here

        List<Integer> res = new ArrayList<>();
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();


        for(Integer i : arrA){
            setA.add(i);
        }
        for(Integer i : arrB){
            setB.add(i);
        }

        for(Integer i : arrA){
            if(!setB.contains(i)) res.add(i);
        }

        for(Integer i : arrB){
            if(!setA.contains(i)) res.add(i);
        }



        return res;
    }
}
