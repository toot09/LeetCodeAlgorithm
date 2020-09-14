//Runtime: 3 ms (80.09%)
//Memory Usage: 39.1 MB (97.66%)
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] tmp = new int[26];
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            tmp[c-'a'] = ++tmp[c-'a'];
        }
        for(int i=0 ; i<t.length() ; i++) {
            char c = t.charAt(i);
            if(tmp[c-'a']==0) {
                return false;
            }
            tmp[c-'a'] = --tmp[c-'a'];
        }
        return true;
    }
}

//Runtime: 15 ms (16.86%)
//Memory Usage: 39.8 MB (60.98%)
/*
import java.util.*;
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++) {
            char key = s.charAt(i);
            hm.put(key, hm.getOrDefault(key, 0)+1);
        }
        for(int i=0 ; i<t.length() ; i++) {
            char key = t.charAt(i);
            if(!hm.containsKey(key) || hm.get(key)==0) {
                return false;
            }
            hm.put(key,hm.get(key)-1);
        }
        return true;
    }
}
*/