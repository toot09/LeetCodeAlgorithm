// 159. Longest Substring with At Most Two Distinct Characters
// Difficulty : Medium
// Comment : Great Prob.!!!
// url : https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/

import java.util.*;
class LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int idx=0, len=0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
            while(hm.size()>2 && idx<=i) {
                char ctmp = s.charAt(idx++);
                hm.put(ctmp, hm.get(ctmp)-1);
                hm.remove(ctmp,0);
            }
            len = Math.max(len, i-idx+1);
        }
        return len;
    }
}