package com.regina23.algorithm._0020;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        if(s == null) return true;
        if(s.length() %2 == 1) return false;
        char[] charArray = s.toCharArray();

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{') {
                stack.push(charArray[i]);
            }else if(stack.isEmpty()){
                return false;
            }
            else if(charArray[i] == ')') {
                if(stack.pop() != '(') return false;
            } else if(charArray[i] == ']') {
                if(stack.pop() != '[') return false;
            } else if(charArray[i] == '}') {
                if(stack.pop() != '{') return false;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(){}[";
        System.out.println(solution.isValid(s));
    }
}
