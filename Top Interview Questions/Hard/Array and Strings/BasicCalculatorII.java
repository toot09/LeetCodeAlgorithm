import java.util.*;
class BasicCalculatorII_TIQ {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char sign = '+';
        int ret=0, n=0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                n = n*10+(c-'0');
            }
            if((!Character.isDigit(c)&&c!=' ') || i==s.length()-1) {
                if(sign=='+') stack.push(n);
                else if(sign=='-') stack.push(n*-1);
                else if(sign=='*') stack.push(stack.pop()*n);
                else stack.push(stack.pop()/n);
                sign = c;
                n = 0;
            }
        }
        for(int num : stack) {
            ret += num;
        }
        return ret;
    }
}