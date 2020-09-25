import java.util.*;
//Runtime: 3 ms
//Memory Usage: 39.8 MB
class ValidParentheses_TIQ {
    public boolean isValid_TIQ(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            switch(c) {
                case ')':
                    if(stack.isEmpty() || stack.pop()!='(') return false;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop()!='{') return false;
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop()!='[') return false;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }
        return stack.isEmpty();
    }
}