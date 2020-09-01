import java.util.*;
class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();

        while(!hs.contains(n)) {
            hs.add(n);
            int end = (int)Math.log10(n)+1;
            int tmp = 0;
            for(int i=1; i<=end ; i++) {
                tmp += (int)Math.pow(n%10,2);
                n /= 10; }
            if(tmp == 1) return true;
            n = tmp;
        }

        return false;
    }
}