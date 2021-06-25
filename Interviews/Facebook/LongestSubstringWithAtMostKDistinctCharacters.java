// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/


import java.util.*;
class LongestSubstringWithAtMostKDistinctCharactersFacebook {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(k==0) return 0;
        Map<Character, Integer> hm = new HashMap<>();
        int idx=0, len=0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
            while(hm.size()>k) {
                char tmp = s.charAt(idx++);
                hm.put(tmp, hm.get(tmp)-1);
                if(hm.get(tmp)==0) hm.remove(tmp);
            }
            len = Math.max(len, i-idx+1);
        }
        return len;
    }
}