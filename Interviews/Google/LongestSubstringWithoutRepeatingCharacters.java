// 3. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Comment : Key is Setting start index using hashmap
// url : https://leetcode.com/problems/longest-substring-without-repeating-characters/


import java.util.*;
class LongestSubstringWithoutRepeatingCharactersGoogle {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int idx=0, len=0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if(hm.containsKey(c) && idx<=hm.get(c)) idx = hm.get(c)+1;
            hm.put(c, i);
            len = Math.max(len, i-idx+1);
        }
        return len;
    }
}