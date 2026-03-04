package dev.vishsali.exponent.sdecodingquestions.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumbers {

    public int fib(int n) {
        List<Integer> map = new ArrayList<>();
        return fibonacci(n, map);
    }

    private int fibonacci(int n , List<Integer> map){
        if ( n <= 1) return 1;

        if(!map.contains(n)){
            map.add(n, (fibonacci(n - 1, map) + fibonacci(n-2, map)));
        }

        return map.get(n);

    }
}
