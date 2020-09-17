import java.util.*;
//Runtime: 11 ms
//Memory Usage: 44.1 MB
class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, int[]> hm = new HashMap<>();
        hm.put('I',new int[]{1,1});
        hm.put('V',new int[]{2,5});
        hm.put('X',new int[]{3,10});
        hm.put('L',new int[]{4,50});
        hm.put('C',new int[]{5,100});
        hm.put('D',new int[]{6,500});
        hm.put('M',new int[]{7,1000});
        int ret = 0;
        for(int i=0 ; i<s.length() ; i++) {
          char c = s.charAt(i);
            if(i<s.length()-1) {
                char next = s.charAt(i+1);
                if(hm.get(c)[0] < hm.get(next)[0]) {
                    ret -= hm.get(c)[1];
                } else {
                    ret += hm.get(c)[1];
                }
            } else {
                ret += hm.get(c)[1];
            }
        }
        return ret;
    }
}