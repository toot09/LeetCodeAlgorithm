import java.util.*;
//Runtime: 5 ms
//Memory Usage: 39.3 MB
class LongestSubstringWithoutRepeatingCharacters {
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