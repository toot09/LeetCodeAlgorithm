// Difficulty : Easy
// Commnet : Easy
// url : https://leetcode.com/explore/interview/card/google/66/others-4/3098/


import java.util.*;
class IsomorphicStringsGoogle {

    Map<Character, Character> hm = new HashMap<>();
    public boolean isIsomorphic(String s, String t) {
        for(int i=0 ; i<s.length() ; i++) {
            char cs=s.charAt(i), ct=t.charAt(i);
            if(hm.containsKey(cs)) {
                if(hm.get(cs)!=ct) return false;
            } else {
                if(!hm.containsValue(ct)) hm.put(cs, ct);
                else return false;
            }
        }
        return true;
    }


    // public boolean isIsomorphic(String s, String t) {
    //     if(s.length() != t.length()) {
    //         return false;
    //     }
    //     Map<Character, Integer> hm1 = new HashMap<>();
    //     Map<Character, Integer> hm2 = new HashMap<>();
    //     for(int i=0 ; i<s.length() ; i++) {
    //         if(hm1.containsKey(s.charAt(i)) || hm2.containsKey(t.charAt(i))) {
    //             if(hm1.get(s.charAt(i)) != hm2.get(t.charAt(i))) {
    //                 return false;
    //             }
    //         } else {
    //             hm1.put(s.charAt(i),i);
    //             hm2.put(t.charAt(i),i);
    //         }
    //     }
    //     return true;
    // }

}