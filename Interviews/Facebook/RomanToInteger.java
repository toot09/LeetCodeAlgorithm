// Difficulty : I Think it is not good Prob.
// Comment : Easy
// url : https://leetcode.com/problems/roman-to-integer/


import java.util.*;

class RomanToIntegerFacebook {
    public int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int ret=0, bef=-1;
        for(int i=s.length()-1 ; i>=0 ; i--) {
            int num=hm.get(s.charAt(i));
            if(num<bef) ret-=num;
            else ret+=num;
            bef = num;
        }
        return ret;
    }
}