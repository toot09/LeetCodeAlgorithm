import java.util.*;

class ValidParentheses2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0 ; i<s.length() ; i++) {
          char c = s.charAt(i);
          if(c == '{' || c == '[' || c == '(') {
            stack.push(c);
          } else {
            if(stack.size() == 0) {
              return false;
            }
            char chk = stack.pop();
            if ((c == '}' && chk == '{') || (c == ']' && chk == '[') ||  (c == ')' && chk == '(')) {
              continue;
            } else {
              return false;
            }
          }
        }
        return stack.size()>0 ? false : true;
    }
}