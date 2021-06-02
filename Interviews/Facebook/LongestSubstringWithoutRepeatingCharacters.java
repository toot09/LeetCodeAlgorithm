// Difficulty : Medium
// Comment : It is also included in Google interview problems.
// url : https://leetcode.com/problems/longest-substring-without-repeating-characters/


import java.util.*;
class LongestSubstringWithoutRepeatingCharactersFacebook {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int ret=0, idx=0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if(hm.containsKey(c) && hm.get(c)>=idx) idx = hm.get(c)+1;
            ret = Math.max(ret, i-idx+1);
            hm.put(c, i);
        }
        return ret;
    }
}