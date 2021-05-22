// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/google/66/others-4/3099/


import java.util.*;
class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Map<Character, Character> hm = new HashMap<>();
        hm.put('0','0');
        hm.put('1','1');
        hm.put('6','9');
        hm.put('8','8');
        hm.put('9','6');
        int len = num.length();
        for(int i=0; i<=(len-1)/2 ; i++) {
            char c1=num.charAt(i), c2=num.charAt(len-i-1);
            if(!hm.containsKey(c1) || hm.get(c1)!=c2) return false;
        }
        return true;
    }
}