package dev.vishsali.neetcode.practice.blind75.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {


    public boolean isValid(String s) {

        Map<Character, Character> map = new HashMap<>() {
            {
                put(']', '[');
                put(')', '(');
                put('}', '{');
            }
        };

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && map.containsKey(c)) {
                if(stack.peek() == map.get(c)) stack.pop();
                else return false;
            }else stack.add(c);

        }

        return stack.isEmpty();
    }
}
