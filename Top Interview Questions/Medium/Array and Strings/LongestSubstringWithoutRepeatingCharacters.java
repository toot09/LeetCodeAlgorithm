import java.util.*;
//Runtime: 5 ms (88.45%)
//Memory Usage: 39.3 MB (95.99%)
class LongestSubstringWithoutRepeatingCharacters_TIQ {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int ret = 0;
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(hm.containsKey(c) && hm.get(c) >= start) {
                ret = Math.max(ret, i - start);
                start = hm.get(c)+1;
            } else {
                ret = Math.max(ret,i - start + 1);
            }
            hm.put(c,i);
        }
        return ret;
    }
}

//Runtime: 6 ms (77.05%)
//Memory Usage: 39.7 MB (63.35%)
/*
class LongestSubstringWithoutRepeatingCharacters_TIQ {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int start = 0;
        int len = 0;
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            if(hs.contains(c)) {
                while(start<i) {
                    hs.remove(s.charAt(start++));
                    if(!hs.contains(c)) break;
                }
            }
            len = Math.max(i - start + 1,len);
            hs.add(c);
        }
        return len;
    }
}
*/