// 20. Valid Parentheses
// It was easier than the others!!
import java.util.*;

class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int len = s.length()-1;
        for(int i=0 ; i<=len ; i++) {
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.size() == 0) {
                    return false;
                } else {
                    char pop = stack.pop();
                    if((s.charAt(i)==')' && pop != '(') || 
                       (s.charAt(i)==']' && pop != '[') ||
                       (s.charAt(i)=='}' && pop != '{')  ) {
                        return false;
                    }
                }
            }
        }
        if(stack.size()>0) return false;
        return true;
    }
}