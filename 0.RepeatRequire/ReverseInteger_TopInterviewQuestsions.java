import java.util.*;
/**
**  해결 방법에 대한 생각의 전환이 필요하다.
*/
//Runtime: 1 ms (100%)
//Memory Usage: 36.8 MB (63.58)
class ReverseInteger_TopInterviewQuestsions_String {
    public int reverse(int x) { 
        Queue<Integer> q = new LinkedList<>();
        int ret = 0;
        boolean minus = false;
        if(x<0) {
            minus = true;
            x *= -1;
        }
        while(x>0) {
            q.offer(x%10);
            x /= 10;
        }
        while(q.size() > 0) {
            int pre = ret;
            ret *= 10;
            ret += q.poll();
            if(pre!=ret/10) {
              return 0;
            }
        }
        return (minus ? ret*-1 : ret);
    }
}


//Runtime: 2 ms (43.03%)
//Memory Usage: 36.9 MB (52.52%)
/*
class ReverseInteger_TopInterviewQuestsions {
    public int reverse(int x) {
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
            if(x/10 != pre) {
                return 0;
            }
            pre = x;
        }
        return x;                
    }
}
*/

//Runtime: 4 ms (14.96%)
//Memory Usage: 38.8 MB (12.64%)
/*
class ReverseInteger_TopInterviewQuestsions {
    public int reverse(int x) {     
        String n = String.valueOf(x);
        int len = n.length();
        int ret = 0;
        for(int i=len-1 ; i>=0 ; i--) {
            int tmp = ret;
            if(i==0 && n.charAt(i) == '-') {
                ret *= -1;
                break;
            }
            ret *= 10;
            ret += n.charAt(i)-'0';
            if(tmp != ret/10) {
              return 0;
            }
        }
        return ret;
    }
}
*/