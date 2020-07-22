//7. Reverse Integer
import java.util.*;
class ReverseInteger {
    public int reverse(int x) {
        // Integer Range Check
        if(x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) return 0;
        Stack<Integer> stack = new Stack<>();
        int len = (int)Math.log10(Math.abs(x));
        while(len>0) {
            stack.push((int)(x/Math.pow(10,len)));
            x %= Math.pow(10,len);
            len--;
        }
        int pre = x;
        while(stack.size()>0) {
            int pop = stack.pop();
            x *= 10;
            x += pop;
            //Overflow Check
            if(x/10 != pre) {
                return 0;
            }
            pre = x;
        }
        return x;                
    }
}