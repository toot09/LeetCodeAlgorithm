// 20. Valid Parentheses
// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/problems/valid-parentheses/


import java.util.*;
class ValidParenthesesGoogle {
    public boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        Map<Character, Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');
        for(int i=0 ; i<str.length() ; i++) {
            char c = str.charAt(i);
            if(hm.containsKey(c)) {
                if(s.size()==0 || hm.get(c)!=s.pop()) return false;
            } else {
                s.push(c);
            }
        }
        return !(s.size()>0);
    }
}