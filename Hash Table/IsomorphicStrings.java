import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++) {
            if(hm1.containsKey(s.charAt(i)) || hm2.containsKey(t.charAt(i))) {
                if(hm1.get(s.charAt(i)) != hm2.get(t.charAt(i))) {
                    return false;
                }
            } else {
                hm1.put(s.charAt(i),i);
                hm2.put(t.charAt(i),i);
            }
        }
        return true;
    }
}