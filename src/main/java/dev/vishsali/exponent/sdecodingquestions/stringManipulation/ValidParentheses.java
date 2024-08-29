package dev.vishsali.exponent.sdecodingquestions.stringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        // your code goes here

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>(){
            {
                put(']', '[');
                put(')', '(');
                put('}', '{');
            }
        };

        for(char ch: s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(ch)){
                if(stack.peek()== map.get(ch)) stack.pop();
                else return false;
            }else {
                stack.add(ch);
            }
        }


        return stack.isEmpty();
    }
}
