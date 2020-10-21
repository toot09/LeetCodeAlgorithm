import java.util.*;
//Runtime: 1 ms (86.52%)
//Memory Usage: 36.1 MB
class HappyNumber_TIQ {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while(n!=1){
            int tmp = 0;
            while(n>0) {
                tmp += (n%10)*(n%10);
                n /= 10;
            }
            n = tmp;
            if(hs.contains(n)) break;
            hs.add(n);
        }
        return n==1;
    }
}